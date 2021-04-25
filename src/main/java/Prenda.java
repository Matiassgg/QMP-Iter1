import Exepciones.PrendaInvalidaException;

public class Prenda {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrimario;
  Color colorSecundario;

  public Prenda(
      TipoPrenda tipo,
      MaterialPrenda material,
      Color colorPrimario,
      Color colorSecundario
  ) {
    this.chequearDatosNulos(tipo, material, colorPrimario);
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public CategoriaPrenda categoria() {
    return tipo.getCategoria();
  }

  private void chequearDatosNulos(
      TipoPrenda tipo,
      MaterialPrenda material,
      Color colorPrimario
  ) {
    if(tipo == null || material == null || colorPrimario == null) {
      throw new PrendaInvalidaException("el ingreso de datos fue incompleto");
    }
  }

}

