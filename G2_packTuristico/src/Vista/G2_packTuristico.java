
package Vista;

import AccesoDatos.Conexion;
import Modelo.Alojamiento;
import Modelo.Habitacion;
import Modelo.Pasaje;
import Modelo.Turista;
import Persistencia.HabitacionData;

import Persistencia.pasajeData;
import Persistencia.TuristaData;
import Persistencia.alojamientoData;
import java.sql.Connection;
import java.time.LocalDate;


public class G2_packTuristico {

    
    public static void main(String[] args) {
       Connection conn = Conexion.getConexion();
       conectarAlojamiento ();
       //conectaTurista();
       
      /* Pasaje pasaje = new Pasaje(1,LocalDate.now(),"san luis","mar del plata",4);
       pasajeData pasaData= new pasajeData();
       
       pasaData.guardPasaje(pasaje);
       
       pasaData.buscarPasajeId(1);
       
       pasaData.darDeBajaPorId(1);
       
       pasaData.darDeAltaPorId(1);}
       
    public static void conectaTurista() {
       Turista turista = new Turista(666666,"Agostina Camargo", 36, 1);
       TuristaData turiData= new TuristaData();
       
       turiData.guardarTurista(turista);
       
       turiData.buscarTurista(666666);
       
       turiData.modificarTurista(turista);
       
       turiData.bajaTurista(666666);
       
       turiData.altaTurista(666666);} 
       
       /*   Habitacion hab3 = new Habitacion(2, 73, 4, 2);
       HabitacionData hab= new HabitacionData();
   
       hab.guardarHabitacion(hab3);
       hab.modificarHabitacion(hab3);
       hab.eliminarHabitacion(2);  */}
    
    public static void conectarAlojamiento () {
        alojamientoData alo = new alojamientoData();
        Alojamiento alo1 = new Alojamiento (0,"cabaña los pepitos",3,2,6,1,20000);
   
        //alo.guardarAlojamiento(alo1);
        //alo.modificarAlojamiento(alo1);
        //alo.eliminarAlojamiento(2);
        //alo.buscarAlojamiento(3);
        //   System.out.println( alo.buscarAlojamiento(3));   
      
    }
    
}


