
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
import javax.swing.table.TableColumnModel;


public class Encarg_PorEntreg extends javax.swing.JFrame {

    private DefaultTableModel ent;
    public static String edit="";
    public Encarg_PorEntreg() {
        initComponents();
        tblPorEntreg.setBorder(new LineBorder(new Color(0, 0, 0)));
	tblPorEntreg.setFillsViewportHeight(true);
        listar_Trabajos_Por_Entregar();
        TableColumnModel column = tblPorEntreg.getColumnModel();
        column.getColumn(0).setPreferredWidth(10);
	column.getColumn(1).setPreferredWidth(20);
	column.getColumn(2).setPreferredWidth(20);
	column.getColumn(3).setPreferredWidth(0);
	column.getColumn(4).setPreferredWidth(30);
        column.getColumn(5).setPreferredWidth(0);
        column.getColumn(6).setPreferredWidth(50);
        column.getColumn(7).setPreferredWidth(50);
    }
    void listar_Trabajos_Por_Entregar(){
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        
        ent=new DefaultTableModel();
        ent.addColumn("Nº Boleta");
        ent.addColumn("ID Artículo");
        ent.addColumn("Medida");
        ent.addColumn("Cantidad");
        ent.addColumn("Material");
        ent.addColumn("Peso");
        ent.addColumn("Estado de Pago");
        ent.addColumn("Estado");
        tblPorEntreg.setModel(ent);
        
        String sql = "SELECT * FROM articulo_pedido";
        
        String []datos = new String[8];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                
               String sentencia_buscar_Articulo = ("SELECT SOLICITUD, ID, DIRECCION_CASA, ESTADO from DIRECCION WHERE SOLICITUD = '"+rs.getString(2)+"'");
               PreparedStatement pstArticulo = cn.prepareStatement(sentencia_buscar_Articulo);

               ResultSet resultado_articulo = pstArticulo.executeQuery();

               if(resultado_articulo.next()){
                   datos[1] =resultado_articulo.getString("ID");
               }           
                datos[2] = rs.getString(3);
                datos[3] = ""+rs.getInt(7);
                datos[4] = rs.getString(4);
                datos[5] = ""+rs.getDouble(5);
                datos[6] = rs.getString(10);
                datos[7] = rs.getString(9);
                
                ent.addRow(datos);
            }
            tblPorEntreg.setModel(ent);
        }catch(SQLException ex){
            mensaje("No se pudo conectar con la Base de Datos");
        }
    }
        
    public static String dato="";
    public static String material="";
    public static String Estado_pago="";
    public static double Peso_total=0.0;
    public static String Estado_entrega_trabajo="";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPorEntreg = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblAdd = new javax.swing.JLabel();
        lblFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE PEDIDOS POR ENTREGAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, 580, -1));

        jLabel2.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("<html>En esta seccion usted tendrá acceso a un registro de trabajos que no han sido entregados donde  podra editar el registro, pero solo el campo \"ESTADO\", para asi saber si el trabaja esta \"ENTREGADO\" o \"SIN ENTREGAR\".</html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 52, 620, 77));

        tblPorEntreg.setBackground(new java.awt.Color(255, 153, 153));
        tblPorEntreg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        tblPorEntreg.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        tblPorEntreg.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPorEntreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblPorEntreg.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblPorEntreg);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 500, 200));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/editar_entrega.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 120));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/off.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 90, 40));

        lblAdd.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(0, 0, 0));
        lblAdd.setText("Editar Registro");
        getContentPane().add(lblAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 130, 20));

        lblFondo1.setBackground(new java.awt.Color(0, 0, 0));
        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/fondo_rosa.png.jpg"))); // NOI18N
        lblFondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        int i=tblPorEntreg.getSelectedRow();
        Estado_entrega_trabajo = tblPorEntreg.getValueAt(i, 7).toString();
        Estado_pago=tblPorEntreg.getValueAt(i, 6).toString();
        if(i>-1){
            
            if(Estado_pago.equals("SIN CANCELAR")){
                mensaje("No se puede entregar el trabajo si aún no se ha cancelado");
            }else{
            if(Estado_entrega_trabajo.equals("ENTREGADO")){
                mensaje("TRABAJO ENTREGADO");
            }else{                   
            dato=String.valueOf(ent.getValueAt(tblPorEntreg.getSelectedRow(),0));
            material = tblPorEntreg.getValueAt(i, 2).toString();
            Estado_pago=tblPorEntreg.getValueAt(i, 6).toString();
            int cantidad = Integer.parseInt(tblPorEntreg.getValueAt(i, 3).toString());
            double peso = Double.parseDouble(tblPorEntreg.getValueAt(i, 5).toString());
            Peso_total=(cantidad*peso);
            dispose();
            Encarg_EditarEstado a=new Encarg_EditarEstado();
            a.setLocationRelativeTo(null);
            a.setVisible(true);
            }
            }
            
        }else{
            mensaje("SELECCIONE UN PEDIDO");
        }
        }catch(Exception e){
            mensaje("SELECCIONE UN PEDIDO");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        Ventana_Encargado ve =new Ventana_Encargado();
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    void mensaje(String s) {
	JOptionPane.showMessageDialog(this, s);
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
            java.util.logging.Logger.getLogger(Encarg_PorEntreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encarg_PorEntreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encarg_PorEntreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encarg_PorEntreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encarg_PorEntreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JTable tblPorEntreg;
    // End of variables declaration//GEN-END:variables
}
