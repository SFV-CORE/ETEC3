
package ex_jframe_notas;
import ex_notas.Contas;
import javax.swing.JOptionPane;

public class MediaBimestral extends javax.swing.JFrame {

    public MediaBimestral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtOBD1 = new javax.swing.JTextField();
        txtAtt1 = new javax.swing.JTextField();
        txtAt1 = new javax.swing.JTextField();
        txtRec1 = new javax.swing.JTextField();
        lblBim1 = new javax.swing.JLabel();
        txtAtt2 = new javax.swing.JTextField();
        txtAt2 = new javax.swing.JTextField();
        txtRec2 = new javax.swing.JTextField();
        lblBim2 = new javax.swing.JLabel();
        txtOBD2 = new javax.swing.JTextField();
        txtAtt3 = new javax.swing.JTextField();
        txtAt3 = new javax.swing.JTextField();
        txtRec3 = new javax.swing.JTextField();
        lblBim3 = new javax.swing.JLabel();
        txtOBD3 = new javax.swing.JTextField();
        txtAtt4 = new javax.swing.JTextField();
        txtAt4 = new javax.swing.JTextField();
        txtRec4 = new javax.swing.JTextField();
        lblBim4 = new javax.swing.JLabel();
        txtOBD4 = new javax.swing.JTextField();
        txtAulas1 = new javax.swing.JTextField();
        txtTotalF1 = new javax.swing.JTextField();
        txtTotalF2 = new javax.swing.JTextField();
        txtTotalF3 = new javax.swing.JTextField();
        txtTotalF4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMedBim1 = new javax.swing.JTextField();
        txtMedF = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMedBim2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMedBim3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMedBim4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Calculo de Media Bimestral");

        txtAtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtt1ActionPerformed(evt);
            }
        });

        txtRec1.setEnabled(false);

        lblBim1.setText("1° Bimestre");

        txtRec2.setEnabled(false);

        lblBim2.setText("2° Bimestre");

        txtOBD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOBD2ActionPerformed(evt);
            }
        });

        txtRec3.setEnabled(false);

        lblBim3.setText("3° Bimestre");

        txtRec4.setEnabled(false);

        lblBim4.setText("4° Bimestre");

        jLabel6.setText("Atividade I");

        jLabel7.setText("Atividade II");

        jLabel8.setText("Recuperação");

        jLabel9.setText("Aulas Dadas");

        jLabel10.setText("Total de Faltas");

        jLabel11.setText("Observação Direta");

        txtMedBim1.setEditable(false);

        txtMedF.setEditable(false);

        txtStatus.setEditable(false);

        jLabel12.setText("Média bimestral");

        jLabel13.setText("Média final");

        jLabel14.setText("Status");

        txtMedBim2.setEditable(false);

        jLabel15.setText("Média bimestral");

        txtMedBim3.setEditable(false);

        jLabel16.setText("Média bimestral");

        txtMedBim4.setEditable(false);

        jLabel17.setText("Média bimestral");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnSair.setText("X");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(txtMedF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel13)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMedBim1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtOBD1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(txtAt1)
                                            .addComponent(txtAtt1)
                                            .addComponent(txtRec1)
                                            .addComponent(txtTotalF1)))
                                    .addComponent(jLabel12))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtOBD2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                                .addComponent(txtAt2)
                                                .addComponent(txtAtt2)
                                                .addComponent(txtRec2))
                                            .addComponent(jLabel15)
                                            .addComponent(txtMedBim2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotalF2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtOBD3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                                .addComponent(txtAt3)
                                                .addComponent(txtAtt3)
                                                .addComponent(txtRec3)
                                                .addComponent(txtTotalF3))
                                            .addComponent(jLabel16)
                                            .addComponent(txtMedBim3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtAulas1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblBim1)
                                .addGap(50, 50, 50)
                                .addComponent(lblBim2)
                                .addGap(56, 56, 56)
                                .addComponent(lblBim3)
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtMedBim4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lblBim4)
                                    .addGap(16, 16, 16))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOBD4)
                                    .addComponent(txtAt4)
                                    .addComponent(txtAtt4)
                                    .addComponent(txtRec4)
                                    .addComponent(txtTotalF4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(270, 270, 270))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBim1)
                            .addComponent(lblBim2)
                            .addComponent(lblBim3))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOBD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAtt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOBD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAtt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOBD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAtt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtAulas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(lblBim4)
                        .addGap(12, 12, 12)
                        .addComponent(txtOBD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAtt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedBim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedBim3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedBim4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedBim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAtt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtt1ActionPerformed

    private void txtOBD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOBD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOBD2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
       
      Contas c = new Contas();   
        if(txtOBD1.getText().equals("") || txtOBD2.getText().equals("") || txtOBD3.getText().equals("") || txtOBD4.getText().equals(""))
        {
            
            JOptionPane.showMessageDialog(null, "Por favor insira todas as notas de observação direta.");
        }
        else if(txtAt1.getText().equals("") || txtAt2.getText().equals("") || txtAt3.getText().equals("") || txtAt4.getText().equals(""))
            {
             JOptionPane.showMessageDialog(null, "Por favor insira todas as notas de atividade 1.");
            }
         else if(txtAtt1.getText().equals("") || txtAtt2.getText().equals("") || txtAtt3.getText().equals("") || txtAtt4.getText().equals(""))
            {
             JOptionPane.showMessageDialog(null, "Por favor insira todas as notas de atividade 2.");
            }
         else if(txtTotalF1.getText().equals("") || txtTotalF2.getText().equals("") || txtTotalF3.getText().equals("") || txtTotalF4.getText().equals(""))
            {
             JOptionPane.showMessageDialog(null, "Por favor insira todas as faltas.");         
            }
         else  if(txtAulas1.getText().equals(""))
            {
             JOptionPane.showMessageDialog(null, "Por favor insira todas as aulas dadas.");              
            }
         else{
             //bim 1
                txtMedBim1.setText(c.mediaBim(txtOBD1.getText(), txtAt1.getText(), txtAtt1.getText()));
             //bim 2
                txtMedBim2.setText(c.mediaBim(txtOBD2.getText(), txtAt2.getText(), txtAtt2.getText()));
             //bim 3
                txtMedBim3.setText(c.mediaBim(txtOBD3.getText(), txtAt3.getText(), txtAtt3.getText()));
             //bim 4
                txtMedBim4.setText(c.mediaBim(txtOBD4.getText(), txtAt4.getText(), txtAtt4.getText()));
             //Media total
                txtMedF.setText(c.mediaBim(txtMedBim1.getText(), txtMedBim2.getText(), txtMedBim3.getText()));       
             //Situação
              String faltas = c.status(txtTotalF1.getText(), txtTotalF2.getText(), txtTotalF3.getText(), txtTotalF4.getText(), txtAulas1.getText());
              if(Float.parseFloat(txtMedF.getText()) <= 4){
                  txtStatus.setText("Reprovado");
              }
              else if(Float.parseFloat(txtMedF.getText()) <= 6 && (!"Reprovado".equals(faltas))){
                  txtStatus.setText("Recuperação");
                  JOptionPane.showMessageDialog(null, "Nota menor ou igual a 6, por favor insira a nota de recuperação.");
                  txtRec1.setEnabled(rootPaneCheckingEnabled);
                  txtRec2.setEnabled(rootPaneCheckingEnabled);
                  txtRec3.setEnabled(rootPaneCheckingEnabled);
                  txtRec4.setEnabled(rootPaneCheckingEnabled);
              }
              else if(Float.parseFloat(txtMedF.getText()) > 6){
                  txtStatus.setText("Aprovado");
              }
              if(Float.parseFloat(txtMedF.getText()) <= 6){
                //Media total
                txtMedF.setText(c.mediaBimRec(txtMedBim1.getText(), txtMedBim2.getText(), txtMedBim3.getText(), txtMedBim4.getText()));
              }
         }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(MediaBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MediaBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MediaBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MediaBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MediaBimestral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBim1;
    private javax.swing.JLabel lblBim2;
    private javax.swing.JLabel lblBim3;
    private javax.swing.JLabel lblBim4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAt1;
    private javax.swing.JTextField txtAt2;
    private javax.swing.JTextField txtAt3;
    private javax.swing.JTextField txtAt4;
    private javax.swing.JTextField txtAtt1;
    private javax.swing.JTextField txtAtt2;
    private javax.swing.JTextField txtAtt3;
    private javax.swing.JTextField txtAtt4;
    private javax.swing.JTextField txtAulas1;
    private javax.swing.JTextField txtMedBim1;
    private javax.swing.JTextField txtMedBim2;
    private javax.swing.JTextField txtMedBim3;
    private javax.swing.JTextField txtMedBim4;
    private javax.swing.JTextField txtMedF;
    private javax.swing.JTextField txtOBD1;
    private javax.swing.JTextField txtOBD2;
    private javax.swing.JTextField txtOBD3;
    private javax.swing.JTextField txtOBD4;
    private javax.swing.JTextField txtRec1;
    private javax.swing.JTextField txtRec2;
    private javax.swing.JTextField txtRec3;
    private javax.swing.JTextField txtRec4;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTotalF1;
    private javax.swing.JTextField txtTotalF2;
    private javax.swing.JTextField txtTotalF3;
    private javax.swing.JTextField txtTotalF4;
    // End of variables declaration//GEN-END:variables
}
