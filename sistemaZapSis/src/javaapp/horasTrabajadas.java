/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import DAO.*;
import Tabla.Tabla_EmpeladoVO;
import VO.EmpeladoVO;
import VO.*;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class horasTrabajadas extends javax.swing.JFrame {

    
    private int mod;
    private int usuarios;
    /**
     * Creates new form horasTrabajadas
     */
    PlaceHolder holder;
    public horasTrabajadas() {
        initComponents();
        setLocationRelativeTo(null);
        FilialDAO filial = new FilialDAO();
        filial.Listar_filial_ComboBOX(combxFilial);
        holders();
    }
    
     public horasTrabajadas(int mod, int usuarios) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
        this.usuarios = usuarios;
        FilialDAO filial = new FilialDAO();
        filial.Listar_filial_ComboBOX(combxFilial);
        holders();
    }
    
    public void holders(){
        holder = new PlaceHolder(txtDNI, Color.gray, Color.gray, "DNI  ", rootPaneCheckingEnabled, "gadugi", 12);
        holder = new PlaceHolder(txtHorasTraba, Color.gray, Color.gray, "Horas Trabajadas  ", rootPaneCheckingEnabled, "gadugi", 12);
        holder = new PlaceHolder(txtHorasExTraba1, Color.gray, Color.gray, "Horas Extras ", rootPaneCheckingEnabled, "gadugi", 12);

       // holder = new PlaceHolder(dateFechaTraba, "Apellido: ");
        //holder = new PlaceHolder(txtUsername, "Username: ");
        //holder = new PlaceHolder(txtCorreo, "Correo: ");
        //holder = new PlaceHolder(txtPassword, "Password: ");
        //holder = new PlaceHolder(txtConfirmarPassword, "Confirmar Password: ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        labelCat = new javax.swing.JLabel();
        combxFilial = new javax.swing.JComboBox<>();
        txtHorasExTraba1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHorasTraba = new javax.swing.JTextField();
        dateFechaTraba = new com.toedter.calendar.JDateChooser();
        txtDNI = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelDNi = new javax.swing.JLabel();
        jLabelCalendar = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelFondo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, -1));

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        labelCat.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        labelCat.setForeground(new java.awt.Color(255, 255, 255));
        labelCat.setText("Seleccionar Categoria");
        getContentPane().add(labelCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        combxFilial.setBackground(new java.awt.Color(255, 255, 255));
        combxFilial.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        combxFilial.setForeground(new java.awt.Color(0, 0, 0));
        combxFilial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combxFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combxFilialActionPerformed(evt);
            }
        });
        getContentPane().add(combxFilial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 30));

        txtHorasExTraba1.setBackground(new java.awt.Color(255, 255, 255));
        txtHorasExTraba1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtHorasExTraba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, 30));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horas Extras");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Horas Trabajadas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtHorasTraba.setBackground(new java.awt.Color(255, 255, 255));
        txtHorasTraba.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtHorasTraba, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, 30));

        dateFechaTraba.setBackground(new java.awt.Color(255, 255, 255));
        dateFechaTraba.setForeground(new java.awt.Color(0, 0, 0));
        dateFechaTraba.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        dateFechaTraba.setIcon(null);
        getContentPane().add(dateFechaTraba, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 260, 30));

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 260, 30));

        tablaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleado.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        tablaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Filial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaEmpleado.setGridColor(new java.awt.Color(0, 0, 0));
        tablaEmpleado.setSelectionBackground(new java.awt.Color(51, 51, 0));
        jScrollPane3.setViewportView(tablaEmpleado);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 330, 86));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Horas Trabajadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 420, 40));

        jLabelDNi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono_User40x40.png"))); // NOI18N
        getContentPane().add(jLabelDNi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 50));

        jLabelCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono_Calendar_40x40.png"))); // NOI18N
        getContentPane().add(jLabelCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, 50));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_75x75.png"))); // NOI18N
        jLabelLogo.setPreferredSize(new java.awt.Dimension(80, 80));
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 80));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 670, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 670, 70));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMarron.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combxFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combxFilialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combxFilialActionPerformed

    /**
     * 
     * @param evt 
     * Registra las horas trabajadas de un empleado
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        //EmpeladoVO em = new EmpeladoVO();
        HspersonalVO hs = new HspersonalVO();
        FilialVO fil = new FilialVO();
        //EmpeladoDAO emdao = new EmpeladoDAO();
        HspersonalDAO hsdao = new HspersonalDAO();
        FilialDAO fildao = new FilialDAO();
        java.sql.Date sqlDateI = new java.sql.Date(dateFechaTraba.getDate().getTime());
        int i;

        try {
            hs.setMes(sqlDateI);
            if (combxFilial.getSelectedIndex() == 0){
                hs.setIdfilial(5);
            } else{
                if(combxFilial.getSelectedIndex() == 1){
                    hs.setIdfilial(6);
                }
            }
            hs.setHorastrabajadas(Integer.parseInt(txtHorasTraba.getText()));
            hs.setHorasextras(Integer.parseInt(txtHorasExTraba1.getText()));
            hs.setComentarios("");
            hs.setDni(Integer.parseInt(txtDNI.getText()));

            i=hsdao.Agregar_HspersonalVO(hs);
            if (i != 0){
                JOptionPane.showMessageDialog(null, "Registrado Correctamente");

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        GestionDeSistema ventana;
        try {
            ventana = new GestionDeSistema(mod, usuarios);
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(horasTrabajadas.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    
    /**
     * 
     * @param evt 
     * Busca un empleado a partir de un DNI
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            EmpeladoVO empleado = new EmpeladoVO();
            EmpeladoDAO dempleado = new EmpeladoDAO();
            Tabla_EmpeladoVO tabla = new Tabla_EmpeladoVO();
            int i  ;

            //empleado = dempleado.Buscar_Empleado_Activo(Integer.parseInt(txtDNI.getText()));
            tabla.mostrarEmpleadoXEstado(tablaEmpleado, Integer.parseInt(txtDNI.getText()));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(horasTrabajadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(horasTrabajadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(horasTrabajadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(horasTrabajadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new horasTrabajadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> combxFilial;
    private com.toedter.calendar.JDateChooser dateFechaTraba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCalendar;
    private javax.swing.JLabel jLabelDNi;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelCat;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtHorasExTraba1;
    private javax.swing.JTextField txtHorasTraba;
    // End of variables declaration//GEN-END:variables
}
