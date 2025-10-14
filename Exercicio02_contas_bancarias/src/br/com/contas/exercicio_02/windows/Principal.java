package br.com.contas.exercicio_02.windows;

import br.com.contas.exercicio_02.classes.ContaBancaria;
import br.com.contas.exercicio_02.classes.ContaCorrente;
import br.com.contas.exercicio_02.classes.ContaPoupanca;
import br.com.contas.exercicio_02.classes.OperacoesBancarias;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu1 = new javax.swing.JMenu();
        MnBancaria = new javax.swing.JMenuItem();
        MnPoupanca = new javax.swing.JMenuItem();
        MnCorrente = new javax.swing.JMenuItem();
        MnCadastro = new javax.swing.JMenuItem();
        Menu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        creditarCorrente = new javax.swing.JMenuItem();
        debitarCorrente = new javax.swing.JMenuItem();
        transferirCorrente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistemas de contas Bancarias");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentResized(evt);
            }
        });

        Menu1.setText("Cadastro");

        MnBancaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MnBancaria.setText("Contas Bancárias");
        MnBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBancariaActionPerformed(evt);
            }
        });
        Menu1.add(MnBancaria);

        MnPoupanca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MnPoupanca.setText("Contas Poupança");
        MnPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPoupancaActionPerformed(evt);
            }
        });
        Menu1.add(MnPoupanca);

        MnCorrente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MnCorrente.setText("Conta Corrente");
        MnCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCorrenteActionPerformed(evt);
            }
        });
        Menu1.add(MnCorrente);

        MnCadastro.setText("Cadastro");
        MnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadastroActionPerformed(evt);
            }
        });
        Menu1.add(MnCadastro);

        jMenuBar1.add(Menu1);

        Menu2.setText("Operações");

        jMenuItem2.setText("Creditar na Conta Poupança");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Menu2.add(jMenuItem2);

        jMenuItem5.setText("Creditar Em Poupança");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Menu2.add(jMenuItem5);

        jMenuItem6.setText("Debitar da Conta Poupança");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Menu2.add(jMenuItem6);

        jMenuItem7.setText("Debitar da Poupança");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Menu2.add(jMenuItem7);
        Menu2.add(jSeparator1);

        creditarCorrente.setText("Creditar na Conta Corrente");
        creditarCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditarCorrenteActionPerformed(evt);
            }
        });
        Menu2.add(creditarCorrente);

        debitarCorrente.setText("Debitar ContaCorrente");
        debitarCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitarCorrenteActionPerformed(evt);
            }
        });
        Menu2.add(debitarCorrente);

        transferirCorrente.setText("Tranferência entre Contas correntes");
        transferirCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirCorrenteActionPerformed(evt);
            }
        });
        Menu2.add(transferirCorrente);

        jMenuBar1.add(Menu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBancariaActionPerformed
        ContaBancariaGUI gui = new ContaBancariaGUI();
        gui.setContaBancaria(contaBancaria);
        gui.setModal(true);
        gui.setVisible(true);

        contaBancaria = gui.getContaBancaria();
    }//GEN-LAST:event_MnBancariaActionPerformed

    private void MnPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPoupancaActionPerformed
        ContaPoupancaGUI guiP = new ContaPoupancaGUI();
        guiP.setContaPoupanca(contaPoupanca);
        guiP.setModal(true);
        guiP.setVisible(true);

        contaPoupanca = guiP.getContaPoupanca();
    }//GEN-LAST:event_MnPoupancaActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
    }//GEN-LAST:event_formWindowStateChanged

    private void MnCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCorrenteActionPerformed
        ContaCorrenteGUI guicc = new ContaCorrenteGUI();

        guicc.setContaCorrente(contaCorrente);
        guicc.setModal(true);
        guicc.setVisible(true);
        contaCorrente = guicc.getContaCorrente();

    }//GEN-LAST:event_MnCorrenteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (isContaPoupancaPreenchida()) {
            String valorCreditadoPoupanca = JOptionPane.showInputDialog(this, "Titular da conta: " + contaPoupanca.getNome()
                + "\nSaldo atual: R$ " + contaPoupanca.getSaldo()
                + "\nDigite o valor", "Poupança | Creditar saldo", JOptionPane.QUESTION_MESSAGE);

            if (valorCreditadoPoupanca != null) {
                double valorCreditadoPoupancaValor = Double.parseDouble(valorCreditadoPoupanca);
                operacoesBancarias.creditarContaPoupanca(contaPoupanca, valorCreditadoPoupancaValor);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Preencha os dados da conta poupança");
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (isContaPoupancaPreenchida()) {
            String valorCreditadoPoupanca = JOptionPane.showInputDialog(this, "Titular da conta: " + contaPoupanca.getNome()
                + "\n\nSaldo na conta Bancaria: R$ " + contaPoupanca.getSaldo()
                + "\nSaldo atual: R$ " + contaPoupanca.getSaldoPoupanca()
                + "\nDigite o valor", "Poupança | Creditar em poupança", JOptionPane.QUESTION_MESSAGE);

            if (valorCreditadoPoupanca != null) {
                double valorCreditadoPoupancaValor = Double.parseDouble(valorCreditadoPoupanca);
                operacoesBancarias.creditarEmPoupanca(contaPoupanca, valorCreditadoPoupancaValor);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Preencha os dados da conta poupança");
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (isContaPoupancaPreenchida()) {
            String valorCreditadoPoupanca = JOptionPane.showInputDialog(this, "Titular da conta: " + contaPoupanca.getNome()
                + "\nSaldo atual: R$ " + contaPoupanca.getSaldo()
                + "\nDigite o valor", "Poupança | Creditar em poupança", JOptionPane.QUESTION_MESSAGE);

            if (valorCreditadoPoupanca != null) {
                double valorCreditadoPoupancaValor = Double.parseDouble(valorCreditadoPoupanca);
                operacoesBancarias.debitarContaPoupanca(contaPoupanca, valorCreditadoPoupancaValor);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Preencha os dados da conta poupança");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (isContaPoupancaPreenchida()) {
            String valorCreditadoPoupanca = JOptionPane.showInputDialog(this, "Titular da conta: " + contaPoupanca.getNome()
                + "\n\nSaldo na conta Bancaria: R$ " + contaPoupanca.getSaldo()
                + "\nSaldo na poupança: R$ " + contaPoupanca.getSaldoPoupanca()
                + "\n\nDigite o valor", "Poupança | Debitar da poupança", JOptionPane.QUESTION_MESSAGE);

            if (valorCreditadoPoupanca != null) {
                double valorCreditadoPoupancaValor = Double.parseDouble(valorCreditadoPoupanca);
                operacoesBancarias.debitarDaPoupanca(contaPoupanca, valorCreditadoPoupancaValor);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Preencha os dados da conta poupança");
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void debitarCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitarCorrenteActionPerformed
        if (isContaCorrentePreenchida()) {
            String valorDebitoContaCorrente = JOptionPane.showInputDialog(this, "Titular da conta: " + contaCorrente.getNome()
                + "\nSaldo Disponivel: R$ " + contaCorrente.getSaldo() + "\n\nDigite o valor do saque", "Conta Corrente | Sacar", JOptionPane.QUESTION_MESSAGE);

            if (valorDebitoContaCorrente != null) {
                double valorDebitoConCorrente = Double.parseDouble(valorDebitoContaCorrente);
                operacoesBancarias.debitarContaCorrente(contaCorrente, valorDebitoConCorrente);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha os dados da Conta Corrente");
        }
    }//GEN-LAST:event_debitarCorrenteActionPerformed

    private void creditarCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditarCorrenteActionPerformed
        if (isContaCorrentePreenchida()) {
            String valorDebitoContaCorrente = JOptionPane.showInputDialog(this, "Titular da conta: "
                + contaCorrente.getNome() + "\nSaldo Disponivel: R$ " + contaCorrente.getSaldo() + "\n\nDigite o valor do depósito", "Conta Corrente | Depositar", JOptionPane.QUESTION_MESSAGE);

            if (valorDebitoContaCorrente != null) {
                double valorDebitoConCorrente = Double.parseDouble(valorDebitoContaCorrente);
                operacoesBancarias.creditarContaCorrente(contaCorrente, valorDebitoConCorrente);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha os dados da Conta Corrente");
        }
            }//GEN-LAST:event_creditarCorrenteActionPerformed

    private void transferirCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirCorrenteActionPerformed
        if (isContaCorrentePreenchida()) {
            ContaCorrente contaDestino = new ContaCorrente();
            contaDestino.setNome("Maicon");
            contaDestino.setSaldo(1000);
            String valorDebitoContaCorrente = JOptionPane.showInputDialog(this, "Conta Origem: " + contaCorrente.getNome()
                + "\nConta Destino: " + contaDestino.getNome().toUpperCase() + "\n\nSaldo Disponivel: R$ "
                + contaCorrente.getSaldo() + "\n\nDigite o valor do depósito", "Conta Corrente | Transferência",
                JOptionPane.QUESTION_MESSAGE);

            if (valorDebitoContaCorrente != null) {
                double valorDebitoConCorrente = Double.parseDouble(valorDebitoContaCorrente);
                operacoesBancarias.transferenciaBancaria(contaCorrente, contaDestino, valorDebitoConCorrente);
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Preencha os dados da Conta Corrente");
        }
    }//GEN-LAST:event_transferirCorrenteActionPerformed

    private void jLabel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentResized
    }//GEN-LAST:event_jLabel1ComponentResized

    private void jLabel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorMoved
    }//GEN-LAST:event_jLabel1AncestorMoved

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        atualizarImagemFundo();
    }//GEN-LAST:event_formComponentResized

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
    }//GEN-LAST:event_formComponentHidden

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        ImagemFundo();
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void MnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadastroActionPerformed
        Cadastrar guicad = new Cadastrar(new javax.swing.JFrame(), true);
        guicad.setCadastro(cadastroConta);
        guicad.setModal(true);
        guicad.setVisible(true);

        Cadastrar novoCadastro = guicad.getCadastrar();

        if (novoCadastro != null) {
            //System.out.println("Cadastro criado: " + novoCadastro.getNome());
        }
    }//GEN-LAST:event_MnCadastroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private ContaBancaria contaBancaria = null;
    private ContaPoupanca contaPoupanca = null;
    private ContaCorrente contaCorrente = null;
    private Cadastrar cadastroConta = null;
    private OperacoesBancarias operacoesBancarias = new OperacoesBancarias();
    private Image imagemFundo;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu1;
    private javax.swing.JMenu Menu2;
    private javax.swing.JMenuItem MnBancaria;
    private javax.swing.JMenuItem MnCadastro;
    private javax.swing.JMenuItem MnCorrente;
    private javax.swing.JMenuItem MnPoupanca;
    private javax.swing.JMenuItem creditarCorrente;
    private javax.swing.JMenuItem debitarCorrente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem transferirCorrente;
    // End of variables declaration//GEN-END:variables

    private boolean isContaPoupancaPreenchida() {
        return contaPoupanca != null;
    }

    private boolean isContaCorrentePreenchida() {
        return contaCorrente != null;
    }

    public void ImagemFundo() {
        imagemFundo = new ImageIcon(getClass().getResource("../assets/imagens/contas-bancarias.jpg")).getImage();
        Image scaledInstance = imagemFundo.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);

        jLabel1.setIcon(new ImageIcon(scaledInstance));
    }

    public void atualizarImagemFundo() {

    }
}
