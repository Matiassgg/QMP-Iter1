public enum TipoPrenda {

  // Todas las prendas con su categoria correspondiente
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
  ANTEOJOS_DE_SOL(CategoriaPrenda.ACCESORIOS);

  CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoriaPrenda) {
    this.categoria = categoriaPrenda;
  }

  public Boolean esValidaLa(CategoriaPrenda categoria) {
      return this.categoria.equals(categoria);
  }
}


