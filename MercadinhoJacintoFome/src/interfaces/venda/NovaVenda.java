package interfaces.venda;

import classes.Gerenciamento;
import classes.Produto;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import java.util.Optional;


public class NovaVenda extends javax.swing.JDialog {

    private Gerenciamento gerenciamento;

    public NovaVenda(Gerenciamento g) {
        this.gerenciamento = g;
        initComponents();
        carregarTabelaProdutos(g);

    // (opcional) permitir duplo-clique para adicionar ao carrinho
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getClickCount() == 2) {
                btAdicionar.doClick();
            }
        }
    });
        // Atalho F2 para o botão Pagamento (jButton4)
        btPagamento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F2"), "Pagamento");
        btPagamento.getActionMap().put("Pagamento", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btPagamento.doClick(); // Simula o clique no botão
            }
        });
        
        this.setLocationRelativeTo(this);
        
    }
    
    private void carregarTabelaProdutos(Gerenciamento g) {
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0); // limpa

    if (g == null) return;

    for (Produto p : g.getListaDeProdutos().values()) {
        modelo.addRow(new Object[]{
            p.getCodigoProduto(),
            p.getDescricao(),
            p.getQuantidade(),
            p.getValorUnitario()
        });
    }
}
    
    private void atualizarTotalCompra() {
    DefaultTableModel modeloCarrinho = (DefaultTableModel) jTable2.getModel();
    double total = 0.0;
    for (int i = 0; i < modeloCarrinho.getRowCount(); i++) {
        Object valObj = modeloCarrinho.getValueAt(i, 4);
        if (valObj == null) continue;
        try {
            total += Double.parseDouble(valObj.toString());
        } catch (NumberFormatException ex) {
            // ignora células inválidas
        }
    }
    jLabelTotalDaCompra.setText(String.format("%.2f", total));
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btPagamento = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabelTotalDaCompra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Venda");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Código do produto: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "código", "Descrição", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        btPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btPesquisarKeyPressed(evt);
            }
        });

        btAdicionar.setText("A. Carrinho");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jLabel3.setText("Q. de produto:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAdicionar))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btAdicionar)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btPesquisar)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Carrinho");

        btVoltar.setText("Fechar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btPagamento.setText("Pagamento");
        btPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagamentoActionPerformed(evt);
            }
        });
        btPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btPagamentoKeyPressed(evt);
            }
        });

        btRemover.setText("Remover Produto");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        jLabel4.setText("Q. de produto:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Dscrição", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total da compra: R$");

        jLabelTotalDaCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTotalDaCompra.setText("00.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelTotalDaCompra))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btPagamento)
                                .addGap(33, 33, 33)
                                .addComponent(btVoltar)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btRemover))
                    .addComponent(btPagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelTotalDaCompra))
                .addGap(213, 213, 213))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        btPesquisar.doClick(); 
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto da lista!");
            return;
        }

        // quantidade desejada
        int quantidadeDesejada;
        try {
            quantidadeDesejada = Integer.parseInt(jSpinner1.getValue().toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida!");
            return;
        }

        if (quantidadeDesejada <= 0) {
            JOptionPane.showMessageDialog(this, "Informe uma quantidade válida!");
            txtCodigo.setText("");
            jSpinner1.setValue(0);
            return;
        }

        DefaultTableModel modeloProdutos = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel modeloCarrinho = (DefaultTableModel) jTable2.getModel();

        // pega dados da linha selecionada
        String codigo = modeloProdutos.getValueAt(linhaSelecionada, 0).toString();
        String descricao = modeloProdutos.getValueAt(linhaSelecionada, 1).toString();
        int estoque = Integer.parseInt(modeloProdutos.getValueAt(linhaSelecionada, 2).toString());
        double valorUnitario = Double.parseDouble(modeloProdutos.getValueAt(linhaSelecionada, 3).toString());

        if (quantidadeDesejada > estoque) {
            JOptionPane.showMessageDialog(this, "Quantidade em estoque insuficiente!");
            return;
        }

        double valorTotal = quantidadeDesejada * valorUnitario;

        // adicionar ao carrinho
        modeloCarrinho.addRow(new Object[]{codigo, descricao, quantidadeDesejada, valorUnitario, valorTotal});

        // opcional: reduzir o estoque exibido na tabela de produtos (visualmente)
        modeloProdutos.setValueAt(estoque - quantidadeDesejada, linhaSelecionada, 2);

        // limpa campo de código e reseta spinner para 0
        txtCodigo.setText("");
        jSpinner1.setValue(0);

        // atualiza total
        atualizarTotalCompra();
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPagamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPagamentoKeyPressed
        
    }//GEN-LAST:event_btPagamentoKeyPressed

    private void btPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagamentoActionPerformed
        double total = gerenciamento.obterTotalDaCompra(jLabelTotalDaCompra.getText().trim());
        Pagamento pagGUI = new Pagamento(this, true, gerenciamento, total);
        pagGUI.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pagGUI.setVisible(true);
        
        if (pagGUI.isFinalizada()) {                            // //
            String id = gerenciamento.gerarIDVenda();                       // //
            java.util.List<classes.Venda> itens = montarVendasDoCarrinho(); // //
            gerenciamento.salvarVendasDoCarrinho(id, itens);                // //
            limparCarrinho();                                    // //
        }
    }//GEN-LAST:event_btPagamentoActionPerformed

    private void btPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPesquisarKeyPressed
        
    }//GEN-LAST:event_btPesquisarKeyPressed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String codigo = txtCodigo.getText().trim();
    if (codigo.isEmpty()) {
        // mostra todos novamente
        carregarTabelaProdutos(gerenciamento);
        return;
    }

    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0);

    Produto p = gerenciamento.getListaDeProdutos().get(codigo);
    if (p != null) {
        modelo.addRow(new Object[]{
            p.getCodigoProduto(),
            p.getDescricao(),
            p.getQuantidade(),
            p.getValorUnitario()
        });
    } else {
        JOptionPane.showMessageDialog(this, "Produto não encontrado: " + codigo);
        // opcional: recarrega tudo
        carregarTabelaProdutos(gerenciamento);
    }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
    int linha = jTable2.getSelectedRow();
    if (linha == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um item no carrinho para remover.");
        txtCodigo.setText("");
        jSpinner2.setValue(0);
        return;
    }

    int quantidadeRemover;
    try {
        quantidadeRemover = Integer.parseInt(jSpinner2.getValue().toString());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
        txtCodigo.setText("");
        jSpinner2.setValue(0);
        return;
    }

    if (quantidadeRemover <= 0) {
        JOptionPane.showMessageDialog(this, "Informe uma quantidade válida para remover!");
        txtCodigo.setText("");
        jSpinner2.setValue(0);
        return;
    }

    DefaultTableModel modeloCarrinho = (DefaultTableModel) jTable2.getModel();
    DefaultTableModel modeloProdutos = (DefaultTableModel) jTable1.getModel();

    // Dados do item selecionado no carrinho
    String codigoCarrinho = modeloCarrinho.getValueAt(linha, 0).toString();
    int quantidadeAtual = Integer.parseInt(modeloCarrinho.getValueAt(linha, 2).toString());
    double valorUnitario = Double.parseDouble(modeloCarrinho.getValueAt(linha, 3).toString());

    // Atualiza o carrinho
    if (quantidadeRemover >= quantidadeAtual) {
        modeloCarrinho.removeRow(linha);
    } else {
        int novaQuantidade = quantidadeAtual - quantidadeRemover;
        double novoTotal = novaQuantidade * valorUnitario;
        modeloCarrinho.setValueAt(novaQuantidade, linha, 2);
        modeloCarrinho.setValueAt(novoTotal, linha, 4);
    }

    // Agora devolve ao estoque (tabela de produtos)
    for (int i = 0; i < modeloProdutos.getRowCount(); i++) {
        String codigoEstoque = modeloProdutos.getValueAt(i, 0).toString();
        if (codigoEstoque.equals(codigoCarrinho)) {
            int estoqueAtual = Integer.parseInt(modeloProdutos.getValueAt(i, 2).toString());
            modeloProdutos.setValueAt(estoqueAtual + quantidadeRemover, i, 2);
            break;
        }
    }

    txtCodigo.setText("");
    jSpinner2.setValue(0);
    atualizarTotalCompra();
    }//GEN-LAST:event_btRemoverActionPerformed

    //Métodos
    public void limparCarrinho() {
        DefaultTableModel modeloCarrinho = (DefaultTableModel) jTable2.getModel();
        modeloCarrinho.setRowCount(0); // remove todas as linhas da tabela;
        jLabelTotalDaCompra.setText("0.00"); // reinicia o total da compra;
    }
    private java.util.List<classes.Venda> montarVendasDoCarrinho() {
    javax.swing.table.DefaultTableModel m = (javax.swing.table.DefaultTableModel) jTable2.getModel();
    java.util.List<classes.Venda> lista = new java.util.ArrayList<>();
    for (int i = 0; i < m.getRowCount(); i++) {
        String codigo = String.valueOf(m.getValueAt(i, 0)); // coluna: Código
        int qtd = Integer.parseInt(String.valueOf(m.getValueAt(i, 2))); // coluna: Quantidade
        double vu = Double.parseDouble(String.valueOf(m.getValueAt(i, 3))); // coluna: Valor Unitário

        classes.Venda v = new classes.Venda();
        v.setCodigoProduto(codigo);
        v.setQuantidade(qtd);
        v.setValorUnitario(vu);
        lista.add(v);
    }
    return lista;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btPagamento;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTotalDaCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
