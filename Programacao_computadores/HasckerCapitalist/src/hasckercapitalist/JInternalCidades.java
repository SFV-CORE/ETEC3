/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasckercapitalist;

import java.awt.Color;

/**
 *
 * @author 55119
 */
public class JInternalCidades extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalCidades
     */
    public JInternalCidades() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCidade1 = new javax.swing.JButton();
        btnCidade2 = new javax.swing.JButton();
        btnCidade3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cidades"));
        setClosable(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        btnCidade1.setBackground(new java.awt.Color(102, 255, 204));
        btnCidade1.setText("São Paulo");
        btnCidade1.setEnabled(false);

        btnCidade2.setText("Cidade do México");
        btnCidade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCidade2ActionPerformed(evt);
            }
        });

        btnCidade3.setText("Califórnia");
        btnCidade3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCidade3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCidade2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCidade3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved

    private void btnCidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCidade2ActionPerformed
        // TODO add your handling code here:
        JPrincipal.Cidade = "Cidade do México, MX"; //atualiza lblCidade no form principal
        JPrincipal.cidade = 2; //numero da cidade no form principal
        this.dispose();
        btnCidade2.setEnabled(false); 
        btnCidade2.setBackground(Color.blue);
    }//GEN-LAST:event_btnCidade2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCidade1;
    private javax.swing.JButton btnCidade2;
    private javax.swing.JButton btnCidade3;
    // End of variables declaration//GEN-END:variables
}
