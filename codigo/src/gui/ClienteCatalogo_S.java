package gui;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class ClienteCatalogo_S extends javax.swing.JFrame {
     
    ButtonGroup grupoDeradios;
    
    public ClienteCatalogo_S() {
        initComponents();
        
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/bicho_izq.jpg")));
        
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

        lblImagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRetro1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRetro = new javax.swing.JButton();
        boton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        r6 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 190, 180));

        jLabel2.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione el artículo de su agrado.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 50, 322, -1));

        btnRetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/sgte.png"))); // NOI18N
        btnRetro1.setContentAreaFilled(false);
        btnRetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 70, 70));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CATALOGO DE ARTICULOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, 350, 25));

        btnRetro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/atras_ventana.png"))); // NOI18N
        btnRetro.setContentAreaFilled(false);
        btnRetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 70, 70));

        boton.setBackground(new java.awt.Color(255, 204, 153));
        boton.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(0, 0, 0));
        boton.setText("Seleccionar");
        boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 100, 30));

        jPanel3.setBackground(new java.awt.Color(248, 231, 215));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        r6.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        r6.setForeground(new java.awt.Color(0, 0, 0));
        r6.setText("S0006");
        r6.setContentAreaFilled(false);
        r6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r6ItemStateChanged(evt);
            }
        });
        jPanel3.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, -1));

        r5.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 0, 0));
        r5.setText("S0005");
        r5.setContentAreaFilled(false);
        r5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r5ItemStateChanged(evt);
            }
        });
        jPanel3.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, -1));

        r4.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(0, 0, 0));
        r4.setText("S0004");
        r4.setContentAreaFilled(false);
        r4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r4ItemStateChanged(evt);
            }
        });
        jPanel3.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, -1));

        r3.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 0, 0));
        r3.setText("S0003");
        r3.setContentAreaFilled(false);
        r3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r3ItemStateChanged(evt);
            }
        });
        jPanel3.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, -1));

        r2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 0, 0));
        r2.setText("S0002");
        r2.setContentAreaFilled(false);
        r2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r2ItemStateChanged(evt);
            }
        });
        jPanel3.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, -1));

        r1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 0, 0));
        r1.setText("S0001");
        r1.setContentAreaFilled(false);
        r1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r1ItemStateChanged(evt);
            }
        });
        r1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                r1StateChanged(evt);
            }
        });
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel3.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, -1));

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sección Sortijas");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 310, 260));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaces/fondo_piel_aux.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        if(evt.getSource() == boton){
            valideRadios();
        }
    }//GEN-LAST:event_botonActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_r1StateChanged
        
    }//GEN-LAST:event_r1StateChanged

    private void r1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r1ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/S0001.jpg")));
    }//GEN-LAST:event_r1ItemStateChanged

    private void r2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r2ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/S0002.jpg")));
    }//GEN-LAST:event_r2ItemStateChanged

    private void r3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r3ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/S0003.jpg")));
    }//GEN-LAST:event_r3ItemStateChanged

    private void r4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r4ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/S0004.jpg")));
    }//GEN-LAST:event_r4ItemStateChanged

    private void r5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r5ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/S0005.png")));
    }//GEN-LAST:event_r5ItemStateChanged

    private void r6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r6ItemStateChanged
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes_complementarias/S0006.jpg")));
    }//GEN-LAST:event_r6ItemStateChanged

    private void btnRetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetroActionPerformed
        dispose();
        Inicio_invitado ii = new Inicio_invitado();
        ii.setLocationRelativeTo(null);
        ii.setVisible(true);
    }//GEN-LAST:event_btnRetroActionPerformed

    private void btnRetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetro1ActionPerformed
        dispose();
        ClienteCatalogo_C ccc = new ClienteCatalogo_C();
        ccc.setLocationRelativeTo(null);
        ccc.setVisible(true);
    }//GEN-LAST:event_btnRetro1ActionPerformed
    
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
    private javax.swing.JButton btnRetro;
    private javax.swing.JButton btnRetro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    // End of variables declaration//GEN-END:variables
}
