
package Persistencia;

import AccesoDatos.Conexion;
import org.mariadb.jdbc.Connection;
import Modelo.Turista;
import Vista.VistaTurista;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


public class TuristaData {
    private Connection conn = null;

    public TuristaData(){
        this.conn = (Connection) Conexion.getConexion();
    }
    
    public void guardarTurista (Turista tu){
        System.out.println("\nGuardar turista: ");
        String sql = "INSERT INTO Turista (dni, nombre, edad, idpaquete, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tu.getDni());
            ps.setString(2, tu.getNombre());
            ps.setInt(3, tu.getEdad());
            ps.setInt(4, tu.getIdPaquete());
            ps.setBoolean(5, tu.isActivo()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tu.setDni(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista");
        }
        }
 
    public Turista buscarTurista(int dni) {
    System.out.println("\nbuscar Turista: " + dni);
    Turista turista = null;
    String sql = "SELECT * FROM dni, nombre, edad, idPaquete, estado FROM turista WHERE dni = ?";
    
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            turista = new Turista();
            turista.setDni(rs.getInt("dni"));
            turista.setNombre(rs.getString("nombre"));
            turista.setEdad(rs.getInt("edad"));
            turista.setIdPaquete(rs.getInt("idPaquete"));
        } else {
            JOptionPane.showMessageDialog(null, "No existe el cliente");
        }
        
        rs.close();
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista");
        ex.printStackTrace(); 
    }
    return turista;
}

   
    public void modificarTurista(Turista turista){
        System.out.println("\nModificar Turista:");
String sql = "UPDATE turista SET dni = ?, nombre = ?, edad = ?, idPaquete = ?, estado = ? WHERE dni = ?";

try {
    
    if (conn == null || conn.isClosed()) {
        throw new SQLException("La conexión a la base de datos no está establecida.");
    }

    
    String selectSql = "SELECT COUNT(*) FROM turista WHERE dni = ?";
    PreparedStatement selectPs = conn.prepareStatement(selectSql);
    selectPs.setInt(1, turista.getDni());
    ResultSet rs = selectPs.executeQuery();
    if (rs.next() && rs.getInt(1) == 0) {
        JOptionPane.showMessageDialog(null, "El cliente no existe en la base de datos");
        return;
    }

    
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, turista.getDni());
    ps.setString(2, turista.getNombre());
    ps.setInt(3, turista.getEdad());
    ps.setInt(4, turista.getIdPaquete());
    ps.setInt(5, turista.getDni()); 

    int exito = ps.executeUpdate();
    if (exito == 1) {
        JOptionPane.showMessageDialog(null, "Modificado exitosamente");
    } else {
        JOptionPane.showMessageDialog(null, "El cliente no existe");
    }

    ps.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista: " + ex.getMessage());
}
}

     public void eliminarTurista(int dni) {
   java.sql.Connection conn = Conexion.getConexion();
        try {
            String query = "DELETE FROM turista WHERE dni = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, dni);
            stmt.executeUpdate();
            System.out.println("turista eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el turista.");
            e.printStackTrace();
        }
    }
   

    public void guardarTurista(VistaTurista turista) {
        
    }
    
    
}