package CaracteristicasPrendas;

// En el Enum del diagrama no coloco todas las constantes
// por un tema de legibilidad del Diagrama en si.
// Al ser varios Tipos de Prenda se dejan solo constantes a modo ejemplo
public enum TipoPrenda {
  ZAPATOS(CategoriaPrenda.CALZADO),
  BOTAS(CategoriaPrenda.CALZADO),
  ZAPATILLAS(CategoriaPrenda.CALZADO),
  CROCS(CategoriaPrenda.CALZADO),
  CAMISA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  REMERA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  REMERA_MANGA_LARGA(CategoriaPrenda.PARTE_SUPERIOR),
  MUSCULOSA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR),
  PANUIELO(CategoriaPrenda.ACCESORIOS),
  ANTEOJOS_DE_SOL(CategoriaPrenda.ACCESORIOS),
  SUETER(CategoriaPrenda.PARTE_SUPERIOR),
  GORRO(CategoriaPrenda.ACCESORIOS),
  CHOMBA(CategoriaPrenda.PARTE_SUPERIOR);

  CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoriaPrenda) {
    this.categoria = categoriaPrenda;
  }

  public CategoriaPrenda getCategoria() {
    return this.categoria;
  }

  public Boolean esValidaLa(CategoriaPrenda categoria) {
      return this.categoria.equals(categoria);
  }
}


