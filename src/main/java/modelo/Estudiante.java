package modelo;

public class Estudiante extends Usuario {

    private String nombre;
    private String apellido;
    private String carrera;
    private int ciclo;

    public Estudiante() {
    }

    public Estudiante(int idUsuario,
                      String correo,
                      String contrasena,
                      String rol,
                      String nombre,
                      String apellido,
                      String carrera,
                      int ciclo) {

        super(idUsuario, correo, contrasena, rol);

        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
}