package cl.milugar.app.api;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.milugar.app.utils.HibernateLauncher;
import cl.milugar.app.responses.TestResponse;
import cl.milugar.app.requests.TestRequest;
import cl.milugar.app.responses.RegistrarUsuarioResponse;
import cl.milugar.app.requests.RegistrarUsuarioRequest;
import cl.milugar.app.responses.NuevoEstacionamientoResponse;
import cl.milugar.app.requests.NuevoEstacionamientoRequest;
import cl.milugar.app.responses.RecuperarPasswordResponse;
import cl.milugar.app.requests.RecuperarPasswordRequest;
import cl.milugar.app.responses.AutenticarUsuarioResponse;
import cl.milugar.app.requests.AutenticarUsuarioRequest;
import cl.milugar.app.responses.ContactoResponse;
import cl.milugar.app.requests.ContactoRequest;
import cl.milugar.app.responses.DenunciaResponse;
import cl.milugar.app.requests.DenunciaRequest;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Path("/prueba")
public class ApiV1 {

  @GET
  @Path("/test")
  @Produces({MediaType.APPLICATION_JSON})
  public TestResponse test() {
    TestResponse response = new TestResponse();
    return response;
  }

  @GET
  @Path("/mysql")
  @Produces({MediaType.APPLICATION_JSON})
  public List mysql() {
    Session session = HibernateLauncher.getSessionFactory().getCurrentSession();
    Transaction tr = session.beginTransaction();
    String sql = "SELECT * FROM MiLugar.estacionamientos;";
    Query query = session.createNativeQuery(sql);
    //Object result = query.getSingleResult();
    List result= query.getResultList();
    tr.commit();
    return result;
  }

  @POST
  @Path("/test")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public TestResponse testPost(TestRequest request) {
    TestResponse response = new TestResponse();
    response.setStatus(request.getStatus());
    return response;
  }

  @POST
  @Path("/registroUsuario")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public RegistrarUsuarioResponse registrarUsuario(RegistrarUsuarioRequest request) {
    RegistrarUsuarioResponse response = new RegistrarUsuarioResponse();
    return response;
  }

  @POST
  @Path("/registroEstacionamiento")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public NuevoEstacionamientoResponse nuevoEstacionamiento(NuevoEstacionamientoRequest request) {
    NuevoEstacionamientoResponse response = new NuevoEstacionamientoResponse();
    return response;
  }

  @POST
  @Path("/recuperarPassword")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public RecuperarPasswordResponse recuperarPassword(RecuperarPasswordRequest request) {
    RecuperarPasswordResponse response = new RecuperarPasswordResponse();
    return response;
  }

  @POST
  @Path("/autenticarUsuario")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public AutenticarUsuarioResponse autenticarUsuario(AutenticarUsuarioRequest request) {
    AutenticarUsuarioResponse response = new AutenticarUsuarioResponse();
    return response;
  }

  @POST
  @Path("/contacto")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public ContactoResponse contacto(ContactoRequest request) {
    ContactoResponse response = new ContactoResponse();
    return response;
  }

  @POST
  @Path("/denuncia")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public DenunciaResponse denuncia(DenunciaRequest request) {
    DenunciaResponse response = new DenunciaResponse();
    return response;
  }

}
