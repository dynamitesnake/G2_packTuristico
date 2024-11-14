
package Vista;

import Modelo.Habitacion;
import Persistencia.HabitacionData;
import javax.swing.JOptionPane;

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTidHabitacion = new javax.swing.JTextField();
        JTNPlanta = new javax.swing.JTextField();
        JTNumeracion = new javax.swing.JTextField();
        JTcupo = new javax.swing.JTextField();
        JRestado = new javax.swing.JRadioButton();
        JBbuscar = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        JBmodificar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTidalojamiento = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Habitacion");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Id Habiatacion: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Numero de Planta:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Numeracion: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Cupo: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Estado: ");

        JBbuscar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBbuscar.setText("Buscar");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        JBguardar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        JBmodificar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBmodificar.setText("Modificar");
        JBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmodificarActionPerformed(evt);
            }
        });

        JBeliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBeliminar.setText("Eliminar");

        jLabel7.setText("idalojamiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTNPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(124, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRestado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(JBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTcupo, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(JTNumeracion)
                            .addComponent(JTidalojamiento))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNumeracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(JTcupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(JRestado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JTidalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBguardar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(JBbuscar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBeliminar)))
                .addGap(26, 26, 26))
        );

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
