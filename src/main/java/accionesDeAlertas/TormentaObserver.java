package accionesDeAlertas;

import Sugerencia.GeneradorSugerencia;
import Usuario.Usuario;
import accionesDeAlertas.serviciosExternos.NotificationService;
import java.util.List;

public class TormentaObserver implements AccionDeAlertas {
  GeneradorSugerencia generadorSugerencia;
  NotificationService notificationService;
  boolean sePuedeEjecutar = true;

  @Override
  public void setSePuedeEjecutar(boolean sePuedeEjecutar) {
    this.sePuedeEjecutar = sePuedeEjecutar;
  }

  @Override
  public void notificarCambiosEnAlertas(Usuario usuario, List<Alerta> alertas) {
    if(alertas.contains(Alerta.TORMENTA) && this.sePuedeEjecutar) {
      this.notificationService.notify("Tenes que llevarte un paraguas");
    }
  }

}
