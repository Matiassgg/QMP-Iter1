package accionesDeAlertas;

import Usuario.Usuario;
import accionesDeAlertas.serviciosExternos.MailSender;
import java.util.List;

public class MailSenderObserver implements AccionDeAlertas {
  MailSender mailSender;
  boolean sePuedeEjecutar = true;

  @Override
  public void setSePuedeEjecutar(boolean sePuedeEjecutar) {
    this.sePuedeEjecutar = sePuedeEjecutar;
  }

  @Override
  public void notificarCambiosEnAlertas(Usuario usuario, List<Alerta> alertas) {
    if(this.sePuedeEjecutar) {
      mailSender.send(
          usuario.getAddress(),
          "Se generaron las siguiente alertas meteorologicas para hoy: \n"
              + alertas.stream().map(Enum::toString)
      );
    }
  }
}
