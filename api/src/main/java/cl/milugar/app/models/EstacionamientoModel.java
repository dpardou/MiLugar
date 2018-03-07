package cl.milugar.app.models;

import cl.milugar.app.models.ComunaModel;
import java.lang.Double;
import java.util.Date;

public class EstacionamientoModel {
  private Integer id;
  private String calle;
  private String numero;
  private ComunaModel comuna;
  private Double latitud;
  private Double longitud;
  private Integer cantidad;
  private String orientacion;
  private String vereda;
  private Integer senalizacion;
  private Integer estado;
  private Date createdAt;
  private Date updatedAt;
  private Date deletedAt;
}
