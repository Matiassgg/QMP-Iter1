package CaracteristicasPrendas;

import java.util.Arrays;
import java.util.List;

public enum TipoPrenda {
  // Materiales validos para una prenda
  ZAPATOS(CategoriaPrenda.CALZADO, Arrays.asList(
      MaterialPrenda.GOMA,
      MaterialPrenda.CUERO
  )),
  BOTAS(CategoriaPrenda.CALZADO, Arrays.asList(
      MaterialPrenda.GOMA,
      MaterialPrenda.CUERO
  )),
  ZAPATILLAS(CategoriaPrenda.CALZADO, Arrays.asList(
      MaterialPrenda.GOMA
  )),
  CROCS(CategoriaPrenda.CALZADO, Arrays.asList(
      MaterialPrenda.GOMA
  )),
  CAMISA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR, Arrays.asList(
      MaterialPrenda.ALGODON
  )),
  REMERA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR, Arrays.asList(
      MaterialPrenda.ALGODON
  )),
  REMERA_MANGA_LARGA(CategoriaPrenda.PARTE_SUPERIOR, Arrays.asList(
      MaterialPrenda.ALGODON
  )),
  MUSCULOSA(CategoriaPrenda.PARTE_SUPERIOR, Arrays.asList(
      MaterialPrenda.ALGODON
  )),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR, Arrays.asList(
      MaterialPrenda.ALGODON,
      MaterialPrenda.JEAN
  )),
  PANUIELO(CategoriaPrenda.ACCESORIOS, Arrays.asList(
      MaterialPrenda.LANA
  )),
  ANTEOJOS_DE_SOL(CategoriaPrenda.ACCESORIOS, Arrays.asList(
      MaterialPrenda.PLASTICO
  )),
  SUETER(CategoriaPrenda.PARTE_SUPERIOR, Arrays.asList(
      MaterialPrenda.LANA
  )),
  GORRO(CategoriaPrenda.ACCESORIOS, Arrays.asList(
      MaterialPrenda.GOMA
  )),
  CHOMBA(CategoriaPrenda.PARTE_SUPERIOR, Arrays.asList(
      MaterialPrenda.ALGODON
  ));

  List<MaterialPrenda> materialesValidos;
  CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoriaPrenda, List<MaterialPrenda> materialesValidos) {
    this.materialesValidos = materialesValidos;
    this.categoria = categoriaPrenda;
  }

  public CategoriaPrenda getCategoria() {
    return this.categoria;
  }

  public Boolean esValidaLaCategoria(CategoriaPrenda categoria) {
      return this.categoria.equals(categoria);
  }

  public boolean esValidoElMaterial(MaterialPrenda material) {
    return materialesValidos.contains(material);
  }

}


