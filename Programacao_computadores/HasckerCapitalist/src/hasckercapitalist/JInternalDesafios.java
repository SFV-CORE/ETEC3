/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasckercapitalist;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 55119
 */
public class JInternalDesafios extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalDesafios
     */
    public JInternalDesafios() {
        initComponents();
        
        if(JPrincipal.Cidade.equals(1)){
            btnExpor.setEnabled(true);
        }
        else{
            btnExpor.setEnabled(false);
        }
        if(JPrincipal.Cidade.equals(2)){
            btnInvadir.setEnabled(true);
        }
        else{
            btnInvadir.setEnabled(false);
        }
    }
    
    //variaveis
    public float dindin = 0; //dinheiro no form
    public int reputacao = 0; // reputacao no form

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExpor = new javax.swing.JButton();
        btnInvadir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Desafios"));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        btnExpor.setText("Expor merdas Brasileiras");
        btnExpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExporActionPerformed(evt);
            }
        });

        btnInvadir.setText("Invadir o Google");
        btnInvadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInvadir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnExpor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnInvadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExporActionPerformed
        // TODO add your handling code here:
        
        Random r =new Random();
        
        int num = r.nextInt(100);
        
        Object[] options = { "Expor!", "Guardar para si." };
        int opcao = JOptionPane.showOptionDialog(null, "Você invadiu os sites do Governo Brasileiro e encontrou dados importantes!\n Deseja expor isso para o mundo? Tem 50% de chance de ser preso!", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if(opcao == 0)
        {
            if(num>=50)
            {
                JOptionPane.showMessageDialog(null, "Você conseguiu expor e não ser descoberto!\n Alguns países adimiraram seu ato e você recebeu recompensas: R$15000 e 9000pts de reputação!!");
                dindin +=15000;
                reputacao+=9000;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "não conseguiu! num: "+ num);
            }
        }else
        {
           dispose(); 
        }
        
        
    }//GEN-LAST:event_btnExporActionPerformed

    private void btnInvadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvadirActionPerformed
        // TODO add your handling code here:
        Random r =new Random();
        
        int num = r.nextInt(100);
        
        Object[] options = { "Expor!", "Guardar para si." };
        int opcao = JOptionPane.showOptionDialog(null, "Existe uma chance aleatória de você conseguir hackear o Google sem ser descoberto, vamos tentar?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if(opcao == 0)
        {
            if(num>=70)
            {
                JOptionPane.showMessageDialog(null, "Você conseguiu invadir e não ser descoberto!\n Uma organização hacker está muito interessada nas suas habilidades e te mandou uma recompensas: R$50000 e 20000pts de reputação!!");
                dindin +=50000;
                reputacao+=20000;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "não conseguiu! num: "+ num);
            }
        }else
        {
           dispose(); 
        }
    }//GEN-LAST:event_btnInvadirActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExpor;
    private javax.swing.JButton btnInvadir;
    // End of variables declaration//GEN-END:variables
}
