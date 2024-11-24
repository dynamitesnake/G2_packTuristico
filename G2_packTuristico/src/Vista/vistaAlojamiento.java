
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
    private Alojamiento alojamiento = null;
    
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
        btn_modificar = new javax.swing.JButton();
        txtIdAlojamiento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtAmbientes = new javax.swing.JTextField();
        txtCamas = new javax.swing.JTextField();
        txtBaños = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(comboAlojamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 340, 30));

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
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 160, 80));

        btnBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 153, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono buscar (2).png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 160, 80));

        btnNuevo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 153, 0));
        btnNuevo.setText("LIMPIAR CAMPOS");
        btnNuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 160, 80));

        btnEliminar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 153, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 160, 80));

        btn_modificar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 153, 0));
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono editar.png"))); // NOI18N
        btn_modificar.setText("MODIFICAR");
        btn_modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 160, 80));
        getContentPane().add(txtIdAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 340, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 420, 30));
        getContentPane().add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 390, 30));
        getContentPane().add(txtAmbientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 390, 30));
        getContentPane().add(txtCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 440, 30));
        getContentPane().add(txtBaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 440, 30));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 330, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vista alojamiento.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        modificarAlojamiento();
    }//GEN-LAST:event_btn_modificarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btn_modificar;
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
    }     
    
    private void eliminarAlojamiento() {
        try {
            int idAlojamiento = Integer.parseInt(txtIdAlojamiento.getText().trim());
            alojaData.eliminarAlojamiento(idAlojamiento);
            JOptionPane.showMessageDialog(null, "Alojamiento eliminado.");
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Por favor ingrese un alojamiento valido.");     
        }
     } 
    
    private void limpiarCampos() {
         txtIdAlojamiento.setText("");
        txtNombre.setText("");
        txtCapacidad.setText("");
        txtAmbientes.setText("");
        txtCamas.setText("");
        txtBaños.setText("");
        txtPrecio.setText("");
    } 
     
     private void modificarAlojamiento() {
    
        try{
            int idAlojamiento = Integer.parseInt(txtIdAlojamiento.getText());
            alojamiento = alojaData.buscarAlojamiento(idAlojamiento);
        
            if(alojamiento != null){
                //modifica los atributos de habiActual segun los nuevos valores:
            alojamiento.setNombre(txtNombre.getText());
            alojamiento.setCapacidad(Integer.parseInt(txtCapacidad.getText()));
            alojamiento.setNroAmbientes(Integer.parseInt(txtAmbientes.getText()));
            alojamiento.setCamas(Integer.parseInt(txtCamas.getText()));
            alojamiento.setBaños(Integer.parseInt(txtBaños.getText()));
            alojamiento.setPrecioNoche(Integer.parseInt(txtPrecio.getText())); 

            //logica para guardar los cambios en la base de datos:
            alojaData.modificarAlojamiento(alojamiento);
        
        JOptionPane.showMessageDialog(this, "Alojamiento modificado con exito");
        }else{
        JOptionPane.showMessageDialog(this, "Alojamiento no encontrado");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar un numero valido para el ID");
         }catch(Exception ex){
             JOptionPane.showMessageDialog(this, "Ocurrio un error al modificar el alojamiento");
    }
}
  }

