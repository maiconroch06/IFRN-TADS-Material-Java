package interfaces;
import classes.ContaBancaria;
import classes.ContaPoupanca;
import classes.service.ContaBancariaService;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ContaPoupancaGUI extends javax.swing.JDialog {

    private ContaBancariaService operacaoConta;
    
    public ContaPoupancaGUI(ContaBancariaService operacaoConta) {
        initComponents();
        setLocationRelativeTo(null);
        this.operacaoConta = operacaoConta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelSaldo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtCaixa = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNumero = new javax.swing.JFormattedTextField();
        BtPesquisa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        pCreditar = new javax.swing.JMenuItem();
        pDebitar = new javax.swing.JMenuItem();
        pTransferir = new javax.swing.JMenuItem();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal - Conta Poupança");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Conta Poupança");

        jLabel2.setText("Numero da Conta:");

        jLabel3.setText("Nome:");

        LabelSaldo.setText("Saldo:");

        jLabel5.setText("Caixinha");

        txtSaldo.setEditable(false);

        txtCaixa.setEditable(false);

        txtNome.setEditable(false);

        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BtPesquisa.setText("Pesquisa");
        BtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisaActionPerformed(evt);
            }
        });

        jMenu1.setText("Voltar");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operações Bancarias");

        pCreditar.setText("Creditar");
        pCreditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCreditarActionPerformed(evt);
            }
        });
        jMenu2.add(pCreditar);

        pDebitar.setText("Debitar");
        pDebitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDebitarActionPerformed(evt);
            }
        });
        jMenu2.add(pDebitar);

        pTransferir.setText("Transferir");
        pTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTransferirActionPerformed(evt);
            }
        });
        jMenu2.add(pTransferir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelSaldo)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtSaldo)
                                    .addComponent(txtNome)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtPesquisa)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSaldo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtPesquisa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisaActionPerformed
        ContaBancaria conta = operacaoConta.buscar(txtNumero.getText());
       
        if (conta != null) {
            txtNumero.setText(conta.getNumero());
            txtNome.setText(conta.getNome());
            txtSaldo.setText("R$ " + conta.getSaldo());

            if (conta instanceof ContaPoupanca) {
                ContaPoupanca cc = (ContaPoupanca) conta;
                txtCaixa.setText("R$ " + cc.getSaldoPoupanca());
            } else {
                txtCaixa.setText("—");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Conta não encontrada!");
        }
    }//GEN-LAST:event_BtPesquisaActionPerformed

    private void pTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTransferirActionPerformed
        TranferPoupancaGUI tp = new TranferPoupancaGUI(operacaoConta);
        tp.setModal(true);
        tp.setVisible(true);
    }//GEN-LAST:event_pTransferirActionPerformed

    private void pCreditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCreditarActionPerformed
        CreditarPoupancaGUI credP = new CreditarPoupancaGUI(operacaoConta);
        credP.setModal(true);
        credP.setVisible(true);
    }//GEN-LAST:event_pCreditarActionPerformed

    private void pDebitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDebitarActionPerformed
        DebitarPoupançaGUI debP = new DebitarPoupançaGUI(operacaoConta);
        debP.setModal(true);
        debP.setVisible(true);      
    }//GEN-LAST:event_pDebitarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtPesquisa;
    private javax.swing.JLabel LabelSaldo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem pCreditar;
    private javax.swing.JMenuItem pDebitar;
    private javax.swing.JMenuItem pTransferir;
    private javax.swing.JTextField txtCaixa;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
