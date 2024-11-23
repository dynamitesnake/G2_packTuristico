
package Modelo;

import java.time.LocalDate;



public class Pasajes {
    private int codPasaje;
    private LocalDate fechaida;
    private LocalDate fechavuelta;
    private String origen;
    private String destino;
    private int asiento;

    public Pasajes(int codPasaje, LocalDate fechaida, LocalDate fechavuelta, String origen, String destino, int asiento) {
        this.codPasaje = codPasaje;
        this.fechaida = fechaida;
        this.fechavuelta = fechavuelta;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }

    public Pasajes( LocalDate fechaida, LocalDate fechavuelta, String origen, String destino, int asiento) {
        this.fechaida = fechaida;
        this.fechavuelta = fechavuelta;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }

    public Pasajes() {
      
    }

    public int getCodPasaje() {
        return codPasaje;
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

   

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public LocalDate getFechaida() {
        return fechaida;
    }

    public LocalDate getFechavuelta() {
        return fechavuelta;
    }

    public void setFechaida(LocalDate fechaida) {
        this.fechaida = fechaida;
    }

    public void setFechavuelta(LocalDate fechavuelta) {
        this.fechavuelta = fechavuelta;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "codPasaje=" + codPasaje + ", fechaida=" + fechaida + ", fechavuelta=" + fechavuelta + ", origen=" + origen + ", destino=" + destino + ", asiento=" + asiento + '}';
    }

  
    
}
