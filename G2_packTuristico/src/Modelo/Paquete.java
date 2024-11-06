
package Modelo;

import java.time.LocalDate;


public class Paquete {
    
    private int idPaquete;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String origen;
    private String destino;
    private String traslados;
    private double montoFinal;
    private int idPasaje;
    private int idAlojamiento;
    private int idPension;

    
    public Paquete() {
    }

    public Paquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Paquete(int idPaquete, LocalDate fechaIni, LocalDate fechaFin, String origen, String destino, String traslados, double montoFinal, int idPasaje, int idAlojaminto, int idPension) {
        this.idPaquete = idPaquete;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.origen = origen;
        this.destino = destino;
        this.traslados = traslados;
        this.montoFinal = montoFinal;
        this.idPasaje = idPasaje;
        this.idAlojamiento = idAlojamiento;
        this.idPension = idPension;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTraslados() {
        return traslados;
    }

    public void setTraslados(String traslados) {
        this.traslados = traslados;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public int getIdPension() {
        return idPension;
    }

    public void setIdPension(int idPension) {
        this.idPension = idPension;
    }
 
     @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", origen=" + origen + ", destino=" + destino + ", traslados=" + traslados 
                + ", montoFinal=" + montoFinal + ", idPasaje=" + idPasaje + ", idAlojamiento=" + idAlojamiento + ", idPension=" + idPension + "}";
}

}