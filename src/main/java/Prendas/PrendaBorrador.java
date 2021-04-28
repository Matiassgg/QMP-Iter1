package Prendas;
import CaracteristicasPrendas.*;
import Exepciones.PrendaInvalidaException;

// Ahora se empieza a construir una prenda de a poco en base a su borrador
// Las validaciones se hacen en el borrador
public class PrendaBorrador {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrimario;
  Color colorSecundario;
  TramaPrenda tela;

  // Voy creando de 'a poco' la prenda borrador en base a como la cree alguien
  // para eventualmente, continuar después (si no se completo la misma)
  public PrendaBorrador(TipoPrenda tipo) {
    // Primero viene el tipo
    this.setTipo(tipo);
  }

  public void setTipo(TipoPrenda tipo) {
    if(tipo == null) {
      throw new PrendaInvalidaException("se debe especificar el tipo de la la prenda");
    }
    this.tipo = tipo;
  }

  public void setMaterial(MaterialPrenda material) {
    this.validarMaterialConTipoPrenda(material);
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {
    if(colorPrimario == null) {
      throw new PrendaInvalidaException("se debe especificar el color primario de la la prenda");
    }
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    // No me importa validar el color secundario ya que es opcional
    this.colorSecundario = colorSecundario;
  }

  public void setTela(TramaPrenda tela) {
    // Por defecto, la tela es de tipo Lisa sino se especifica nada
    if(tela == null) {
      this.tela = TramaPrenda.LISA;
    }
    else {
      this.tela = tela;
    }
  }

  private void validarMaterialConTipoPrenda(MaterialPrenda material) {
    if(material == null) {
      throw new PrendaInvalidaException("se debe especificar el material de la la prenda");
    }
    else if(!material.esValidoEl(tipo)) {
      throw new PrendaInvalidaException("el material de la prenda no se condice con tu tipo");
    }
  }

  public Prenda crearPrenda() {
    // this.chequearDatosNulos(tipo, material, colorPrimario);
    /*
      Lo comento y dejo a propósito para aclarar que:
      Las validaciones de este método ahora pasan a hacerlas cada
      uno de los métodos anteriores al momento de la creación
      Esto se hizo asi para poder ir construyendo de a poco la prenda
      y que las validaciones se corran en cada paso de 'construcción'
    */
    return new Prenda(tipo, colorPrimario, colorSecundario, material, tela);
  }

}
