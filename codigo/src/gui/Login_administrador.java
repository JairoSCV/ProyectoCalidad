/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import Conex.Conexion;
import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author SAMIR
 */
public class Login_administrador extends javax.swing.JFrame {
    public static boolean Mostrar = false;

    /** Creates new form Logim_admin */
    public Login_administrador() {
        initComponents();
        txtPass_Admin.setVisible(true);
        txtPass_Admin_Visible.setVisible(false);
        
        //boton ver
        btnVer.setIcon(setIcono("/imagenes_interfaces/ver.png", btnVer));
        btnVer.setPressedIcon(setIconoPresionado("/imagenes_interfaces/ver.png", btnVer, 3, 3));
        
    }
       /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPass_Admin = new javax.swing.JPasswordField();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsu_Admin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblIcono_Admin = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtPass_Admin_Visible = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass_Admin.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        getContentPane().add(txtPass_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 143, -1));

        btnAtras.setBackground(new java.awt.Color(255, 255, 153));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/atras.png"))); // NOI18N
        btnAtras.setContentAreaFilled(false);
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Atr??s");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 20));

        txtUsu_Admin.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        getContentPane().add(txtUsu_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 143, -1));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 208, 70, 24));

        btnVer.setContentAreaFilled(false);
        btnVer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 242, -1, 30));

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contrase??a:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, -1));

        lblIcono_Admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/jefe.png"))); // NOI18N
        lblIcono_Admin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblIcono_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 160, 160));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 153));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/siguiente.png"))); // NOI18N
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnIngresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 70));

        txtPass_Admin_Visible.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        getContentPane().add(txtPass_Admin_Visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 143, -1));

        lblFondo.setBackground(new java.awt.Color(0, 0, 0));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/fondo_general.jpg"))); // NOI18N
        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private int a=3;
    void mensaje(String s) {
	JOptionPane.showMessageDialog(this, s);
    }
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
        Ventana_principal vp = new Ventana_principal(this, true);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if(Mostrar){
            txtPass_Admin.setText(txtPass_Admin_Visible.getText());
            txtPass_Admin.setVisible(true);
            txtPass_Admin_Visible.setVisible(false);
            Mostrar = false;
        }else{
            txtPass_Admin_Visible.setText(txtPass_Admin.getText());
            txtPass_Admin.setVisible(false);
            txtPass_Admin_Visible.setVisible(true);
            Mostrar = true;
        }
    }//GEN-LAST:event_btnVerActionPerformed
public static String Nombres = "";
public static String Apellidos = "";
public static String Correo = "";
public static String Dni = "";
public static String Celular = "";

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        LoginAdmin();
    }//GEN-LAST:event_btnIngresarActionPerformed

    void LoginAdmin(){
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        
        try{
            String usuAdmi=txtUsu_Admin.getText().trim();
            if(usuAdmi.length()>0){
                char[] clave= txtPass_Admin.getPassword();
		String contrase??a=new String(clave).trim();
                if(contrase??a.length()>0){
                    String sentencia_buscar = ("SELECT ID_Usuario, Nombres_usuario, Apellidos_usuario, Correo_usuario, Dni_usuario, Telefono_usuario, Contrasenia_usuario, Cargo_usuario FROM usuarios_empresa WHERE ID_Usuario = '"+usuAdmi+"' AND Contrasenia_usuario = '"+contrase??a+"' AND Cargo_usuario = 'Administrador'");
                    PreparedStatement pst = cn.prepareStatement(sentencia_buscar);

                    ResultSet resultado = pst.executeQuery();

                    if(resultado.next()){
                        Nombres = resultado.getString("Nombres_usuario");
                        Apellidos = resultado.getString("Apellidos_usuario");
                        Correo = resultado.getString("Correo_usuario");
                        Dni = resultado.getString("Dni_usuario");
                        Celular = resultado.getString("Telefono_usuario");
                        mensaje("??????SESION EXITOSA!!!");
                        
                        dispose();
				Ventana_Administrador va=new Ventana_Administrador();
				va.setLocationRelativeTo(null);
				va.setVisible(true);
                    }else{
                        a--;
				if(a==0){
                                    mensaje("L??mite de intentos alcanzados\n\tSe cerrar?? el sistema");
					System.exit(0);
				}else{
					mensaje("Usuario y/o contrase??a incorrecta\n\tIntentos restantes: "+a);
					txtUsu_Admin.setText("");
					txtPass_Admin.setText("");
                                        txtPass_Admin_Visible.setText("");
                                        txtPass_Admin_Visible.setVisible(false);
                                        txtPass_Admin.setVisible(true);
					txtUsu_Admin.grabFocus();
				}
                    }
                    
                    
                }else{
                mensaje("INGRESE CONTRASE??A");
                txtPass_Admin.setText("");
                txtPass_Admin.grabFocus();
                }
            }else{
                mensaje("RELLENE EL CAMPO ID");
                txtUsu_Admin.setText("");
                txtUsu_Admin.grabFocus();
            }
        
        }catch(SQLException e){
            mensaje("No se puede conectar con la base de datos.");
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
            java.util.logging.Logger.getLogger(Login_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_administrador().setVisible(true);
            }
        });
    }
    public Icon setIcono(String url, JButton boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        
        int ancho = boton.getWidth() - 6;
        int alto = boton.getHeight() - 6;
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
    
    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth()-ancho;
        int height = boton.getHeight()-altura;
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono_Admin;
    private javax.swing.JPasswordField txtPass_Admin;
    private javax.swing.JTextField txtPass_Admin_Visible;
    private javax.swing.JTextField txtUsu_Admin;
    // End of variables declaration//GEN-END:variables

}
