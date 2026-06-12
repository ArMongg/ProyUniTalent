package modelo;

import java.time.LocalDate;

public class Reporte {

    private int idReporte;
    private String tipo;
    private LocalDate fechaGeneracion;

    public Reporte() {
    }

    public Reporte(int idReporte,
                   String tipo,
                   LocalDate fechaGeneracion) {

        this.idReporte = idReporte;
        this.tipo = tipo;
        this.fechaGeneracion = fechaGeneracion;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    
}