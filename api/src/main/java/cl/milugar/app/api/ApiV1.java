package cl.milugar.app.api;

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

public class ApiV1 {

  public TestResponse test(TestRequest testRequest) {
    TestResponse response = new TestResponse();
    return response;
  }

  public RegistrarUsuarioResponse registrarUsuario(RegistrarUsuarioRequest request) {
    RegistrarUsuarioResponse response = new RegistrarUsuarioResponse();
    return response;
  }

  public NuevoEstacionamientoResponse nuevoEstacionamiento(NuevoEstacionamientoRequest request) {
    NuevoEstacionamientoResponse response = new NuevoEstacionamientoResponse();
    return response;
  }

  public RecuperarPasswordResponse recuperarPassword(RecuperarPasswordRequest request) {
    RecuperarPasswordResponse response = new RecuperarPasswordResponse();
    return response;
  }

  public AutenticarUsuarioResponse autenticarUsuario(AutenticarUsuarioRequest request) {
    AutenticarUsuarioResponse response = new AutenticarUsuarioResponse();
    return response;
  }

  public ContactoResponse contacto(ContactoRequest request) {
    ContactoResponse response = new ContactoResponse();
    return response;
  }

  public DenunciaResponse denuncia(DenunciaRequest request) {
    DenunciaResponse response = new DenunciaResponse();
    return response;
  }

}
