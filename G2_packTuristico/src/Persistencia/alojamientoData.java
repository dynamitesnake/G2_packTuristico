
package Persistencia;
import AccesoDatos.Conexion;
import Modelo.Alojamiento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pension;
import org.mariadb.jdbc.Connection;



public class alojamientoData {
    private Connection conn = null;
    
    public alojamientoData(){
        this.conn = (Connection) Conexion.getConexion();
    }
    
    public void guardarAlojamiento(Alojamiento alojamiento) {
    System.out.println("\nGuardar Alojamiento: ");
    String sql = "INSERT INTO alojamiento(nombre, capacidad, nroAmbientes, camas, baños, precioNoche) VALUES (?,?,?,?,?,?)";

    try {
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, alojamiento.getNombre());
        ps.setInt(2, alojamiento.getCapacidad());
        ps.setInt(3, alojamiento.getNroAmbientes());
        ps.setInt(4, alojamiento.getCamas());
        ps.setInt(5, alojamiento.getBaños());
        ps.setDouble(6, alojamiento.getPrecioNoche()); 
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            alojamiento.setIdAlojamiento(rs.getInt(1));
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento: " + ex.getMessage());
    }
}

    public void modificarAlojamiento(Alojamiento alojamiento) {
        System.out.println("\nModificar Alojamiento:");
        String sql = "UPDATE alojamiento SET idAlojamiento=?, nombre=?, capacidad=?, nroAmbientes=?, camas=?, baños=?, precioNoche=? WHERE idAlojamiento =?";

            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, alojamiento.getIdAlojamiento());
                ps.setString(2, alojamiento.getNombre());
                ps.setInt(3, alojamiento.getCapacidad());
                ps.setInt(4, alojamiento.getNroAmbientes());
                ps.setInt(5, alojamiento.getCamas());
                ps.setInt(6, alojamiento.getBaños());
                ps.setDouble(7, alojamiento.getPrecioNoche()); 
                ps.setInt(8, alojamiento.getIdAlojamiento());

                int exito = ps.executeUpdate();
                if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El alojamiento no existe");
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento: " + ex.getMessage());
        }
}

public void bajaAlojamiento(int IdAlojamiento) {
    System.out.println("\nDar de baja a alojamiento: " + IdAlojamiento);
    String sql = "UPDATE alojamiento SET idAlojamiento = 0 WHERE idAlojamiento = ?"; 
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, IdAlojamiento);
        int fila = ps.executeUpdate();
        if (fila == 1) {
            JOptionPane.showMessageDialog(null, "Baja de alojamiento");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento: " + ex.getMessage());
    }
}

public void altaAlojamiento(int IdAlojamiento) {
    System.out.println("\nDar de alta a alojamiento: " + IdAlojamiento);
    String sql = "UPDATE alojamiento SET idAlojamiento = 1 WHERE idAlojamiento = ?"; 
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, IdAlojamiento);
        int fila = ps.executeUpdate();
        if (fila == 1) {
            JOptionPane.showMessageDialog(null, "Alta de alojamiento");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento: " + ex.getMessage());
    }
    }
public void eliminarAlojamiento(int idAlojamiento) {
        java.sql.Connection conn = Conexion.getConexion();
        try {
            String query = "DELETE FROM alojamiento WHERE idAlojamiento = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idAlojamiento);
            stmt.executeUpdate();
            System.out.println("Alojamiento eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar Alojamiento.");
            e.printStackTrace();
        }
    }
public Alojamiento buscarAlojamiento(int idAlojamiento) {
        java.sql.Connection conn = Conexion.getConexion();
        Alojamiento alojamiento = null;
        try {
            String query = "SELECT * FROM alojamiento WHERE idAlojamiento = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idAlojamiento);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                alojamiento = new Alojamiento (rs.getInt("idAlojamiento"), rs.getString("nombre"), rs.getInt("capacidad"), rs.getInt("nroAmbientes"), rs.getInt("camas"), rs.getInt("baños"), rs.getDouble("precioNoche") );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el alojamiento.");
            e.printStackTrace();
        }
         return alojamiento;
    }
public List<Alojamiento> listarAlojamiento() {
        java.sql.Connection conn = Conexion.getConexion();
        List<Alojamiento> lista = new ArrayList<>();
        try {
            String query = "SELECT * FROM alojamiento";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento(rs.getInt("idAlojamiento"), rs.getString("nombre"), rs.getInt("capacidad"), rs.getInt("nroAmbientes"), rs.getInt("camas"), rs.getInt("baños"), rs.getDouble("precioNoche") );
                lista.add(alojamiento);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar alojamientos.");
            e.printStackTrace();
        }
        return lista;
    }
}