
package Vista;

import AccesoDatos.Conexion;
import Modelo.Pasaje;
import Persistencia.pasajeData;
import java.sql.Connection;
import java.time.LocalDate;


public class G2_packTuristico {

    
    public static void main(String[] args) {
       Connection conn = Conexion.getConexion();
       Pasaje pasaje = new Pasaje(1,LocalDate.now(),"san luis","mar del plata",4);
       
       pasajeData pasaData= new pasajeData();
       pasaData.guardPasaje(pasaje);
       
    }
    
}
