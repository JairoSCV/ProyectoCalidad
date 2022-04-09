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
    }
    arreglo_clases.Arreglo_Ventas av = new Arreglo_Ventas();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBoleta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMontoT = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtMontoRestante = new javax.swing.JTextField();
        txtMontoA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nº Boleta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel4.setText("PAGAR MONTO RESTANTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtBoleta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Monto amortiguado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Monto total:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtMontoT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtMontoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 50, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Monto restante:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        getContentPane().add(txtMontoRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 100, -1));

        txtMontoA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtMontoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 50, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("<  Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Pagar monto restante");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        lblFondo1.setBackground(new java.awt.Color(0, 0, 0));
        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/color_ventanas.jpg"))); // NOI18N
        lblFondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Ventana_info_cliente vic = new Ventana_info_cliente();
        vic.setLocationRelativeTo(null);
        vic.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static double vuelto = 0.0;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel txtBoleta;
    private javax.swing.JLabel txtMontoA;
    private javax.swing.JTextField txtMontoRestante;
    private javax.swing.JLabel txtMontoT;
    // End of variables declaration//GEN-END:variables
}
