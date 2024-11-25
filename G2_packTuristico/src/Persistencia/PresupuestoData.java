
package Persistencia;

import Modelo.Alojamiento;
import Modelo.Pasajes;
import modelo.Pension;


public class PresupuestoData {
  private double costoPension;
  private double costoAlojamiento;
  private double costoPasaje;
  private int cantPasajeros;
  private int cantidadDias;
  private String Temporada;

  //constructores:
    public PresupuestoData(double costoPension, double costoAlojamiento, double costoPasaje, int cantPasajeros, int cantidadDias, String Temporada) {
        this.costoPension = costoPension;
        this.costoAlojamiento = costoAlojamiento;
        this.costoPasaje = costoPasaje;
        this.cantPasajeros = cantPasajeros;
        this.cantidadDias = cantidadDias;
        this.Temporada = Temporada;
    }

    public PresupuestoData() {
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
   //Metodo para calcular el transporte por temporada: 
    public double calcularCostoTransporte(){
        double costoTotal = costoPasaje * cantPasajeros;
        switch(Temporada){
            case "Alta":
                return costoTotal * 1.30;
            case "Media":
                return costoTotal * 1.15;
            default:
                return costoTotal;
        }
     
  }
  //metodo de calculo total:
  public double calcularCostoTotal(){
      double totalPension = costoPension * cantidadDias * cantPasajeros;
      double totalAlojamiento = cantidadDias * costoAlojamiento;
      double totalPasaje = costoPasaje * cantPasajeros;
      return totalPension + totalAlojamiento + totalPasaje;
  }
   
}
