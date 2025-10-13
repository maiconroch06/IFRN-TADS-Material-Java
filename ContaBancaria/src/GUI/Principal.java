package GUI;

import classes.ContaBancaria;
import classes.ContaPoupanca;
import classes.ContaCorrente;
import classes.Operacoes;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MnBancaria = new javax.swing.JMenuItem();
        MnCorrente = new javax.swing.JMenuItem();
        MnPoupanca = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MnDebitar = new javax.swing.JMenuItem();
        MnCreditar = new javax.swing.JMenuItem();
        MnTransferir = new javax.swing.JMenuItem();
        MnMostrarSaldo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Cadastrar");

        MnBancaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MnBancaria.setText("Conta Bancaria");
        MnBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBancariaActionPerformed(evt);
            }
        });
        jMenu2.add(MnBancaria);

        MnCorrente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MnCorrente.setText("Conta Corrente");
        MnCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCorrenteActionPerformed(evt);
            }
        });
        jMenu2.add(MnCorrente);

        MnPoupanca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MnPoupanca.setText("Conta Poupança");
        MnPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPoupancaActionPerformed(evt);
            }
        });
        jMenu2.add(MnPoupanca);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Operações");

        MnDebitar.setText("Debitar");
        jMenu6.add(MnDebitar);

        MnCreditar.setText("Creditar");
        MnCreditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCreditarActionPerformed(evt);
            }
        });
        jMenu6.add(MnCreditar);

        MnTransferir.setText("Transferir");
        jMenu6.add(MnTransferir);

        MnMostrarSaldo.setText("Mostrar Saldo");
        MnMostrarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnMostrarSaldoActionPerformed(evt);
            }
        });
        jMenu6.add(MnMostrarSaldo);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCorrenteActionPerformed
        ContaCorrenteGUI cc = new ContaCorrenteGUI();
        cc.setVisible(true);            // Mostrar a janela
        cc.setLocationRelativeTo(null); // Centralizar tela

    }//GEN-LAST:event_MnCorrenteActionPerformed

    private void MnPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPoupancaActionPerformed
        ContaPoupancaGUI cp = new ContaPoupancaGUI();
        cp.setVisible(true);            // Mostrar a janela
        cp.setLocationRelativeTo(null); // Centralizar tela

    }//GEN-LAST:event_MnPoupancaActionPerformed

    private void MnCreditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCreditarActionPerformed

    }//GEN-LAST:event_MnCreditarActionPerformed

    private void MnMostrarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnMostrarSaldoActionPerformed
    }//GEN-LAST:event_MnMostrarSaldoActionPerformed

    private void MnBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBancariaActionPerformed
        ContaBancariaGUI cb = new ContaBancariaGUI();
        cb.setVisible(true);            // Mostrar a janela
        cb.setLocationRelativeTo(null); // Centralizar tela
        
    }//GEN-LAST:event_MnBancariaActionPerformed


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
    private Operacoes operacoes = new Operacoes();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnBancaria;
    private javax.swing.JMenuItem MnCorrente;
    private javax.swing.JMenuItem MnCreditar;
    private javax.swing.JMenuItem MnDebitar;
    private javax.swing.JMenuItem MnMostrarSaldo;
    private javax.swing.JMenuItem MnPoupanca;
    private javax.swing.JMenuItem MnTransferir;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
