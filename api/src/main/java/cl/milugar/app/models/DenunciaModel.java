package cl.milugar.app.models;

import cl.milugar.app.models.EstacionamientoModel;
import java.util.Date;

public class DenunciaModel {
  private Integer id;
  private EstacionamientoModel estacionamiento;
  private String foto;
  private String descripcion;
  private Date createdAt;
  private Date updatedAt;
  private Date deletedAt;
}
