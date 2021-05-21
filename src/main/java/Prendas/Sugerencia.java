package Prendas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sugerencia {
  List<Atuendo> atuendos;

  public Sugerencia() {
    this.atuendos = new ArrayList<>();
  }

  // Digamos que genero 3 atuendos posibles para una sugerencia
  // (deberia ser una especie nXm Atuendos en verdad...) (producto cartesiano de todos con todos)
  public List<Atuendo> generarAtuendos() {
    this.atuendos = Arrays.asList(new Atuendo(), new Atuendo(), new Atuendo());
    return atuendos;
  }

  public boolean esAptaParaLaTemperatura(Integer temperatura) {
    return atuendos
        .stream()
        .allMatch(Atuendo -> Atuendo.esAptoParaLaTemperatura(temperatura));
  }
}
