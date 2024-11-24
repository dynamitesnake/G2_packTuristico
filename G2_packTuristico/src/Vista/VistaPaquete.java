
package Vista;

import Modelo.Alojamiento;
import Modelo.Paquete;
import Persistencia.PaqueteData;
import Persistencia.alojamientoData;
import Persistencia.pasajeDatas;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.PensionData;


public class VistaPaquete extends javax.swing.JInternalFrame {
     private alojamientoData alojaData ;
     private PensionData penData;
     private pasajeDatas pasajeData;
     private PaqueteData paqueData;
    private ArrayList <Alojamiento> listaAloja;
    private String temporada;

    
    public VistaPaquete() {
        initComponents();
        alojaData = new alojamientoData();
        paqueData = new PaqueteData();
        penData = new PensionData();
        pasajeData = new pasajeDatas();
        listaAloja = (ArrayList <Alojamiento>)alojaData.listarAlojamiento();
        comboAlojamiento();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboAlojamientos = new javax.swing.JComboBox<>();
        jCorigen = new javax.swing.JComboBox<>();
        jCdestino = new javax.swing.JComboBox<>();
        jCtransp = new javax.swing.JComboBox<>();
        txtIdPaquete = new javax.swing.JTextField();
        calendIda = new com.toedter.calendar.JDateChooser();
        calendVuelta = new com.toedter.calendar.JDateChooser();
        jtCantidadPasajeros = new javax.swing.JTextField();
        txtIdPension = new javax.swing.JTextField();
        txtMontoFinal = new javax.swing.JTextField();
        txt_temp = new javax.swing.JTextField();
        txt_idPasaje = new javax.swing.JTextField();
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

        getContentPane().add(comboAlojamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 200, 30));

        jCorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San Luis", "Villa Mercedes", " " }));
        getContentPane().add(jCorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 140, 30));

        jCdestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mar del Plata", "Bariloche", "Mendoza", "Salta", "Jujuy", "Las Grutas", "Puerto Madryn", "Carlos Paz", "Mina Clavero", "Pinamar", "Miramar", "Villa Gesell", "Necochea", "Puerto Iguazu", "Termas de Rio Hondo", "Merlo", "Calafate", "Ushuaia", "Tucuman", "Chubut", "Buenos Aires", "Mar de Ajó", "Santiago de Chile", "Florianapolis", "Camboriú", "Punta del Este", "Punta Cana", "Cancun", "Viña del Mar", "Montevideo", "Cordoba", " " }));
        jCdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCdestinoActionPerformed(evt);
            }
        });
        getContentPane().add(jCdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 140, 30));

        jCtransp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Colectivo", " " }));
        getContentPane().add(jCtransp, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 170, 30));
        getContentPane().add(txtIdPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 240, 30));
        getContentPane().add(calendIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 110, 30));
        getContentPane().add(calendVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 110, 30));
        getContentPane().add(jtCantidadPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 160, 30));
        getContentPane().add(txtIdPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 160, 30));
        getContentPane().add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 120, 40));
        getContentPane().add(txt_temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 160, 30));
        getContentPane().add(txt_idPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, 30));

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
        getContentPane().add(jB_guardarPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 190, 100));

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
        getContentPane().add(JBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 180, 100));

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
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 170, 100));

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 0));
        jButton4.setText("MODIFICAR");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 140, 50));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("ELIMINAR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 130, 50));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vista paquete (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1100, 770));

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
      buscarPaquete();
    }//GEN-LAST:event_JBbuscarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{
            if (calendIda.getDate() == null || calendVuelta.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar las fechas de ida y vuelta.");
            return;
        }
       
    LocalDate fecha1 = calendIda.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fecha2 = calendVuelta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
   
    int inicio = fecha1.getMonthValue();
    int fin = fecha2.getMonthValue();

    if ((inicio == Month.JANUARY.getValue() || inicio == Month.JULY.getValue()) &&
        (fin == Month.JANUARY.getValue() || fin == Month.JULY.getValue())) {
        txt_temp.setText("Alta");
        temporada ="Alta";
    } else if ((inicio == Month.FEBRUARY.getValue() || inicio == Month.JUNE.getValue()) &&
               (fin == Month.FEBRUARY.getValue() || fin == Month.JUNE.getValue())) {
        txt_temp.setText("Media");
         temporada ="Media";
    } else {
        txt_temp.setText("Baja");
         temporada ="Baja";
    }
        
    
      } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar una fecha");
       
      }
        double precio=0;
        
        String seleccionCompletaT = jCtransp.getSelectedItem().toString();
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
        String trans = (String) jCtransp.getSelectedItem();
        String origen = (String) jCorigen.getSelectedItem();
        String destino = (String) jCdestino.getSelectedItem();
        double suma = 0;

        
        if (destino.equalsIgnoreCase("mar del plata") || destino.equalsIgnoreCase("pinamar")
                || destino.equalsIgnoreCase("miramar") || destino.equalsIgnoreCase("villa gesell")
                || destino.equalsIgnoreCase("necochea") || destino.equalsIgnoreCase("buenos aires")
                || destino.equalsIgnoreCase("mar de ajo")) {
            suma = 140000;
        }
        if (destino.equalsIgnoreCase("mendoza") || destino.equalsIgnoreCase("carlos paz")
                || destino.equalsIgnoreCase("cordoba")) {
            suma = 70000;
        }
        if (destino.equalsIgnoreCase("mina clavero") || destino.equalsIgnoreCase("merlo")) {
            suma = 60000;
        }
        if (destino.equalsIgnoreCase("puerto madryn") || destino.equalsIgnoreCase("salta")
                || destino.equalsIgnoreCase("jujuy")) {
            suma = 200000;
        }
        if (destino.equalsIgnoreCase("bariloche") || destino.equalsIgnoreCase("las grutas")
                || destino.equalsIgnoreCase("chubut") || destino.equalsIgnoreCase("tucuman")
                || destino.equalsIgnoreCase("termas de rio hondo")) {
            suma = 190000;
        }

        if (destino.equalsIgnoreCase("puerto iguazu") || destino.equalsIgnoreCase("ushuaia")
                || destino.equalsIgnoreCase("calafate")) {
            suma = 240000;

        }
        if (destino.equalsIgnoreCase("santiago de chile")) {
            suma = 100000;
        }
        if (destino.equalsIgnoreCase("viña del mar")) {
            suma = 140000;
        }
        if (destino.equalsIgnoreCase("florianapolis")) {
            suma = 370000;
        }
        if (destino.equalsIgnoreCase("camboriu")) {
            suma = 390000;
        }
        if (destino.equalsIgnoreCase("punta del este")) {
            suma = 260000;
        }
        if (destino.equalsIgnoreCase("montevideo")) {
            suma = 240000;
        }
        if (destino.equalsIgnoreCase("punta cana")) {
            suma = 1600000;
        }
        if (destino.equalsIgnoreCase("cancun")) {
            suma = 1900000;
        }
        if (trans.equalsIgnoreCase("avion")) {
            suma = suma * 1.6;
        }
        if (origen.equalsIgnoreCase("villa mercedes")) {
            suma = suma + 10000;
        }
        
        txtMontoFinal.setText(String.valueOf(precio + suma));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jCdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCdestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCdestinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton btnCalcular;
    private com.toedter.calendar.JDateChooser calendIda;
    private com.toedter.calendar.JDateChooser calendVuelta;
    private javax.swing.JComboBox<Alojamiento> comboAlojamientos;
    private javax.swing.JButton jB_guardarPaquete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCdestino;
    private javax.swing.JComboBox<String> jCorigen;
    private javax.swing.JComboBox<String> jCtransp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtCantidadPasajeros;
    private javax.swing.JTextField txtIdPaquete;
    private javax.swing.JTextField txtIdPension;
    private javax.swing.JTextField txtMontoFinal;
    private javax.swing.JTextField txt_idPasaje;
    private javax.swing.JTextField txt_temp;
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
private void guardarPaquete() {
    try { 
            int idPaquete = Integer.parseInt(txtIdPaquete.getText()); 
            LocalDate fechaIni = new java.sql.Date(calendIda.getDate().getTime()).toLocalDate();
            LocalDate fechaFin = new java.sql.Date(calendVuelta.getDate().getTime()).toLocalDate();
            int idPasaje = Integer.parseInt(txt_idPasaje.getText()); 
            int pasajeros = Integer.parseInt(jtCantidadPasajeros.getText()); 
            int idAlojamiento = Integer.parseInt((String) comboAlojamientos.getSelectedItem());  
            int idPension = Integer.parseInt(txtIdPension.getText()); 
            String medioViaje = (String) jCtransp.getSelectedItem();
            String origen = (String) jCorigen.getSelectedItem();
            String destino = (String) jCdestino.getSelectedItem();
            int montoFinal = Integer.parseInt(txtMontoFinal.getText());
            Paquete paquete = new Paquete(idPaquete, fechaIni, fechaFin,origen, destino, medioViaje, montoFinal, idPasaje,idAlojamiento,idPension,pasajeros); 
            
            paqueData.guardarPaquete(paquete); 
            JOptionPane.showMessageDialog(null, "alojamiento agregado: "); 
            
        } catch (NumberFormatException e) { 
            JOptionPane.showMessageDialog(null, "Error: Por favor ingresa datos validos"); 
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar el Alojamiento: " + e.getMessage()); 
        }
    }     



  private void buscarPaquete() {
    try {
        
        int idPaquete = Integer.parseInt(txtIdPaquete.getText());
        String origen = (String) jCorigen.getSelectedItem();
        String destino = (String) jCdestino.getSelectedItem();

        
        Paquete paquete = paqueData.buscarPaquete(idPaquete);

        if (paquete != null) {
            
            txtIdPaquete.setText(String.valueOf(paquete.getIdPaquete()));
            calendIda.setDate(java.sql.Date.valueOf(paquete.getFechaIni()));
            calendVuelta.setDate(java.sql.Date.valueOf(paquete.getFechaFin()));
            jCorigen.setSelectedItem(paquete.getOrigen());
            jCdestino.setSelectedItem(paquete.getDestino());
            jCtransp.setSelectedItem(paquete.getMedioViaje());
            txtMontoFinal.setText(String.valueOf(paquete.getMontoFinal()));
            jtCantidadPasajeros.setText(String.valueOf(paquete.getIdPasaje()));
            comboAlojamientos.setSelectedItem(paquete.getIdAlojamiento());
            txtIdPension.setText(String.valueOf(paquete.getIdPension()));

            JOptionPane.showMessageDialog(null, "Paquete encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún paquete");
        }
    }  catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al buscar el paquete: " + e.getMessage());
    }
}

  }


    

