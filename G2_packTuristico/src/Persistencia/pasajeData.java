
package Persistencia;

import AccesoDatos.Conexion;
import org.mariadb.jdbc.Connection;
import Modelo.Pasaje;
import java.sql.*;
import java.util.*;


public class pasajeData {
    private Connection conn = null;

    public pasajeData() {
        this.conn = (Connection) Conexion.getConexion();
    }
    
    
    
}
