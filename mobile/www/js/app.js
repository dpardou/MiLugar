// Esto es el vector de estado de la aplicación.

var app = {
  currentPage: null,
  hasPosition: false,
  latitude: null,
  longitude: null,
  map: null,
  watchPosition: function () {
    if (this.hasPosition == false) {
      var self = this
      navigator.geolocation.watchPosition(function (pos) {
        self.latitude = pos.coords.latitude
        self.longitude = pos.coords.longitude
        self.hasPosition = true
      }, function (err) {
        console.warn('ERROR(' + err.code + '): ' + err.message);
      }, {
        enableHighAccuracy: false,
        timeout: 3000,
        maximumAge: 0
      })
    }
  },

  switchPage: function(newPage) {
    $(this.currentPage).removeClass('pagina-activa')
    this.currentPage = newPage
    $(this.currentPage).addClass('pagina-activa')
    this.callbacks[newPage]()
  },

  callbacks: {
    '#pagina-cargando': function () {

    },
    '#pagina-login': function () {

    },
    '#pagina-recuperar-contrasena': function () {

    },
    '#pagina-registro': function () {

    },
    '#pagina-mapa': function () {
      app.map = L.map('map').setView([0, 0], 5)
      L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', { attribution: '' }).addTo(app.map);

      navigator.geolocation.getCurrentPosition(function (pos) {
        app.latitude = pos.coords.latitude
        app.longitude = pos.coords.longitude
        app.map.setView([app.latitude, app.longitude], 18)
        L.marker([app.latitude, app.longitude]).addTo(app.map).bindPopup('Prueba Geolocalización<br> App MiLugar.').openPopup();
      })
    },
  }
}

// Esto es lo que se hace cuando se hace click en un elemento.

$(document).on('click', '[data-href]', function (ev) {
  ev.preventDefault()

  app.switchPage($(this).data('href'))
})

// Esto es todo lo que se hace al cargar la página.

$(document).ready(function () {
  if (app.currentPage == null) {
    app.switchPage('#pagina-cargando')
  }
})
