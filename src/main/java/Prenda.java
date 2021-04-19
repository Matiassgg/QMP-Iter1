import Exepciones.PrendaInvalidaException;

public class Prenda {
  TipoPrenda tipo;
  MaterialPrenda material;
  ColorPrimario colorPrimario;
  ColorSecundario colorSecundario;

  // Este constructor es el que utiliza el usuario para crear sus prendas especificando que desea cargar
  public Prenda(
      CategoriaPrenda categoria,
      TipoPrenda tipo,
      MaterialPrenda material,
      ColorPrimario colorPrimario,
      ColorSecundario colorSecundario
  ) {
    this.chequearDatosNulos(categoria, tipo, material, colorPrimario);
    this.chequearTipo(categoria, tipo);

    // Si hubiera que chequear mas cosas (colorPrimario valido, material valido)
    // agregaría métodos dentro del constructor del estilo 'chequearColor(color)' ...

    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;

    // La prenda no lanzo ninguna excepción al momento de crearla
    // No es necesario este mensaje, pero si llega hasta aca esta all good :)
    System.out.println("Se creo la prenda correctamente");
  }

  private void chequearDatosNulos(
      CategoriaPrenda categoria,
      TipoPrenda  tipo,
      MaterialPrenda material,
      ColorPrimario colorPrimario
  ) {
    if(categoria == null || tipo == null || material == null || colorPrimario == null) {
      // Falto ingresar algún dato, lanzo una excepción
      throw new PrendaInvalidaException("el ingreso de datos fue incompleto");
    }
  }

  private void chequearTipo(CategoriaPrenda categoria, TipoPrenda tipo) {
    if(!tipo.esValidaLa(categoria)) {
      // En este caso, el tipo no se condice con su categoria
      throw new PrendaInvalidaException("el tipo no se condice con su categoria");
    }
  }

}

