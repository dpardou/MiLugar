package cl.milugar.app.requests;

public class ContactoRequest {

  private String nombre;
  private String email;
  private String mensaje;
  private Boolean error = false;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public Boolean getError() {
    return this.error;
  }
}
