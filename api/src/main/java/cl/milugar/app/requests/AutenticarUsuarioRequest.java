package cl.milugar.app.requests;

public class AutenticarUsuarioRequest {

  private String email;
  private String password;
  private Boolean error = false;

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean getError() {
    return this.error;
  }
}
