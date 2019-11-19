/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.sql.SQLException;
import vistaLogin.*;
/**
 *
 * @author Oscar Andres Arce
 */
public class GestionDeSistema extends javax.swing.JFrame {
    
    private int mod;
    private int idUsuario;
    

    /**
     * Creates new form GestionDeSistema
     */
    public GestionDeSistema() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
 
    public GestionDeSistema(int mod, int idUsuario) throws SQLException {
        //this.manager = new MySQLDaoManager("localhost", "root", "", "siac");
        initComponents();
        //setSize(800, 510);
        setResizable(false);
        setLocationRelativeTo(null);
        this.idUsuario = idUsuario;
        this.mod = mod;
        if (mod == 1) {
            btnGesEmpleados.setVisible(true);
            btnGesHoras.setVisible(false);
            btnGesInformes.setVisible(false);
            btnSueldo.setVisible(false);
        } else if (mod == 2) {
            btnGesEmpleados.setVisible(true);
            btnGesHoras.setVisible(true);
            btnGesInformes.setVisible(true);
            btnSueldo.setVisible(true);
        } 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGesEmpleados = new javax.swing.JButton();
        btnGesHoras = new javax.swing.JButton();
        btnGesInformes = new javax.swing.JButton();
        btnSueldo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGesEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnGesEmpleados.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnGesEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnGesEmpleados.setText("Gestion de Empleados");
        btnGesEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGesEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGesEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGesEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 228, 71));

        btnGesHoras.setBackground(new java.awt.Color(255, 255, 255));
        btnGesHoras.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnGesHoras.setForeground(new java.awt.Color(0, 0, 0));
        btnGesHoras.setText("Gestion de Horas Trabajadas");
        btnGesHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGesHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGesHorasActionPerformed(evt);
            }
        });
        getContentPane().add(btnGesHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 250, 70));

        btnGesInformes.setBackground(new java.awt.Color(255, 255, 255));
        btnGesInformes.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnGesInformes.setForeground(new java.awt.Color(0, 0, 0));
        btnGesInformes.setText("Gestion de Informes");
        btnGesInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGesInformesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGesInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 228, 68));

        btnSueldo.setBackground(new java.awt.Color(255, 255, 255));
        btnSueldo.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnSueldo.setForeground(new java.awt.Color(0, 0, 0));
        btnSueldo.setText("Liquidacion de Sueldos");
        btnSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 250, 68));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/304a38cb-167a-4dac-b2db-9ff975525191_200x200.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnRegresar.setText("Atras");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMarron.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGesInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGesInformesActionPerformed
        GenerarReporte ventana = new GenerarReporte(mod, idUsuario);
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnGesInformesActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frm_Menu ventana= new frm_Menu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGesEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGesEmpleadosActionPerformed
        // TODO add your handling code here:
        GestionEmpleados ventana= new GestionEmpleados(mod, idUsuario);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGesEmpleadosActionPerformed

    private void btnGesHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGesHorasActionPerformed
        horasTrabajadas ventana = new horasTrabajadas(mod, idUsuario);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGesHorasActionPerformed

    private void btnSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueldoActionPerformed
        GestionReciboSueldo ventana = new GestionReciboSueldo(mod, idUsuario);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSueldoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGesEmpleados;
    private javax.swing.JButton btnGesHoras;
    private javax.swing.JButton btnGesInformes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
