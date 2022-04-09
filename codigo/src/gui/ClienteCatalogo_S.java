package gui;

import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class ClienteCatalogo_S extends javax.swing.JFrame {
     
    ButtonGroup grupoDeradios;
    
    public ClienteCatalogo_S() {
        initComponents();
        FuncionIcono("src/imagenes/S0001.jpg", lblS1);
        FuncionIcono("src/imagenes/S0002.jpg", lblS2);
        FuncionIcono("src/imagenes/S0003.jpg", lblS3);
        FuncionIcono("src/imagenes/S0004.jpg", lblS4);
        FuncionIcono("src/imagenes/S0005.jpg", lblS5);
        FuncionIcono("src/imagenes/S0006.png", lblS6);
        
        grupoDeradios = new ButtonGroup();
        
        grupoDeradios.add(r1);
        grupoDeradios.add(r2);
        grupoDeradios.add(r3);
        grupoDeradios.add(r4);
        grupoDeradios.add(r6);
        grupoDeradios.add(r5);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblS2 = new javax.swing.JLabel();
        lblS1 = new javax.swing.JLabel();
        lblS4 = new javax.swing.JLabel();
        lblS6 = new javax.swing.JLabel();
        lblS3 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        lblS5 = new javax.swing.JLabel();
        r4 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        boton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        r5 = new javax.swing.JRadioButton();
        lblFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Seleccione el artículo de su agrado.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 50, 322, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, 428, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 117, 428, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CATALOGO DE ARTICULOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, 253, 25));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 689, 428, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setText("SECCION SORTIJAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 85, -1, -1));
        getContentPane().add(lblS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 146, 110, 113));
        getContentPane().add(lblS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 146, 110, 113));
        getContentPane().add(lblS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 326, 110, 113));
        getContentPane().add(lblS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 514, 110, 113));
        getContentPane().add(lblS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 326, 110, 113));

        r1.setText("S0001");
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 277, -1, -1));

        r2.setText("S0002");
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 277, -1, -1));

        r3.setText("S0003");
        getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 457, -1, -1));
        getContentPane().add(lblS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 514, 110, 113));

        r4.setText("S0004");
        getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 457, -1, -1));

        r6.setText("S0006");
        getContentPane().add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 643, -1, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 709, -1, -1));

        boton.setText("Seleccionar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 709, -1, -1));

        jButton3.setText("Siguiente página");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 709, -1, -1));

        r5.setText("S0005");
        getContentPane().add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 643, -1, -1));

        lblFondo1.setBackground(new java.awt.Color(0, 0, 0));
        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_complementarias/fondo_catalogo.jpg"))); // NOI18N
        lblFondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Inicio_invitado ii = new Inicio_invitado();
        ii.setLocationRelativeTo(null);
        ii.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        if(evt.getSource() == boton){
            valideRadios();
        }
    }//GEN-LAST:event_botonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        ClienteCatalogo_C ccc = new ClienteCatalogo_C();
        ccc.setLocationRelativeTo(null);
        ccc.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
    private void valideRadios(){
        //String cad_S="";
        if(r1.isSelected()){
            cad_S="S0001";
            Seleccionar(cad_S);
        }
        else if(r2.isSelected()){
            cad_S="S0002";
            Seleccionar(cad_S);
        }
        else if(r3.isSelected()){
            cad_S="S0003";
            Seleccionar(cad_S);
        }
        else if(r4.isSelected()){
            cad_S="S0004";
            Seleccionar(cad_S);
        }
        else if(r5.isSelected()){
            cad_S="S0005";
            Seleccionar(cad_S);
        }
        else if(r6.isSelected()){
            cad_S="S0006";
            Seleccionar(cad_S);
        }else{
            JOptionPane.showMessageDialog(this,"SELECCIONE UN ARTÍCULO");
        }
    }
    public static String cad_S=null;
    public void Seleccionar(String s){
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de escoger el artículo "+s+"?");
        if(r==0){
            dispose();
            Calcular_Presupuesto cp=new Calcular_Presupuesto();
            cp.setLocationRelativeTo(null);
            cp.setVisible(true);
            
        }else{
            grupoDeradios.clearSelection();
        }
    }
    public void FuncionIcono(String s, JLabel lbl){
        ImageIcon imagen = new ImageIcon(s);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
        this.repaint();
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
            java.util.logging.Logger.getLogger(ClienteCatalogo_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCatalogo_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCatalogo_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCatalogo_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClienteCatalogo_S().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblS1;
    private javax.swing.JLabel lblS2;
    private javax.swing.JLabel lblS3;
    private javax.swing.JLabel lblS4;
    private javax.swing.JLabel lblS5;
    private javax.swing.JLabel lblS6;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    // End of variables declaration//GEN-END:variables
}
