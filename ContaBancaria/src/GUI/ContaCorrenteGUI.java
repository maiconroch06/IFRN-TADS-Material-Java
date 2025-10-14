package GUI;

public class ContaCorrenteGUI extends javax.swing.JFrame {
/*
    public ContaCorrenteGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campSaldoContaCorrente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jblSaldo = new javax.swing.JLabel();
        campNomeContaCorrente = new javax.swing.JTextField();
        campLimiteContaCorrente = new javax.swing.JTextField();
        BotaoSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Conta Corrente");

        campSaldoContaCorrente.setText("0");
        campSaldoContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campSaldoContaCorrenteActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nome:");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Limite Conta Corrente:");

        jblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jblSaldo.setText("Saldo:");

        campNomeContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeContaCorrenteActionPerformed(evt);
            }
        });

        campLimiteContaCorrente.setText("100");
        campLimiteContaCorrente.setEnabled(false);
        campLimiteContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campLimiteContaCorrenteActionPerformed(evt);
            }
        });

        BotaoSalvar.setText("Cadastrar Conta");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.setMaximumSize(new java.awt.Dimension(121, 28));
        jButton2.setMinimumSize(new java.awt.Dimension(121, 28));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jblSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campSaldoContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campNomeContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campLimiteContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campNomeContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jblSaldo)
                    .addComponent(campSaldoContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(campLimiteContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvar)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campSaldoContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campSaldoContaCorrenteActionPerformed
    }//GEN-LAST:event_campSaldoContaCorrenteActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        /*if (cc != null) {
            txtNomeContaCorrente.setText(cc.getNome());
            txtSaldoContaCorrente.setText(cc.getSaldo() + "");

        }*/
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void campNomeContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNomeContaCorrenteActionPerformed

    }//GEN-LAST:event_campNomeContaCorrenteActionPerformed

    private void campLimiteContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campLimiteContaCorrenteActionPerformed
    }//GEN-LAST:event_campLimiteContaCorrenteActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        /*if (!txtNomeContaCorrente.getText().trim().toUpperCase().isEmpty() && !txtSaldoContaCorrente.getText().trim().isEmpty()) {
            double saldo = Double.parseDouble(txtSaldoContaCorrente.getText().trim());
            if (saldo >= 0) {
                cc = new ContaCorrente();
                cc.setNome(txtNomeContaCorrente.getText().trim().toUpperCase());
                cc.setSaldo(saldo);
                JOptionPane.showMessageDialog(this, cc.showSaldo());
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, preencha o saldo com valor a partir de R$ 0 reais!");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome e o saldo da conta!");
        }*/
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    //    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
/*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ContaCorrenteGUI dialog = new ContaCorrenteGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });*/
    }
    
    ContaCorrenteGUI cc = new ContaCorrenteGUI();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JTextField campLimiteContaCorrente;
    private javax.swing.JTextField campNomeContaCorrente;
    private javax.swing.JTextField campSaldoContaCorrente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jblSaldo;
    // End of variables declaration//GEN-END:variables

    

}
