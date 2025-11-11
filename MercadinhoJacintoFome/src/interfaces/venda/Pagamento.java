package interfaces.venda;

import classes.Gerenciamento;
import classes.Cliente;
import interfaces.cadastrar.CadCliente;
import javax.swing.JOptionPane;


public class Pagamento extends javax.swing.JDialog {
    private boolean finalizada = false;
    private Runnable onFinalizarCompra;
    private Gerenciamento g;
    private double total;
    public Pagamento() {
        initComponents();
        
        this.setLocationRelativeTo(this);
    }

    public Pagamento(java.awt.Window parent, boolean modal, Gerenciamento g, double total) {
        super(parent, ModalityType.APPLICATION_MODAL);
        this.g = g;
        this.total = total;
        this.onFinalizarCompra = onFinalizarCompra;
        initComponents();
        this.setLocationRelativeTo(parent);
        txtTotal.setText(String.format("R$ %.2f", total));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opcPix = new javax.swing.JRadioButton();
        opcDebito = new javax.swing.JRadioButton();
        opcCredito = new javax.swing.JRadioButton();
        opcEspecie = new javax.swing.JRadioButton();
        txtNomeCliente = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnCadNCliente = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Pagamento");

        jLabel1.setText("Nome Cliente: ");

        jLabel2.setText("CPF Cliente:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Metodo de Pagamento");

        jLabel4.setText("Forma de Pagamento: ");

        buttonGroup1.add(opcPix);
        opcPix.setText("PIX");

        buttonGroup1.add(opcDebito);
        opcDebito.setText("Débito");

        buttonGroup1.add(opcCredito);
        opcCredito.setText("Crédito");

        buttonGroup1.add(opcEspecie);
        opcEspecie.setText("Espécie");

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total da compra: R$");

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotal.setText("00.00");

        btnCadNCliente.setText("Cadastrar Novo Cliente");
        btnCadNCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadNClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(opcPix)
                                .addGap(18, 18, 18)
                                .addComponent(opcDebito)
                                .addGap(18, 18, 18)
                                .addComponent(opcCredito)
                                .addGap(18, 18, 18)
                                .addComponent(opcEspecie))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFinalizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnCadNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opcPix)
                        .addComponent(opcDebito)
                        .addComponent(opcCredito)
                        .addComponent(opcEspecie)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal)
                    .addComponent(btnVoltar)
                    .addComponent(btnFinalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadNCliente)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        String metodo = null;
        if (opcPix.isSelected())      metodo = "PIX";
        else if (opcDebito.isSelected())  metodo = "DEBITO";
        else if (opcCredito.isSelected()) metodo = "CREDITO";
        else if (opcEspecie.isSelected()) metodo = "ESPECIE";

        // Verifica se algum método de pagamento foi selecionado;
        if (metodo == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma forma de pagamento.");
            return;
        }
        
        // Pega todo o texto de cpf e deixa só os números/String;
        String cpf = txtCpf.getText().trim().replaceAll("\\D", ""); 
        
        // Verifica se cpf tá vazio ou com menos dígitos;
        if (cpf.isEmpty() || cpf.length() != 11) {
            JOptionPane.showMessageDialog(this, "CPF inválido.");
            return;
        }
        
        // Se esse CPF existir na lista finaliza a compra, caso não, Abre a tela de erro;
        if(g.verificarCliente(cpf)) {
            JOptionPane.showMessageDialog(null, "Compra Finalizada comm Sucesso!!");
            if (onFinalizarCompra != null) onFinalizarCompra.run();
            finalizada = true;
            dispose();
            
        } else {
            Object[] options = {"Cadastrar", "Tentar Novamente"};
            int escolha = JOptionPane.showOptionDialog(
                this,
                "Cliente Não Cadastrado ou CPF incorreto." + cpf,
                "Cliente",
                JOptionPane.YES_NO_OPTION,         
                JOptionPane.WARNING_MESSAGE,
                null,                              
                options,                           
                options[0]                         
            );
            
            if (escolha == 0) {
                CadCliente cad = new CadCliente(this, true, g, cpf, txtNomeCliente.getText().trim());
                cad.setVisible(true);
            } else {
                return;
            }
        }
        
        
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadNClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadNClienteActionPerformed
        CadCliente cad = new CadCliente(this, true, g, txtCpf.getText().trim(), txtNomeCliente.getText().trim());
        cad.setVisible(true);
    }//GEN-LAST:event_btnCadNClienteActionPerformed

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        try {
            Cliente cl = g.consultarCliente(txtCpf.getText().trim().replaceAll("\\D", ""));
            txtNomeCliente.setText(cl.getNome());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    //Métodos
    public boolean isFinalizada() {
        return finalizada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadNCliente;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JRadioButton opcCredito;
    private javax.swing.JRadioButton opcDebito;
    private javax.swing.JRadioButton opcEspecie;
    private javax.swing.JRadioButton opcPix;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
