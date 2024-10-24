
package Persistencia;
import AccesoDatos.Conexion;
import Modelo.Turista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class TuristaData {
    private Connection conn = null;

    public TuristaData(){
        this.conn = (Connection) Conexion.getConexion();
    }
    
    public void guardarTurista (Turista turista){
        String sql = "INSERT INTO Turista (dni, nombre, edad, idPaquete) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, turista.getDni());
            ps.setString(2, turista.getNombre());
            ps.setInt(3, turista.getEdad());
            ps.setInt(4, turista.getIdPaquete());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                turista.setDni(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista");
        }
        }
 
    public Turista buscarTurista (int dni) {
        System.out.println("\nbuscar Turista: " + dni);
        Turista turista= null;
        String sql = "SELECT dni, nombre, edad, idPaquete  FROM turista WHERE dni = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                turista = new Turista();
                turista.setDni(rs.getInt("dni"));
                turista.setNombre(rs.getString("nombre"));
                turista.setEdad(rs.getInt("edad"));
                turista.setIdPaquete(rs.getInt("idPaquete"));
             }
            else {
                JOptionPane.showMessageDialog(null, "No existe el cliente");
            }
                rs.close();
                ps.close();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista");
    } return turista;
    
}   
    public void modificarTurista(Turista turista){
        System.out.println("\nModificar Turista:");
        String sql = "UPDATE turista SET dni=?,nombre=?,edad=?,idPaquete=? WHERE dni =?";
        
        try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, turista.getDni());
            ps.setString(2, turista.getNombre());
            ps.setInt(3, turista.getEdad());
            ps.setInt(4, turista.getIdPaquete());
           int exito = ps.executeUpdate();
            System.out.println("Cliente modificado ");
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }
            ps.close();
           }catch (SQLException ex) { 
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista");
           }
        }
     public void bajaTurista(int dni) {
        System.out.println("\nDar de baja a cliente: " + dni);
        String sql = "UPDATE turista SET dni = 0 WHERE dni = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Baja de cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla turista");
        }
    }
     public void altaTurista(int dni) {
        System.out.println("\nDar de alta a cliente: " + dni);
        String sql = "UPDATE turista SET dni = 1 WHERE dni = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alta de cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista");
        }
}

}

