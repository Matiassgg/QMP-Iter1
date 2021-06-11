package accionesDeAlertas;
import Usuario.Usuario;
import accionesDeAlertas.serviciosExternos.NotificationService;
import java.util.List;

public class GranizoObserver implements AccionDeAlertas {
  NotificationService notificationService;
  boolean sePuedeEjecutar = true;

  public void setSePuedeEjecutar(boolean sePuedeEjecutar) {
    this.sePuedeEjecutar = sePuedeEjecutar;
  }

  @Override
  public void notificarCambiosEnAlertas(Usuario usuario, List<Alerta> alertas) {
    if(alertas.contains(Alerta.GRANIZO) && this.sePuedeEjecutar) {
      this.notificationService.notify("Evite salir en auto");
    }
  }
}
