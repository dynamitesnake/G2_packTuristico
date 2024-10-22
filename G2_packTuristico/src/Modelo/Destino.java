package Modelo;

import java.sql.Date;

public class Destino {
    private int codigoDestino;
    private String nombreCiudad;
    private Date fechaInicioTemporadaAlta;
    private Date fechaFinTemporadaAlta;

    // Getters y Setters
    public int getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(int codigoDestino) {
        this.codigoDestino = codigoDestino;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Date getFechaInicioTemporadaAlta() {
        return fechaInicioTemporadaAlta;
    }

    public void setFechaInicioTemporadaAlta(Date fechaInicioTemporadaAlta) {
        this.fechaInicioTemporadaAlta = fechaInicioTemporadaAlta;
    }

    public Date getFechaFinTemporadaAlta() {
        return fechaFinTemporadaAlta;
    }

    public void setFechaFinTemporadaAlta(Date fechaFinTemporadaAlta) {
        this.fechaFinTemporadaAlta = fechaFinTemporadaAlta;
    }
}
