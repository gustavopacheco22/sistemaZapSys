/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaLogin;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import javax.swing.JOptionPane;
import modeloLogin.SqlUsuarios;
import modeloLogin.Hash;
import modeloLogin.Usuarios;

/**
 *
 * @author Gustavo
 */
public class frm_alta extends javax.swing.JFrame {

    /**
     * Creates new form frm_alta
     */
    PlaceHolder holder;
    public frm_alta() {
        initComponents();
        setLocationRelativeTo(null);
        holders();

    }
    
    public void holders(){
        holder = new PlaceHolder(txtNombre, Color.ORANGE, Color.ORANGE, "Nombre: ", rootPaneCheckingEnabled, "arial", 12) ;
        holder = new PlaceHolder(txtApellido, Color.ORANGE, Color.ORANGE, "Apellido: ", rootPaneCheckingEnabled, "arial", 12);
        holder = new PlaceHolder(txtUsername, Color.ORANGE, Color.ORANGE, "Username: ", rootPaneCheckingEnabled, "arial", 12);
        holder = new PlaceHolder(txtCorreo, Color.ORANGE, Color.ORANGE, "Correo: "  , rootPaneCheckingEnabled, "arial", 12);
        holder = new PlaceHolder(txtPassword,  Color.ORANGE, Color.ORANGE, "Password:" , rootPaneCheckingEnabled, "arial", 12);
        holder = new PlaceHolder(txtConfirmarPassword, Color.ORANGE, Color.ORANGE, "Confirmar Password: " , rootPaneCheckingEnabled, "arial", 12);
    }

    SqlUsuarios metodos = new SqlUsuarios();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabelImagen = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabelConfir = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setSelectionColor(new java.awt.Color(51, 51, 0));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 30));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 30));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 270, 30));

        jLabelImagen.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_browser-web-content_532739.png"))); // NOI18N
        getContentPane().add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 30));

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setText("SIGN UP");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 270, 30));

        txtConfirmarPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 270, 30));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 270, 30));

        jLabelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1486395884-account_80606.png"))); // NOI18N
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabelUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono_Username.png"))); // NOI18N
        getContentPane().add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabelCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono_Correo.png"))); // NOI18N
        getContentPane().add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabelPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono_Pass.png"))); // NOI18N
        getContentPane().add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabelConfir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono_Confir.png"))); // NOI18N
        getContentPane().add(jLabelConfir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMarron.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        frm_Menu ventana = new frm_Menu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
       SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        String pass = new String(txtPassword.getPassword());
        String passC = new String(txtConfirmarPassword.getPassword());

        if (txtUsername.getText().equals("") || pass.equals("") || passC.equals("") || txtNombre.getText().equals("") || txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {

            if (pass.equals(passC)) {
                Long id = modSql.existeUsuario(txtUsername.getText());
                if ( id == 0) {
                    if (modSql.esEmail(txtCorreo.getText())) {
                        String nuevoPass = Hash.sha1(pass);
                        mod.setUsuario(txtUsername.getText());
                        mod.setPassword(nuevoPass);
                        mod.setNombre(txtNombre.getText());
                        mod.setEmail(txtCorreo.getText());
                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            //limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                            //limpiar();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El email es incorrecto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtConfirmarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarPasswordActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabelConfir;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfirmarPassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
