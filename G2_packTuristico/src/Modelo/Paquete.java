
package Modelo;

import java.time.LocalDate;


public class Paquete {
    
    private int idPaquete;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String origen;
    private String destino;
    private String medioViaje;
    private double montoFinal;
    private int idPasaje;
    private int idAlojamiento;
    private int idPension;
    private int pasajeros;

    
    public Paquete() {
    }

    public Paquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Paquete(int idPaquete, LocalDate fechaIni, LocalDate fechaFin, String origen, String destino, String medioViaje, double montoFinal, int idPasaje, int idAlojaminto, int idPension, int pasajeros) {
        this.idPaquete = idPaquete;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.origen = origen;
        this.destino = destino;
        this.medioViaje = medioViaje;
        this.montoFinal = montoFinal;
        this.idPasaje = idPasaje;
        this.idAlojamiento = idAlojamiento;
        this.idPension = idPension;
        this.pasajeros= pasajeros;
    }

    public String getMedioViaje() {
        return medioViaje;
    }

    public void setMedioViaje(String medioViaje) {
        this.medioViaje = medioViaje;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
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
        return "Paquete{" + "idPaquete=" + idPaquete + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", origen=" + origen + ", destino=" + destino + ", medioViaje=" + medioViaje 
                + ", montoFinal=" + montoFinal + ", idPasaje=" + idPasaje + ", idAlojamiento=" + idAlojamiento + ", idPension=" + idPension +"pasajeros"+ pasajeros + "}";
}

}