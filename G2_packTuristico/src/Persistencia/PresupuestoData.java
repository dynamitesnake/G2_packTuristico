
package Persistencia;

import Modelo.Alojamiento;
import Modelo.Pasajes;
import modelo.Pension;
import Modelo.Presupuesto;


public class PresupuestoData {
 
   
    public double calcularPresupuesto(Presupuesto presupuesto){
        double costoPasaje = presupuesto.getCostoPasaje();
        double costoAlojamiento = presupuesto.getCostoAlojamiento();
        double costoPension = presupuesto.getCostoPension();
        int cantPasajeros = presupuesto.getCantPasajeros();
        int cantidadDias = presupuesto.getCantidadDias();
        String Temporada = presupuesto.getTemporada();
        
        
        double costoTotal = costoPasaje * cantPasajeros;
        
       switch(Temporada.toLowerCase()){
           case "Alta":
               costoTotal *= 1.3;
               break;
           case "Media":
               costoTotal *= 1.15;
               break;
           case "baja":
               break;
               
           default:
               throw new  IllegalArgumentException( "Temporada no valida: "  + Temporada);
       }
        
       double totalPension = costoPension * cantidadDias * cantPasajeros;
       double totalAlojamiento = cantidadDias * costoAlojamiento;
       double totalPasaje = costoPasaje * cantPasajeros;
       
       return costoTotal + totalPension + totalAlojamiento + totalPasaje ;
       
               
               
    }}
    
  
 
   

