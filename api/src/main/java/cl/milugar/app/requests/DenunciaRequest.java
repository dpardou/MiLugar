package cl.milugar.app.requests;

import java.lang.Double;

public class DenunciaRequest {

  private String foto;
  private String comunaId;
  private String orientacion;
  private String vereda;
  private Integer senalizacion;
  private Double latitud;
  private Double longitud;
  private Boolean error = false;

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public void setComunaId(String comunaId) {
    this.comunaId = comunaId;
  }

  public void setOrientacion(String orientacion) {
    if (orientacion.equals("NORTE") || orientacion.equals("SUR") || orientacion.equals("ORIENTE") || orientacion.equals("PONIENTE")){
      this.orientacion = orientacion;
    } else{
      this.error = true;
    }
  }

  public void setVereda(String vereda) {
    if (vereda.equals("NORTE") || vereda.equals("SUR") || vereda.equals("ORIENTE") || vereda.equals("PONIENTE")){
      this.vereda = vereda;
    } else{
      this.error = true;
    }
  }

  public void setSenalizacion(Integer senalizacion) {
    if (senalizacion >= 0 && senalizacion <= 3){
      this.senalizacion = senalizacion;
    } else {
      this.error = true;
    }
  }

  public void setLatitud(Double latitud) {
    this.latitud = latitud;
  }

  public void setLongitud(Double longitud) {
    this.longitud = longitud;
  }

  public Boolean getError() {
    return this.error;
  }
}
