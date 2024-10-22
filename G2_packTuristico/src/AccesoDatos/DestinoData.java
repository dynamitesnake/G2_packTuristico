package AccesoDatos;

import Modelo.Destino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DestinoData {
    private Connection connection;

    public DestinoData() {
        this.connection = Conexion.getConexion();
    }

    public void guardarDestino(Destino destino) {
        String sql = "INSERT INTO destino (nombre_ciudad, fecha_inicio_temporada_alta, fecha_fin_temporada_alta) VALUES (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, destino.getNombreCiudad());
            ps.setDate(2, destino.getFechaInicioTemporadaAlta());
            ps.setDate(3, destino.getFechaFinTemporadaAlta());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al guardar destino: " + e.getMessage());
        }
    }

    public List<Destino> obtenerDestinos() {
        List<Destino> destinos = new ArrayList<>();
        String sql = "SELECT * FROM destino";
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Destino destino = new Destino();
                destino.setCodigoDestino(rs.getInt("codigo_destino"));
                destino.setNombreCiudad(rs.getString("nombre_ciudad"));
                destino.setFechaInicioTemporadaAlta(rs.getDate("fecha_inicio_temporada_alta"));
                destino.setFechaFinTemporadaAlta(rs.getDate("fecha_fin_temporada_alta"));
                destinos.add(destino);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener destinos: " + e.getMessage());
        }
        return destinos;
    }

    // Aquí puedes agregar más métodos para actualizar y eliminar destinos.
}


