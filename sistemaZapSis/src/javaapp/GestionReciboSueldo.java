/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import DAO.CategoriaDAO;
import DAO.ContratoDAO;
import DAO.EmpeladoDAO;
import DAO.HspersonalDAO;
import DAO.RetenycontDAO;
import DAO.SueldoDAO;
import Tabla.Tabla_CategoriaVO;
import Tabla.Tabla_EmpeladoVO;
import Tabla.Tabla_ContratoVO;
import Tabla.Tabla_HspersonalVO;
import VO.CategoriaVO;
import VO.ContratoVO;
import VO.EmpeladoVO;
import VO.HspersonalVO;
import VO.RetenycontVO;
import VO.SueldoVO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class GestionReciboSueldo extends javax.swing.JFrame {

    
    private int mod;
    private int usuario;
    /**
     * Creates new form GestionReciboSueldo
     */
    public GestionReciboSueldo() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public GestionReciboSueldo(int mod, int usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateMes = new com.toedter.calendar.JMonthChooser();
        dateAnio = new com.toedter.calendar.JYearChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaHs = new javax.swing.JTable();
        btnSueldo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCategoria = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaContrato = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 216, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 380, 76));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, 20));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, 20));
        jPanel1.add(dateMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 130, -1));
        jPanel1.add(dateAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        tablaHs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaHs);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 380, 76));

        btnSueldo.setText("Generar Sueldo");
        btnSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueldoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        tableCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableCategoria);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 400, 76));

        tablaContrato.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaContrato);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 400, 76));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generar Recibo de Sueldo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 310, 27));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_75x75.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 740, 10));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMarron.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            ContratoVO cont = new ContratoVO();
            ContratoDAO daocont = new ContratoDAO();
            Tabla_ContratoVO tabla1 = new Tabla_ContratoVO();
            CategoriaVO cat = new CategoriaVO();
            CategoriaDAO daocat = new CategoriaDAO();
            Tabla_CategoriaVO tabla2 = new Tabla_CategoriaVO();
            HspersonalVO hs = new HspersonalVO();
            HspersonalDAO daohs = new HspersonalDAO();
            Tabla_HspersonalVO tablaHS = new Tabla_HspersonalVO();
            double montoHsTraba = 0;
            double montoHsExtra = 0;
            int categoria  ;

            //empleado = dempleado.Buscar_Empleado_Activo(Integer.parseInt(txtDNI.getText()));
            tabla.mostrarEmpleadoXEstado(tablaEmpleado, Integer.parseInt(txtDNI.getText()));
            categoria = tabla1.mostrarContratoXDni(tablaContrato, Integer.parseInt(txtDNI.getText()));
                      
            tabla2.mostrarCategoriaXid(tableCategoria, categoria);
            tablaHS.mostrarHSPersonalXDni(tablaHs, Integer.parseInt(txtDNI.getText()));
            
           // montoHsTraba = cat.getMontoacobrar()* hs.getHorastrabajadas();
            //montoHsExtra = cat.getMontoacobrar()* hs.getHorasextras();
            
            
            
            
            
            
            //cont  = daocont.BuscarContratoXDni(Integer.parseInt(txtDNI.getText()));
            
            
            
           
            
         
            
          

        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * 
     * @param evt 
     * Genera un recibo de sueldo de un empleado
     */
    
    private void btnSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueldoActionPerformed
        EmpeladoVO empleado = new EmpeladoVO();
        EmpeladoDAO dempleado = new EmpeladoDAO();
        ContratoVO cont = new ContratoVO();
        ContratoDAO daocont = new ContratoDAO();
        CategoriaVO cat = new CategoriaVO();
        CategoriaDAO daocat = new CategoriaDAO(); 
        HspersonalVO hs = new HspersonalVO();
        HspersonalDAO daohs = new HspersonalDAO();
        RetenycontVO ret = new RetenycontVO();
        RetenycontDAO daoret = new RetenycontDAO();
        double montoHsTraba = 0;
        double montoHsExtra = 0;
        double montoSindi = 0;
        double montoJubil = 0;
        double montoObra = 0;
        double montoAporteJub = 0;        
        double montoAporteObra = 0;
        double netoACobrar = 0;


        
        empleado = dempleado.Buscar_Empleado_Activo(Integer.parseInt(txtDNI.getText()));
        cont = daocont.BuscarContratoXDni(Integer.parseInt(txtDNI.getText()));
        cat = daocat.buscarCategoriaXid(cont.getIdcategoria());
        hs = daohs.BuscarHsPersonalxDNI(Integer.parseInt(txtDNI.getText()));
        ret = daoret.BuscarRetenciones(1);
        //ret.toString();
        montoHsTraba = cat.getMontoacobrar()* hs.getHorastrabajadas();
        montoHsExtra = cat.getMontoacobrar()* hs.getHorasextras();
        montoSindi = cat.getMontoacobrar()* ret.getPorsind();
        montoJubil = cat.getMontoacobrar()* ret.getPorcapjub();
        montoObra = cat.getMontoacobrar()* ret.getPorcobsoc();
        montoAporteJub = montoAporteJub + montoJubil;
        montoAporteObra = montoAporteObra + montoObra;
        netoACobrar = (montoHsTraba + montoHsExtra) - montoJubil - montoObra - montoSindi;
        
        System.out.println(dateMes.getMonth());
        try {
            SueldoVO sueldo = new SueldoVO();
            SueldoDAO daosueldo = new SueldoDAO();
            
            sueldo.setDni(Integer.parseInt(txtDNI.getText()));
            sueldo.setMes((dateMes.getMonth()+1));
            sueldo.setAnio(dateAnio.getYear());
            sueldo.setIdretcon(1);
            sueldo.setSueldobase(montoHsTraba);
            sueldo.setMontosindicato(montoSindi);
            sueldo.setMontohsex(montoHsExtra);
            sueldo.setMontojubilacion(montoJubil);
            sueldo.setMontoobrasocial(montoObra);
            sueldo.setMontodeaporteju(montoAporteJub);
            sueldo.setMontodeaporteobsoc(montoAporteObra);
            sueldo.setNetocobrar(netoACobrar);
            
            daosueldo.Agregar_SueldoVO(sueldo);
            
            
        } catch (Exception e) {
        }
        


    }//GEN-LAST:event_btnSueldoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        GestionDeSistema ventana;
        try {
            ventana = new GestionDeSistema(mod, usuario);
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GestionReciboSueldo.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(GestionReciboSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionReciboSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionReciboSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionReciboSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionReciboSueldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSueldo;
    private com.toedter.calendar.JYearChooser dateAnio;
    private com.toedter.calendar.JMonthChooser dateMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaContrato;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTable tablaHs;
    private javax.swing.JTable tableCategoria;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
