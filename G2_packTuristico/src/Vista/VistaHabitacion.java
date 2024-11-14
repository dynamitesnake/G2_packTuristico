
package Vista;

import Modelo.Habitacion;
import Persistencia.HabitacionData;
import javax.swing.JOptionPane;
import AccesoDatos.Conexion;

/**
 *
 * @author deborahhhh
 */
public class VistaHabitacion extends javax.swing.JInternalFrame {
private HabitacionData habiData = new HabitacionData();
private Habitacion habiActual = null;
  
    public VistaHabitacion() {
        initComponents();
        habiData = new HabitacionData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTidHabitacion = new javax.swing.JTextField();
        JTNPlanta = new javax.swing.JTextField();
        JTNumeracion = new javax.swing.JTextField();
        JTcupo = new javax.swing.JTextField();
        JRestado = new javax.swing.JRadioButton();
        JBbuscar = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        JBmodificar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JTidalojamiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JTidHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 330, 30));
        getContentPane().add(JTNPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 280, 30));
        getContentPane().add(JTNumeracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 350, 30));
        getContentPane().add(JTcupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 440, 30));
        getContentPane().add(JRestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        JBbuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        JBbuscar.setForeground(new java.awt.Color(255, 153, 0));
        JBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono buscar (2).png"))); // NOI18N
        JBbuscar.setText("BUSCAR");
        JBbuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 150, 60));

        JBguardar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        JBguardar.setForeground(new java.awt.Color(255, 153, 0));
        JBguardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\save_icon-icons.com_53618 (1).png")); // NOI18N
        JBguardar.setText("GUARDAR");
        JBguardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });
        getContentPane().add(JBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 150, 60));

        JBmodificar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        JBmodificar.setForeground(new java.awt.Color(255, 153, 0));
        JBmodificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\documentediting_editdocuments_text_documentedi_2820.png")); // NOI18N
        JBmodificar.setText("MODIFICAR");
        JBmodificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        JBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(JBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 150, 60));

        JBeliminar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        JBeliminar.setForeground(new java.awt.Color(255, 153, 0));
        JBeliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\1486564399-close_81512.png")); // NOI18N
        JBeliminar.setText("ELIMINAR");
        JBeliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        getContentPane().add(JBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 150, 60));

        JTidalojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTidalojamientoActionPerformed(evt);
            }
        });
        getContentPane().add(JTidalojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 320, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vista habitacion.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmodificarActionPerformed
        
        try{
        int id = Integer.parseInt(JTidHabitacion.getText());
        habiActual = habiData.buscarHabitacion(id);
        
        if(habiActual != null){
            //modifica los atributos de habiActual segun los nuevos valores:
        habiActual.setPlanta(Integer.parseInt(JTNPlanta.getText()));
        habiActual.setNumeracion(Integer.parseInt(JTNumeracion.getText()));
        habiActual.setCupo(Integer.parseInt(JTcupo.getText()));
        habiActual.setIdalojamiento(Integer.parseInt(JTidalojamiento.getText()));
        JRestado.setSelected(habiActual.isActivo());//si esta activo, se selecciona el boton. 
        
        //logica para guardar los cambios en la base de datos:
        habiData.modificarHabitacion(habiActual);
        
        JOptionPane.showMessageDialog(this, "Habitacion modificada con exito");
        }else{
        JOptionPane.showMessageDialog(this, "Habitacion No encontrada");
        }
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe Ingresar un numero valido para el ID");
         }catch(Exception ex){
             JOptionPane.showMessageDialog(this, "Ocurrio un error al modificar habitacion");
         
         }
    }//GEN-LAST:event_JBmodificarActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
       
        try{
        Integer id = Integer.parseInt(JTidHabitacion.getText());
        habiActual = habiData.buscarHabitacion(id);
        if (habiActual != null){
        JTNPlanta.setText(String.valueOf(habiActual.getPlanta()));
        JTNumeracion.setText(String.valueOf(habiActual.getNumeracion()));
        JTcupo.setText(String.valueOf(habiActual.getCupo()));
        JTidalojamiento.setText(String.valueOf(habiActual.getIdalojamiento()));
        JRestado.setSelected(habiActual.isActivo());
         
        }
          }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "debe ingresar un numero valido");
        }
    }
    
    
    private void limpiarCampos(){

 JTidHabitacion.setText("");
 JTNPlanta.setText("");
 JTNumeracion.setText("");
 JTcupo.setText("");
 JTidalojamiento.setText("");
 JRestado.setSelected(true);
 
 


    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
    try {
        int idHabitacion = Integer.parseInt(JTidHabitacion.getText().trim());
        int planta = Integer.parseInt(JTNPlanta.getText().trim());
        int numeracion = Integer.parseInt(JTNumeracion.getText().trim());
        int cupo = Integer.parseInt(JTcupo.getText().trim());
        if (cupo < 1) {  // Permitir solo valores positivos
        JOptionPane.showMessageDialog(null, "El cupo debe ser un número positivo");
        return;
    }
        int idalojamiento = Integer.parseInt(JTidalojamiento.getText().trim());
        boolean estado = JRestado.isSelected();
     
     Habitacion habitacion = new Habitacion (idHabitacion, planta, numeracion, cupo, idalojamiento,  estado);
    habiData.guardarHabitacion(habitacion);
    JOptionPane.showMessageDialog(null, "Habitación guardada con éxito");
    limpiarCampos();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido");
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar la habitación: " + ex.getMessage());
}
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JTidalojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTidalojamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTidalojamientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBmodificar;
    private javax.swing.JRadioButton JRestado;
    private javax.swing.JTextField JTNPlanta;
    private javax.swing.JTextField JTNumeracion;
    private javax.swing.JTextField JTcupo;
    private javax.swing.JTextField JTidHabitacion;
    private javax.swing.JTextField JTidalojamiento;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
