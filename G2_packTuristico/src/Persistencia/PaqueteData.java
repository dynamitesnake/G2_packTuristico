
package Persistencia;

import AccesoDatos.Conexion;
import org.mariadb.jdbc.Connection;
import Modelo.Paquete;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import javax.swing.JOptionPane;


public class PaqueteData {
    private Connection conn = null;

    public PaqueteData(){
        this.conn = (Connection) Conexion.getConexion();
    }
    
    public void guardarPaquete (Paquete paquete){
        System.out.println("\nGuardar paquete: ");
        String sql = "INSERT INTO paquete (idpaquete, fechaIni, fechaFin, origen, destino, traslados, montoFinal, idpasaje, idalojamiento, idpension) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getIdPaquete());
            ps.setDate(2, java.sql.Date.valueOf(paquete.getFechaIni()));
            ps.setDate(3, java.sql.Date.valueOf(paquete.getFechaFin()));
            ps.setString(4, paquete.getOrigen());
            ps.setString(5, paquete.getDestino());
            ps.setString(6, paquete.getTraslados());
            ps.setDouble(7, paquete.getMontoFinal()); 
            ps.setInt(8, paquete.getIdPasaje());
            ps.setInt(9, paquete.getIdAlojamiento());
            ps.setInt(10, paquete.getIdPension());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paquete.setIdPaquete(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete");
        }
        }
    
    public Paquete buscarPaquete (int idPaquete) {
        System.out.println("\nbuscar Turista: " + idPaquete);
        Paquete paquete= null;
        String sql = "SELECT idpaquete FROM paquete WHERE idpaquete = ? ";;
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPaquete);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
              paquete = new Paquete();
              paquete.setIdPaquete(idPaquete);
              paquete.setFechaIni(rs.getDate("fechaIni").toLocalDate());
              paquete.setFechaFin(rs.getDate("fechaFin").toLocalDate());
              paquete.setOrigen(rs.getString("origen"));
              paquete.setDestino(rs.getString("destino"));
              paquete.setTraslados(rs.getString("traslados"));
              paquete.setMontoFinal(rs.getDouble("montoFinal"));
              paquete.setIdPasaje(rs.getInt("idPasaje"));
              paquete.setIdAlojamiento(rs.getInt("idAlojamiento"));
              paquete.setIdPension(rs.getInt("idPension"));
             }
            else {
                JOptionPane.showMessageDialog(null, "No existe el paquete");
            }
                rs.close();
                ps.close();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete");
    } return paquete;
}   
    
     public void modificarPaquete(Paquete paquete) {
        System.out.println("\nModificar paquete: ");
        String sql = "UPDATE paquete SET idpaquete = ?, fechaIni = ?, fechaFin = ?, origen = ?, destino = ?, traslados = ?; montoFinal = ?, idpasaje= ?, idalojamiento = ?, idpension = ? WHERE idpaquete = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, paquete.getIdPaquete());
            ps.setDate(2, java.sql.Date.valueOf(paquete.getFechaIni()));
            ps.setDate(3, java.sql.Date.valueOf(paquete.getFechaFin()));
            ps.setString(4, paquete.getOrigen());
            ps.setString(5, paquete.getDestino());
            ps.setString(6, paquete.getTraslados());
            ps.setDouble(7, paquete.getMontoFinal());
            ps.setInt(8, paquete.getIdPasaje()); 
            ps.setInt(9, paquete.getIdAlojamiento()); 
            ps.setInt(10, paquete.getIdPension()); 
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paquete modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El paquete no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete");
        }
    }
    
    public void eliminarPaquete(int idPaquete) {
        java.sql.Connection conn = Conexion.getConexion();
        try {
            String query = "DELETE FROM paquete WHERE idpaquete = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idPaquete);
            stmt.executeUpdate();
            System.out.println("Paquete eiminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el paquete.");
            e.printStackTrace();
        }
    }
    
    public List<Paquete> listarPaquete() {
        java.sql.Connection conn = Conexion.getConexion();
        List<Paquete> lista = new ArrayList<>();
        try {
            String query = "SELECT * FROM paquete";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Paquete paquete = new Paquete(rs.getInt("idpaquete"), rs.getDate("fechaIni").toLocalDate(), rs.getDate("fechaFin").toLocalDate(), rs.getString("origen"), rs.getString("destino"), rs.getString("traslados"), rs.getDouble("montoFinal"), rs.getInt("idpasaje"), rs.getInt("idalojamiento"), rs.getInt("idpension"));
                lista.add(paquete);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar alojamientos.");
            e.printStackTrace();
        }
        return lista;
    }
    
  

  
}
