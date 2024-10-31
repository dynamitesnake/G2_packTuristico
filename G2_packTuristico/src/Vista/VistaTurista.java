
package Vista;

import Persistencia.TuristaData;
import Modelo.Turista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class VistaTurista extends javax.swing.JInternalFrame {
    
    private TuristaData turisData = new TuristaData();
    private Turista turista = null;
    private List<Turista> turistas;


    public VistaTurista() {
        this.turistas = new ArrayList<>();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtdni = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jB_guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jB_buscar = new javax.swing.JButton();
        jB_modificar = new javax.swing.JButton();
        jB_baja = new javax.swing.JButton();
        jB_alta = new javax.swing.JButton();
        jB_salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jB_activo = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("CLIENTE");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("DNI:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("NOMBRE COMPLETO:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("EDAD:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("ID PAQUETE:");

        jB_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jB_guardar.setForeground(new java.awt.Color(0, 102, 255));
        jB_guardar.setText("AGREGAR");
        jB_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_guardarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\icons8-passport-50.png")); // NOI18N

        jB_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jB_buscar.setForeground(new java.awt.Color(0, 102, 255));
        jB_buscar.setText("BUSCAR");
        jB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarActionPerformed(evt);
            }
        });

        jB_modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB_modificar.setForeground(new java.awt.Color(0, 153, 255));
        jB_modificar.setText("MODIFICAR");
        jB_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_modificarActionPerformed(evt);
            }
        });

        jB_baja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB_baja.setForeground(new java.awt.Color(0, 153, 255));
        jB_baja.setText("BAJA");
        jB_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_bajaActionPerformed(evt);
            }
        });

        jB_alta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB_alta.setForeground(new java.awt.Color(0, 153, 255));
        jB_alta.setText("ALTA");
        jB_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_altaActionPerformed(evt);
            }
        });

        jB_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB_salir.setForeground(new java.awt.Color(0, 153, 255));
        jB_salir.setText("SALIR");
        jB_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\icons8-taj-mahal-50.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("ACTIVO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jB_modificar)
                .addGap(40, 40, 40)
                .addComponent(jB_baja)
                .addGap(45, 45, 45)
                .addComponent(jB_alta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_salir)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtedad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdni))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jB_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jB_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jB_activo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jB_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_modificar)
                    .addComponent(jB_baja)
                    .addComponent(jB_alta)
                    .addComponent(jB_salir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_guardarActionPerformed
        guardarTurista ();
    }//GEN-LAST:event_jB_guardarActionPerformed

    private void jB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarActionPerformed
        buscarTurista ();
    }//GEN-LAST:event_jB_buscarActionPerformed

    private void jB_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_modificarActionPerformed
        modificarTurista();
    }//GEN-LAST:event_jB_modificarActionPerformed

    private void jB_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jB_salirActionPerformed

    private void jB_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_altaActionPerformed
       altaTurista();
    }//GEN-LAST:event_jB_altaActionPerformed

    private void jB_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_bajaActionPerformed
        bajaTurista();
    }//GEN-LAST:event_jB_bajaActionPerformed

    private void guardarTurista() {
        try { 
            int dni = Integer.parseInt(txtdni.getText()); 
            String nombre = txtnom.getText(); 
            int edad = Integer.parseInt(txtedad.getText()); 
            int idpaquete = Integer.parseInt(txtid.getText()); 
            boolean activo = true;
            Turista turista = new Turista(dni, nombre, edad, idpaquete, activo); 
            
            turisData.guardarTurista(turista); 
            JOptionPane.showMessageDialog(null, "Cliente agregado: " + nombre); 
            limpiarCampos(); 
        } catch (NumberFormatException e) { 
            JOptionPane.showMessageDialog(null, "Error: Por favor ingresa números válidos para DNI, Edad y ID de Paquete."); 
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar el turista: " + e.getMessage()); 
        }
    }       
    
    private void buscarTurista() { 
       try { 
           int dni = Integer.parseInt(txtdni.getText()); 
           Turista turista = turisData.buscarTurista(dni);
        if (turista != null) { 
            txtnom.setText(turista.getNombre()); 
            txtedad.setText(String.valueOf(turista.getEdad())); 
            txtid.setText(String.valueOf(turista.getIdPaquete())); 
            jB_activo.setSelected(turista.isActivo());
            JOptionPane.showMessageDialog(null, "Turista encontrado: " + turista.getNombre()); 
        } else { JOptionPane.showMessageDialog(null, "Turista no encontrado."); 
        } 
       } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: Por favor ingresa un DNI válido."); 
       } catch (Exception e) { JOptionPane.showMessageDialog(null, "Ocurrió un error al buscar el turista: " + e.getMessage()); 
       }
    }  
    
    private void modificarTurista() {
    try {
        int dni = Integer.parseInt(txtdni.getText());
        for (Turista turista : turistas) {
            if (turista.getDni() == dni) { 
                turista.setNombre(txtnom.getText());
                turista.setEdad(Integer.parseInt(txtedad.getText()));
                turista.setIdPaquete(Integer.parseInt(txtid.getText()));
                JOptionPane.showMessageDialog(null, "Turista modificado: " + turista.getNombre());
                limpiarCampos();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Turista no encontrado.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: Por favor ingresa números válidos para Edad y ID de Paquete.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al modificar el turista: " + e.getMessage());
    }
}
    
    private void bajaTurista() {
        try { 
            int dni = Integer.parseInt(txtdni.getText()); 
            for (Turista turista : turistas) { 
                if (turista.getDni() == dni) { 
                    turista.setActivo(false); 
                    JOptionPane.showMessageDialog(null, "Turista dado de baja: " + turista.getNombre()); 
                    limpiarCampos(); 
                    return;  
                } 
            } JOptionPane.showMessageDialog(null, "Turista no encontrado."); 
        } catch (NumberFormatException e) { JOptionPane.showMessageDialog(null, "Error: Por favor ingresa un DNI válido."); 
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al dar de baja el turista: " + e.getMessage()); 
        } 
    }
    
    private void altaTurista() {
        try { 
            int dni = Integer.parseInt(txtdni.getText()); 
            for (Turista turista : turistas) { 
                if (turista.getDni() == dni) { 
                    turista.setActivo(true); 
                    JOptionPane.showMessageDialog(null, "Turista dado de alta: " + turista.getNombre()); 
                    limpiarCampos(); 
                    return; 
                } 
            } 
            JOptionPane.showMessageDialog(null, "Turista no encontrado."); 
        } catch (NumberFormatException e) { 
            JOptionPane.showMessageDialog(null, "Error: Por favor ingresa un DNI válido."); 
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocurrió un error al dar de alta el turista: " + e.getMessage()); 
        } 
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jB_activo;
    private javax.swing.JButton jB_alta;
    private javax.swing.JButton jB_baja;
    private javax.swing.JButton jB_buscar;
    private javax.swing.JButton jB_guardar;
    private javax.swing.JButton jB_modificar;
    private javax.swing.JButton jB_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtdni.setText("");
        txtnom.setText("");
        txtedad.setText("");
        txtid.setText("");
    }

    

    
    
}
