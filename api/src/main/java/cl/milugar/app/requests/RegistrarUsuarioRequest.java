package cl.milugar.app.requests;

public class RegistrarUsuarioRequest {

  private String nombre;
  private String email;
  private String password;
  private String repeatPassword;
  private Boolean error = false;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRepeatPassword(String repeatPassword) {
    this.repeatPassword = repeatPassword;
  }

  public Boolean getError() {
    return this.error;
  }
}
