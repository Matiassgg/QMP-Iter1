package InstitucionesYColegios;
import CaracteristicasPrendas.*;
import Prendas.*;

public class UniformeJohnson implements ConstructorUniformes {

  @Override
  public Prenda fabricarPrendaSuperior() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.CAMISA_MANGA_CORTA);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(255, 255, 255));  // Blanco
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarPrendaInferior() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.PANTALON);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(0, 0, 0));  // Negro
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.ZAPATOS);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(0, 0, 0));  // Negro
    return borrador.crearPrenda();
  }
}
