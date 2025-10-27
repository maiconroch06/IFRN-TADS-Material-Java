package trabalho_interface;

import java.util.HashMap;
import javax.swing.JOptionPane;
import trabalho.herança.ContaPoupanca;
import trabalho.herança.OperacoesBancarias;

public class DebitarPoupançaGUI extends javax.swing.JDialog {

    private final HashMap<String, ContaPoupanca> listaContasPoupanca; 
    
    public DebitarPoupançaGUI(HashMap<String, ContaPoupanca> listaContasPoupanca) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listaContasPoupanca = listaContasPoupanca;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumConta = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JTextField();
        BtrConta = new javax.swing.JRadioButton();
        BtrCaixinha = new javax.swing.JRadioButton();
        BtCreditar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Debitar Conta Poupança");

        jLabel2.setText("Numero da Conta:");

        jLabel3.setText("Valor:");

        jLabel4.setText("Onde:");

        try {
            txtNumConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtValor.setText("R$ ");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        buttonGroup1.add(BtrConta);
        BtrConta.setText("Conta");

        buttonGroup1.add(BtrCaixinha);
        BtrCaixinha.setText("Caixinha");

        BtCreditar.setText("Debitar");
        BtCreditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCreditarActionPerformed(evt);
            }
        });

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumConta)
                            .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtCreditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(BtrConta)
                                .addGap(18, 18, 18)
                                .addComponent(BtrCaixinha)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtrCaixinha)
                    .addComponent(BtrConta)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCreditar)
                    .addComponent(BtVoltar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
    }//GEN-LAST:event_txtValorActionPerformed

    private void BtCreditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCreditarActionPerformed
        String numConta = txtNumConta.getText().trim();
        String valorStr = txtValor.getText().replace("R$", "").replace(",", ".").trim();

        if (numConta.isEmpty() || valorStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        try {
            double valor = Double.parseDouble(valorStr);
            
            if (valor <= 0) {
                JOptionPane.showMessageDialog(this, 
                        "O valor deve ser maior que zero!", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }


            // Verifica se a conta existe
            if (listaContasPoupanca.containsKey(numConta)) {
                ContaPoupanca contaP = listaContasPoupanca.get(numConta);

                OperacoesBancarias operacoes = new OperacoesBancarias();
                operacoes.setListaContasPoupanca(listaContasPoupanca);
                
                if (BtrConta.isSelected()) {
                    operacoes.debitarContaPoupanca(contaP, valor);

                    JOptionPane.showMessageDialog(this, 
                            "Valor debitado com sucesso!\nNovo saldo: R$ " + contaP.saldoAtual());
                } else if (BtrCaixinha.isSelected()) {
                    operacoes.debitarDaPoupanca(contaP, valor);

                    JOptionPane.showMessageDialog(this, 
                            "Valor debitado com sucesso na Caixinha!\nNovo saldo: R$ " + contaP.getSaldoPoupanca());
                } else {
                    JOptionPane.showMessageDialog(this, 
                    "Selecione onde deseja debitar (Conta ou Caixinha).", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, 
                        "Conta não encontrada!", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                    "Valor inválido! Digite apenas números (ex: 1000 ou 1000.50).", 
                    "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Erro ao debitar: " + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BtCreditarActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCreditar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JRadioButton BtrCaixinha;
    private javax.swing.JRadioButton BtrConta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField txtNumConta;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
