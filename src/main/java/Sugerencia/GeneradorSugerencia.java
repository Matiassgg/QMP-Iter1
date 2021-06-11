package Sugerencia;

import Prenda.Prenda;
import Prenda.PrendaBorrador;
import CaracteristicasPrendas.TipoPrenda;
import CaracteristicasPrendas.Color;
import Usuario.RepositorioUsuarios;
import Usuario.Usuario;
import servicioDelClima.ServicioMeteorologico;
import java.util.Arrays;

public class GeneradorSugerencia {
  private ServicioMeteorologico servicioMeteorologico;
  private final RepositorioUsuarios repositorioUsuarios = RepositorioUsuarios.getInstance();

  public GeneradorSugerencia(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Sugerencia generar(Usuario usuario, ServicioMeteorologico servicioMeteorologico) {
    // Por ahora asi, seria la sugerencia que se genera para el usuario con un X clima de ServicioMeteorologico
    return new Sugerencia(Arrays.asList(crearPrendaRandomA(), crearPrendaRandomB()));
  }

  public void caluloDeSugerenciaDiaria() {
    repositorioUsuarios
        .getUsuarios()
        .forEach(usuario -> usuario.actualizarSugerencia(this.generar(usuario, servicioMeteorologico)));
  }

  // Solo para poder generar una sugerencia random
  //////////////////////////////////////////////////////////////////////////////////////

  private Prenda crearPrendaRandomA() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.CAMISA_MANGA_CORTA);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(255, 255, 255));
    return borrador.crearPrenda();
  }

  private Prenda crearPrendaRandomB() {
    PrendaBorrador borrador = new PrendaBorrador(TipoPrenda.PANTALON);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(0, 0, 0));
    return borrador.crearPrenda();
  }

}
