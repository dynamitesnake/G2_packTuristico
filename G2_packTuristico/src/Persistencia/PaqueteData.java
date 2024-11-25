
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
    String sql = "INSERT INTO `paquete` (idpaquete, fechaIni, fechaFin, origen, destino, pasajeros, medioViaje, montoFinal, idpasaje, idalojamiento, idpension) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, paquete.getIdPaquete()); 
        ps.setDate(2, java.sql.Date.valueOf(paquete.getFechaIni()));
        ps.setDate(3, java.sql.Date.valueOf(paquete.getFechaFin()));
        ps.setString(4, paquete.getOrigen());
        ps.setString(5, paquete.getDestino());
        ps.setInt(6, paquete.getPasajeros()); 
        ps.setString(7, paquete.getMedioViaje());
        ps.setDouble(8, paquete.getMontoFinal());
        ps.setInt(9, paquete.getIdPasaje());
        ps.setInt(10, paquete.getIdAlojamiento());
        ps.setInt(11, paquete.getIdPension());

        ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                 paquete.setIdPaquete(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje");
        }
    }

 public Paquete buscarPaquete(int idPaquete) {
    System.out.println("\nBuscando Paquete con ID: " + idPaquete);
    Paquete paquete = null;
    String sql = "SELECT * FROM paquete WHERE idPaquete = ?"; 

    try (PreparedStatement ps = conn.prepareStatement(sql)) { 
        ps.setInt(1, idPaquete);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            
            paquete = new Paquete();
            paquete.setIdPaquete(rs.getInt("idPaquete"));
            paquete.setFechaIni(rs.getDate("fechaIni").toLocalDate());
            paquete.setFechaFin(rs.getDate("fechaFin").toLocalDate());
            paquete.setOrigen(rs.getString("origen"));
            paquete.setDestino(rs.getString("destino"));
            paquete.setPasajeros(rs.getInt("Pasajeros"));
            paquete.setMedioViaje(rs.getString("medioViaje"));
            paquete.setMontoFinal(rs.getDouble("montoFinal"));
            paquete.setIdPasaje(rs.getInt("idPasaje"));
            paquete.setIdAlojamiento(rs.getInt("idAlojamiento"));
            paquete.setIdPension(rs.getInt("idPension"));
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un paquete con el ID proporcionado.");
        }

        rs.close(); 
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete: " + ex.getMessage());
        ex.printStackTrace(); 
    }

    return paquete;
}

    
     public void modificarPaquete(Paquete paquete) {
    System.out.println("\nModificar paquete: ");
    String sql = "UPDATE paquete SET fechaIni = ?, fechaFin = ?, origen = ?, destino = ?, pasajeros = ?, medioViaje = ?, montoFinal = ?, idpasaje = ?, idalojamiento = ?, idpension = ? WHERE idpaquete = ?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDate(1, java.sql.Date.valueOf(paquete.getFechaIni()));
        ps.setDate(2, java.sql.Date.valueOf(paquete.getFechaFin()));
        ps.setString(3, paquete.getOrigen());
        ps.setString(4, paquete.getDestino());
        ps.setInt(5, paquete.getPasajeros()); 
        ps.setString(6, paquete.getMedioViaje());
        ps.setDouble(7, paquete.getMontoFinal());
        ps.setInt(8, paquete.getIdPasaje());
        ps.setInt(9, paquete.getIdAlojamiento());
        ps.setInt(10, paquete.getIdPension());
        ps.setInt(11, paquete.getIdPaquete()); 

        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Paquete modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El paquete no existe");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete: " + ex.getMessage());
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
                Paquete paquete = new Paquete(rs.getInt("idpaquete"), rs.getDate("fechaIni").toLocalDate(), rs.getDate("fechaFin").toLocalDate(), rs.getString("origen"), rs.getString("destino"),rs.getString("medioViaje"), rs.getDouble("montoFinal"), rs.getInt("idpasaje"), rs.getInt("idalojamiento"), rs.getInt("idpension"),rs.getInt("pasajeros"));
                lista.add(paquete);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar alojamientos.");
            e.printStackTrace();
        }
        return lista;
    }
    
    public List<Paquete> listarPaquetesUltimos2Meses() {
        List<Paquete> listaPaquetes = new ArrayList<>();

        String sql = "SELECT idpaquete, fechaIni, fechaFin, origen, destino, medioViaje " +
                "DATEDIFF(fechaFin, fechaIni) AS Dias idpasaje, idalojamiento, " +
                "idpension, montoFinal FROM paquete" +         
                "WHERE fechaIni BETWEEN DATE_SUB(CURRENT_DATE, INTERVAL 2 MONTH) AND CURRENT_DATE "; 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 

            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idpaquete"));
                paquete.setFechaIni(rs.getDate("fechaIni").toLocalDate());
                paquete.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                paquete.setDestino("destino");
                paquete.setIdPasaje(rs.getInt("idpasaje"));
                paquete.setIdAlojamiento(rs.getInt("idalojamiento"));
                paquete.setIdPension(rs.getInt("idpension"));
                paquete.setMontoFinal(rs.getDouble("montoFinal"));
                listaPaquetes.add(paquete);
                
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete " + ex.getMessage());
        }
            return listaPaquetes;
    }

    public List<Paquete> listarPaqueteCiudadesMasElegidas() {
       
        List<Paquete> destinos = new ArrayList<>();
            String sql = "SELECT idpaquete AS Destino, " +
                 "FROM paquete " +
                 "ORDER BY destino ASC";

    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Paquete ciudad = new Paquete();
            ciudad.setDestino(rs.getString("destino"));
            destinos.add(ciudad);
        }

        rs.close();
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al listar las ciudades con estadísticas: " + ex.getMessage());
    }
    return destinos;
    }
    
    
    
}
