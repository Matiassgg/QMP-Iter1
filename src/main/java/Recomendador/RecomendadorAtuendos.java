package Recomendador;

import Prendas.Sugerencia;
import ServiciosDelClima.EstadoDelClima;
import ServiciosDelClima.ServicioMeteorologicoAccuWeather;
import java.util.List;

public class RecomendadorAtuendos {
  ServicioMeteorologicoAccuWeather servicioMeteorologico;

  public Sugerencia sugerirNuevoAtuendo(String direccion, Placard placard) {
    EstadoDelClima climaActual = this.servicioMeteorologico.obtenerCondicionesClimaticasDe(direccion);

    // Forma parte del QMP3 la logica de combinacion de prendas

    // Devuelvo una lista de atuendos (todos las posibles sugerencias)
    // para que el Recomendador luego las filtre por la Tº
    List<Sugerencia> atuendosPosibles = placard.obtenerCombinaciones();

    return atuendosPosibles
        .stream()
        .filter(Sugerencia -> Sugerencia.esAptaParaLaTemperatura(climaActual.getTemperatura()))
        .findAny().get();
  }

}
