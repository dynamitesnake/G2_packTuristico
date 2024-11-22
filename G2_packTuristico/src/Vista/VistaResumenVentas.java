
package Vista;

import Persistencia.PaqueteData;
import Modelo.Paquete;
import Modelo.Pasajes;
import Modelo.Turista;
import Persistencia.TuristaData;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class VistaResumenVentas extends javax.swing.JInternalFrame {

    public Turista turis = new Turista();
    public Pasajes pasaje = new Pasajes();
    public Paquete paquete;
    public TuristaData turistaData = new TuristaData();
    public PaqueteData paqueteData = new PaqueteData();

    public ArrayList<Turista> pasajeros = new ArrayList<>();
    public ArrayList<Paquete> listado = new ArrayList();

    
private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};

    public VistaResumenVentas() {
        initComponents();
        armarCabecera();
        cargarTabla();
        
    }

   private void cargarTabla(){
            
       limpiarTabla();    
            double total = 0;
            int cantidad =0;
            listado = (ArrayList) paqueteData.listarPaquetesUltimos2Meses();
            for (Paquete p: listado) {
                    long cantidadDeDias = p.getFechaIni().until(p.getFechaFin(), ChronoUnit.DAYS);
                    modelo.addRow(new Object[] {
                        p.getIdPaquete(),
                        p.getDestino(),
                        p.getFechaIni(),
                        p.getFechaFin(),
                        cantidadDeDias,
                        p.getIdPasaje(),
                        p.getIdAlojamiento(),
                        p.getIdPension(),
                        String.format("$%.2f", p.getMontoFinal())
                    });
                    total = total + p.getMontoFinal();
                    cantidad++;
            }
            txt_total.setText(String.format("$%.2f", total));
            txt_cantidad.setText(String.valueOf(cantidad));

        }


    private void limpiarTabla(){

            int indice= modelo.getRowCount()-1;
            for (int i = indice; i>=0; i--) {
                    modelo.removeRow(i);
            }
        }
        
            private void armarCabecera(){

            modelo.addColumn("ID Paquete");
            modelo.addColumn("Destino");
            modelo.addColumn("Desde");
            modelo.addColumn("Hasta");
            modelo.addColumn("Días");
            modelo.addColumn("Transporte");
            modelo.addColumn("Aljoamiento");
            modelo.addColumn("Regimen");
            modelo.addColumn("Monto");

            tablaPaque.setModel(modelo);
            // Obtener el modelo de columnas de la tabla
            TableColumnModel columnModel = tablaPaque.getColumnModel();

            //Ancho de las columnas
            columnModel.getColumn(0).setPreferredWidth(5);   // "ID"
            columnModel.getColumn(1).setPreferredWidth(10);  // "Destino"
            columnModel.getColumn(2).setPreferredWidth(20);  // "Desde"
            columnModel.getColumn(3).setPreferredWidth(20);  // "Hasta"
            columnModel.getColumn(4).setPreferredWidth(50);  // "Días"
            columnModel.getColumn(5).setPreferredWidth(40);  // "Transporte"
            columnModel.getColumn(6).setPreferredWidth(50);  // "Alojamiento"
            columnModel.getColumn(7).setPreferredWidth(30);  // "Regimen"
            columnModel.getColumn(8).setPreferredWidth(10);  // "Monto"

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            tablaPaque.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tablaPaque.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tablaPaque.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);                
            tablaPaque.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);  
            tablaPaque.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);  
            tablaPaque.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);  

            DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
            rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            tablaPaque.getColumnModel().getColumn(9).setCellRenderer(rightRenderer); 
            
            JTableHeader header = tablaPaque.getTableHeader();
            DefaultTableCellRenderer rendererCentrado = (DefaultTableCellRenderer) header.getDefaultRenderer();
            rendererCentrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            header.setDefaultRenderer(rendererCentrado);

        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_total = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPaque = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, 40));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 290, 40));

        tablaPaque.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaPaque);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 580, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPaque;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
