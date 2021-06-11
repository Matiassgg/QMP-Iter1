package Usuario;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
  private final static RepositorioUsuarios INSTANCE = new RepositorioUsuarios();
  private final List<Usuario> usuarios = new ArrayList<>();

  public static RepositorioUsuarios getInstance() {
    return INSTANCE;
  }

  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }

}
