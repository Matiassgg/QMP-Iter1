package servicioDelClima;

import API.AccuWeatherAPI;
import Usuario.RepositorioUsuarios;
import accionesDeAlertas.Alerta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico{
  AccuWeatherAPI apiDelClima;
  RepositorioUsuarios repositorioUsuarios;
  List<Alerta> alertas;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI accuWeatherAPI, RepositorioUsuarios repositorioUsuarios) {
    this.apiDelClima = accuWeatherAPI;
    this.repositorioUsuarios = repositorioUsuarios;
    this.alertas = new ArrayList<>();
  }

  @Override
  public void actualizarAlertasEn(String ciudad) {
    Map<String, List<String>> alertasDeApi = apiDelClima.getAlerts(ciudad);
    this.alertas = obtenerListaDeAlertas(alertasDeApi.get("CurrentAlerts"));
    repositorioUsuarios.getUsuarios().forEach(usuario -> usuario.alertasGeneradas(this.alertas));
  }

  @Override
  public List<Alerta> consultarAlertasEn(String ciudad) {
    return alertas;
  }

  private List<Alerta> obtenerListaDeAlertas(List<String> alertasEnStrings) {
    // Pasar de List<String> -> List<Alertas>
    return new ArrayList<>();
  }
}
