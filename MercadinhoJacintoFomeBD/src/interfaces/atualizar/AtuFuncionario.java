package interfaces.atualizar;

import classes.Funcionario;
import conexao.ConexaoFuncionario;
import javax.swing.JOptionPane;

public class AtuFuncionario extends javax.swing.JDialog {

    private Funcionario funcionario;
    ConexaoFuncionario conexaoFuncionario;
    
    public AtuFuncionario(ConexaoFuncionario conexaoFuncionario) {
        initComponents();
        setLocationRelativeTo(null);
        this.conexaoFuncionario = conexaoFuncionario;
    }

    public AtuFuncionario(ConexaoFuncionario conexaoFuncionario, Funcionario funcionario) {
        initComponents();
        setLocationRelativeTo(null);
        this.conexaoFuncionario = conexaoFuncionario;
        this.funcionario = funcionario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualizar Funcionario");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btAtualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        String cpf = txtCpf.getText().trim();
        String nome = txtNome.getText().trim();

        // VALIDAÇÕES
        if (nome.isEmpty() || cpf.replace(".", "").replace("-", "").trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        funcionario = conexaoFuncionario.consultarFuncionario(cpf);
        funcionario.setNome(nome);
       
        txtNome.setText("");
        txtCpf.setText("");
       
        String mensagem = 
        "Funcionario atualizado com sucesso!\n\n" +
        "CPF: " + funcionario.getCPF()+ "\n" +
        "Nome: " + funcionario.getNome();

        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        try {
            if (funcionario != null) {
                txtNome.setText(funcionario.getNome());
                txtCpf.setText(funcionario.getCPF());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel1AncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
