package interfaces.atualizar;

import utilidades.Sistema.Gerenciamento;
import utilidades.classes.Produto;
import interfaces.Main;
import javax.swing.JOptionPane;

public class AtuProduto extends javax.swing.JDialog {
    
    private Gerenciamento g;
    
    public AtuProduto(Gerenciamento g) {
        initComponents();
        setLocationRelativeTo(null);
        this.g = g;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Valor Unitário:");

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualizar Produto");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição:");

        jLabel3.setText("Código:");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValor)
                            .addComponent(txtQuantidade)
                            .addComponent(txtCodigo)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAtualizar)
                        .addGap(67, 67, 67)
                        .addComponent(btCancelar)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btCancelar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed

    }//GEN-LAST:event_txtValorActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        String descricao = txtDescricao.getText().trim();
        String codigo = txtCodigo.getText().trim();
        String quantidadeS = txtQuantidade.getText().trim();
        String valorUnitarioS = txtValor.getText().trim();

        // Verifica se campos estão vazios
        if (codigo.replace(".", "").replace("-", "").trim().isEmpty() || descricao.isEmpty()
            || quantidadeS.isEmpty() || valorUnitarioS.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }

        // Verifica se quantidade é um inteiro válido
        int quantidade;
        try {
            quantidade = Integer.parseInt(quantidadeS);
            if (quantidade < 0) throw new NumberFormatException(); // evitar negativos se quiser
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantidade deve ser um número inteiro válido!");
            txtQuantidade.requestFocus();
            return;
        }

        // Verifica se valor unitário é um double válido
        double valorUnitario;
        try {
            valorUnitario = Double.parseDouble(valorUnitarioS.replace(",", "."));
            if (valorUnitario < 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor unitário deve ser um número válido!");
            txtValor.requestFocus();
            return;
        }

        // Verifica se o produto existe
        Produto produto = g.consultarProduto(codigo);

        // Atualiza diretamente os atributos do produto existente
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setValorUnitario(valorUnitario);
        
            // limpa campos
            txtCodigo.setText("");
            txtDescricao.setText("");
            txtQuantidade.setText("");
            txtValor.setText("");
            
        String mensagem = 
        "Produto atualizado com sucesso!\n\n" +
        "Código: " + produto.getCodigoProduto() + "\n" +
        "Descrição: " + produto.getDescricao() + "\n" +
        "Quantidade: " + produto.getQuantidade() + "\n" +
        "Valor Unitário: " + produto.getValorUnitario();

        JOptionPane.showMessageDialog(null, mensagem); 
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        try {
            if (g.getCodigoSelecionado().equals("")) {
                return;
            }

            // buscando produto no gerenciamento
            Produto p = g.getListaDeProdutos().get(g.getCodigoSelecionado());

            if (p != null) {
                txtCodigo.setText(p.getCodigoProduto());
                txtDescricao.setText(p.getDescricao());
                txtQuantidade.setText(String.valueOf(p.getQuantidade()));
                txtValor.setText(String.valueOf(p.getValorUnitario()));
            }

            // limpa a referência para evitar reutilização errada
            g.setCodigoSelecionado(null);

        } catch (Exception e) {
            e.printStackTrace(); // ??
        }
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        try {
            Produto p = g.consultarProduto(txtCodigo.getText().trim().replaceAll("\\D", ""));
            txtDescricao.setText(p.getDescricao());
            txtQuantidade.setText(String.valueOf(p.getQuantidade())); 
            txtValor.setText(String.valueOf(p.getValorUnitario()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
