package interfaces;
import classes.ContaBancaria;
import classes.ContaCorrente;
import classes.service.ContaBancariaService;
import javax.swing.JOptionPane;

public class ContaCorrenteGUI extends javax.swing.JDialog {
    
    private ContaBancariaService operacaoConta;
    
    public ContaCorrenteGUI(ContaBancariaService operacaoConta) {
        initComponents();
        setLocationRelativeTo(null);
        this.operacaoConta = operacaoConta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        txtNumero = new javax.swing.JFormattedTextField();
        btPesquisar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        MnVoltar = new javax.swing.JMenu();
        OpcaoMnVoltar = new javax.swing.JMenuItem();
        MnOperações = new javax.swing.JMenu();
        MnCreditar = new javax.swing.JMenuItem();
        MnDebitar = new javax.swing.JMenuItem();
        MnTransferir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal - Conta Corrente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Buscar por Conta");

        jLabel2.setText("Nome:");

        jLabel3.setText("Saldo:");

        txtNome.setEditable(false);

        txtSaldo.setEditable(false);

        jLabel5.setText("Numero da Conta:");

        jLabel6.setText("Credito:");

        txtCredito.setEditable(false);

        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btPesquisar.setText("Pesquisa");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        MnVoltar.setText("Voltar");

        OpcaoMnVoltar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        OpcaoMnVoltar.setText("Voltar");
        OpcaoMnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcaoMnVoltarActionPerformed(evt);
            }
        });
        MnVoltar.add(OpcaoMnVoltar);

        jMenuBar2.add(MnVoltar);

        MnOperações.setText("Operações Bancarias");

        MnCreditar.setText("Creditar na Conta");
        MnCreditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCreditarActionPerformed(evt);
            }
        });
        MnOperações.add(MnCreditar);

        MnDebitar.setText("Debitar na Conta");
        MnDebitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDebitarActionPerformed(evt);
            }
        });
        MnOperações.add(MnDebitar);

        MnTransferir.setText("Transferir");
        MnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTransferirActionPerformed(evt);
            }
        });
        MnOperações.add(MnTransferir);

        jMenuBar2.add(MnOperações);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtNome)
                                    .addComponent(txtSaldo)))
                            .addComponent(jLabel1))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPesquisar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpcaoMnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcaoMnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_OpcaoMnVoltarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
       ContaBancaria conta = operacaoConta.buscar(txtNumero.getText());

        if (conta != null) {
            txtNumero.setText(conta.getNumero());
            txtNome.setText(conta.getNome());
            txtSaldo.setText("R$ " + conta.getSaldo());

            if (conta instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) conta;
                txtCredito.setText("R$ " + cc.getLimiteCredito());
            } else {
                txtCredito.setText("—");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Conta não encontrada!");
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void MnCreditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCreditarActionPerformed
        CreditarCorrenteGUI telaCreditar = new CreditarCorrenteGUI(operacaoConta);
        telaCreditar.setModal(true);
        telaCreditar.setVisible(true);
    }//GEN-LAST:event_MnCreditarActionPerformed

    private void MnDebitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDebitarActionPerformed
        DebitarCorrenteGUI telaDebitar = new DebitarCorrenteGUI(operacaoConta);
        telaDebitar.setModal(true);
        telaDebitar.setVisible(true);
    }//GEN-LAST:event_MnDebitarActionPerformed

    private void MnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTransferirActionPerformed
        TransferCorrenteGUI telaTransferencia = new TransferCorrenteGUI(operacaoConta);
        telaTransferencia.setModal(true);
        telaTransferencia.setVisible(true);
        
    }//GEN-LAST:event_MnTransferirActionPerformed

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnCreditar;
    private javax.swing.JMenuItem MnDebitar;
    private javax.swing.JMenu MnOperações;
    private javax.swing.JMenuItem MnTransferir;
    private javax.swing.JMenu MnVoltar;
    private javax.swing.JMenuItem OpcaoMnVoltar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables

}
