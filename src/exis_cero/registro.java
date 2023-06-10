
package exis_cero;

public class registro {
    private String nombreUser;
    private String contrasena;

    public registro(String nombreUser, String contrasena) {
      this.nombreUser = nombreUser;
        this.contrasena = contrasena;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}