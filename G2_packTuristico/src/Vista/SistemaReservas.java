
package Vista;

public class SistemaReservas extends javax.swing.JFrame {

   
    public SistemaReservas() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        sistema = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_paquete = new javax.swing.JMenu();
        jM_paquete1 = new javax.swing.JMenuItem();
        jM_pasajes = new javax.swing.JMenu();
        jM_pasaje = new javax.swing.JMenuItem();
        jm_Turista = new javax.swing.JMenu();
        jM_agregarTurista = new javax.swing.JMenuItem();
        jM_alojamientos = new javax.swing.JMenu();
        menuAlojamientos = new javax.swing.JMenuItem();
        jM_habitacion = new javax.swing.JMenuItem();
        jM_pension = new javax.swing.JMenuItem();
        jM_salir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuprincipal (1).png"))); // NOI18N
        sistema.add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 680);

        getContentPane().add(sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 680));

        jM_paquete.setText("Paquete");
        jM_paquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_paqueteActionPerformed(evt);
            }
        });

        jM_paquete1.setText("Paquete");
        jM_paquete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_paquete1ActionPerformed(evt);
            }
        });
        jM_paquete.add(jM_paquete1);

        jMenuBar1.add(jM_paquete);

        jM_pasajes.setText("Pasajes");
        jM_pasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_pasajesActionPerformed(evt);
            }
        });

        jM_pasaje.setText("Cargar Pasaje");
        jM_pasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_pasajeActionPerformed(evt);
            }
        });
        jM_pasajes.add(jM_pasaje);

        jMenuBar1.add(jM_pasajes);

        jm_Turista.setText("Turistas");

        jM_agregarTurista.setText("Agregar Turista");
        jM_agregarTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_agregarTuristaActionPerformed(evt);
            }
        });
        jm_Turista.add(jM_agregarTurista);

        jMenuBar1.add(jm_Turista);

        jM_alojamientos.setText("Alojamientos");

        menuAlojamientos.setText("Alojamientos");
        menuAlojamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlojamientosActionPerformed(evt);
            }
        });
        jM_alojamientos.add(menuAlojamientos);

        jM_habitacion.setText("Habitacion");
        jM_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_habitacionActionPerformed(evt);
            }
        });
        jM_alojamientos.add(jM_habitacion);

        jM_pension.setText("Pension");
        jM_pension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_pensionActionPerformed(evt);
            }
        });
        jM_alojamientos.add(jM_pension);

        jMenuBar1.add(jM_alojamientos);

        jM_salir.setText("Salir");
        jM_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_salirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jM_salir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAlojamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlojamientosActionPerformed
        sistema.removeAll();
        sistema.repaint();
        vistaAlojamiento alojamiento = new vistaAlojamiento();
        sistema.add(alojamiento);
        alojamiento.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_menuAlojamientosActionPerformed

    private void jM_pasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_pasajeActionPerformed
        sistema.removeAll();
        sistema.repaint();
        VistaPasaje pasaje = new VistaPasaje();
        sistema.add(pasaje);
        pasaje.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_jM_pasajeActionPerformed

    private void jM_paqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_paqueteActionPerformed
        sistema.removeAll();
        sistema.repaint();
        VistaPaquete paquete = new VistaPaquete();
        sistema.add(paquete);
        paquete.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_jM_paqueteActionPerformed

    private void jM_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_habitacionActionPerformed
        sistema.removeAll();
        sistema.repaint();
        VistaHabitacion habitacion = new VistaHabitacion();
        sistema.add(habitacion);
        habitacion.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_jM_habitacionActionPerformed

    private void jM_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_salirActionPerformed
       dispose();
    }//GEN-LAST:event_jM_salirActionPerformed

    private void jM_pensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_pensionActionPerformed
        sistema.removeAll();
        sistema.repaint();
        VistaPension pension = new VistaPension();
        sistema.add(pension);
        pension.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_jM_pensionActionPerformed

    private void jM_agregarTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_agregarTuristaActionPerformed

        sistema.removeAll();
        sistema.repaint();
        VistaTurista turista = new VistaTurista();
        sistema.add(turista);
        turista.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_jM_agregarTuristaActionPerformed

    private void jM_paquete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_paquete1ActionPerformed
       sistema.removeAll();
        sistema.repaint();
        VistaPaquete paquete = new VistaPaquete();
        sistema.add(paquete);
        paquete.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_jM_paquete1ActionPerformed

    private void jM_pasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_pasajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jM_pasajesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jM_agregarTurista;
    private javax.swing.JMenu jM_alojamientos;
    private javax.swing.JMenuItem jM_habitacion;
    private javax.swing.JMenu jM_paquete;
    private javax.swing.JMenuItem jM_paquete1;
    private javax.swing.JMenuItem jM_pasaje;
    private javax.swing.JMenu jM_pasajes;
    private javax.swing.JMenuItem jM_pension;
    private javax.swing.JMenu jM_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jm_Turista;
    private javax.swing.JMenuItem menuAlojamientos;
    private javax.swing.JDesktopPane sistema;
    // End of variables declaration//GEN-END:variables
}
