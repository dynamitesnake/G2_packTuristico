
package Vista;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pension;
import persistencia.PensionData;

public class VistaPension extends javax.swing.JInternalFrame {
    PensionData pensionData = new PensionData();
    public VistaPension() {
        initComponents();
        setTitle("Gestión de Pensión"); 
        setSize(900, 500);
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldID = new javax.swing.JTextField();
        jTextFieldPorcentaje = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldID.setMinimumSize(new java.awt.Dimension(68, 22));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 100, 30));

        jTextFieldPorcentaje.setMinimumSize(new java.awt.Dimension(68, 22));
        getContentPane().add(jTextFieldPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 100, 30));

        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(68, 22));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, 30));

        jButtonBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 153, 0));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono buscar (2).png"))); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 180, 70));

        jButtonAgregar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 153, 0));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButtonAgregar.setText("AGREGAR");
        jButtonAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 180, 70));

        jButtonModificar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 153, 51));
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 120, 40));

        jButtonListar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButtonListar.setForeground(new java.awt.Color(255, 153, 0));
        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono listar.png"))); // NOI18N
        jButtonListar.setText("LISTAR");
        jButtonListar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButtonListar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 180, 70));

        jButtonEliminar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 153, 51));
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 120, 40));

        jTextAreaListar.setColumns(20);
        jTextAreaListar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 430, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pensión ultimo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la pensión a buscar:")); 
        Pension pension = pensionData.buscarPension(id); 
        if (pension != null) { 
            jTextFieldID.setText(String.valueOf(pension.getIdPension()));
            jTextFieldNombre.setText(pension.getNombre()); 
            jTextFieldPorcentaje.setText(String.valueOf(pension.getPorcentaje())); 
            JOptionPane.showMessageDialog(null, "Pensión encontrada"); 
        } else { 
            JOptionPane.showMessageDialog(null, "Pensión no encontrada");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jTextFieldID.getText());
            String nombre = jTextFieldNombre.getText();
            double porcentaje = Double.parseDouble(jTextFieldPorcentaje.getText());

            Pension pension = new Pension(id, nombre, porcentaje);
            pensionData.agregarPension(pension);
            JOptionPane.showMessageDialog(null, "Pensión agregada correctamente");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe completar los campos de texto.");
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000")) { // Código SQLState para clave duplicada
                JOptionPane.showMessageDialog(null, "Error: El ID de la pensión ya existe. Por favor, ingrese un ID diferente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar pensión.");
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        try {
        int idOriginal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la pensión a modificar:"));

        String idNuevoTexto = jTextFieldID.getText();
        String nombre = jTextFieldNombre.getText(); 
        double porcentaje = Double.parseDouble(jTextFieldPorcentaje.getText());

        Integer idNuevo = idNuevoTexto.isEmpty() ? null : Integer.parseInt(idNuevoTexto);

        Pension pension = new Pension(idOriginal, nombre, porcentaje);

        pensionData.modificarPension(idOriginal, idNuevo, pension);

        JOptionPane.showMessageDialog(null, "Pensión modificada correctamente");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Debe completar los campos de texto correctamente.");
    } catch (Exception e) {
        e.printStackTrace();
    }
  
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

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaListar;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPorcentaje;
    // End of variables declaration//GEN-END:variables

}