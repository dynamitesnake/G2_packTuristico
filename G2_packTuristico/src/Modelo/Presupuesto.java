
package Modelo;


public class Presupuesto {
     private double costoPension;
  private double costoAlojamiento;
  private double costoPasaje;
  private int cantPasajeros;
  private int cantidadDias;
  private String Temporada;

  //constructores:
    public Presupuesto(double costoPension, double costoAlojamiento, double costoPasaje, int cantPasajeros, int cantidadDias, String Temporada) {
        this.costoPension = costoPension;
        this.costoAlojamiento = costoAlojamiento;
        this.costoPasaje = costoPasaje;
        this.cantPasajeros = cantPasajeros;
        this.cantidadDias = cantidadDias;
        this.Temporada = Temporada;
    }

    public Presupuesto() {
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }

    public double getCostoPension() {
        return costoPension;
    }

    public void setCostoPension(double costoPension) {
        this.costoPension = costoPension;
    }

    public double getCostoAlojamiento() {
        return costoAlojamiento;
    }

    public void setCostoAlojamiento(double costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(double costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}
