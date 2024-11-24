/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Pasajes;
import Persistencia.pasajeDatas;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author 54266
 */
public class VistaPasaje extends javax.swing.JInternalFrame {

    private pasajeDatas pasaData = new pasajeDatas();
    private Pasajes pasaje = new Pasajes();

    public VistaPasaje() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jCorigen = new javax.swing.JComboBox<>();
        jCdestino = new javax.swing.JComboBox<>();
        jCAsiento = new javax.swing.JComboBox<>();
        jCtransp = new javax.swing.JComboBox<>();
        calendIda = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCodigo = new javax.swing.JTextPane();
        jBpresupuesto = new javax.swing.JButton();
        calendVuelta = new com.toedter.calendar.JDateChooser();
        jTprecio = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San Luis", "Villa Mercedes", " ", " " }));
        getContentPane().add(jCorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 160, -1));

        jCdestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mar del Plata", "Bariloche", "Mendoza", "Salta", "Jujuy", "Las Grutas", "Puerto Madryn", "Carlos Paz", "Mina Clavero", "Pinamar", "Miramar", "Villa Gesell", "Necochea", "Puerto Iguazu", "Termas de Rio Hondo", "Merlo", "Calafate", "Ushuaia", "Tucuman", "Chubut", "Buenos Aires", "Mar de Ajó", "Santiago de Chile", "Florianapolis", "Camboriú", "Punta del Este", "Punta Cana", "Cancun", "Viña del Mar", "Montevideo", "Cordoba", "" }));
        getContentPane().add(jCdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 160, -1));

        jCAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        getContentPane().add(jCAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, -1));

        jCtransp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Colectivo" }));
        getContentPane().add(jCtransp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 160, -1));
        getContentPane().add(calendIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 160, -1));

        jScrollPane1.setViewportView(jTCodigo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 160, -1));

        jBpresupuesto.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jBpresupuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono compras.png"))); // NOI18N
        jBpresupuesto.setText("PRESUPUESTAR");
        jBpresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpresupuestoActionPerformed(evt);
            }
        });
        getContentPane().add(jBpresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 220, 50));
        getContentPane().add(calendVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 160, -1));

        jTprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 110, 30));

        jBguardar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jBguardar.setText("GUARDAR");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 160, 50));

        eliminar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono eliminar.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 190, 60));

        jBuscar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono buscar (2).png"))); // NOI18N
        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VistaPasajefinal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBpresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpresupuestoActionPerformed
        presupuesto();
    }//GEN-LAST:event_jBpresupuestoActionPerformed

    private void jTprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprecioActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        guardarDatos();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarDatos() {
        presupuesto();
        try {
            // Validar que el campo de código no esté vacío antes de convertirlo
            String idTexto = jTCodigo.getText();
            if (idTexto != null && !idTexto.isEmpty()) {
                Integer id = Integer.parseInt(idTexto);
                String trans = (String) jCtransp.getSelectedItem();
                String origen = (String) jCorigen.getSelectedItem();
                String destino = (String) jCdestino.getSelectedItem();
                LocalDate fechaIda = new java.sql.Date(calendIda.getDate().getTime()).toLocalDate();
                LocalDate fechaVuelta = new java.sql.Date(calendVuelta.getDate().getTime()).toLocalDate();
                String selecAsiento = (String) jCAsiento.getSelectedItem();

                // Validar que selecAsiento no sea nulo o vacío antes de convertirlo
                if (selecAsiento != null && !selecAsiento.isEmpty()) {
                    int asiento = Integer.parseInt(selecAsiento);

                    // Validar que jTprecio no sea nulo o vacío antes de convertirlo
                    String precioTexto = jTprecio.getText();
                    if (precioTexto != null && !precioTexto.isEmpty()) {
                        double precio = Double.parseDouble(precioTexto);

                        // Guardar el pasaje
                        pasaData.guardPasaje(new Pasajes(id, fechaIda, fechaVuelta, origen, destino, asiento));
                        JOptionPane.showMessageDialog(null, "Pasaje con D.N.I " + id + " guardado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "El campo de precio está vacío.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El campo de asiento está vacío.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo de D.N.I está vacío.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en la conversión de números: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: Hay un campo sin seleccionar o vacío.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
        }

    }

    private void presupuesto() {
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
        jTprecio.setText(String.valueOf(suma));

    }

    private void buscar() {
        String idText = jTCodigo.getText().trim();
        if (idText.isEmpty() || !idText.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
            return;
        }

        try {
            Integer id = Integer.parseInt(jTCodigo.getText());
            pasaje = pasaData.buscarPasaje(id);
            if (pasaje != null) {
                //jCtransp.setText(String.valueOf(pasaje.));
                jCorigen.setSelectedItem(pasaje.getOrigen());
                jCdestino.setSelectedItem(pasaje.getDestino());
                jCAsiento.setSelectedItem(pasaje.getAsiento());
                LocalDate fechaida= pasaje.getFechaida();
                if(fechaida!=null){
                    calendIda.setDate(java.sql.Date.valueOf(fechaida));
                }else{
                    calendIda.setDate(null);
                }
                
                LocalDate fechaVuelta= pasaje.getFechavuelta();
                if(fechaVuelta != null){
                    calendVuelta.setDate(java.sql.Date.valueOf(fechaVuelta));               
                }else {
                    calendVuelta.setDate(null);
                }
                

            }else{
               JOptionPane.showMessageDialog(this, "Pasaje no encontrado."); 
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "debe ingresar un numero valido");
        }catch (Exception ex) { JOptionPane.showMessageDialog(this, "Ocurrió un error: " + ex.getMessage());
    }
    }
    public void eliminar(){
         try{
        int idPasaje = Integer.parseInt(jTCodigo.getText());
        pasaData.eliminarPasaje(idPasaje);
        JOptionPane.showMessageDialog(null,"Pasaje "+jTCodigo.getText()+" Eliminado");
        } catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Ingrese un pasaje valido");
        }
    }            
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser calendIda;
    private com.toedter.calendar.JDateChooser calendVuelta;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBpresupuesto;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<String> jCAsiento;
    private javax.swing.JComboBox<String> jCdestino;
    private javax.swing.JComboBox<String> jCorigen;
    private javax.swing.JComboBox<String> jCtransp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTCodigo;
    private javax.swing.JTextField jTprecio;
    // End of variables declaration//GEN-END:variables
}
/* Un cliente seleccionara ciudades origen y destino, que guardan código, nombre, fecha inicio y fin 
de su estadía. Nos interesaran aquellos destinos turísticos por sus temporadas altas.
➢ A partir del destino seleccionado se ofrecen diferentes opciones de paquetes a presupuestar.
Para armar el Paquete, se debe ingresar el destino, las fechas desde y hasta cuando desea viajar.
➢ Se buscarán los transportes entre origen y destino, con su precio (siempre por persona) y agrega 
al paquete. Los precios varían según la elección el avión es el transporte más costoso.
 */
