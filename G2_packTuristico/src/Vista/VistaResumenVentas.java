
package Vista;

import Persistencia.PaqueteData;
import Modelo.Paquete;
import Modelo.Pasajes;
import Modelo.Turista;
import Persistencia.TuristaData;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.List;

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
        
        // Definir columnas de la tabla
        String[] columnas = {"ID Paquete", "FechaIni", "FechaFin", "Origen", "Destino", "Traslados", "Monto", "ID Pasaje", "ID Alojamiento", "ID Pension"};
        
        // Crear el modelo de la tabla
        modeloTabla = new DefaultTableModel(null, columnas);
        tablaVentas = new JTable(modeloTabla);
        
        // Hacer que la tabla sea no editable
        tablaVentas.setDefaultEditor(Object.class, null);
        
        // Agregar la tabla al panel con un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tablaVentas);
        add(scrollPane, BorderLayout.CENTER);
        
        // Cargar las ventas al inicializar el frame
        cargarVentas();
    }

    // Método para cargar las ventas desde la base de datos
    public void cargarVentas() {
        // Limpiar la tabla antes de cargar los nuevos datos
        modeloTabla.setRowCount(0);

        // Conexión a la base de datos y consulta SQL
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/turismo", "root", "")) {
            String query = "SELECT * FROM paquete";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterar sobre los resultados y agregar las filas a la tabla
            while (rs.next()) {
                int idPaquete = rs.getInt("idPaquete");
                Date fechaIni = rs.getDate("fechaIni");
                Date fechaFin = rs.getDate("fechaFin");
                String origen = rs.getString("origen");
                String destino = rs.getString("destinno");
                Boolean traslados = rs.getBoolean("traslados");
                double montoFinal = rs.getDouble("montoFinal");
                int idPasaje = rs.getInt("idPasaje");
                int idAlojamiento = rs.getInt("idAlojamiento");
                int idPension = rs.getInt("idPension");
                

                // Agregar la fila a la tabla
            Object[] fila = {idPaquete, fechaIni, fechaFin, origen, destino, traslados, montoFinal,  idPasaje, idAlojamiento, idPension};
            modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las ventas: " + e.getMessage());
        }
    }

    // Método para actualizar la tabla después de una venta
    public void agregarVenta(int idPaquete, Date fechaIni, Date fechaFin, String origen, String destino, Boolean traslados, double montoFinal, int idPasaje, int idAlojamiento, int idPension ) {
        Object[] fila = {idPaquete, fechaIni, fechaFin, origen, destino, traslados, montoFinal, idPasaje, idAlojamiento, idPension};
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

