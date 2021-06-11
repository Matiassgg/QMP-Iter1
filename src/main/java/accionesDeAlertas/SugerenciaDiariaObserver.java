package accionesDeAlertas;

import Sugerencia.GeneradorSugerencia;
import Usuario.Usuario;
import servicioDelClima.ServicioMeteorologico;
import java.util.List;

public class SugerenciaDiariaObserver implements AccionDeAlertas {
  GeneradorSugerencia generadorSugerencia;
  ServicioMeteorologico servicioMeteorologico;
  boolean sePuedeEjecutar = true;

  public SugerenciaDiariaObserver(GeneradorSugerencia generadorSugerencia) {
    this.generadorSugerencia = generadorSugerencia;
  }

  @Override
  public void setSePuedeEjecutar(boolean sePuedeEjecutar) {
    this.sePuedeEjecutar = sePuedeEjecutar;
  }

  @Override
  public void notificarCambiosEnAlertas(Usuario usuario, List<Alerta> alertas) {
    usuario.actualizarSugerencia(generadorSugerencia.generar(usuario, servicioMeteorologico));
  }
}
