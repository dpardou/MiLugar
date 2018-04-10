var btn = $("button").clone();
$(btn).on("click", function () {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(function(position) {
    //  $("#registro-estacionamiento-coordenadas-x").val(position.coords.latitude)
    //  $("#registro-estacionamiento-coordenadas-y").val(position.coords.longitude)
      var mymap = L.map('mapa').setView([position.coords.latitude, position.coords.longitude], 18);
      L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
          attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
      }).addTo(mymap);

      L.marker([position.coords.latitude, position.coords.longitude]).addTo(mymap)
          .bindPopup('Prueba Geolocalización<br> App MiLugar.')
          .openPopup();
    })
  } else {
    console.log("Geolocation is not supported by this browser.");
  }
})


$(document).ready(function() {
  btn.click()
})
