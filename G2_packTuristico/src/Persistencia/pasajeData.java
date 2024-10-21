
package Persistencia;

import Modelo.Conexion;
import org.mariadb.jdbc.Connection;


public class pasajeData {
    private Connection conn = null;

    public pasajeData() {
        this.conn = (Connection) Conexion.getConexion();
    }
    
    
    
}
