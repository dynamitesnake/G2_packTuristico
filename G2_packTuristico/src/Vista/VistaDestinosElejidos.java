
package Vista;

import javax.swing.*; 
import javax.swing.table.DefaultTableModel; 
import java.awt.*; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException;

public class VistaDestinosElejidos extends javax.swing.JInternalFrame {

    private JTable table; 
    private DefaultTableModel tableModel;
    
    public VistaDestinosElejidos() {
        
    setTitle("Destinos Más Elegidos"); 
    setClosable(true); 
    setMaximizable(true); 
    setIconifiable(true); 
    setSize(600, 400); 
    setLayout(new BorderLayout()); 
    tableModel = new DefaultTableModel(new String[]{"Destino", "Cantidad de Visitas"}, 0); 
    table = new JTable(tableModel); 
    add(new JScrollPane(table), BorderLayout.CENTER); 
    cargarDestinosMasElegidos(); 
    }
          
    private void cargarDestinosMasElegidos() { 
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/turismo", "root", "")) { 
            String query = "SELECT destino, COUNT(*) AS cantidad_visitas " + "FROM paquete " + 
                    "GROUP BY destino " + 
                    "ORDER BY cantidad_visitas DESC"; 
            try (PreparedStatement st = conn.prepareStatement(query)) { 
                ResultSet rs = st.executeQuery(); 
                while (rs.next()) { 
                    String destino = rs.getString("destino"); 
                    int cantidadVisitas = rs.getInt("cantidad_visitas"); 
                    tableModel.addRow(new Object[]{destino, cantidadVisitas}); 
                } 
            } 
        } catch (SQLException e) { JOptionPane.showMessageDialog(this, "Error al cargar los destinos más elegidos: " + e.getMessage()); 
        } 
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
