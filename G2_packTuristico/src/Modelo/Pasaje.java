
package Modelo;

import java.time.LocalDate;


public class Pasaje {
    private int codPasaje;
    private LocalDate fechaHora;
    private String origen;
    private String destino;
    private int asiento;

    public Pasaje(int codPasaje, LocalDate fechaHora, String origen, String destino, int asiento) {
        this.codPasaje = codPasaje;
        this.fechaHora = fechaHora;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }

    public Pasaje(LocalDate fechaHora, String origen, String destino, int asiento) {
        this.fechaHora = fechaHora;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }

    public Pasaje() {
      
    }

    public int getCodPasaje() {
        return codPasaje;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setCodPasaje(int codPasaje) {
        this.codPasaje = codPasaje;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "codPasaje=" + codPasaje + ", fechaHora=" + fechaHora + ", origen=" + origen + ", destino=" + destino + ", asiento=" + asiento + '}';
    }
    
    
    
}
