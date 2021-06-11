package servicioDelClima;

import accionesDeAlertas.Alerta;

import java.util.List;

public interface ServicioMeteorologico {

  void actualizarAlertasEn(String ciudad);
  List<Alerta> consultarAlertasEn(String ciudad);

}
