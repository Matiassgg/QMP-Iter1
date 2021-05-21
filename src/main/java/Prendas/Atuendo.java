package Prendas;
import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  List<Prenda> prendas;

  public Atuendo() {
    prendas = new ArrayList<>();
  }

  public boolean esAptoParaLaTemperatura(Integer temperatura) {
    return prendas
        .stream()
        .allMatch(Prenda -> Prenda.esAptaParaLaTemperatura(temperatura));
  }

}


