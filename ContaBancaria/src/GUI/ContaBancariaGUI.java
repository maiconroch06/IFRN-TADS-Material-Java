package GUI;

import javax.swing.JOptionPane;

public class ContaBancariaGUI extends javax.swing.JFrame {

    public ContaBancariaGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeContabancaria = new javax.swing.JTextField();
        txtSaldoContaBancaria = new javax.swing.JTextField();
        btnCadastrarConta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeContabancaria1 = new javax.swing.JTextField();
        txtSaldoContaBancaria1 = new javax.swing.JTextField();
        btnCadastrarConta1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Nome:");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setText("Saldo");
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtNomeContabancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeContabancariaActionPerformed(evt);
            }
        });

        txtSaldoContaBancaria.setText("0");
        txtSaldoContaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoContaBancariaActionPerformed(evt);
            }
        });

        btnCadastrarConta.setText("Cadastrar Conta");
        btnCadastrarConta.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                btnCadastrarContaComponentAdded(evt);
            }
        });
        btnCadastrarConta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnCadastrarContaAncestorAdded(evt);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Conta Bancaria");

        jLabel3.setText("Nome:");
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setText("Saldo");
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtNomeContabancaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeContabancaria1ActionPerformed(evt);
            }
        });

        txtSaldoContaBancaria1.setText("0");
        txtSaldoContaBancaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoContaBancaria1ActionPerformed(evt);
            }
        });

        btnCadastrarConta1.setText("Cadastrar Conta");
        btnCadastrarConta1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                btnCadastrarConta1ComponentAdded(evt);
            }
        });
        btnCadastrarConta1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnCadastrarConta1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnCadastrarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarConta1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.setMaximumSize(new java.awt.Dimension(121, 28));
        jButton3.setMinimumSize(new java.awt.Dimension(121, 28));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSaldoContaBancaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addComponent(txtNomeContabancaria1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarConta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeContabancaria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldoContaBancaria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarConta1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        if (cb != null) {
            txtNomeContabancaria.setText(cb.getNome().toUpperCase());
            txtSaldoContaBancaria.setText(String.valueOf(cb.getSaldo()));
        }
    }//GEN-LAST:event_jLabel2AncestorAdded

    private void txtNomeContabancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeContabancariaActionPerformed
    }//GEN-LAST:event_txtNomeContabancariaActionPerformed

    private void txtSaldoContaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoContaBancariaActionPerformed
    }//GEN-LAST:event_txtSaldoContaBancariaActionPerformed

    private void btnCadastrarContaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btnCadastrarContaComponentAdded
    }//GEN-LAST:event_btnCadastrarContaComponentAdded

    private void btnCadastrarContaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnCadastrarContaAncestorAdded
    }//GEN-LAST:event_btnCadastrarContaAncestorAdded

    private void btnCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarContaActionPerformed
        if (!txtNomeContabancaria.getText().trim().toUpperCase().isEmpty() && !txtSaldoContaBancaria.getText().trim().isEmpty()) {
            double saldo = Double.parseDouble(txtSaldoContaBancaria.getText().trim());
            if (saldo >= 0) {
                cb = new ContaBancariaGUI();
                cb.setNome(txtNomeContabancaria.getText().trim().toUpperCase());
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

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded

    }//GEN-LAST:event_jLabel3AncestorAdded

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
        if (cb != null) {
            txtNomeContabancaria.setText(cb.getNome().toUpperCase());
            txtSaldoContaBancaria.setText(String.valueOf(cb.getSaldo()));
        }
    }//GEN-LAST:event_jLabel4AncestorAdded

    private void txtNomeContabancaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeContabancaria1ActionPerformed
    }//GEN-LAST:event_txtNomeContabancaria1ActionPerformed

    private void txtSaldoContaBancaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoContaBancaria1ActionPerformed
    }//GEN-LAST:event_txtSaldoContaBancaria1ActionPerformed

    private void btnCadastrarConta1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btnCadastrarConta1ComponentAdded
    }//GEN-LAST:event_btnCadastrarConta1ComponentAdded

    private void btnCadastrarConta1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnCadastrarConta1AncestorAdded
    }//GEN-LAST:event_btnCadastrarConta1AncestorAdded

    private void btnCadastrarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarConta1ActionPerformed
        if (!txtNomeContabancaria.getText().trim().toUpperCase().isEmpty() && !txtSaldoContaBancaria.getText().trim().isEmpty()) {
            double saldo = Double.parseDouble(txtSaldoContaBancaria.getText().trim());
            if (saldo >= 0) {
                cb = new ContaBancariaGUI();
                cb.setNome(txtNomeContabancaria.getText().trim().toUpperCase());
                cb.setSaldo(saldo);
                JOptionPane.showMessageDialog(this, cb.showSaldo());

                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, preencha o saldo com valor a partir de R$ 0 reais!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome e o saldo da conta!");
        }
    }//GEN-LAST:event_btnCadastrarConta1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ContaBancariaGUI dialog = new ContaBancariaGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCadastrarConta;
    private javax.swing.JButton btnCadastrarConta1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNomeContabancaria;
    private javax.swing.JTextField txtNomeContabancaria1;
    private javax.swing.JTextField txtSaldoContaBancaria;
    private javax.swing.JTextField txtSaldoContaBancaria1;
    // End of variables declaration//GEN-END:variables
}
