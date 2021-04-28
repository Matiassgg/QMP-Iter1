package Prendas;
import java.util.ArrayList;

public class Atuendo {
  ArrayList<Prenda> prendas;

  public Atuendo() {
    this.prendas = new ArrayList<>();
  }

  public void cargarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

}


