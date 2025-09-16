/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestiondeproductos2;

import Vistas.Administracion;
import Vistas.Listado_por_Nombre;
import Vistas.Listado_por_Precio;
import Vistas.Listado_por_Rubro;

/**
 *
 * @author Usuario
 */
public class Gestora extends javax.swing.JFrame {

    /**
     * Creates new form Gestora
     */
    public Gestora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGest = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMadmin = new javax.swing.JMenu();
        jmAdmin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMConsultaNom = new javax.swing.JMenuItem();
        JMConsultaPre = new javax.swing.JMenuItem();
        JMConsultaRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelGestLayout = new javax.swing.GroupLayout(PanelGest);
        PanelGest.setLayout(PanelGestLayout);
        PanelGestLayout.setHorizontalGroup(
            PanelGestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        PanelGestLayout.setVerticalGroup(
            PanelGestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        JMadmin.setText("Administracion");

        jmAdmin.setText("Admin");
        jmAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdminActionPerformed(evt);
            }
        });
        JMadmin.add(jmAdmin);

        jMenuBar1.add(JMadmin);

        jMenu2.setText("Consultas");

        JMConsultaNom.setText("Consulta por Nombre");
        JMConsultaNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMConsultaNomActionPerformed(evt);
            }
        });
        jMenu2.add(JMConsultaNom);

        JMConsultaPre.setText("Consulta por Precio");
        JMConsultaPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMConsultaPreActionPerformed(evt);
            }
        });
        jMenu2.add(JMConsultaPre);

        JMConsultaRubro.setText("Consulta por Rubro");
        JMConsultaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMConsultaRubroActionPerformed(evt);
            }
        });
        jMenu2.add(JMConsultaRubro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGest)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGest)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdminActionPerformed
        Administracion s = new Administracion();
        PanelGest.add(s);
        s.setVisible(true);
         s.setLocation(10, 10);

    }//GEN-LAST:event_jmAdminActionPerformed

    private void JMConsultaNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMConsultaNomActionPerformed
        Listado_por_Nombre s = new Listado_por_Nombre();
        PanelGest.add(s);
        s.setVisible(true);

    }//GEN-LAST:event_JMConsultaNomActionPerformed

    private void JMConsultaPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMConsultaPreActionPerformed
        Listado_por_Precio s = new Listado_por_Precio();
        PanelGest.add(s);
        s.setVisible(true);
        s.setLocation(50, 50);
    }//GEN-LAST:event_JMConsultaPreActionPerformed

    private void JMConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMConsultaRubroActionPerformed
        Listado_por_Rubro s = new Listado_por_Rubro();
        PanelGest.add(s);
        s.setVisible(true);
    }//GEN-LAST:event_JMConsultaRubroActionPerformed

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
            java.util.logging.Logger.getLogger(Gestora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMConsultaNom;
    private javax.swing.JMenuItem JMConsultaPre;
    private javax.swing.JMenuItem JMConsultaRubro;
    private javax.swing.JMenu JMadmin;
    private javax.swing.JDesktopPane PanelGest;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAdmin;
    // End of variables declaration//GEN-END:variables
}
