package cl.milugar.app.models;

import cl.milugar.app.models.ProvinciaModel;
import java.util.Date;

public class ComunaModel {
    private Integer id;
    private String nombre;
    private ProvinciaModel provincia;
    private String email;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
