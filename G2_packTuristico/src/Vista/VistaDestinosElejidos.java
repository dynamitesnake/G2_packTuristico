
package Vista;

import Modelo.Paquete;
import Persistencia.PaqueteData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class VistaDestinosElejidos extends javax.swing.JInternalFrame {

    public PaqueteData paqueData;
    public ArrayList<Paquete> listadoPaquetes;
    
    public DefaultTableModel modelo;
    
    public VistaDestinosElejidos() {
        initComponents();
        paqueData = new PaqueteData();
        listadoPaquetes = (ArrayList<Paquete>) paqueData.listarPaqueteCiudadesMasElegidas();
        modelo = new DefaultTableModel();
        
        armarCabecera();
        cargaTabla();
        
        ListSelectionModel modeloS = jT_destinos.getSelectionModel();
        modeloS.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int filaSeleccionada = jT_destinos.getSelectedRow();
                    if (filaSeleccionada != -1) {
                    }
                }
            }
        });
    }
          
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_destinos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_destinos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_destinos.setText("destinos");
        getContentPane().add(jLabel_destinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 35, 156, -1));

        jT_destinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jT_destinos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 84, -1, 229));

        pack();
    }// </editor-fold>//GEN-END:initComponents

                        
    private void limpiarTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

   private void cargaTabla() {
        limpiarTabla();
        List<Paquete> listadoC = paqueData.listarPaqueteCiudadesMasElegidas();
        for (Paquete c : listadoC) {
            modelo.addRow(new Object[] { c.getDestino() });
            
        }
   }

    private void armarCabecera() {
        modelo.addColumn("Destinos");

        jT_destinos.setModel(modelo);

        TableColumnModel columnModel = jT_destinos.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(50); // ID Ciudad
        columnModel.getColumn(1).setPreferredWidth(150); // Nombre de la Ciudad
        columnModel.getColumn(2).setPreferredWidth(180); // Total de Turistas
        columnModel.getColumn(3).setPreferredWidth(180); // Cantidad de Paquetes

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jT_destinos.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jT_destinos.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jT_destinos.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jT_destinos.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_destinos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_destinos;
    // End of variables declaration//GEN-END:variables
}
