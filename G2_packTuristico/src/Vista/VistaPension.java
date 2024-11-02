
package Vista;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pension;
import persistencia.PensionData;

public class VistaPension extends javax.swing.JInternalFrame {
    PensionData pensionData = new PensionData();
    public VistaPension() {
        initComponents();
        setTitle("Gestión de Pensión"); 
        setSize(500, 400);
        setLayout(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPorcentaje = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldPorcentaje = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListar = new javax.swing.JTextArea();

        jLabelPorcentaje.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelPorcentaje.setText("Porcentaje:");

        jLabelNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jTextFieldPorcentaje.setMinimumSize(new java.awt.Dimension(68, 22));

        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(68, 22));

        jButtonBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonListar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTextAreaListar.setColumns(20);
        jTextAreaListar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jButtonModificar)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPorcentaje)
                                    .addComponent(jLabelNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jTextFieldPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButtonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonListar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la pensión a buscar:")); 
        Pension pension = pensionData.buscarPension(id); 
        if (pension != null) { 
            jTextFieldNombre.setText(pension.getNombre()); 
            jTextFieldPorcentaje.setText(String.valueOf(pension.getPorcentaje())); 
            JOptionPane.showMessageDialog(null, "Pensión encontrada"); 
        } else { 
            JOptionPane.showMessageDialog(null, "Pensión no encontrada");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextFieldNombre.getText();
        double porcentaje = Double.parseDouble(jTextFieldPorcentaje.getText());
        
        Pension pension = new Pension(nombre, porcentaje);
        pensionData.agregarPension(pension);
        JOptionPane.showMessageDialog(null, "Pensión agregada correctamente");
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextFieldNombre.getText(); 
        double porcentaje = Double.parseDouble(jTextFieldPorcentaje.getText()); 
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la pensión a modificar:")); 
        Pension pension = new Pension(id, nombre, porcentaje); 
        pensionData.modificarPension(pension); 
        JOptionPane.showMessageDialog(null, "Pensión modificada correctamente");
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
        List<Pension> pensiones = pensionData.listarPensiones(); 
        jTextAreaListar.setText(""); 
        for (Pension p : pensiones) { 
            jTextAreaListar.append(p.getIdPension() + " - " + p.getNombre() + " - " + p.getPorcentaje() + "\n"); 
        }
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la pensión a eliminar:")); 
        pensionData.eliminarPension(id); 
        JOptionPane.showMessageDialog(null, "Pensión eliminada correctamente");
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPorcentaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaListar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPorcentaje;
    // End of variables declaration//GEN-END:variables

}