/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasckercapitalist;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author 55119
 */
public class JInternalAcoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form jInternatAcoes
     */
    public JInternalAcoes() {
        initComponents();
        setSize(new Dimension(380, 250));
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

        JPAcoes = new javax.swing.JPanel();
        btnTravaZap = new javax.swing.JButton();
        btnAtkDDoS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDerrWifi = new javax.swing.JButton();
        btnDescSenhaWifi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        btnDarDeface = new javax.swing.JButton();
        jProgressBar3 = new javax.swing.JProgressBar();
        btnEscanearRede = new javax.swing.JButton();
        btnEntrarComoAdm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar6 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar7 = new javax.swing.JProgressBar();
        lblDin1 = new javax.swing.JLabel();
        lblRS1 = new javax.swing.JLabel();
        lblNumDin1 = new javax.swing.JLabel();
        lblDin2 = new javax.swing.JLabel();
        lblReputacao = new javax.swing.JLabel();
        btnSpearPhishing = new javax.swing.JButton();
        btnClonePhishing = new javax.swing.JButton();
        btnPhonePhishing = new javax.swing.JButton();
        btnscamsnigerianos = new javax.swing.JButton();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        jProgressBar10 = new javax.swing.JProgressBar();
        jProgressBar11 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        setPreferredSize(new java.awt.Dimension(623, 569));

        JPAcoes.setPreferredSize(new java.awt.Dimension(611, 520));
        JPAcoes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JPAcoesMouseMoved(evt);
            }
        });

        btnTravaZap.setText("Travar Zap");
        btnTravaZap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravaZapActionPerformed(evt);
            }
        });

        btnAtkDDoS.setText("Ataque DDoS");
        btnAtkDDoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtkDDoSActionPerformed(evt);
            }
        });

        jLabel1.setText("R$ 3");

        jLabel2.setText("????");

        btnDerrWifi.setText("Derrubar Wi-Fi");
        btnDerrWifi.setMaximumSize(new java.awt.Dimension(87, 23));
        btnDerrWifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerrWifiActionPerformed(evt);
            }
        });

        btnDescSenhaWifi.setText("<html>Descobrir Senha<br> de Wi-Fi</html>");
        btnDescSenhaWifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescSenhaWifiActionPerformed(evt);
            }
        });

        jLabel3.setText("R$ 5");

        jProgressBar1.setStringPainted(true);

        jProgressBar2.setStringPainted(true);

        btnDarDeface.setText("Dar Deface");
        btnDarDeface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDefaceActionPerformed(evt);
            }
        });

        jProgressBar3.setStringPainted(true);

        btnEscanearRede.setText("<html>Escanear Rede<html>");
        btnEscanearRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscanearRedeActionPerformed(evt);
            }
        });

        btnEntrarComoAdm.setText("<html>Entrar como <br>Administrador</html>");
        btnEntrarComoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarComoAdmActionPerformed(evt);
            }
        });

        jLabel4.setText("R$ 10");

        jProgressBar4.setStringPainted(true);

        jLabel5.setText("R$ 12");

        jProgressBar5.setStringPainted(true);

        jLabel6.setText("R$ 15");

        jProgressBar6.setStringPainted(true);

        jLabel7.setText("R$ 20");

        jProgressBar7.setStringPainted(true);

        lblDin1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDin1.setText("Dinheiro:");

        lblRS1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRS1.setForeground(new java.awt.Color(0, 51, 255));
        lblRS1.setText("R$");

        lblNumDin1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNumDin1.setForeground(new java.awt.Color(0, 51, 255));
        lblNumDin1.setText("0000");

        lblDin2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDin2.setText("Reputação:");

        lblReputacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblReputacao.setForeground(new java.awt.Color(0, 51, 255));
        lblReputacao.setText("0000");

        btnSpearPhishing.setText("Spear Phishing");
        btnSpearPhishing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpearPhishingActionPerformed(evt);
            }
        });

        btnClonePhishing.setText("Clone Phishing");
        btnClonePhishing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClonePhishingActionPerformed(evt);
            }
        });

        btnPhonePhishing.setText("<html>Phone Phishing</html>");
        btnPhonePhishing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhonePhishingActionPerformed(evt);
            }
        });

        btnscamsnigerianos.setText("<html>419/scams nigerianos</html>");
        btnscamsnigerianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscamsnigerianosActionPerformed(evt);
            }
        });

        jProgressBar8.setStringPainted(true);

        jProgressBar9.setStringPainted(true);

        jProgressBar10.setStringPainted(true);

        jProgressBar11.setStringPainted(true);

        jLabel8.setText("R$ 500");

        jLabel9.setText("R$ 1500");

        jLabel10.setText("R$ 2000");

        jLabel11.setText("R$ 2000");

        javax.swing.GroupLayout JPAcoesLayout = new javax.swing.GroupLayout(JPAcoes);
        JPAcoes.setLayout(JPAcoesLayout);
        JPAcoesLayout.setHorizontalGroup(
            JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAcoesLayout.createSequentialGroup()
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAcoesLayout.createSequentialGroup()
                        .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnTravaZap, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAtkDDoS, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDescSenhaWifi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDerrWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPAcoesLayout.createSequentialGroup()
                                        .addComponent(btnEscanearRede, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(JPAcoesLayout.createSequentialGroup()
                                        .addComponent(btnEntrarComoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(14, 14, 14)
                                        .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30)
                        .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnscamsnigerianos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClonePhishing, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSpearPhishing, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPAcoesLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jProgressBar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPAcoesLayout.createSequentialGroup()
                                        .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jProgressBar9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jProgressBar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addComponent(btnPhonePhishing, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jProgressBar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPAcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addComponent(btnDarDeface, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(14, 14, 14)
                                .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addComponent(lblDin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRS1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumDin1))
                            .addGroup(JPAcoesLayout.createSequentialGroup()
                                .addComponent(lblDin2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblReputacao)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPAcoesLayout.setVerticalGroup(
            JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPAcoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumDin1)
                    .addComponent(lblDin1)
                    .addComponent(lblRS1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDin2)
                    .addComponent(lblReputacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSpearPhishing, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTravaZap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClonePhishing, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnAtkDDoS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAcoesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDescSenhaWifi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPAcoesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnscamsnigerianos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jProgressBar10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDerrWifi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPhonePhishing, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jProgressBar11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEscanearRede, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAcoesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrarComoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPAcoesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(JPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDarDeface, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAtkDDoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtkDDoSActionPerformed
        // TODO add your handling code here:
        
        int value = jProgressBar1.getValue(); //variavel valor para adicionar a barra de progresso
        jProgressBar1.setValue(value+20); //quando clicada adiciona 20%
         
        
       if(value == 100){ //quando chega a 100%
            JPrincipal.Dindin += 3; //dindin adicionado no form principal
            dindin += 3; //dindin adicionado nesse form
            jProgressBar1.setValue(0); //zerar barra de progresso
            lblNumDin1.setText(String.valueOf(dindin)); //exibe o tanto de dinheiro
            reputacao += 1; //adiciona a reputação desse form
            lblReputacao.setText(String.valueOf(reputacao)); //exibe a reputacao acumulada
            JPrincipal.reputacao += 1; //adiciona a reputação do form principal
            }    
    }//GEN-LAST:event_btnAtkDDoSActionPerformed

    private void btnDerrWifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerrWifiActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar4.getValue();
        jProgressBar4.setValue(value+18);
        if(value == 100){
            JPrincipal.Dindin += 10;
            dindin += 10;
            jProgressBar4.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 5;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 5;
        }
        
    }//GEN-LAST:event_btnDerrWifiActionPerformed

    private void btnDescSenhaWifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescSenhaWifiActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar2.getValue();
        jProgressBar2.setValue(value+20);
        if(value == 100){
            JPrincipal.Dindin += 5;
            dindin += 5;
            jProgressBar2.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 2;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 2;
        }
    }//GEN-LAST:event_btnDescSenhaWifiActionPerformed

    private void btnDarDefaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDefaceActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar7.getValue();
        jProgressBar7.setValue(value+10);
        if(value == 100){
            JPrincipal.Dindin += 20;
            dindin += 20;
            jProgressBar7.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 15;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 15;
        }
    }//GEN-LAST:event_btnDarDefaceActionPerformed

    private void btnEntrarComoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarComoAdmActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar6.getValue();
        jProgressBar6.setValue(value+12);
        if(value == 100){
            JPrincipal.Dindin += 15;
            dindin += 15;
            jProgressBar6.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 10;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 10;
        }
    }//GEN-LAST:event_btnEntrarComoAdmActionPerformed

    private void btnEscanearRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscanearRedeActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar5.getValue();
        jProgressBar5.setValue(value+15);
        if(value == 100){
            JPrincipal.Dindin += 12;
            dindin += 12;
            jProgressBar5.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 7;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 7;
        }
    }//GEN-LAST:event_btnEscanearRedeActionPerformed

    private void btnTravaZapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravaZapActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Você nunca vai ser um hacker de verdade fazendo isso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
        JPrincipal.close = 1;
    }//GEN-LAST:event_btnTravaZapActionPerformed

    private void JPAcoesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPAcoesMouseMoved
        // TODO add your handling code here:
        switch (JPrincipal.level) {
            case 1:
                //quando consegue a primeira habilidade
                setSize(new Dimension(380, 440));// aumenta o form
                dindin -= 30; //tira o dindin usado pra compra a habilidade
                lblNumDin1.setText(String.valueOf(dindin)); //atualiza o dindin desse form
                JPrincipal.level = 0; //zera o level pra poder entrar a nova habilidade
                break;
            case 2:
                setSize(new Dimension(380, 580));
                dindin -= 150;
                lblNumDin1.setText(String.valueOf(dindin));
                JPrincipal.level = 0;
                break;
            case 3:
                setSize(new Dimension(670, 580));
                dindin -= 2000;
                lblNumDin1.setText(String.valueOf(dindin));
                JPrincipal.level = 0;
                break;
            default:
                break;
        }
        
        if(JPrincipal.cidade == 2){ //mudança de cidade, esse form deixa de existir
            this.dispose();
        }
    }//GEN-LAST:event_JPAcoesMouseMoved

    private void btnSpearPhishingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpearPhishingActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar8.getValue();
        jProgressBar8.setValue(value+10);
        if(value == 100){
            JPrincipal.Dindin += 500;
            dindin += 500;
            jProgressBar8.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 1500;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 1500;
        }
    }//GEN-LAST:event_btnSpearPhishingActionPerformed

    private void btnClonePhishingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClonePhishingActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar9.getValue();
        jProgressBar9.setValue(value+10);
        if(value == 100){
            JPrincipal.Dindin += 1500;
            dindin += 1500;
            jProgressBar9.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 2500;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 2500;
        }
    }//GEN-LAST:event_btnClonePhishingActionPerformed

    private void btnPhonePhishingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhonePhishingActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar11.getValue();
        jProgressBar11.setValue(value+10);
        if(value == 100){
            JPrincipal.Dindin += 2000;
            dindin += 2000;
            jProgressBar11.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 2000;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 2000;
        }
    }//GEN-LAST:event_btnPhonePhishingActionPerformed

    private void btnscamsnigerianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscamsnigerianosActionPerformed
        // TODO add your handling code here:
        int value = jProgressBar10.getValue();
        jProgressBar10.setValue(value+10);
        if(value == 100){
            JPrincipal.Dindin += 20000;
            dindin += 20000;
            jProgressBar10.setValue(0);
            lblNumDin1.setText(String.valueOf(dindin));
            reputacao += 1000;
            lblReputacao.setText(String.valueOf(reputacao));
            JPrincipal.reputacao += 1000;
        }
    }//GEN-LAST:event_btnscamsnigerianosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPAcoes;
    private javax.swing.JButton btnAtkDDoS;
    private javax.swing.JButton btnClonePhishing;
    private javax.swing.JButton btnDarDeface;
    private javax.swing.JButton btnDerrWifi;
    private javax.swing.JButton btnDescSenhaWifi;
    private javax.swing.JButton btnEntrarComoAdm;
    private javax.swing.JButton btnEscanearRede;
    private javax.swing.JButton btnPhonePhishing;
    private javax.swing.JButton btnSpearPhishing;
    private javax.swing.JButton btnTravaZap;
    private javax.swing.JButton btnscamsnigerianos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar10;
    private javax.swing.JProgressBar jProgressBar11;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JLabel lblDin1;
    private javax.swing.JLabel lblDin2;
    private javax.swing.JLabel lblNumDin1;
    private javax.swing.JLabel lblRS1;
    private javax.swing.JLabel lblReputacao;
    // End of variables declaration//GEN-END:variables
}
