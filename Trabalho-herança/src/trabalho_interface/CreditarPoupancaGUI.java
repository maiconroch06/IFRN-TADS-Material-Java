package trabalho_interface;

import java.util.HashMap;
import javax.swing.JOptionPane;
import trabalho.herança.ContaPoupanca;
import trabalho.herança.OperacoesBancarias;

public class CreditarPoupancaGUI extends javax.swing.JDialog {

    private final HashMap<String, ContaPoupanca> listaContasPoupanca; 
    
    public CreditarPoupancaGUI(HashMap<String, ContaPoupanca> listaContasPoupanca) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listaContasPoupanca = listaContasPoupanca;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        BtCreditar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();
        BtrConta = new javax.swing.JRadioButton();
        BtrCaixinha = new javax.swing.JRadioButton();
        txtNumConta = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creditar Conta Poupança");

        jLabel2.setText("Numero da Conta:");

        jLabel3.setText("Valor:");

        jLabel4.setText("Onde:");

        txtValor.setText("R$ ");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        BtCreditar.setText("Creditar");
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

        buttonGroup1.add(BtrConta);
        BtrConta.setText("Conta");

        buttonGroup1.add(BtrCaixinha);
        BtrCaixinha.setText("Caixinha");

        try {
            txtNumConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumConta)
                            .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtCreditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtrConta)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtrCaixinha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtVoltar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtrCaixinha)
                    .addComponent(BtrConta)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtVoltar)
                    .addComponent(BtCreditar))
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(168, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                    operacoes.creditarContaPoupanca(contaP, valor);

                    JOptionPane.showMessageDialog(this, 
                            "Valor creditado com sucesso!\nNovo saldo: R$ " + contaP.saldoAtual());
                } else if (BtrCaixinha.isSelected()) {
                    operacoes.creditarEmPoupanca(contaP, valor);

                    JOptionPane.showMessageDialog(this, 
                            "Valor creditado com sucesso na Caixinha!\nNovo saldo: R$ " + contaP.getSaldoPoupanca());
                } else {
                    JOptionPane.showMessageDialog(this, 
                    "Selecione onde deseja creditar (Conta ou Caixinha).", 
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
                    "Erro ao creditar: " + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BtCreditarActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
    }//GEN-LAST:event_txtValorActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txtNumConta;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
