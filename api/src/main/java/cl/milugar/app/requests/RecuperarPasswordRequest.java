package cl.milugar.app.requests;

public class RecuperarPasswordRequest {

  private String email;
  private Boolean error = false;

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getError() {
    return this.error;
  }
}
