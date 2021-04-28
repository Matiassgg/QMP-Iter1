package CaracteristicasPrendas;

import java.util.*;

// Ahora los materiales pasan a tener TipoPrenda 'validos' para ser consistentes con su construcción
// En el Enum del diagrama no coloco todas las constantes como el caso de TipoPrenda.
// Al ser varios Materiales los posibles para una Prenda se dejan solo constantes a modo ejemplo
public enum MaterialPrenda {

  // Es medio insostenible esto ...
  CUERO(Arrays.asList(
      TipoPrenda.BOTAS,
      TipoPrenda.ZAPATOS
  )),
  JEAN(Arrays.asList(
      TipoPrenda.PANTALON,
      TipoPrenda.CAMISA_MANGA_CORTA
  )),
  ALGODON(Arrays.asList(
      TipoPrenda.REMERA_MANGA_CORTA,
      TipoPrenda.REMERA_MANGA_LARGA,
      TipoPrenda.MUSCULOSA,
      TipoPrenda.PANUIELO,
      TipoPrenda.CAMISA_MANGA_CORTA
  )),
  LANA(Arrays.asList(
      TipoPrenda.SUETER,
      TipoPrenda.GORRO
  )),
  PLASTICO(Arrays.asList(
      TipoPrenda.ANTEOJOS_DE_SOL
  )),
  GOMA(Arrays.asList(
      TipoPrenda.CROCS,
      TipoPrenda.ZAPATILLAS
  ));

  List<TipoPrenda> tiposValidos;

  // Defino que TIPOS de prendas pueden tener ese MATERIAL
  MaterialPrenda(List<TipoPrenda> tipos) {
    tiposValidos = new ArrayList<>();
    this.tiposValidos.addAll(tipos);
  }

  public boolean esValidoEl(TipoPrenda tipo) {
    return tiposValidos.contains(tipo);
  }
}
