package Exepciones;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String causa) {
    super("La prenda no fue correcta ya que: " + causa);
  }
}