
package gui;

import Conex.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public final class Admin_Lista_Pedidos extends javax.swing.JFrame {

    private DefaultTableModel ped;
    public Admin_Lista_Pedidos() {
        initComponents();
        tblPedidos.setBorder(new LineBorder(new Color(0, 0, 0)));
	tblPedidos.setFillsViewportHeight(true);
        listar_pedidos_material();
        
    }
    
    void listar_pedidos_material(){
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        
        ped=new DefaultTableModel();
        ped.addColumn("Pedido");
        ped.addColumn("ID Trabajador");
        ped.addColumn("Estado");
        ped.addColumn("Material");
        ped.addColumn("Peso Total");
        tblPedidos.setModel(ped);
        
        String sql_lista_pedido = "SELECT * FROM lista_pedidos";
        
        String []datos = new String[5];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql_lista_pedido);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = ""+rs.getDouble(5);
                
                ped.addRow(datos);
            }
            tblPedidos.setModel(ped);
        }catch(SQLException ex){
            mensaje("No se pudo conectar con la Base de Datos "+ex.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        lblFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LISTA DE PEDIDOS POR TRABAJADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, -1));

        jLabel2.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("<html>Se visualizan a continuaci??n el registro de trabajo registrados en el sistema relacionado a su trabajador correspondiente.</html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 630, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/material.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 100, 100));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/off.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 90, 40));

        jLabel17.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Brindar material");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 260, 130, -1));

        tblPedidos.setBackground(new java.awt.Color(255, 153, 153));
        tblPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        tblPedidos.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblPedidos.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblPedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 633, 240));

        lblFondo1.setBackground(new java.awt.Color(0, 0, 0));
        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/fondo_rosa.png.jpg"))); // NOI18N
        lblFondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        public int pos = -1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        pos=tblPedidos.getSelectedRow();
        String Estado_Entrega = tblPedidos.getValueAt(pos, 2).toString();
        if(pos > -1){
                switch (Estado_Entrega) {
                    case "ENTREGADO":
                        mensaje("No se puede entregar material, porque ya ha sido entregado.");
                        break;
                    default:
                        int  r = JOptionPane.showConfirmDialog(null, "??Est?? seguro brindar "+tblPedidos.getValueAt(pos, 4).toString()+" gramos de "+
                        tblPedidos.getValueAt(pos, 3).toString()+" al trabajador de ID: "+tblPedidos.getValueAt(pos, 1).toString()+"?");
                        if(r==0){
                            String N_boleta = tblPedidos.getValueAt(pos, 0).toString();
                            
                            ModificarRegistro(N_boleta);
                            listar_pedidos_material();
                        };break;
                }
        }else{
            mensaje("SELECCIONE UN PEDIDO");
        }
        }catch(Exception e){
            mensaje("SELECCIONE UN PEDIDO");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        Ventana_Administrador va = new Ventana_Administrador();
        va.setLocationRelativeTo(null);
        va.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    void mensaje(String s) {
	JOptionPane.showMessageDialog(this, s);
    }
    
    void ModificarRegistro(String n_boleta){
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE lista_pedidos SET ESTADO_ENTREGA_MATERIAL ='ENTREGADO' WHERE ID_PEDIDO = '"+n_boleta+"' ");
            pst.executeUpdate();
            
            try{
                PreparedStatement pst_articulo_pedido = cn.prepareStatement("UPDATE articulo_pedido SET ENTREGA_MATERIAL ='ENTREGADO' WHERE N_BOLETA = '"+n_boleta+"' ");
                pst_articulo_pedido.executeUpdate();
                
            }catch(SQLException e){
                mensaje("REGISTRO NO MODIFICADO(ARTICULO_PEDIDO)");
            }
            mensaje("MATERIAL ENTREGADO");
        }catch(SQLException e){
                mensaje("REGISTRO NO MODIFICADO(LISTA_PEDIDO)");
        }
    }
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
            java.util.logging.Logger.getLogger(Admin_Lista_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Lista_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Lista_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Lista_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Lista_Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
