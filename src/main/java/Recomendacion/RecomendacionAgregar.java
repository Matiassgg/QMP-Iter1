package Recomendacion;

import Guardarropas.Guardarropas;
import Prenda.Prenda;

public class RecomendacionAgregar implements Recomendacion {
  Guardarropas guardarropas;
  Prenda prenda;

  public RecomendacionAgregar(Guardarropas guardarropas, Prenda prenda) {
    this.guardarropas = guardarropas;
    this.prenda = prenda;
  }

  @Override
  public void aplicateEnElGuardarropas() {
    guardarropas.agregarPrenda(prenda);
  }

}
