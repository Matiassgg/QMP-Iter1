package Prendas;
import CaracteristicasPrendas.*;
import Exepciones.PrendaInvalidaException;

public class PrendaBorrador {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrimario;
  Color colorSecundario;
  TramaPrenda tela;
  TramaPrenda telaPorDefecto;
  Integer temperatura;

  public PrendaBorrador(TipoPrenda tipo) {
    this.setTipo(tipo);
  }

  public void setTipo(TipoPrenda tipo) {
    if(tipo == null) {
      throw new PrendaInvalidaException("se debe especificar el tipo de la la prenda");
    }
    this.tipo = tipo;
  }

  public void setMaterial(MaterialPrenda material) {
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {
    if(colorPrimario == null) {
      throw new PrendaInvalidaException("se debe especificar el color primario de la la prenda");
    }
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTela(TramaPrenda tela) {
    if(tela == null) {
      this.tela = telaPorDefecto;
    }
    else {
      this.tela = tela;
    }
  }

  public void setTelaPorDefecto(TramaPrenda telaPorDefecto) {
    this.telaPorDefecto = telaPorDefecto;
  }

  private void validarMaterialConTipoPrenda(MaterialPrenda material) {
    if(material == null) {
      throw new PrendaInvalidaException("se debe especificar el material de la la prenda");
    }
    else if(!tipo.esValidoElMaterial(material)) {
      throw new PrendaInvalidaException("el material de la prenda no se condice con tu tipo");
    }
  }

  public void setTemperatura(Integer temperatura) {
    this.temperatura = temperatura;
  }

  public Prenda crearPrenda() {
    if(!this.estaCompleta()) {
      throw new PrendaInvalidaException("la prenda esta incompleta");
    }
    return new Prenda(tipo, colorPrimario, colorSecundario, material, tela, temperatura);
  }

  private boolean estaCompleta() {
    return this.tipo != null &&
        this.material != null &&
        this.colorPrimario != null &&
        this.tela != null &&
        this.temperatura != null;
  }
}
