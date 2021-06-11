package accionesDeAlertas;

import Usuario.Usuario;
import java.util.List;

public interface AccionDeAlertas {
  void setSePuedeEjecutar(boolean sePuedeEjecutar);
  void notificarCambiosEnAlertas(Usuario usuario, List<Alerta> alertas);
}
