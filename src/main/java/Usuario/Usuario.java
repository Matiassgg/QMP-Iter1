package Usuario;

import Guardarropas.Guardarropas;
import Recomendacion.Recomendacion;
import java.util.List;

public class Usuario {
  List<Guardarropas> guardarropas;
  List<Recomendacion> recomendaciones;
  List<Recomendacion> recomendacionesAceptadas;

  public Usuario(List<Guardarropas> guardarropasCompartido) {
    this.guardarropas = guardarropasCompartido;
  }

  // Alguien (un usuario) me propone una recomendacion para mi guardarropas
  public void agregarRecomendacion(Recomendacion recomendacion) {
    recomendaciones.add(recomendacion);
  }

  // Acepto la recomendacion, la quito de mi lista pendiente de recomendaciones y la agrego como recomendacion aceptada
  public void aceptarRecomendacion(Recomendacion recomendacion) {
    recomendacion.aplicateEnElGuardarropas();
    this.eliminarRecomendacion(recomendacion);
    this.agregarRecomendacionAceptada(recomendacion);
  }

  // Es un pasamanos esto y se parece MUCHO a aceptarRecomendacion(...), algo huele mal (?
  public void rechazarRecomendacion(Recomendacion recomendacion) {
    this.eliminarRecomendacion(recomendacion);
  }

  public void deshacerRecomendacionAceptada(Recomendacion recomendacion) {
    recomendacionesAceptadas.remove(recomendacion);
  }

  //////////////////////////////////////////////////////////////////////////////////

  public List<Recomendacion> getPropuestasModificacion() {
    return recomendaciones;
  }

  public List<Recomendacion> getRecomendacionesAceptadas() {
    return recomendacionesAceptadas;
  }

  private void eliminarRecomendacion(Recomendacion recomendacion) {
    recomendaciones.remove(recomendacion);
  }

  private void agregarRecomendacionAceptada(Recomendacion recomendacion) {
    recomendacionesAceptadas.add(recomendacion);
  }

}
