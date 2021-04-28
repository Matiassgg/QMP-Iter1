package InstitucionesYColegios;
import Prendas.Prenda;

public class Uniforme {
  // Características de un uniforme
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public Uniforme obtenerUniformeDe(ConstructorUniformes constructorUniformes) {
    return new Uniforme(
        constructorUniformes.fabricarPrendaSuperior(),
        constructorUniformes.fabricarPrendaInferior(),
        constructorUniformes.fabricarCalzado()
    );
  }
}

