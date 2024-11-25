
package persistencia;

import AccesoDatos.Conexion;
import modelo.Pension;

import java.sql.*;
import java.util.*;

public class PensionData {

    // Método para agregar una nueva pensión
    public void agregarPension(Pension pension) throws SQLException {
        Connection conn = Conexion.getConexion();
        String query = "INSERT INTO pension (idPension, nombre, porcentaje) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, pension.getIdPension());
        stmt.setString(2, pension.getNombre());
        stmt.setDouble(3, pension.getPorcentaje());
        stmt.executeUpdate();
        System.out.println("Pensión agregada correctamente.");
    }

    // Método para eliminar una pensión por idPension
    public void eliminarPension(int idPension) {
        Connection conn = Conexion.getConexion();
        try {
            String query = "DELETE FROM pension WHERE idPension = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idPension);
            stmt.executeUpdate();
            System.out.println("Pensión eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar pensión.");
            e.printStackTrace();
        }
    }

    // Método para modificar una pensión
    public void modificarPension(int idOriginal, Integer idNuevo, Pension pension) {
        Connection conn = Conexion.getConexion();
        try {
            String query;
            if (idNuevo != null) {
                query = "UPDATE pension SET idPension = ?, nombre = ?, porcentaje = ? WHERE idPension = ?";
            } else {
                query = "UPDATE pension SET nombre = ?, porcentaje = ? WHERE idPension = ?";
            }

            PreparedStatement stmt = conn.prepareStatement(query);

            if (idNuevo != null) {
                stmt.setInt(1, idNuevo);
                stmt.setString(2, pension.getNombre());
                stmt.setDouble(3, pension.getPorcentaje());
                stmt.setInt(4, idOriginal);
            } else {
                stmt.setString(1, pension.getNombre());
                stmt.setDouble(2, pension.getPorcentaje());
                stmt.setInt(3, idOriginal);
            }

            stmt.executeUpdate();
            System.out.println("Pensión modificada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar pensión.");
            e.printStackTrace();
        }

    }

    // Método para buscar una pensión por idPension
    public Pension buscarPension(int idPension) {
        Connection conn = Conexion.getConexion();
        Pension pension = null;
        try {
            String query = "SELECT * FROM pension WHERE idPension = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idPension);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pension = new Pension(rs.getInt("idPension"), rs.getString("nombre"), rs.getDouble("porcentaje"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar pensión.");
            e.printStackTrace();
        }
        return pension;
    }

    // Método para listar todas las pensiones
    public List<Pension> listarPensiones() {
        Connection conn = Conexion.getConexion();
        List<Pension> lista = new ArrayList<>();
        try {
            String query = "SELECT * FROM pension";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pension pension = new Pension(rs.getInt("idPension"), rs.getString("nombre"), rs.getDouble("porcentaje"));
                lista.add(pension);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar pensiones.");
            e.printStackTrace();
        }
        return lista;
    }
    
}