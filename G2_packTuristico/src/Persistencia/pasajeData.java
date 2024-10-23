
package Persistencia;

import AccesoDatos.Conexion;
import org.mariadb.jdbc.Connection;
import Modelo.Pasaje;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


public class pasajeData {
    private Connection conn = null;

    public pasajeData() {
        this.conn = (Connection) Conexion.getConexion();
    }
     public void guardPasaje(Pasaje pasaje) {
        System.out.println("\nGuardar pasaje: " + pasaje.getDestino());
        String sql = "INSERT INTO pasaje (fechaHora, origen, destino, asiento) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, java.sql.Date.valueOf(pasaje.getFechaHora()));
            ps.setString(2, pasaje.getOrigen());
            ps.setString(3,pasaje.getDestino());
            ps.setInt(4,pasaje.getAsiento());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setCodPasaje(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("pruebas");
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje");
        }
    }
     public Pasaje buscarPasajeId(int idpasaje) {
        System.out.println("\nBuscar pasaje por id: " + idpasaje);
        Pasaje pasaje = null;
        String sql = "SELECT fechaHora, origen, destino, asiento FROM pasaje WHERE idPasaje = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idpasaje);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setCodPasaje(idpasaje);
                pasaje.setFechaHora(rs.getDate("fechaHora").toLocalDate());
                pasaje.setOrigen(rs.getString("origen"));
                pasaje.setDestino(rs.getString("destino"));
                pasaje.setAsiento(rs.getInt("asiento"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasaje");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje");
        }
        return pasaje;
    }
     public void modificarPasaje(Pasaje pasaje) {
        System.out.println("\nModificar pasaje: " + pasaje.getCodPasaje());
        String sql = "UPDATE pasaje SET fechaHora = ?, origen = ?, destino = ?, asiento = ? WHERE idPasaje = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(pasaje.getFechaHora()));
            ps.setString(2, pasaje.getOrigen());
            ps.setString(3, pasaje.getDestino());
            ps.setInt(4,pasaje.getAsiento());
            ps.setInt(5, pasaje.getCodPasaje()); 
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El pasaje no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje");
        }
    }
     public void darDeBajaPorId(int idPasaje) {
        System.out.println("\nDar de baja a id: " + idPasaje);
        String sql = "UPDATE pasaje WHERE idPasaje = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPasaje);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Baja de pasaje");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pasaje");
        }
    }
     public void darDeAltaPorId(int idPasaje) {
        System.out.println("\nDar de alta a pasaje: " + idPasaje);
        String sql = "UPDATE pasaje WHERE idPasaje = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPasaje);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alta de pasaje");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje");
        }
    }
    
    
    
}
