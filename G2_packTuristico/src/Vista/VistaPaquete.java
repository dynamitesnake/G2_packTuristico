
package Vista;

import Modelo.Alojamiento;
import Modelo.Paquete;
import Persistencia.PaqueteData;
import Persistencia.alojamientoData;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class VistaPaquete extends javax.swing.JInternalFrame {
     private alojamientoData alojaData ;
     private PaqueteData paqueData;
    private ArrayList <Alojamiento> listaAloja;
    private String temporada;

    
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

        jLabel11 = new javax.swing.JLabel();
        comboAlojamientos = new javax.swing.JComboBox<>();
        jCorigen = new javax.swing.JComboBox<>();
        jCdestino = new javax.swing.JComboBox<>();
        cboxTransporte = new javax.swing.JComboBox<>();
        txtIdPaquete = new javax.swing.JTextField();
        calendIda = new com.toedter.calendar.JDateChooser();
        calendVuelta = new com.toedter.calendar.JDateChooser();
        jtCantidadPasajeros = new javax.swing.JTextField();
        txtIdPension = new javax.swing.JTextField();
        txtMontoFinal = new javax.swing.JTextField();
        jB_guardarPaquete = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Temporada");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 220, 40));

        getContentPane().add(comboAlojamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, 30));

        getContentPane().add(jCorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 170, 30));

        getContentPane().add(jCdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 170, 30));

        cboxTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboxTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 140, 30));
        getContentPane().add(txtIdPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 240, 30));
        getContentPane().add(calendIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, 30));
        getContentPane().add(calendVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, 30));
        getContentPane().add(jtCantidadPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, 30));
        getContentPane().add(txtIdPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 160, 30));
        getContentPane().add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 120, 40));

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
        getContentPane().add(jB_guardarPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 160, 70));

        JBbuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        JBbuscar.setForeground(new java.awt.Color(255, 153, 0));
        JBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono buscar (2).png"))); // NOI18N
        JBbuscar.setText("   BUSCAR");
        JBbuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 160, 70));

        btnCalcular.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 153, 0));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono listar.png"))); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 180, 70));

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 0));
        jButton4.setText("MODIFICAR");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 110, 30));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("ELIMINAR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vista paquete.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -240, 1320, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_guardarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_guardarPaqueteActionPerformed
       
        guardarPaquete();
    }//GEN-LAST:event_jB_guardarPaqueteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminarPaquete();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
      
    }//GEN-LAST:event_JBbuscarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{
          
       
      LocalDate fecha1 = calendIda.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fecha2 = calendVuelta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
   
    int inicio = fecha1.getMonthValue();
    int fin = fecha2.getMonthValue();

    if ((inicio == Month.JANUARY.getValue() || inicio == Month.JULY.getValue()) &&
        (fin == Month.JANUARY.getValue() || fin == Month.JULY.getValue())) {
        jLabel11.setText("Alta");
        temporada ="Alta";
    } else if ((inicio == Month.FEBRUARY.getValue() || inicio == Month.JUNE.getValue()) &&
               (fin == Month.FEBRUARY.getValue() || fin == Month.JUNE.getValue())) {
        jLabel11.setText("Media");
         temporada ="Media";
    } else {
        jLabel11.setText("Baja");
         temporada ="Baja";
    }
        
    
      } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar una fecha");
    
       
      }
        double precio=0;
        
        String seleccionCompletaT = cboxTransporte.getSelectedItem().toString();
        String[] a = seleccionCompletaT.split("\\D+");
        
        double costoT = Integer.parseInt(a[1]);
        
        try{
        int cantP = Integer.parseInt(jtCantidadPasajeros.getText());
        
        if (temporada.equals("Alta")) {
            precio = (costoT * cantP) * 1.30;
        } else if (temporada.equals("Media")) {
            precio = (costoT * cantP) * 1.15;
        } else {

           precio = (costoT * cantP);

        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Tiene que ingresar una cantidad de pasajeros");
    
       
      }
        txtMontoFinal.setText(String.valueOf(precio));
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton btnCalcular;
    private com.toedter.calendar.JDateChooser calendIda;
    private com.toedter.calendar.JDateChooser calendVuelta;
    private javax.swing.JComboBox<String> cboxTransporte;
    private javax.swing.JComboBox<Alojamiento> comboAlojamientos;
    private javax.swing.JButton jB_guardarPaquete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCdestino;
    private javax.swing.JComboBox<String> jCorigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField jtCantidadPasajeros;
    private javax.swing.JTextField txtIdPaquete;
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
    String traslados = (String) cboxTransporte.getSelectedItem();
    double montoFinal = Double.parseDouble(txtMontoFinal.getText());
    int idPasaje = Integer.parseInt(jtCantidadPasajeros.getText());
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
    

