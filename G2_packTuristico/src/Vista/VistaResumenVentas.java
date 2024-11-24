
package Vista;
import java.sql.Connection;
import java.sql.Date; 
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;


public class VistaResumenVentas extends javax.swing.JInternalFrame {

    private JTable tablaVentas;
    private DefaultTableModel modeloTabla;
  
    public VistaResumenVentas() {
        
        setTitle("Resumen de Ventas");
        setSize(600, 400);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setLayout(new BorderLayout());
        

        String[] columnas = {"ID Paquete", "FechaIni", "FechaFin", "Origen", "Destino", "medioViaje", "Monto", "ID Pasaje", "ID Alojamiento", "ID Pension"};
        
        modeloTabla = new DefaultTableModel(null, columnas);
        tablaVentas = new JTable(modeloTabla);
       
        tablaVentas.setDefaultEditor(Object.class, null);
        
        JScrollPane scrollPane = new JScrollPane(tablaVentas);
        add(scrollPane, BorderLayout.CENTER);
        
        // Cargar las ventas al inicializar el frame
        cargarVentas();
    }

    public void cargarVentas(){ 
        
            modeloTabla.setRowCount(0); 
        
        java.sql.Date fechaFinSQL = new java.sql.Date(System.currentTimeMillis()); 
        
        LocalDate fechaActual = LocalDate.now(); 
        LocalDate fechaDosMesesAntes = fechaActual.minusMonths(2); 
        java.sql.Date fechaInicioSQL = java.sql.Date.valueOf(fechaDosMesesAntes); 
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/turismo", "root", "")) { 
            String query = "SELECT idPaquete, fechaIni, fechaFin, " + 
                    "DATEDIFF(fechaFin, fechaIni) AS dias, origen, destino, medioViaje, " + 
                    "montoFinal, idPasaje, idAlojamiento, idPension " + 
                    "FROM paquete " + 
                    "WHERE fechaIni BETWEEN ? AND ?";
    
        try (PreparedStatement st = conn.prepareStatement(query)) { 
            st.setDate(1, fechaInicioSQL);
            st.setDate(2, fechaFinSQL); 
            ResultSet rs = st.executeQuery(); 
 
            while (rs.next()) { 
                int idPaquete = rs.getInt("idPaquete");
                Date fechaIni = rs.getDate("fechaIni"); 
                Date fechaFin = rs.getDate("fechaFin"); 
                int dias = rs.getInt("dias"); 
                String origen = rs.getString("origen"); 
                String destino = rs.getString("destino"); 
                String medioViaje = rs.getString("medioViaje"); 
                double montoFinal = rs.getDouble("montoFinal"); 
                int idPasaje = rs.getInt("idPasaje"); 
                int idAlojamiento = rs.getInt("idAlojamiento"); 
                int idPension = rs.getInt("idPension"); 


                Object[] fila = {idPaquete, fechaIni, fechaFin, origen, destino, medioViaje, montoFinal, idPasaje, idAlojamiento, idPension}; modeloTabla.addRow(fila); } } } catch (SQLException e) { JOptionPane.showMessageDialog(this, "Error al cargar las ventas: " + e.getMessage()); } }

    
    public void agregarVenta(int idPaquete, Date fechaIni, Date fechaFin, String origen, String destino, String medioViaje, double montoFinal, int idPasaje, int idAlojamiento, int idPension ) {
        Object[] fila = {idPaquete, fechaIni, fechaFin, origen, destino, medioViaje, montoFinal, idPasaje, idAlojamiento, idPension};
        modeloTabla.addRow(fila);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

