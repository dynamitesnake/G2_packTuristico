
package Vista;

import Modelo.Alojamiento;
import Modelo.Paquete;
import Persistencia.PaqueteData;
import Persistencia.alojamientoData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class VistaPaquete extends javax.swing.JInternalFrame {
     private alojamientoData alojaData ;
     private PaqueteData paqueData;
    private ArrayList <Alojamiento> listaAloja;

    
    public VistaPaquete() {
        initComponents();
        alojaData = new alojamientoData();
        paqueData = new PaqueteData();
        listaAloja = (ArrayList <Alojamiento>)alojaData.listarAlojamiento();
        comboAlojamiento();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboAlojamientos = new javax.swing.JComboBox<>();
        jCorigen = new javax.swing.JComboBox<>();
        jCdestino = new javax.swing.JComboBox<>();
        txtIdPaquete = new javax.swing.JTextField();
        calendIda = new com.toedter.calendar.JDateChooser();
        calendVuelta = new com.toedter.calendar.JDateChooser();
        Ctransp = new javax.swing.JTextField();
        txtIdPasaje = new javax.swing.JTextField();
        txtIdPension = new javax.swing.JTextField();
        txtMontoFinal = new javax.swing.JTextField();
        jB_guardarPaquete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(comboAlojamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 200, 30));

        getContentPane().add(jCorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 200, 30));

        getContentPane().add(jCdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 200, 30));
        getContentPane().add(txtIdPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 240, 30));
        getContentPane().add(calendIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 30));
        getContentPane().add(calendVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 110, 30));
        getContentPane().add(Ctransp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 120, 30));
        getContentPane().add(txtIdPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 160, 30));
        getContentPane().add(txtIdPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 160, 30));
        getContentPane().add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 120, 40));

        jB_guardarPaquete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jB_guardarPaquete.setForeground(new java.awt.Color(255, 153, 0));
        jB_guardarPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono guardar.png"))); // NOI18N
        jB_guardarPaquete.setText("   AGREGAR");
        jB_guardarPaquete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jB_guardarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_guardarPaqueteActionPerformed(evt);
            }
        });
        getContentPane().add(jB_guardarPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 190, 80));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono buscar (2).png"))); // NOI18N
        jButton2.setText("   BUSCAR");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 190, 80));

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono listar.png"))); // NOI18N
        jButton3.setText("LISTAR");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, 170, 80));

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 0));
        jButton4.setText("MODIFICAR");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 110, 40));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("ELIMINAR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paquete (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1170, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_guardarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_guardarPaqueteActionPerformed
        // TODO add your handling code here:
        guardarPaquete();
    }//GEN-LAST:event_jB_guardarPaqueteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminarPaquete();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ctransp;
    private com.toedter.calendar.JDateChooser calendIda;
    private com.toedter.calendar.JDateChooser calendVuelta;
    private javax.swing.JComboBox<Alojamiento> comboAlojamientos;
    private javax.swing.JButton jB_guardarPaquete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCdestino;
    private javax.swing.JComboBox<String> jCorigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtIdPaquete;
    private javax.swing.JTextField txtIdPasaje;
    private javax.swing.JTextField txtIdPension;
    private javax.swing.JTextField txtMontoFinal;
    // End of variables declaration//GEN-END:variables

    
    private void comboAlojamiento() {
     for (Alojamiento item : listaAloja)  {
        comboAlojamientos.addItem(item);
    }
    }
    private void eliminarPaquete(){
        try{
    int idPaquete = Integer.parseInt(txtIdPaquete.getText().trim());
    paqueData.eliminarPaquete(idPaquete);
    JOptionPane.showMessageDialog(null, "Paquete Eliminado");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Por favor ingrese un paquete valido");
        }
    } 
    private void guardarPaquete(){
    try{
    int idPaquete = Integer.parseInt(txtIdPaquete.getText());
    LocalDate fechaIni = LocalDate.parse(calendIda.getDateFormatString());
    LocalDate fechaFin = LocalDate.parse(calendVuelta.getDateFormatString());
    String origen = (String)jCorigen.getSelectedItem();
    String destino = (String) jCdestino.getSelectedItem();
    String traslados = Ctransp.getText();
    double montoFinal = Double.parseDouble(txtMontoFinal.getText());
    int idPasaje = Integer.parseInt(txtIdPasaje.getText());
    int idAlojamiento = (int) comboAlojamientos.getSelectedItem();
    int idPension = Integer.parseInt(txtIdPension.getText());
    
    Paquete paquete = new Paquete(idPaquete, fechaIni, fechaFin, origen, destino, traslados, montoFinal, idPasaje, idAlojamiento, idPension);
    paqueData.guardarPaquete(paquete);
    JOptionPane.showMessageDialog(null, "paquete guardado");
    } catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error ingresar valores validos");
    } catch(Exception e) {
    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar el paquete" + e.getMessage());
    }

    }
    
}
    

