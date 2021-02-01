/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmenu;

/**
 *
 * @author Lenovo
 */
public class JConFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form JConFuncionarios
     */
    public JConFuncionarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtCdFun = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblCdFun = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDtAd = new javax.swing.JLabel();
        ftxtDtAd = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        txtSexo = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMenuPrincipal = new javax.swing.JMenu();
        btnMenuPrincipal = new javax.swing.JMenuItem();
        jmCadAlt = new javax.swing.JMenu();
        btnCadAltCargos = new javax.swing.JMenuItem();
        btnCadAltFuncionarios = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        btnConCargo = new javax.swing.JMenuItem();
        btnConFuncionarios = new javax.swing.JMenuItem();
        jmOpcoes = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Funcionários");

        btnConsultar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblTitulo.setText("Consulta de Funcionário");

        lblCargo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCargo.setText("Cargo");

        txtCdFun.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lblCdFun.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCdFun.setText("Código do Funcionário");

        lblNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNome.setText("Nome ");

        lblSexo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSexo.setText("Sexo");

        lblDtAd.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDtAd.setText("Data de admissão");

        ftxtDtAd.setEnabled(false);

        btnLimpar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtSexo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtSexo.setEnabled(false);

        txtCargo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCargo.setEnabled(false);

        jmMenuPrincipal.setText("Menu Principal");
        jmMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmMenuPrincipal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btnMenuPrincipal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jmMenuPrincipal.add(btnMenuPrincipal);

        jMenuBar1.add(jmMenuPrincipal);

        jmCadAlt.setText("Cadastro/Alterar");
        jmCadAlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmCadAlt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btnCadAltCargos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCadAltCargos.setText("Cargos");
        btnCadAltCargos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadAltCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAltCargosActionPerformed(evt);
            }
        });
        jmCadAlt.add(btnCadAltCargos);

        btnCadAltFuncionarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCadAltFuncionarios.setText("Funcionários");
        btnCadAltFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadAltFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAltFuncionariosActionPerformed(evt);
            }
        });
        jmCadAlt.add(btnCadAltFuncionarios);

        jMenuBar1.add(jmCadAlt);

        jmConsulta.setText("Consulta");
        jmConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmConsulta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btnConCargo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnConCargo.setText("Cargos");
        btnConCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConCargoActionPerformed(evt);
            }
        });
        jmConsulta.add(btnConCargo);

        btnConFuncionarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnConFuncionarios.setText("Funcionários");
        btnConFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConFuncionariosActionPerformed(evt);
            }
        });
        jmConsulta.add(btnConFuncionarios);

        jMenuBar1.add(jmConsulta);

        jmOpcoes.setText("Opções");
        jmOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmOpcoes.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btnSair.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jmOpcoes.add(btnSair);

        jMenuBar1.add(jmOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCdFun)
                                    .addComponent(lblNome))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCdFun, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSexo)
                                    .addComponent(lblCargo)
                                    .addComponent(lblDtAd)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ftxtDtAd, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(txtCargo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(btnConsultar)))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCdFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCdFun))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtAd)
                    .addComponent(ftxtDtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnConsultar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadAltCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAltCargosActionPerformed
        // TODO add your handling code here:

        new JCadAltCargo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadAltCargosActionPerformed

    private void btnCadAltFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAltFuncionariosActionPerformed
        // TODO add your handling code here:

        new JCadAltFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadAltFuncionariosActionPerformed

    private void btnConCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConCargoActionPerformed
        // TODO add your handling code here:

        new JConCargo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConCargoActionPerformed

    private void btnConFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConFuncionariosActionPerformed
        // TODO add your handling code here:

        new JConFuncionarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConFuncionariosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        // TODO add your handling code here:

        new JMenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(JConFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JConFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JConFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JConFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JConFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadAltCargos;
    private javax.swing.JMenuItem btnCadAltFuncionarios;
    private javax.swing.JMenuItem btnConCargo;
    private javax.swing.JMenuItem btnConFuncionarios;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JMenuItem btnMenuPrincipal;
    private javax.swing.JMenuItem btnSair;
    private javax.swing.JFormattedTextField ftxtDtAd;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCadAlt;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenu jmMenuPrincipal;
    private javax.swing.JMenu jmOpcoes;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCdFun;
    private javax.swing.JLabel lblDtAd;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCdFun;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
