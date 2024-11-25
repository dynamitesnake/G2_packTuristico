
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
import java.time.temporal.ChronoUnit;
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
    private Paquete paquete = null;

    
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
        txtIdAlojamiento = new javax.swing.JTextField();
        jB_guardarPaquete = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(comboAlojamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 220, 30));

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
        getContentPane().add(calendIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 120, 30));
        getContentPane().add(calendVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 140, 30));
        getContentPane().add(jtCantidadPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 160, 30));
        getContentPane().add(txtIdPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 160, 30));
        getContentPane().add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 120, 40));
        getContentPane().add(txt_temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 160, 30));
        getContentPane().add(txt_idPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, 30));
        getContentPane().add(txtIdAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 160, 30));

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

        btnModificar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 153, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 140, 50));

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vista paquete ultimo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1100, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_guardarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_guardarPaqueteActionPerformed
       
        guardarPaquete();
    }//GEN-LAST:event_jB_guardarPaqueteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       modificarPaquete();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminarPaquete();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
      buscarPaquete();
    }//GEN-LAST:event_JBbuscarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
String temporada = ""; 
double precio = 0;
long diasEstadia = 0; 

try {
    if (calendIda.getDate() == null || calendVuelta.getDate() == null) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar las fechas de ida y vuelta.");
        return;
    }

    // Conversión de fechas:
    LocalDate fechaIda = calendIda.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fechaVuelta = calendVuelta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    diasEstadia = ChronoUnit.DAYS.between(fechaIda, fechaVuelta);
    if (diasEstadia <= 0) {
        JOptionPane.showMessageDialog(null, "La fecha de vuelta debe ser posterior a la fecha de ida");
        return;
    }

    int inicio = fechaIda.getMonthValue();
    int fin = fechaVuelta.getMonthValue();

    if ((inicio == Month.JANUARY.getValue() || inicio == Month.JULY.getValue()) &&
        (fin == Month.JANUARY.getValue() || fin == Month.JULY.getValue())) {
        txt_temp.setText("Alta");
        temporada = "Alta";
    } else if ((inicio == Month.FEBRUARY.getValue() || inicio == Month.JUNE.getValue()) &&
               (fin == Month.FEBRUARY.getValue() || fin == Month.JUNE.getValue())) {
        txt_temp.setText("Media");
        temporada = "Media";
    } else {
        txt_temp.setText("Baja");
        temporada = "Baja";
    }

} catch (NullPointerException e) {
    JOptionPane.showMessageDialog(null, "Tiene que seleccionar una fecha");
    return;
}

try {
    String seleccionCompletaT = jCtransp.getSelectedItem().toString();
    String[] a = seleccionCompletaT.split("\\D+");
    double costoT = Integer.parseInt(a[1]);

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
    return;
}

String trans = (String) jCtransp.getSelectedItem();
String origen = (String) jCorigen.getSelectedItem();
String destino = (String) jCdestino.getSelectedItem();
double suma = 0;

// Costos por destino
if (destino.equalsIgnoreCase("mar del plata") || destino.equalsIgnoreCase("pinamar")
        || destino.equalsIgnoreCase("miramar") || destino.equalsIgnoreCase("villa gesell")
        || destino.equalsIgnoreCase("necochea") || destino.equalsIgnoreCase("buenos aires")
        || destino.equalsIgnoreCase("mar de ajo")) {
    suma = 140000;
}
else if (trans.equalsIgnoreCase("avion")) {
    suma = suma * 1.6;
}
if (origen.equalsIgnoreCase("villa mercedes")) {
    suma = suma + 10000;
}


try {
    alojamientoData alojamientoData = new alojamientoData();
    double precioPorNoche = alojamientoData.getPrecioPorNoche(ALLBITS);

    if (precioPorNoche == 0) {
        JOptionPane.showMessageDialog(null, "No se encontró precio por noche para el destino seleccionado.");
        return;
    }

    double costoAlojamiento = precioPorNoche * diasEstadia;

    
    double montoFinal = precio + suma + costoAlojamiento;

    
    txtMontoFinal.setText(String.valueOf(montoFinal)); 
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error al obtener el precio del alojamiento: " + e.getMessage());
}
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jCdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCdestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCdestinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser calendIda;
    private com.toedter.calendar.JDateChooser calendVuelta;
    private javax.swing.JComboBox<Alojamiento> comboAlojamientos;
    private javax.swing.JButton jB_guardarPaquete;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCdestino;
    private javax.swing.JComboBox<String> jCorigen;
    private javax.swing.JComboBox<String> jCtransp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtCantidadPasajeros;
    private javax.swing.JTextField txtIdAlojamiento;
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
            int idAlojamiento = Integer.parseInt(txtIdAlojamiento.getText());  
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
            jtCantidadPasajeros.setText(String.valueOf(paquete.getPasajeros()));
            txtIdAlojamiento.setText(String.valueOf(paquete.getIdAlojamiento()));
            txt_idPasaje.setText(String.valueOf(paquete.getIdPasaje()));
            
            

            JOptionPane.showMessageDialog(null, "Paquete encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún paquete");
        }
    }  catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al buscar el paquete: " + e.getMessage());
    } 
    }
  private void modificarPaquete() {
    
        try{
            int idPaquete = Integer.parseInt(txtIdPaquete.getText());
            paquete = paqueData.buscarPaquete(idPaquete);
        
            if(paquete != null){
                
            paquete.setIdPaquete(Integer.parseInt(txtIdPaquete.getText()));
            paquete.setFechaIni(calendIda.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            paquete.setFechaFin(calendVuelta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            paquete.setOrigen((String) jCorigen.getSelectedItem());
            paquete.setDestino((String) jCdestino.getSelectedItem());
            paquete.setPasajeros(Integer.parseInt(jtCantidadPasajeros.getText()));
            paquete.setMedioViaje((String) jCtransp.getSelectedItem());
            paquete.setMontoFinal(Double.parseDouble(txtMontoFinal.getText()));
            paquete.setIdPasaje(Integer.parseInt(txt_idPasaje.getText()));
            paquete.setIdAlojamiento(Integer.parseInt(txtIdAlojamiento.getText()));
            paquete.setIdPension(Integer.parseInt(txtIdPension.getText()));

            
            paqueData.modificarPaquete(paquete);

        } else {
            JOptionPane.showMessageDialog(null, "El paquete con el ID especificado no existe.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: Verifique que los campos numéricos tengan valores válidos. " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
  }


    

