/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import DAO.CategoriaDAO;
import DAO.ContratoDAO;
import VO.ContratoVO;
import DAO.EmpeladoDAO;
import Tabla.Tabla_EmpeladoVO;
import VO.EmpeladoVO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Andres Arce
 */
public class GenerarContrato extends javax.swing.JFrame {

    private int mod;
    private int idusuario;
    /**
     * Creates new form GenerarContrato
     */
    public GenerarContrato() {
        initComponents();
        setLocationRelativeTo(null);
        this.labelCat.setVisible(false);
        this.combxCategoria.setVisible(false);
        this.labIngreso.setVisible(false);
        this.dateIngreso.setVisible(false);
        this.labVencimiento.setVisible(false);
        this.dateVencimiento.setVisible(false);
        DAO.CategoriaDAO categorias= new DAO.CategoriaDAO();
        categorias.Listar_Categoria_ComboBOX(combxCategoria);  
    }
    public GenerarContrato(int mod, int idusuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.labelCat.setVisible(false);
        this.combxCategoria.setVisible(false);
        this.labIngreso.setVisible(false);
        this.dateIngreso.setVisible(false);
        this.labVencimiento.setVisible(false);
        this.dateVencimiento.setVisible(false);
        this.mod = mod;
        this.idusuario = idusuario;
        DAO.CategoriaDAO categorias= new DAO.CategoriaDAO();
        categorias.Listar_Categoria_ComboBOX(combxCategoria);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        combxCategoria = new javax.swing.JComboBox<>();
        labelCat = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        dateIngreso = new com.toedter.calendar.JDateChooser();
        dateVencimiento = new com.toedter.calendar.JDateChooser();
        labIngreso = new javax.swing.JLabel();
        labVencimiento = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generar Contrato");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Nombre de Sindicato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmpleado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 461, 54));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 419, -1));

        combxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(combxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, -1));

        labelCat.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        labelCat.setForeground(new java.awt.Color(255, 255, 255));
        labelCat.setText("Seleccionar Categoria");
        getContentPane().add(labelCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));
        getContentPane().add(dateIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 264, -1));
        getContentPane().add(dateVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 264, -1));

        labIngreso.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        labIngreso.setForeground(new java.awt.Color(255, 255, 255));
        labIngreso.setText("Fecha de Ingreso");
        getContentPane().add(labIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 30));

        labVencimiento.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        labVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        labVencimiento.setText("Fecha de Vencimiento");
        getContentPane().add(labVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_75x75.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 590, 20));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMarron.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel3");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combxCategoriaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_combxCategoriaActionPerformed

    /**
     * 
     * @param evt 
     * Busca un empleado a partir de un DNI
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
          try {
            EmpeladoVO empleado =null;
            EmpeladoDAO dempleado = new EmpeladoDAO();
            Tabla_EmpeladoVO tablas = new Tabla_EmpeladoVO();
            
            empleado = dempleado.Buscar_EmpeladoVO(Integer.parseInt(txtDni.getText()));
            
            if(empleado!=null){
                this.labelCat.setVisible(true);
                this.combxCategoria.setVisible(true);
                this.labIngreso.setVisible(true);
                this.dateIngreso.setVisible(true);
                this.labVencimiento.setVisible(true);
                this.dateVencimiento.setVisible(true);
                tablas.mostrarEmpleado(tablaEmpleado, Integer.parseInt(txtDni.getText()));
            }
            //empleado = dempleado.Buscar_EmpeladoVO(Integer.parseInt(txtDNI.getText()));
       
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void limpiar() {
        txtDni.setText("");

    }
    
    /**
     * 
     * @param evt 
     * Genera un nuevo contrato al empleado designado.
     */
    
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        ContratoDAO condao = new ContratoDAO();
        ContratoVO cont = new ContratoVO();
        int i = 0;
        
//        java.util.Calendar cal = Calendar.getInstance();
//        java.util.Date utilDate = new java.util.Date();
//        cal.setTime(dateIngreso.getCalendar().getTime());
//        cal.set(Calendar.HOUR_OF_DAY, 0);
//        cal.set(Calendar.MINUTE, 0);
//        cal.set(Calendar.SECOND, 0);
//        cal.set(Calendar.MILLISECOND, 0);
        java.sql.Date sqlDateI = new java.sql.Date(dateIngreso.getDate().getTime());
        java.sql.Date sqlDateV = new java.sql.Date(dateVencimiento.getDate().getTime());

        //System.out.println("utilDate"+ utilDate);
        System.out.println("sqlDateIngreso: "+ sqlDateI);    
        System.out.println("sqlDateVencimiento: "+ sqlDateV);



        /*consultar por el tema de verificar el estado del empleado y porner como unico al estado 
        del contrato con el dni del esmpleado*/
        
        
        cont.setFechafirma(sqlDateI);
        cont.setFechavencimiento(sqlDateV);
        cont.setDni(Integer.parseInt(txtDni.getText()));
        if (combxCategoria.getSelectedIndex() == 0){
            cont.setIdcategoria(4);
        } else{
            if(combxCategoria.getSelectedIndex() == 1){
                 cont.setIdcategoria(5);
            } else {
                 cont.setIdcategoria(6);
            }
        }
        i = condao.Agregar_ContratoVO(cont);
        if (i > 0) {
                JOptionPane.showMessageDialog(this, "Contrato Agregado Correctamente");
        } else {
                JOptionPane.showMessageDialog(this, "No se Pudo agregar el contrato");
        }

        limpiar();
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        GestionEmpleados ventana = new GestionEmpleados(mod, idusuario);
        ventana.setVisible(true);       
       this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> combxCategoria;
    private com.toedter.calendar.JDateChooser dateIngreso;
    private com.toedter.calendar.JDateChooser dateVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labIngreso;
    private javax.swing.JLabel labVencimiento;
    private javax.swing.JLabel labelCat;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
