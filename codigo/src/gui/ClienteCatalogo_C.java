/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMIR
 */
public class ClienteCatalogo_C extends javax.swing.JFrame {

    ButtonGroup grupoDeradios;
    /**
     * Creates new form ClienteCatalogo_C
     */
    public ClienteCatalogo_C() {
        initComponents();
        
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/bicho_der.jpg")));
        
        grupoDeradios = new ButtonGroup();
        
        grupoDeradios.add(c1);
        grupoDeradios.add(c2);
        grupoDeradios.add(c3);
        grupoDeradios.add(c4);
        grupoDeradios.add(c5);
        grupoDeradios.add(c6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        c6 = new javax.swing.JRadioButton();
        c5 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRetro = new javax.swing.JButton();
        btnRetro1 = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(248, 231, 215));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c6.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        c6.setForeground(new java.awt.Color(0, 0, 0));
        c6.setText("C0006");
        c6.setContentAreaFilled(false);
        c6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c6ItemStateChanged(evt);
            }
        });
        jPanel3.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, -1));

        c5.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        c5.setForeground(new java.awt.Color(0, 0, 0));
        c5.setText("C0005");
        c5.setContentAreaFilled(false);
        c5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c5ItemStateChanged(evt);
            }
        });
        jPanel3.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, -1));

        c4.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        c4.setForeground(new java.awt.Color(0, 0, 0));
        c4.setText("C0004");
        c4.setContentAreaFilled(false);
        c4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c4ItemStateChanged(evt);
            }
        });
        jPanel3.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, -1));

        c3.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        c3.setForeground(new java.awt.Color(0, 0, 0));
        c3.setText("C0003");
        c3.setContentAreaFilled(false);
        c3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c3ItemStateChanged(evt);
            }
        });
        jPanel3.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, -1));

        c2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        c2.setForeground(new java.awt.Color(0, 0, 0));
        c2.setText("C0002");
        c2.setContentAreaFilled(false);
        c2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c2ItemStateChanged(evt);
            }
        });
        jPanel3.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, -1));

        c1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 0, 0));
        c1.setText("C0001");
        c1.setContentAreaFilled(false);
        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        c1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                c1StateChanged(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel3.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, -1));

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sección Cadenas");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 310, 260));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CATALOGO DE ARTICULOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 370, 25));

        jLabel2.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Seleccione el artículo de su agrado.");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 290, -1));

        btnRetro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/atras_ventana.png"))); // NOI18N
        btnRetro.setContentAreaFilled(false);
        btnRetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 70, 70));

        btnRetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/sgte.png"))); // NOI18N
        btnRetro1.setContentAreaFilled(false);
        btnRetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, 70));

        lblImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 190, 180));

        boton1.setBackground(new java.awt.Color(255, 204, 153));
        boton1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(0, 0, 0));
        boton1.setText("Seleccionar");
        boton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 100, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/fondo_piel_aux.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c6ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/C0006.jpg")));
    }//GEN-LAST:event_c6ItemStateChanged

    private void c5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c5ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/C0005.jpg")));
    }//GEN-LAST:event_c5ItemStateChanged

    private void c4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c4ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/C0004.jpg")));
    }//GEN-LAST:event_c4ItemStateChanged

    private void c3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c3ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/C0003.jpg")));
    }//GEN-LAST:event_c3ItemStateChanged

    private void c2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c2ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/C0002.jpg")));
    }//GEN-LAST:event_c2ItemStateChanged

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/C0001.jpg")));
    }//GEN-LAST:event_c1ItemStateChanged

    private void c1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_c1StateChanged

    }//GEN-LAST:event_c1StateChanged

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void btnRetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetroActionPerformed
        dispose();
        ClienteCatalogo_S ccs = new ClienteCatalogo_S();
        ccs.setLocationRelativeTo(null);
        ccs.setVisible(true);
    }//GEN-LAST:event_btnRetroActionPerformed

    private void btnRetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetro1ActionPerformed
        dispose();
        ClienteCatalogo_P ccp = new ClienteCatalogo_P();
        ccp.setLocationRelativeTo(null);
        ccp.setVisible(true);
    }//GEN-LAST:event_btnRetro1ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(evt.getSource() == boton1){
            valideRadios();
        }
    }//GEN-LAST:event_boton1ActionPerformed

     private void valideRadios(){
        if(c1.isSelected()){
            cad_C="C0001";
            Seleccionar(cad_C);
        }
        else if(c2.isSelected()){
            cad_C="C0002";
            Seleccionar(cad_C);
        }
        else if(c3.isSelected()){
            cad_C="C0003";
            Seleccionar(cad_C);
        }
        else if(c4.isSelected()){
            cad_C="C0004";
            Seleccionar(cad_C);
        }
        else if(c5.isSelected()){
            cad_C="C0005";
            Seleccionar(cad_C);
        }
        else if(c6.isSelected()){
            cad_C="C0006";
            Seleccionar(cad_C);
        }else{
            JOptionPane.showMessageDialog(this,"SELECCIONE UN ARTÍCULO");
        }
    }
     
    public static String cad_C=null;
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
            java.util.logging.Logger.getLogger(ClienteCatalogo_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCatalogo_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCatalogo_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCatalogo_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteCatalogo_C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton btnRetro;
    private javax.swing.JButton btnRetro1;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JRadioButton c5;
    private javax.swing.JRadioButton c6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
