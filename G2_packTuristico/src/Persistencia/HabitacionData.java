
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
    
    
 public void guardarHabitacion(Habitacion habitacion){
     Connection conn = Conexion.getConexion();
    
 String sql = "INSERT INTO habitacion(planta, numeracion, cupo, estado) VALUES (?, ?, ?, ?)";
 
        try {
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getPlanta());
            ps.setInt(2, habitacion.getNumeracion());
            ps.setInt(3,habitacion.getCupo());
            ps.setBoolean(4, habitacion.isActivo()); 
            ps.executeUpdate();
            
         ResultSet rs = ps.getGeneratedKeys();
         if(rs.next()){
         habitacion.setIdHabitacion(rs.getInt(1));
         JOptionPane.showMessageDialog(null, "Habitacio guardada");
         }
         ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al acceder a la tabla Habitacion");
        }
 }
 
 public void modificarHabitacion (Habitacion habitacion){
         Connection conn = Conexion.getConexion();
 String sql = "UPDATE habitacion SET planta= ?, numeracion= ?, cupo= ? + WHERE idHabitacion = ?";
      try {
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(2, habitacion.getPlanta());
          ps.setInt(3, habitacion.getNumeracion());
          ps.setInt(4, habitacion.getCupo());
          ps.setInt(5, habitacion.getIdHabitacion());
         int exito = ps.executeUpdate();
         if(exito ==1){
         JOptionPane.showMessageDialog(null, "Habitacion Modificada");
         }
         
          
          
                  
                  } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "error al intentar modificar tabla Habitacion");
      }
 
 }
 public void eliminarHabitacion (int id) {
     String sql = "UPDATE habitacion SET estado = 0 WHERE idHabitacion = ?";
      try {
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1,id);
         int exito = ps.executeUpdate();
          if(exito ==1){
         JOptionPane.showMessageDialog(null, "Habitacion eliminada");
         }
         
          
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "error al intentar eliminar en tabla habication");
      }
     
     
 }
 public Habitacion buscarHabitacion(int id){
     System.out.println("\nBuscar habitacion por id:" + id);
        Habitacion habitacion = null;
        
        String sql = "SELECT  planta, numeracion, cupo, idalojamiento FROM habitacion WHERE idHabitacion = ? AND estado =1" ;
      try {
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1,id);
          ResultSet rs = ps.executeQuery();
          if(rs.next()){
          habitacion = new Habitacion();
          habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
          habitacion.setPlanta(rs.getInt("planta"));
          habitacion.setNumeracion(rs.getInt("numeracion"));
          habitacion.setCupo(rs.getInt("cupo"));
          habitacion.setActivo(true);
          
          } else {
            JOptionPane.showMessageDialog(null, "No existe la habitacion con el ID espesificado");
            }
                rs.close();
                ps.close();
          
            
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "No existe habitacion con ese ID");
      }
        
        return habitacion;
     }

    
    
}
