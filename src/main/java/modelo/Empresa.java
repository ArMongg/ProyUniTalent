package modelo;

public class Empresa extends Usuario {

    private String razonSocial;
    private String ruc;
    private String sector;

    public Empresa() {
    }

    public Empresa(int idUsuario,
                   String correo,
                   String contrasena,
                   String rol,
                   String razonSocial,
                   String ruc,
                   String sector) {

        super(idUsuario, correo, contrasena, rol);

        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.sector = sector;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}