
package Persistencia;
import AccesoDatos.Conexion;
import Modelo.Alojamiento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;



public class alojamientoData {
    private Connection conn = null;
    
    private alojamientoData(){
        this.conn = (Connection) Conexion.getConexion();
    }
    
    public void guardarAlojamiento (Alojamiento alojamiento){
        System.out.println("\nGuardar Alojamiento: ");
        String sql = "INSERT INTO alojamiento(nombre, capacidad, nroAmbientes, camas, baños, precioNoche) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alojamiento.getNombre());
            ps.setInt(2, alojamiento.getCapacidad());
            ps.setInt(3, alojamiento.getNroAmbientes());
            ps.setInt(4, alojamiento.getCamas());
            ps.setInt(5, alojamiento.getBaños());
            ps.setDouble(5, alojamiento.getPrecioNoche());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alojamiento.setIdAlojamiento(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento");
        }
 }
    public Alojamiento buscarAlojamientoid (int IdAlojamiento) {
        System.out.println("\nbuscar Alojamiento: " + IdAlojamiento);
        Alojamiento alojamiento= null;
        String sql = "SELECT idAlojamiento, nombre, capacidad, nroAmbientes, camas, baños, precioNoche FROM alojamiento WHERE idAlojamiento = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, IdAlojamiento);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(IdAlojamiento);
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setCapacidad(rs.getInt("capacidad"));
                alojamiento.setNroAmbientes(rs.getInt("nroAmbientes"));
                alojamiento.setCamas(rs.getInt("camas"));
                alojamiento.setBaños(rs.getInt("baños"));
                alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
             }
            else {
                JOptionPane.showMessageDialog(null, "No existe el alojamiento");
            }
                rs.close();
                ps.close();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento");
    } return alojamiento;
    
}   
    public void modificarAlojamiento(Alojamiento alojamiento){
        System.out.println("\nModificar Alojamiento:");
        String sql = "UPDATE alojamiento SET nombre=?,capacidad=?,nroAmbientes=?,camas=?,baños=?,precioNoche=? WHERE idAlojamiento =?";
        
        try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, alojamiento.getNombre());
            ps.setInt(2, alojamiento.getCapacidad());
            ps.setInt(3, alojamiento.getNroAmbientes());
            ps.setInt(4, alojamiento.getCamas());
            ps.setInt(5, alojamiento.getBaños());
            ps.setDouble(5, alojamiento.getPrecioNoche());
           int exito = ps.executeUpdate();
            System.out.println("Alojamiento modificado ");
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El pasaje no existe");
            }
            ps.close();
           }catch (SQLException ex) { 
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento");
           }
        }
     public void bajaAlojamiento(int IdAlojamiento) {
        System.out.println("\nDar de baja a alojamiento: " + IdAlojamiento);
        String sql = "UPDATE alojamiento SET idAlojamiento = 0 WHERE idAlojamiento = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, IdAlojamiento);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Baja de alojamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla alojamiento");
        }
    }
     public void altaAlojamiento(int IdAlojamiento) {
        System.out.println("\nDar de alta a alojamiento: " + IdAlojamiento);
        String sql = "UPDATE alojamiento SET idAlojamiento = 1 WHERE idAlojamiento = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, IdAlojamiento);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alta de alojamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento");
        }
    
    
}

}