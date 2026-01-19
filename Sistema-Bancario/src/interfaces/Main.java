package interfaces;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import classes.ContaBancaria;
import classes.service.ContaBancariaService;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    ContaBancariaService operacaoConta = new ContaBancariaService();

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MnCadastroContas = new javax.swing.JMenuItem();
        MnContaCorrente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/banco.png"))); // NOI18N

        MenuCadastro.setText("Operações");

        MnCadastroContas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MnCadastroContas.setText("Cadastrar Conta");
        MnCadastroContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadastroContasActionPerformed(evt);
            }
        });
        MenuCadastro.add(MnCadastroContas);

        MnContaCorrente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MnContaCorrente.setText("Menu Operacional");
        MnContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnContaCorrenteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MnContaCorrente);

        jMenuBar1.add(MenuCadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnContaCorrenteActionPerformed
        ContaCorrente telaBancaria = new ContaCorrente(operacaoConta);
        telaBancaria.setModal(true);
        telaBancaria.setVisible(true);
    }//GEN-LAST:event_MnContaCorrenteActionPerformed

    private void MnCadastroContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadastroContasActionPerformed
        CadastrarConta guiCadastro = new CadastrarConta(this, true);
        guiCadastro.setVisible(true);
        
        ContaBancaria contaCriada = guiCadastro.getContaCadastrada();
        
        if(contaCriada != null) {
            if (contaCriada instanceof ContaCorrente) {
                ContaCorrente contaCorrente = (ContaCorrente) contaCriada;
                operacaoConta.criar(contaCriada);
                
                JOptionPane.showMessageDialog(this,
                    "Conta CORRENTE criada com sucesso!\n" +
                    "Nome: " + contaCorrente.getNome() + "\n" +
                    "Número: " + contaCorrente.getNumero() + "\n" +
                    "Saldo: " + contaCorrente.getSaldo() 
            );

            } else if (contaCriada instanceof ContaPoupanca) {
                ContaPoupanca contaPoupanca = (ContaPoupanca) contaCriada;
                operacaoConta.criar(contaCriada);

                JOptionPane.showMessageDialog(this,
                    "Conta POUPANÇA criada com sucesso!\n" +
                    "Nome: " + contaPoupanca.getNome() + "\n" +
                    "Número: " + contaPoupanca.getNumero() + "\n" +
                    "Saldo: " + contaPoupanca.getSaldo()
                );
            }
        }
    }//GEN-LAST:event_MnCadastroContasActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MnCadastroContas;
    private javax.swing.JMenuItem MnContaCorrente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
