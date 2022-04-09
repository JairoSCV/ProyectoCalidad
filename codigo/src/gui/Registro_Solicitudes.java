/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Conex.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author diego
 */
public final class Registro_Solicitudes extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Solicitudes
     */
    private DefaultTableModel reg;
    public static int f=-1;
    public Registro_Solicitudes() {
        initComponents();
        tblRegistro.setBorder(new LineBorder(new Color(0, 0, 0)));
	tblRegistro.setFillsViewportHeight(true);
        mostrarDireccion();
    }
    
    void mostrarDireccion(){
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        reg=new DefaultTableModel();
	reg.addColumn("ID artículo");
	reg.addColumn("Dirección");
	reg.addColumn("Estado");
	tblRegistro.setModel(reg);
        TableColumnModel column = tblRegistro.getColumnModel();
	column.getColumn(0).setPreferredWidth(0);
	column.getColumn(1).setPreferredWidth(200);
	column.getColumn(2).setPreferredWidth(0);
        
        String sql_direcciones = "SELECT * FROM direccion";
        
        String []datos_direccion = new String[3];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql_direcciones);
            while(rs.next()){
                datos_direccion[0] = rs.getString(1);
                datos_direccion[1] = rs.getString(2);
                datos_direccion[2] = rs.getString(3);
                
                reg.addRow(datos_direccion);
            }
            tblRegistro.setModel(reg);
        }catch(SQLException ex){
            mensaje("No se pudo conectar con la Base de Datos");
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblFondo1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE SOLICITUDES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 29, -1, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("<html>Aqui se encuentran los registros de las direcciones de los clientes, a los que tomarán las medidas del usuario del artículo:</html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 522, 37));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 103, 512, 299));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar Detalles");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 414, 161, 28));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("< Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 416, -1, -1));

        lblFondo1.setBackground(new java.awt.Color(0, 0, 0));
        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/color_ventanas.jpg"))); // NOI18N
        lblFondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String ID_articulo = "";
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
        f=tblRegistro.getSelectedRow();
        ID_articulo = tblRegistro.getValueAt(f, 0).toString();
        if(f>-1){
            if((tblRegistro.getValueAt(f, 2)).equals("Registrado")){
                mensaje("SOLICITUD YA REGISTRADA");
            }else{
            dispose();
            Registro_Pedido rp=new Registro_Pedido();
            rp.setLocationRelativeTo(null);
            rp.setVisible(true);
            }
        }else{
            mensaje("SELECCIONE UNA SOLICITUD");
        }
        }catch(Exception e){
            mensaje("SELECCIONE UNA SOLICITUD");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Ventana_Encargado ve=new Ventana_Encargado();
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Solicitudes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JTable tblRegistro;
    // End of variables declaration//GEN-END:variables
}