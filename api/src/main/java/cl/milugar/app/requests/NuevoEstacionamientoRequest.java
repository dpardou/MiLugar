package cl.milugar.app.requests;

import java.lang.Double;

public class NuevoEstacionamientoRequest {

  private Double latitud;
  private Double longitud;
  private Integer cantidad;
  private String orientacion;
  private String vereda;
  private Integer senalizacion;
  private Boolean error = false;

  public void setLatitud(Double latitud) {
    this.latitud = latitud;
  }

  public void setLongitud(Double longitud) {
    this.longitud = longitud;
  }

  public void setCantidad(Integer cantidad) {
    if (cantidad != 0) {
      this.cantidad = cantidad;
    } else {
      this.error = true;
    }
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

  public Boolean getError() {
    return this.error;
  }
}
