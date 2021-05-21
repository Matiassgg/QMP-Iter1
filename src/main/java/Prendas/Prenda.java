package Prendas;
import CaracteristicasPrendas.*;

public class Prenda {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrimario;
  Color colorSecundario;
  TramaPrenda tela;
  Integer temperaturaMaxima;

  public Prenda(
      TipoPrenda tipo,
      Color colorPrimario,
      Color colorSecundario,
      MaterialPrenda material,
      TramaPrenda tela,
      Integer temperaturaMaxima
  ) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.tela = tela;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public CategoriaPrenda categoria() {
    return tipo.getCategoria();
  }

  public boolean esAptaParaLaTemperatura(Integer temperatura) {
    return temperatura <= this.temperaturaMaxima;
  }

}

