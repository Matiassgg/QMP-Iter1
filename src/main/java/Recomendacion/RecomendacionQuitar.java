package Recomendacion;

import Guardarropas.Guardarropas;
import Prenda.Prenda;

public class RecomendacionQuitar implements Recomendacion{
  Guardarropas guardarropas;
  Prenda prenda;

  public RecomendacionQuitar(Guardarropas guardarropas, Prenda prenda) {
    this.guardarropas = guardarropas;
    this.prenda = prenda;
  }

  @Override
  public void aplicateEnElGuardarropas() {
    guardarropas.quitarPrenda(prenda);
  }

}
