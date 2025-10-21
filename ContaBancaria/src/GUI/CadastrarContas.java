package GUI;

public class CadastrarContas extends javax.swing.JDialog {

    public CadastrarContas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtrContaCorrente = new javax.swing.JRadioButton();
        BtrContaPoupanca = new javax.swing.JRadioButton();
        BtCancelar = new javax.swing.JButton();
        BtCadastrar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        campSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtrContaCorrente1 = new javax.swing.JRadioButton();
        BtrContaPoupanca1 = new javax.swing.JRadioButton();
        BtCancelar1 = new javax.swing.JButton();
        BtCadastrar1 = new javax.swing.JButton();
        campNome = new javax.swing.JTextField();

        jLabel1.setText("Nome:");

        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Cadastro de Conta");

        BtrContaCorrente.setText("Conta Corrente");
        BtrContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtrContaCorrenteActionPerformed(evt);
            }
        });

        BtrContaPoupanca.setText("Conta Poupança");

        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contas");

        jLabel4.setText("Nome:");
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setText("Senha:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cadastro de Conta");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(BtrContaCorrente1);
        BtrContaCorrente1.setText("Conta Corrente");
        BtrContaCorrente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtrContaCorrente1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(BtrContaPoupanca1);
        BtrContaPoupanca1.setText("Conta Poupança");

        BtCancelar1.setText("Cancelar");
        BtCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelar1ActionPerformed(evt);
            }
        });

        BtCadastrar1.setText("Cadastrar");
        BtCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrar1ActionPerformed(evt);
            }
        });

        campNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtCadastrar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtCancelar1)
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtrContaCorrente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtrContaPoupanca1))
                    .addComponent(campSenha)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtrContaCorrente1)
                    .addComponent(BtrContaPoupanca1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCancelar1)
                    .addComponent(BtCadastrar1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtrContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtrContaCorrenteActionPerformed

    }//GEN-LAST:event_BtrContaCorrenteActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed

    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void BtrContaCorrente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtrContaCorrente1ActionPerformed

    }//GEN-LAST:event_BtrContaCorrente1ActionPerformed

    private void BtCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_BtCancelar1ActionPerformed

    private void BtCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrar1ActionPerformed

    }//GEN-LAST:event_BtCadastrar1ActionPerformed

    private void campNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNomeActionPerformed

    }//GEN-LAST:event_campNomeActionPerformed

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
        if (cb != null) {
            txtNome.setText(cb.getNome().toUpperCase());
            txtSenha.setText(String.valueOf(cb.getSaldo()));
        }
    }//GEN-LAST:event_jLabel4AncestorAdded

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarContas dialog = new CadastrarContas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtCadastrar1;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtCancelar1;
    private javax.swing.JRadioButton BtrContaCorrente;
    private javax.swing.JRadioButton BtrContaCorrente1;
    private javax.swing.JRadioButton BtrContaPoupanca;
    private javax.swing.JRadioButton BtrContaPoupanca1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campNome;
    private javax.swing.JPasswordField campSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
