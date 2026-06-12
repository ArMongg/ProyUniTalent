package modelo;

public class OfertaLaboral {

    private int idOferta;
    private int idEmpresa;
    private String titulo;
    private String descripcion;
    private double salario;

    public OfertaLaboral() {
    }

    public OfertaLaboral(int idOferta,
                         int idEmpresa,
                         String titulo,
                         String descripcion,
                         double salario) {

        this.idOferta = idOferta;
        this.idEmpresa = idEmpresa;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}