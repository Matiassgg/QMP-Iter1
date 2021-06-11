package Sugerencia;

import Prenda.Prenda;
import java.util.List;

public class Sugerencia {
  List<Prenda> prendasSugeridas;

  public Sugerencia(List<Prenda> prendasSugeridas) {
    this.prendasSugeridas = prendasSugeridas;
  }

  public void agregarPrendaSugerida(Prenda prenda) {
    prendasSugeridas.add(prenda);
  }

  public void borrarPrendaSugerida(Prenda prenda) {
    prendasSugeridas.remove(prenda);
  }

  public void removerPrendasDeSugerencia() {
    prendasSugeridas.clear();
  }

}
