package modelo;

import java.time.LocalDate;

public class Postulacion {

    private int idPostulacion;
    private int idOferta;
    private int idEstudiante;
    private LocalDate fecha;
    private String estado;

    public Postulacion() {
    }

    public Postulacion(int idPostulacion,
                       int idOferta,
                       int idEstudiante,
                       LocalDate fecha,
                       String estado) {

        this.idPostulacion = idPostulacion;
        this.idOferta = idOferta;
        this.idEstudiante = idEstudiante;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(int idPostulacion) {
        this.idPostulacion = idPostulacion;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}