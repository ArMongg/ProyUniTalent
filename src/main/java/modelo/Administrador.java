package modelo;

public class Administrador extends Usuario {

    private String nombre;

    public Administrador() {
    }

    public Administrador(int idUsuario,
                         String correo,
                         String contrasena,
                         String rol,
                         String nombre) {

        super(idUsuario, correo, contrasena, rol);

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}