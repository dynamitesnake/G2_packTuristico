
package Vista;

import Persistencia.TuristaData;
import Modelo.Turista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;



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

        txtdni = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jB_guardar = new javax.swing.JButton();
        jB_buscar = new javax.swing.JButton();
        jB_modificar = new javax.swing.JButton();
        jB_baja = new javax.swing.JButton();
        jB_alta = new javax.swing.JButton();
        jB_salir = new javax.swing.JButton();
        jB_activo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 280, 30));
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 30));
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 260, 30));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 150, 30));

        jB_guardar.setBackground(new java.awt.Color(255, 255, 255));
        jB_guardar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jB_guardar.setForeground(new java.awt.Color(255, 153, 51));
        jB_guardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\save_icon-icons.com_53618 (2).png")); // NOI18N
        jB_guardar.setText("AGREGAR");
        jB_guardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jB_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 170, 110));

        jB_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jB_buscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jB_buscar.setForeground(new java.awt.Color(255, 153, 51));
        jB_buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\find_search_card_user_16713 (1).png")); // NOI18N
        jB_buscar.setText("BUSCAR");
        jB_buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        jB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 170, 110));

        jB_modificar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jB_modificar.setForeground(new java.awt.Color(255, 153, 51));
        jB_modificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\pen_edit_modify_pencil_icon_181536 (1).png")); // NOI18N
        jB_modificar.setText("MODIFICAR");
        jB_modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jB_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 130, 60));

        jB_baja.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jB_baja.setForeground(new java.awt.Color(255, 153, 0));
        jB_baja.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\gui_low_priority_icon_157102 (1).png")); // NOI18N
        jB_baja.setText("BAJA");
        jB_baja.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jB_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_bajaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 130, 60));

        jB_alta.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jB_alta.setForeground(new java.awt.Color(255, 153, 0));
        jB_alta.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\task_document_paper_descending_priority_tasks_documents_icon_142254.png")); // NOI18N
        jB_alta.setText("ALTA");
        jB_alta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jB_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_altaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 130, 60));

        jB_salir.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jB_salir.setForeground(new java.awt.Color(255, 153, 51));
        jB_salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\logout_off_exit_14655.png")); // NOI18N
        jB_salir.setText("SALIR");
        jB_salir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jB_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jB_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 130, 60));

        jB_activo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jB_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 20, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/turista (2).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 670));

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
    private javax.swing.JLabel jLabel2;
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
