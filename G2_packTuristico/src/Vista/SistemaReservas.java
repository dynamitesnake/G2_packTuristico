
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
        Escritorio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_destinos = new javax.swing.JMenu();
        jM_pasajes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuTurista = new javax.swing.JMenu();
        Jturista = new javax.swing.JMenuItem();
        jM_alojamientos = new javax.swing.JMenu();
        menuAlojamientos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDAD (1).png"))); // NOI18N
        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 690));

        jM_destinos.setText("Destinos");
        jM_destinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_destinosActionPerformed(evt);
            }
        });
        jMenuBar1.add(jM_destinos);

        jM_pasajes.setText("Pasajes");
        jM_pasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_pasajesActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Cargar Pasaje");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jM_pasajes.add(jMenuItem2);

        jMenuBar1.add(jM_pasajes);

        menuTurista.setText("Turistas");

        Jturista.setText("Turista");
        Jturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JturistaActionPerformed(evt);
            }
        });
        menuTurista.add(Jturista);

        jMenuBar1.add(menuTurista);

        jM_alojamientos.setText("Alojamientos");

        menuAlojamientos.setText("Alojamientos");
        menuAlojamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlojamientosActionPerformed(evt);
            }
        });
        jM_alojamientos.add(menuAlojamientos);

        jMenuBar1.add(jM_alojamientos);

        jMenu4.setText("Salir");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_destinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_destinosActionPerformed
        Destinos destino = new Destinos();
        sistema.add(destino);
        destino.setVisible(true);
    }//GEN-LAST:event_jM_destinosActionPerformed

    private void jM_pasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_pasajesActionPerformed
        Pasajes pasaje = new Pasajes();
        sistema.add(pasaje);
        pasaje.setVisible(true);
        
    }//GEN-LAST:event_jM_pasajesActionPerformed

    private void JturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JturistaActionPerformed
       sistema.removeAll();
        sistema.repaint();
        VistaTurista turista = new VistaTurista();
        sistema.add(turista);
        turista.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_JturistaActionPerformed

    private void menuAlojamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlojamientosActionPerformed
        sistema.removeAll();
        sistema.repaint();
        vistaAlojamiento alojamiento = new vistaAlojamiento();
        sistema.add(alojamiento);
        alojamiento.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_menuAlojamientosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        sistema.removeAll();
        sistema.repaint();
        VistaPasajes pasaje = new VistaPasajes();
        sistema.add(pasaje);
        pasaje.setVisible(true);
        sistema.moveToFront(this);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JLabel Escritorio;
    private javax.swing.JMenuItem Jturista;
    private javax.swing.JMenu jM_alojamientos;
    private javax.swing.JMenu jM_destinos;
    private javax.swing.JMenu jM_pasajes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuAlojamientos;
    private javax.swing.JMenu menuTurista;
    // End of variables declaration//GEN-END:variables
}
