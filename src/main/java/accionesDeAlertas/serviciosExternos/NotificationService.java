// Se cuenta con una API Para Java del sistema operativo que envía notificaciones en la pantalla
// al usuario mientras navega el sitio.
package accionesDeAlertas.serviciosExternos;

// Esto deberia ser la API, la hago a mano simplemente para que no tire error java
public class NotificationService {
  public void notify(String text) {
    System.out.println(text);
  }
}
