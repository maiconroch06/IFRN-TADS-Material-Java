package interfaces;

import classes.ContaCorrente;
import classes.ContaPoupanca;
import classes.ContaBancaria;
import classes.service.ContaBancariaService;
import javax.swing.JOptionPane;

public class CadastrarConta extends javax.swing.JDialog {

    private ContaBancaria contaCadastrada = null;
    private ContaBancariaService operaçaoConta;
    
    public CadastrarConta(java.awt.Frame parent, boolean modal, ContaBancariaService operaçaoConta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.operaçaoConta = operaçaoConta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtrContaCorrente = new javax.swing.JRadioButton();
        BtrContaPoupanca = new javax.swing.JRadioButton();
        BtCancelar = new javax.swing.JButton();
        BtCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro");

        jLabel1.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Cadastro de Conta");

        buttonGroup1.add(BtrContaCorrente);
        BtrContaCorrente.setText("Conta Corrente");

        buttonGroup1.add(BtrContaPoupanca);
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

        jLabel4.setText("Tipo Conta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtrContaCorrente)
                                .addGap(18, 18, 18)
                                .addComponent(BtrContaPoupanca))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BtrContaCorrente)
                    .addComponent(BtrContaPoupanca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtCancelar)
                    .addComponent(BtCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
        //Caso o Usuário preencha o campo nome
        if (txtNome.getText().trim().length() >= 3) {
            String nome = txtNome.getText().trim();

            // Caso o Usuário escolha o tipo Conta Corrente
            if (BtrContaCorrente.isSelected()) {
                
                // Cria/(Atribui) o objeto (a) contaCadastrada
                contaCadastrada = new ContaCorrente();

                double saldoInicial = 0.0;

                contaCadastrada = new ContaCorrente();
                
                // Adiciona valores importantes para o objeto "cadastrar"
                contaCadastrada.setNome(nome);
                contaCadastrada.setNumero(operaçaoConta.gerarNumeroContaCorrente());
                contaCadastrada.setSaldo(saldoInicial);

                // Fecha a janela Cadastro Corrente
                this.dispose();
                
            } else if (BtrContaPoupanca.isSelected()) {

                // Cria/(Atribui) o objeto (a) contaCadastrada
                contaCadastrada = new ContaPoupanca();

                double saldoInicial = 0.0;

                // Adiciona valores importantes para o objeto "cadastrar"
                contaCadastrada.setNumero(operaçaoConta.gerarNumeroContaPoupanca());
                contaCadastrada.setNome(nome);
                contaCadastrada.setSaldo(saldoInicial);

                this.dispose();
                
            // Caso o Usuário não tenha selecionado um tipo de conta
            } else {
                JOptionPane.showMessageDialog(this, "Selecione o tipo de conta antes de cadastrar!");
            }
            
        // Caso o Usuário não tenha colocado o nome   
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o nome com mais de 3 caracteres!");
        }
     
    }//GEN-LAST:event_BtCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JRadioButton BtrContaCorrente;
    private javax.swing.JRadioButton BtrContaPoupanca;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    public ContaBancaria getContaCadastrada() {
        return contaCadastrada;
    }

    public void setCadastrarContaGUI(ContaBancaria contaCadastrada) {
        this.contaCadastrada = contaCadastrada;
    }
}
