package ServiciosDelClima;

import java.time.LocalDateTime;

public class RespuestaAccuWeather {
  EstadoDelClima estadoDelClima;
  LocalDateTime expiracion;

  public RespuestaAccuWeather(EstadoDelClima estadoDelClima, LocalDateTime expiracion) {
    this.estadoDelClima = estadoDelClima;
    this.expiracion = expiracion;
  }

  // La expiracion podria durar 2 horas y media o +, asi la expiracion "cubre" la cantidad
  // maxima de pedidos por ciudad (que son 10) en un dia y no nos cobran el 0,05USD
  public boolean expiro() {
    return this.expiracion.isAfter(LocalDateTime.now());
  }

  public EstadoDelClima getEstadoDelClima() {
    return estadoDelClima;
  }

}
