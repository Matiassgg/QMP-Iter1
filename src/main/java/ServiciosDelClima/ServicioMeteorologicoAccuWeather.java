package ServiciosDelClima;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
  AccuWeatherAPI apiClima;
  Map<String, RespuestaAccuWeather> ultimaRespuesta;
  Duration periodoValidez;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI apiDelClima, Duration periodoValidez) {
    this.apiClima = apiDelClima;
    this.ultimaRespuesta = new HashMap<>();
    this.periodoValidez = periodoValidez;
  }

  @Override
  public EstadoDelClima obtenerCondicionesClimaticasDe(String direccion) {
    if (!this.esRespuestaValida(direccion)) {
      this.consultarNuevaRespuestaApi(direccion);
    }
    return this.ultimaRespuesta.get(direccion).getEstadoDelClima();
  }

  private boolean esRespuestaValida(String direccion) {
    return this.ultimaRespuesta == null || this.ultimaRespuesta.get(direccion).expiro();
  }

  private void consultarNuevaRespuestaApi(String direccion) {
    Map<String, Object> respuesta = this.apiClima.getWeather(direccion).get(0);

    // viento, presion, humedad, etc de caracteristicas del clima pueden luego guardarse en EstadoDelClima
    Integer temperatura = (Integer) respuesta.get("Temperature");
    ultimaRespuesta.put(direccion, new RespuestaAccuWeather(new EstadoDelClima(temperatura), this.nuevaProximaExpiracion()));
  }

  private LocalDateTime nuevaProximaExpiracion() {
    return LocalDateTime.now().plus(this.periodoValidez);
  }
}
