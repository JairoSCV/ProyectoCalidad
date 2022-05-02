/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Conex.Conexion;
import arreglo_clases.Arreglo_Ventas;
import clases_padres.Ventas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMIR
 */
public class Cliente_MontRestante extends javax.swing.JFrame {

    /**
     * Creates new form Cliente_MontRestante
     */
    public Cliente_MontRestante() {
        initComponents();
        txtBoleta.setText(Login_clienteRegistrado.N_Boleta);
        txtMontoA.setText(""+Ventana_info_cliente.montoA);
        txtMontoT.setText(""+Ventana_info_cliente.montoTotal);
        
        TextPrompt monto = new TextPrompt("Solo dígitos",txtMontoRestante);
    }
    arreglo_clases.Arreglo_Ventas av = new Arreglo_Ventas();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBoleta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMontoT = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtMontoRestante = new javax.swing.JTextField();
        txtMontoA = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Elephant", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PAGAR MONTO RESTANTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/cancelar.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/siguiente.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 80, 80));

        jPanel2.setBackground(new java.awt.Color(248, 231, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nº Boleta:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtBoleta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBoleta.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 20));

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Monto amortiguado:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Monto total:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        txtMontoT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMontoT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtMontoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, 10));

        jLabel7.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Monto restante:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtMontoRestante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoRestanteKeyTyped(evt);
            }
        });
        jPanel2.add(txtMontoRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, -1));

        txtMontoA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMontoA.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtMontoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 310, 200));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/fondo_reg_pedido.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static double vuelto = 0.0;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        Ventana_info_cliente vic = new Ventana_info_cliente();
        vic.setLocationRelativeTo(null);
        vic.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int r=JOptionPane.showConfirmDialog(null, "¿Está seguro de cancelar el pedido?");
        if(r==0){
            double montoRestante_pagar = Double.parseDouble(txtMontoRestante.getText().trim());
            double montoRestante = (Ventana_info_cliente.montoTotal)-(Ventana_info_cliente.montoA);
            vuelto = montoRestante_pagar-montoRestante;
            if(vuelto>=0){
                
                ModificarRegistro();
                
                Ventas V=new Ventas(Login_clienteRegistrado.N_Boleta,Login_clienteRegistrado.Id_articulo,Login_clienteRegistrado.medida, Login_clienteRegistrado.material,Login_clienteRegistrado.peso, Ventana_info_cliente.montoTotal, Login_clienteRegistrado.cantidad,Ventana_info_cliente.Nombres, Ventana_info_cliente.Apellidos, Ventana_info_cliente.Dni);
                av.adicionar(V);
                escribirVentas();
                mensaje("PEDIDO CANCELADO\nRecibe un vuelto de "+vuelto);
                dispose();
                Ventana_info_cliente vic = new Ventana_info_cliente();
                vic.setLocationRelativeTo(null);
                vic.setVisible(true);
            }else{
                mensaje("¡Monto insuficiente!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMontoRestanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoRestanteKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtMontoRestante.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoRestanteKeyTyped

     void mensaje(String s) {
	JOptionPane.showMessageDialog(this, s);
    }

    void escribirVentas(){
		PrintWriter esc=null;
		try{
			esc=new PrintWriter(new BufferedWriter(new FileWriter("Ventas.txt")));
			for(int i=0;i<av.tamaño();i++){
                                esc.println(av.obtener(i).getNroBoleta()+","+av.obtener(i).getIdArticulo()+","+av.obtener(i).getMedida()+","+av.obtener(i).getMaterial()+","+
						av.obtener(i).getPeso()+","+av.obtener(i).getMontoAmortiguado()+","+av.obtener(i).getCantidad()+","+av.obtener(i).getNombre()+","+av.obtener(i).getApellido()+","+av.obtener(i).getDni());
			}esc.close();
		}catch(Exception e){
			mensaje("ERROR DE ESCRITURA");
		}
    }
    
    void ModificarRegistro(){
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE articulo_pedido SET PAGO_ESTADO ='CANCELADO', MONTO_AMORTIGUADO = '"+Ventana_info_cliente.montoTotal+"' WHERE N_BOLETA = '"+Login_clienteRegistrado.N_Boleta+"' ");
            pst.executeUpdate();
        }catch(SQLException e){
            mensaje("No se modificó correctamente el registro");
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
            java.util.logging.Logger.getLogger(Cliente_MontRestante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_MontRestante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_MontRestante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_MontRestante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_MontRestante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtBoleta;
    private javax.swing.JLabel txtMontoA;
    private javax.swing.JTextField txtMontoRestante;
    private javax.swing.JLabel txtMontoT;
    // End of variables declaration//GEN-END:variables
}
