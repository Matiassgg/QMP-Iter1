import java.util.ArrayList;

public class Atuendo {
  ArrayList<Prenda> prendas;

  public Atuendo() {
    this.prendas = new ArrayList<>();
  }

  // Aca no se chequea si es valida la prenda, de eso se encarga la clase Prenda
  public void cargarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

}


