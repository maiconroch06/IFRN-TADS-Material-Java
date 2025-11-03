package interfaces;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import classes.ContaBancaria;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private static int contadorCorrente = 1;
    private static int contadorPoupanca = 1;

    private ContaCorrente contaCorrente = null;
    private ContaPoupanca contaPoupanca = null;
    
    private final HashMap<String, ContaCorrente> ListaContasCorrente = new HashMap<>();
    private final HashMap<String, ContaPoupanca> ListaContasPoupanca = new HashMap<>();
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(Main.MAXIMIZED_BOTH); // Maximiza ao abrir
    }
    
    // Metodos de contagem de Prtocolo de Numero de Conta
    public static String gerarNumeroContaCorrente() {
        String numero = String.format("01%02d", contadorCorrente);
        contadorCorrente++;
        return numero;
    }

    //String.format se a semelha com "prinf" de C
    public static String gerarNumeroContaPoupanca() {
        String numero = String.format("02%02d", contadorPoupanca);
        contadorPoupanca++;
        return numero;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MnCadastroContas = new javax.swing.JMenuItem();
        MenuContas = new javax.swing.JMenu();
        MnContaCorrente = new javax.swing.JMenuItem();
        MnContaPoupanca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/banco.png"))); // NOI18N

        MenuCadastro.setText("Cadastro");

        MnCadastroContas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MnCadastroContas.setText("Cadastrar Conta");
        MnCadastroContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadastroContasActionPerformed(evt);
            }
        });
        MenuCadastro.add(MnCadastroContas);

        jMenuBar1.add(MenuCadastro);

        MenuContas.setText("Contas");

        MnContaCorrente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MnContaCorrente.setText("Conta Corrente");
        MnContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnContaCorrenteActionPerformed(evt);
            }
        });
        MenuContas.add(MnContaCorrente);

        MnContaPoupanca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MnContaPoupanca.setText("Conta Poupança");
        MnContaPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnContaPoupancaActionPerformed(evt);
            }
        });
        MenuContas.add(MnContaPoupanca);

        jMenuBar1.add(MenuContas);

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
        ContaCorrenteGUI guiCC = new ContaCorrenteGUI(ListaContasCorrente);
        guiCC.setListaContaCorrente(ListaContasCorrente);
        guiCC.setModal(true);
        guiCC.setVisible(true);
    }//GEN-LAST:event_MnContaCorrenteActionPerformed

    private void MnContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnContaPoupancaActionPerformed
        ContaPoupancaGUI guiCP = new ContaPoupancaGUI(ListaContasPoupanca);
        guiCP.setListaContaPoupanca(ListaContasPoupanca);
        guiCP.setModal(true);
        guiCP.setVisible(true);
    }//GEN-LAST:event_MnContaPoupancaActionPerformed

    private void MnCadastroContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadastroContasActionPerformed
        CadastrarContasGUI guiCadastro = new CadastrarContasGUI(this, true);
        guiCadastro.setModal(true);
        guiCadastro.setVisible(true);
        
        ContaBancaria contaCriada = guiCadastro.getContaCadastrada();
        
        // Verifica se o objeto que veio da tela CadastroContas não está vazia
        if(contaCriada != null) {
            // Verifica se o objeto contaCriada é uma instância de uma determinada ContaCorrente
            if (contaCriada instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) contaCriada;
                ListaContasCorrente.put(cc.getNumConta(), cc);
                
                // Mensagem de confirmação do cadastro
                JOptionPane.showMessageDialog(this,
                    "Conta CORRENTE criada com sucesso!\n" +
                    "Nome: " + cc.getNome() + "\n" +
                    "Número: " + cc.getNumConta() + "\n" +
                    "Saldo: " + cc.getSaldo() 
            );

            // Verifica se o objeto contaCriada é uma instância de uma determinada ContaPoupanca
            } else if (contaCriada instanceof ContaPoupanca) {
                ContaPoupanca cp = (ContaPoupanca) contaCriada;
                ListaContasPoupanca.put(cp.getNumConta(), cp);

                // Mensagem de confirmação do cadastro
                JOptionPane.showMessageDialog(this,
                    "Conta POUPANÇA criada com sucesso!\n" +
                    "Nome: " + cp.getNome() + "\n" +
                    "Número: " + cp.getNumConta() + "\n" +
                    "Saldo: " + cp.getSaldo()
                );
            }
        }
    }//GEN-LAST:event_MnCadastroContasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuContas;
    private javax.swing.JMenuItem MnCadastroContas;
    private javax.swing.JMenuItem MnContaCorrente;
    private javax.swing.JMenuItem MnContaPoupanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
