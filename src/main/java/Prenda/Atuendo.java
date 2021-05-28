package Prenda;
import CaracteristicasPrendas.CategoriaPrenda;
import Exepciones.PrendaInvalidaException;

public class Atuendo {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    this.validarPrenda(prendaSuperior, CategoriaPrenda.PARTE_SUPERIOR);
    this.validarPrenda(prendaInferior, CategoriaPrenda.PARTE_INFERIOR);
    this.validarPrenda(calzado, CategoriaPrenda.CALZADO);
    this.validarPrenda(accesorio, CategoriaPrenda.ACCESORIOS);
  }

  private void validarPrenda(Prenda prenda, CategoriaPrenda categoriaPrenda) {
    if(prenda.categoria() == categoriaPrenda ) {
      throw new PrendaInvalidaException("No es valida la categoria para la prenda");
    }
  }
}


