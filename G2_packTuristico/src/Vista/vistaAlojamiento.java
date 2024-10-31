
package Vista;

import Modelo.Alojamiento;
import Persistencia.alojamientoData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class vistaAlojamiento extends javax.swing.JInternalFrame { 
    private alojamientoData alojaData ;
    private ArrayList <Alojamiento> listaAloja;
    private DefaultTableModel modelo;
    
    public vistaAlojamiento() {
        initComponents();
        alojaData = new alojamientoData();
        listaAloja = (ArrayList <Alojamiento>)alojaData.listarAlojamiento();
        modelo = new DefaultTableModel();
        comboAlojamiento();
       armarCabeceraTabla();
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbAlojamiento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboAlojamientos = new javax.swing.JComboBox<>();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMostarAlojamientos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jlbAlojamiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlbAlojamiento.setForeground(new java.awt.Color(51, 153, 255));
        jlbAlojamiento.setText("Alojamiento");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Alojamientos:");

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jtbMostarAlojamientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbMostarAlojamientos);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAlta.setText("Alta");

        btnBaja.setText("Baja");

        btnEliminar.setText("Eliminar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jlbAlojamiento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)
                                .addComponent(comboAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlta)
                                .addGap(83, 83, 83)
                                .addComponent(btnBaja)
                                .addGap(90, 90, 90)
                                .addComponent(btnEliminar)
                                .addGap(62, 62, 62)
                                .addComponent(btnSalir)
                                .addGap(14, 14, 14)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlbAlojamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(btnBaja)
                    .addComponent(btnAlta)
                    .addComponent(btnModificar))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        borrarFilasdeTabla();
        cargarAlojamientos ();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alojamiento> comboAlojamientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbAlojamiento;
    private javax.swing.JTable jtbMostarAlojamientos;
    // End of variables declaration//GEN-END:variables

    private void comboAlojamiento() {
     for (Alojamiento item : listaAloja)  {
        comboAlojamientos.addItem(item);
    }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Nombre");
        filaCabecera.add("Capacidad");
        filaCabecera.add("nroAmbientes");
        filaCabecera.add("camas");
        filaCabecera.add("baños");
        filaCabecera.add("precioNoche");
        
        for (Object it: filaCabecera) {
        modelo.addColumn(it);
    }
        jtbMostarAlojamientos.setModel(modelo);
    
    }
    private void borrarFilasdeTabla() {
        int indice = modelo.getRowCount() -1;
        for (int i = indice ; i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void cargarAlojamientos (){
        Alojamiento selec = (Alojamiento) comboAlojamientos.getSelectedItem();
       List <Alojamiento> lista = alojaData.listarAlojamiento();
       for (Alojamiento a : lista){
           modelo.addRow(new Object [] {a.getNombre(),a.getCapacidad(),a.getNroAmbientes(),a.getCamas(),a.getBaños(),a.getPrecioNoche()});
    }    
}
}