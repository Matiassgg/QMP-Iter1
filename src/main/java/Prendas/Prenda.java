package Prendas;
import CaracteristicasPrendas.*;

public class Prenda {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrimario;
  Color colorSecundario;
  TramaPrenda tela;

  public Prenda(
      TipoPrenda tipo,
      Color colorPrimario,
      Color colorSecundario,
      MaterialPrenda material,
      TramaPrenda tela
  ) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.tela = tela;
  }

  public CategoriaPrenda categoria() {
    return tipo.getCategoria();
  }

}

