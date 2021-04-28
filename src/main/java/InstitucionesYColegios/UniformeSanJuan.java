package InstitucionesYColegios;
import CaracteristicasPrendas.*;
import Prendas.*;

public class UniformeSanJuan implements ConstructorUniformes {

  @Override
  public Prenda fabricarPrendaSuperior() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.CHOMBA);
    borrador.setColorPrimario(new Color(0, 255, 0));  // Verde
    borrador.setTela(TramaPrenda.PIQUE);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarPrendaInferior() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.PANTALON);
    borrador.setTela(TramaPrenda.ACETATO);
    borrador.setColorPrimario(new Color(150, 152, 154));  // Gris
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.ZAPATILLAS);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(255, 255, 255));  // Blanco
    return borrador.crearPrenda();
  }

}
