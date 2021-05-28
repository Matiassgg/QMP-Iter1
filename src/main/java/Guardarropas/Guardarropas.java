package Guardarropas;
import Prenda.Prenda;
import Usuario.Usuario;
import java.util.List;

public class Guardarropas {
  List<Prenda> prendas;
  Usuario duenio;

  public Guardarropas(List<Prenda> prendas, Usuario duenio) {
    this.duenio = duenio;
    this.prendas = prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

}
