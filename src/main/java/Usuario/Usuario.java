package Usuario;

import Sugerencia.Sugerencia;
import accionesDeAlertas.AccionDeAlertas;
import accionesDeAlertas.Alerta;

import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  Sugerencia sugerenciaDiaria;
  List<AccionDeAlertas> accionesDeAlertas;
  String address;

  public Usuario(Sugerencia sugerenciaDiaria) {
    this.sugerenciaDiaria = sugerenciaDiaria;
  }

  public Sugerencia obtenerSugerenciaDiaria() {
    return sugerenciaDiaria;
  }

  public void actualizarSugerencia(Sugerencia nuevaSugerenciaDiaria) {
    this.sugerenciaDiaria = nuevaSugerenciaDiaria;
  }

  public void alertasGeneradas(List<Alerta> alertas) {
    this.accionesDeAlertas.forEach(accionDeAlertas -> accionDeAlertas.notificarCambiosEnAlertas(this, alertas));
  }

  public void configurarAccionAEjecutar(AccionDeAlertas accionDeAlertas, boolean ejecucion) {
    AccionDeAlertas accionConfigurableBuscada = accionesDeAlertas
        .stream()
        .filter(accionDeAlertas1 -> accionDeAlertas == accionDeAlertas1).collect(Collectors.toList())
        .get(0);
    accionConfigurableBuscada.setSePuedeEjecutar(ejecucion);
  }

  public String getAddress() {
    return address;
  }
}
