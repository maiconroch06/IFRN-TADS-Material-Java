package br.com.contas.exercicio_02.windows;

import br.com.contas.exercicio_02.classes.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class ContaBancariaGUI extends javax.swing.JDialog {

    public ContaBancariaGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campNomeContaBancaria = new javax.swing.JTextField();
        campSaldoContaBancaria = new javax.swing.JTextField();
        btnCadastrarConta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conta Bancária");

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

        jLabel2.setText("Saldo:");
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        campNomeContaBancaria.setEditable(false);
        campNomeContaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeContaBancariaActionPerformed(evt);
            }
        });

        campSaldoContaBancaria.setEditable(false);
        campSaldoContaBancaria.setText("0");
        campSaldoContaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campSaldoContaBancariaActionPerformed(evt);
            }
        });

        btnCadastrarConta.setText("Cadastrar Conta");
        btnCadastrarConta.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                btnCadastrarContaComponentAdded(evt);
            }
        });
        btnCadastrarConta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnCadastrarContaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarContaActionPerformed(evt);
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campSaldoContaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campNomeContaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnCadastrarConta)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campNomeContaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campSaldoContaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarConta))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campNomeContaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNomeContaBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNomeContaBancariaActionPerformed

    private void campSaldoContaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campSaldoContaBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campSaldoContaBancariaActionPerformed

    private void btnCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarContaActionPerformed
        if (!campNomeContaBancaria.getText().trim().toUpperCase().isEmpty() && !campSaldoContaBancaria.getText().trim().isEmpty()) {
            double saldo = Double.parseDouble(campSaldoContaBancaria.getText().trim());
            if (saldo >= 0) {
                cb = new ContaBancaria();
                cb.setNome(campNomeContaBancaria.getText().trim().toUpperCase());
                cb.setSaldo(saldo);
                JOptionPane.showMessageDialog(this, cb.showSaldo());

                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, preencha o saldo com valor a partir de R$ 0 reais!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome e o saldo da conta!");
        }

    }//GEN-LAST:event_btnCadastrarContaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void btnCadastrarContaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btnCadastrarContaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarContaComponentAdded

    private void btnCadastrarContaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnCadastrarContaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarContaAncestorAdded

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        if (cb != null) {
            campNomeContaBancaria.setText(cb.getNome().toUpperCase());
            campSaldoContaBancaria.setText(String.valueOf(cb.getSaldo()));
        }
    }//GEN-LAST:event_jLabel2AncestorAdded

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarConta;
    private javax.swing.JTextField campNomeContaBancaria;
    private javax.swing.JTextField campSaldoContaBancaria;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private ContaBancaria cb = null;

    public ContaBancaria getContaBancaria() {
        return cb;

    }

    public void setContaBancaria(ContaBancaria cb) {
        this.cb = cb;
    }
}
