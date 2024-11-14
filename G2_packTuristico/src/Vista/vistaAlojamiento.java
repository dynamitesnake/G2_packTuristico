
package Vista;

import AccesoDatos.Conexion;
import Modelo.Alojamiento;
import Persistencia.alojamientoData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
       
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboAlojamientos = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtIdAlojamiento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtAmbientes = new javax.swing.JTextField();
        txtCamas = new javax.swing.JTextField();
        txtBaños = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(comboAlojamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 440, 30));

        btnGuardar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 153, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 160, 80));

        btnBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 153, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 160, 80));

        btnNuevo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 153, 0));
        btnNuevo.setText("LIMPIAR CAMPOS");
        btnNuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 160, 80));

        btnEliminar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 153, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 160, 80));

        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 153, 0));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 610, 90, 50));
        getContentPane().add(txtIdAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 440, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 560, 30));
        getContentPane().add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 510, 30));

        txtAmbientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmbientesActionPerformed(evt);
            }
        });
        getContentPane().add(txtAmbientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 520, 30));
        getContentPane().add(txtCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 590, 30));
        getContentPane().add(txtBaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 590, 30));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 590, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hotel (3).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1210, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarAlojamiento();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarAlojamiento();
       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarAlojamiento();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtAmbientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmbientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmbientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alojamiento> comboAlojamientos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAmbientes;
    private javax.swing.JTextField txtBaños;
    private javax.swing.JTextField txtCamas;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtIdAlojamiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void comboAlojamiento() {
     for (Alojamiento item : listaAloja)  {
        comboAlojamientos.addItem(item);
    }
    }

    private void cargarAlojamientos (){
        Alojamiento selec = (Alojamiento) comboAlojamientos.getSelectedItem();
       List <Alojamiento> lista = alojaData.listarAlojamiento();
       for (Alojamiento a : lista){
           modelo.addRow(new Object [] {a.getNombre(),a.getCapacidad(),a.getNroAmbientes(),a.getCamas(),a.getBaños(),a.getPrecioNoche()});
    }    
}
  private void buscarAlojamiento() { 
    try { 
        int selectedIndex = comboAlojamientos.getSelectedIndex();
        
        if (selectedIndex >= 0) {  
            Alojamiento selectedAlojamiento = (Alojamiento) comboAlojamientos.getItemAt(selectedIndex); 
            int idAlojamiento = selectedAlojamiento.getIdAlojamiento(); 
            
            Alojamiento alojamiento = alojaData.buscarAlojamiento(idAlojamiento);
            
            if (comboAlojamientos != null) { 
                txtIdAlojamiento.setText(String.valueOf(alojamiento.getIdAlojamiento()));
                txtNombre.setText(alojamiento.getNombre()); 
                txtCapacidad.setText(String.valueOf(alojamiento.getCapacidad())); 
                txtAmbientes.setText(String.valueOf(alojamiento.getNroAmbientes())); 
                txtCamas.setText(String.valueOf(alojamiento.getCamas())); 
                txtBaños.setText(String.valueOf(alojamiento.getBaños())); 
                txtPrecio.setText(String.valueOf(alojamiento.getPrecioNoche())); 
                JOptionPane.showMessageDialog(null, "Alojamiento encontrado: " + alojamiento.getNombre()); 
            } else { 
                JOptionPane.showMessageDialog(null, "Alojamiento no encontrado."); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un alojamiento.");
        }
        
    } catch (ClassCastException e) {
        JOptionPane.showMessageDialog(null, "Error: No se pudo obtener el alojamiento seleccionado."); 
    } catch (Exception e) { 
        JOptionPane.showMessageDialog(null, "Ocurrió un error al buscar el alojamiento: " + e.getMessage()); 
    }
}
private void guardarAlojamiento() {
        try { 
            int idAlojamiento = Integer.parseInt(txtIdAlojamiento.getText()); 
            String nombre = txtNombre.getText(); 
            int capacidad = Integer.parseInt(txtCapacidad.getText()); 
            int nroAmbientes = Integer.parseInt(txtAmbientes.getText()); 
            int camas = Integer.parseInt(txtCamas.getText()); 
            int baños = Integer.parseInt(txtBaños.getText()); 
            double precioNoche = Double.parseDouble(txtPrecio.getText()); 
            
            Alojamiento alojamiento = new Alojamiento(idAlojamiento, nombre, capacidad, nroAmbientes , camas, baños, precioNoche); 
            
            alojaData.guardarAlojamiento(alojamiento); 
            JOptionPane.showMessageDialog(null, "alojamiento agregado: "); 
            limpiarCampos(); 
        } catch (NumberFormatException e) { 
            JOptionPane.showMessageDialog(null, "Error: Por favor ingresa datos validos"); 
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar el Alojamiento: " + e.getMessage()); 
        }
    }     private void eliminarAlojamiento() {
        try {
            int idAlojamiento = Integer.parseInt(txtIdAlojamiento.getText().trim());
            alojaData.eliminarAlojamiento(idAlojamiento);
            JOptionPane.showMessageDialog(null, "Alojamiento eliminado.");
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Por favor ingrese un alojamiento valido.");     
        }
     } private void limpiarCampos() {
         txtIdAlojamiento.setText("");
        txtNombre.setText("");
        txtCapacidad.setText("");
        txtAmbientes.setText("");
        txtCamas.setText("");
        txtBaños.setText("");
        txtPrecio.setText("");
    } 
  }

