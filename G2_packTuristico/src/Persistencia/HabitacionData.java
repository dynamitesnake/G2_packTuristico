
package Persistencia;

import AccesoDatos.Conexion;
import Modelo.Habitacion;
import java.sql.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





/**
 *
 * @author deborahhhh
 */


public class HabitacionData {
  private Connection conn = null;

    public HabitacionData() {
        this.conn =  (org.mariadb.jdbc.Connection) Conexion.getConexion();
    }
  
  
    
    
 public void guardarHabitacion(Habitacion habitacion){
     Connection conn = Conexion.getConexion();
    
 String sql = "INSERT INTO habitacion (idHabitacion, planta, numeracion, cupo, estado, idalojamiento) VALUES (?, ?, ?, ?, ?, ?)";
 
        try {
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getidHabitacion());
            ps.setInt(2, habitacion.getPlanta());
            ps.setInt(3, habitacion.getNumeracion());
            ps.setInt(4,habitacion.getCupo());
            ps.setBoolean(5, habitacion.isActivo()); 
            ps.setInt(6,habitacion.getIdalojamiento());
            ps.executeUpdate();
            
         ResultSet rs = ps.getGeneratedKeys();
         if(rs.next()){
         habitacion.setidHabitacion(rs.getInt(1));
         JOptionPane.showMessageDialog(null, "Habitacio guardada");
         }
         ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla Habitacion");
        }
 }
 
 public void modificarHabitacion(Habitacion habitacion) {
    Connection conn = Conexion.getConexion();
    String sql = "UPDATE habitacion SET planta = ?, numeracion = ?, cupo = ?, estado = ?, idalojamiento = ? WHERE idHabitacion = ?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, habitacion.getPlanta());
        ps.setInt(2, habitacion.getNumeracion());
        ps.setInt(3, habitacion.getCupo());
        ps.setBoolean(4, habitacion.isActivo());
        ps.setInt(5, habitacion.getIdalojamiento());
        ps.setInt(6, habitacion.getidHabitacion()); 

        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Habitación modificada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una habitación con el id especificado");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar modificar la tabla Habitación: " + ex.getMessage());
    }
}

      
 
 
 public void eliminarHabitacion (int idHabitacion) {
             java.sql.Connection conn = Conexion.getConexion();
        try {
            String query = "DELETE FROM habitacion WHERE idHabitacion = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idHabitacion);
            stmt.executeUpdate();
            System.out.println("Habitacion eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar Habitacion.");
            e.printStackTrace();
        }
    }
 public Habitacion buscarHabitacion(int idHabitacion){
   java.sql.Connection conn = Conexion.getConexion();
        Habitacion habitacion = null;
        try {
            String query = "SELECT * FROM habitacion WHERE idHabitacion = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idHabitacion);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                habitacion = new Habitacion (rs.getInt("idHabitacion"), rs.getInt("Planta"), rs.getInt("Numeracion"), rs.getInt("Cupo"), rs.getInt("idAlojamiento"), rs.getBoolean("Estado"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar la habitacion.");
            e.printStackTrace();
        }
         return habitacion;
    }

    
    
}
