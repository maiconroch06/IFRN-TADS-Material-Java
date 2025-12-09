package interfaces.venda;

import classes.Gerenciamento;
import classes.ItemVenda;
import classes.Produto;
import classes.RegistroVenda;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import utilidades.tabela.Carregar;
import utilidades.tabela.Atalhos;
import utilidades.tabela.Pesquisar;

public class NovaVenda extends javax.swing.JDialog {

    private Gerenciamento g;
    private DefaultTableModel modeloProduto;
    private DefaultTableModel modeloCarrinho;

    public NovaVenda(Gerenciamento g) {
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.modeloProduto = (DefaultTableModel) jTProdutos.getModel();
        this.modeloCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        
        this.g = g;
        
        Carregar.ordenacao(jTProdutos);
        
        Carregar.tabelaProdutos(modeloProduto, g.getListaDeProdutos());

        // permite duplo-clique para adicionar ao carrinho
        Atalhos.duploClique(jTProdutos, () -> btAdicionar.doClick());
        Atalhos.duploClique(jTCarrinho, () -> btRemover.doClick());

        // Atalho F2 para o botão Pagamento (jButton4)
        Atalhos.atalho(btPagamento, "F2");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        jSpQtdProduto = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btPagamento = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jSpQtdRemover = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTCarrinho = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabelTotalDaCompra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Venda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Código do produto: ");

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor Unitário (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.getTableHeader().setReorderingAllowed(false);
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);
        if (jTProdutos.getColumnModel().getColumnCount() > 0) {
            jTProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTProdutos.getColumnModel().getColumn(2).setResizable(false);
            jTProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jSpQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAdicionar)))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btAdicionar)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btPesquisar)
                    .addComponent(jSpQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Carrinho");

        btVoltar.setText("Fechar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btPagamento.setText("Pagamento (F2)");
        btPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagamentoActionPerformed(evt);
            }
        });

        btRemover.setText("Remover Produto");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        jSpQtdRemover.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel4.setText("Q. de produto:");

        jTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor Unitário (R$)", "Valor Total (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCarrinho.getTableHeader().setReorderingAllowed(false);
        jTCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTCarrinho);
        if (jTCarrinho.getColumnModel().getColumnCount() > 0) {
            jTCarrinho.getColumnModel().getColumn(0).setResizable(false);
            jTCarrinho.getColumnModel().getColumn(1).setResizable(false);
            jTCarrinho.getColumnModel().getColumn(2).setResizable(false);
            jTCarrinho.getColumnModel().getColumn(3).setResizable(false);
            jTCarrinho.getColumnModel().getColumn(4).setResizable(false);
        }

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
                                .addComponent(jSpQtdRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btPagamento)
                                .addGap(33, 33, 33)
                                .addComponent(btVoltar)))))
                .addContainerGap(17, Short.MAX_VALUE))
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
                        .addComponent(jSpQtdRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        btPesquisar.doClick(); 
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        int linhaSelecionada = jTProdutos.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto da lista!");
            return;
        }
        
        // se a tabela estiver ordenada
        linhaSelecionada = jTProdutos.convertRowIndexToModel(linhaSelecionada);

        // quantidade desejada
        int quantidadeDesejada;
        try {
            quantidadeDesejada = Integer.parseInt(jSpQtdProduto.getValue().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida!");
            return;
        }

        if (quantidadeDesejada <= 0) {
            JOptionPane.showMessageDialog(this, "A quantidade deve ser maior que zero!");
            return;
        }

        // dados da tabela
        String codigo = modeloProduto.getValueAt(linhaSelecionada, 0).toString();
        String descricao = modeloProduto.getValueAt(linhaSelecionada, 1).toString();
        int estoqueAtual = Integer.parseInt(modeloProduto.getValueAt(linhaSelecionada, 2).toString());
        double valorUnitario = Double.parseDouble(modeloProduto.getValueAt(linhaSelecionada, 3).toString());

        if (quantidadeDesejada > estoqueAtual) {
            JOptionPane.showMessageDialog(this, "Quantidade maior que o estoque!");
            return;
        }

        Produto produto = new Produto();
        produto.setCodigoProduto(codigo);
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidadeDesejada);
        produto.setValorUnitario(valorUnitario);

        // verifica se existe produto na tabela carrinho
        boolean existe = verificarProdutoExistente(modeloCarrinho, produto);

        if (existe) {
            limparCamposProduto();
            atualizarValorTotal();
            return;
        }

        // se não existe o produto na tabela, então criar nova linha
        int novoEstoque = estoqueAtual - quantidadeDesejada;
        double valorTotal = quantidadeDesejada * valorUnitario;
        modeloCarrinho.addRow(new Object[]{codigo, descricao, quantidadeDesejada, valorUnitario, valorTotal});

        modeloProduto.setValueAt(novoEstoque, linhaSelecionada, 2);
        g.atualizarProdutoQuantidade(codigo, novoEstoque);
        Carregar.tabelaProdutos(modeloProduto, g.getListaDeProdutos());
        limparCamposProduto();
        atualizarValorTotal();
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        controlarEstoqueJanelaFechada();
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagamentoActionPerformed
        double total = g.obterTotalDaCompra(jLabelTotalDaCompra.getText().trim());

        // verifica se tem zero itens
        if (modeloCarrinho.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, 
                "Adicione pelo menos um item antes de ir para o pagamento!");
            return;
        }

        RegistroVenda venda = new RegistroVenda();

        venda.setIdVenda(g.gerarIdVenda());
        venda.setItensComprados(montarVendasDoCarrinho());
        venda.setTotalValor(total);


        // abre tela de pagamento
        Pagamento pagGUI = new Pagamento(this, true, g, venda);
        pagGUI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pagGUI.setVisible(true);

        if (pagGUI.isFinalizada()) {
            g.cadastrarVenda(venda.getIdVenda(), venda);

            limparCarrinho();
            Carregar.ordenacao(jTProdutos);
        }
    }//GEN-LAST:event_btPagamentoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String codigo = txtCodigo.getText().trim();
        if (codigo.isEmpty()) {
            // mostra todos novamente
            Carregar.tabelaProdutos(modeloProduto, g.getListaDeProdutos());
            return;
        }

        Produto p = g.getListaDeProdutos().get(codigo);

        if (p != null) {
            Pesquisar.pesqProduto(codigo, modeloProduto, g);

            jTProdutos.setRowSelectionInterval(0, 0);
            int estoque = p.getQuantidade();
            jSpQtdProduto.setModel(new SpinnerNumberModel(1, 1, estoque, 1));
            focarSpinner(jSpQtdProduto);
            getRootPane().setDefaultButton(btAdicionar);

        } else {
            JOptionPane.showMessageDialog(this, "Produto não encontrado: " + codigo);
            Carregar.tabelaProdutos(modeloProduto, g.getListaDeProdutos());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linhaSelecionada = jTCarrinho.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um item no carrinho para remover.");
            limparCamposProduto();
            return;
        }

        // se a tabela estiver ordenada
        linhaSelecionada = jTCarrinho.convertRowIndexToModel(linhaSelecionada);

        // quantidade a remover
        int quantidadeRemover;
        try {
            quantidadeRemover = Integer.parseInt(jSpQtdRemover.getValue().toString());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida!");
            return;
        }

        if (quantidadeRemover <= 0) {
            JOptionPane.showMessageDialog(this, "Informe uma quantidade válida para remover!");
            return;
        }

        // dados do carrinho
        String codigo = modeloCarrinho.getValueAt(linhaSelecionada, 0).toString();
        int quantidadeAtual = Integer.parseInt(modeloCarrinho.getValueAt(linhaSelecionada, 2).toString());
        double valorUnitario = Double.parseDouble(modeloCarrinho.getValueAt(linhaSelecionada, 3).toString());

        // validação
        if (quantidadeRemover > quantidadeAtual) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida! Favor selecionar corretamente!");
            return;
        }

        // atualiza carrinho
        if (quantidadeRemover == quantidadeAtual) {
            modeloCarrinho.removeRow(linhaSelecionada);
            
        } else {
            int novaQuantidade = quantidadeAtual - quantidadeRemover;
            double novoTotal = novaQuantidade * valorUnitario;

            modeloCarrinho.setValueAt(novaQuantidade, linhaSelecionada, 2);
            modeloCarrinho.setValueAt(novoTotal, linhaSelecionada, 4);
        }

        // devolve ao estoque
        for (int i = 0; i < modeloProduto.getRowCount(); i++) {
            if (modeloProduto.getValueAt(i, 0).toString().equals(codigo)) {

                int estoqueAtual = Integer.parseInt(modeloProduto.getValueAt(i, 2).toString());
                int novoEstoque = estoqueAtual + quantidadeRemover;

                modeloProduto.setValueAt(novoEstoque, i, 2);
                g.atualizarProdutoQuantidade(codigo, novoEstoque);
                break;
            }
        }
        
        limparCamposProduto();
        atualizarValorTotal();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        int linha = jTProdutos.getSelectedRow();
        if (linha != -1) {            
            linha = jTProdutos.convertRowIndexToModel(linha); // Converte índice visual para índice do modelo
            int estoque = Integer.parseInt(jTProdutos.getModel().getValueAt(linha, 2).toString()); // Pega estoque do produto
            jSpQtdProduto.setModel(new SpinnerNumberModel(1, 1, estoque, 1)); // Define limite do spinner
            
            focarSpinner(jSpQtdProduto);
            getRootPane().setDefaultButton(btAdicionar); // Seta o enter como botão padrão do bt adicionar
        }
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jTCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCarrinhoMouseClicked
        int linha = jTCarrinho.getSelectedRow();
        if (jTCarrinho.getSelectedRow() != -1) {
            int qtd = Integer.parseInt(modeloCarrinho.getValueAt(linha, 2).toString()); // Pega quantidade de produtos da tabela;
            jSpQtdRemover.setModel(new SpinnerNumberModel(1, 1, qtd, 1)); // Atualiza limite do Spinner;
            
            focarSpinner(jSpQtdRemover);            
            getRootPane().setDefaultButton(btRemover); // Mesma coisa do adicionar
        }
    }//GEN-LAST:event_jTCarrinhoMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controlarEstoqueJanelaFechada();
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JSpinner jSpQtdProduto;
    private javax.swing.JSpinner jSpQtdRemover;
    private javax.swing.JTable jTCarrinho;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    private void controlarEstoqueJanelaFechada() {
//        DefaultTableModel modeloCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        int linha = modeloCarrinho.getRowCount();
        if (linha > 0) {
            for (int i = 0; i < linha; i++) {
                g.atualizarProdutoQuantidade(modeloCarrinho.getValueAt(i, 0).toString(), Integer.parseInt(modeloCarrinho.getValueAt(i, 2).toString()) + g.consultarProduto(modeloCarrinho.getValueAt(i, 0).toString()).getQuantidade());
            }
        }
    }
    
    public boolean verificarProdutoExistente(DefaultTableModel modeloCarrinho, Produto produto) {
        for (int i = 0; i < modeloCarrinho.getRowCount(); i++) {
            String codigoCarrinho = modeloCarrinho.getValueAt(i, 0).toString();

            if (codigoCarrinho.equals(produto.getCodigoProduto())) {

                int qtdAtualCarrinho = Integer.parseInt(modeloCarrinho.getValueAt(i, 2).toString());
                int novaQtdCarrinho = qtdAtualCarrinho + produto.getQuantidade();

                // atualiza carrinho
                modeloCarrinho.setValueAt(novaQtdCarrinho, i, 2);
                modeloCarrinho.setValueAt(novaQtdCarrinho * produto.getValorUnitario(), i, 4);

                // atualiza o estoque
                int estoqueAtual = g.consultarProduto(produto.getCodigoProduto()).getQuantidade();
                int novoEstoque = estoqueAtual - produto.getQuantidade();

                g.atualizarProdutoQuantidade(produto.getCodigoProduto(), novoEstoque);

                // atualiza tabela de produtos
                Carregar.tabelaProdutos(modeloProduto, g.getListaDeProdutos());

                return true; // o produto já existia
            }
        }

        return false; // novo produto
    }
    
    private void limparCamposProduto() {
        txtCodigo.setText("");
        jSpQtdProduto.setValue(0);
    }

    
    // Pega na linha selecionada da tabela de produto o preço do produto.
    private void atualizarValorTotal() {
        double total = 0.0;
        for (int i = 0; i < modeloCarrinho.getRowCount(); i++) {
            Object valObj = modeloCarrinho.getValueAt(i, 4);
            
            if (valObj == null) {
                continue;
            }
            try {
                total += Double.parseDouble(valObj.toString());
            } catch (NumberFormatException ex) {
                // ignora células inválidas
            }
        }
        jLabelTotalDaCompra.setText(String.format("%.2f", total));
    }
    
    public void limparCarrinho() {
        modeloCarrinho.setRowCount(0); // remove todas as linhas da tabela;
        jLabelTotalDaCompra.setText("0.00"); // reinicia o total da compra;
    }
    
    private ArrayList<ItemVenda> montarVendasDoCarrinho() {
        ArrayList<ItemVenda> lista = new ArrayList<>();
        
        for (int i = 0; i < modeloCarrinho.getRowCount(); i++) {
            String codigo = String.valueOf(modeloCarrinho.getValueAt(i, 0));
            String descricao = String.valueOf(modeloCarrinho.getValueAt(i, 1));
            int qtd = Integer.parseInt(String.valueOf(modeloCarrinho.getValueAt(i, 2)));
            double valorUnitario = Double.parseDouble(String.valueOf(modeloCarrinho.getValueAt(i, 3)));
            double valorTotalProduto = Double.parseDouble(String.valueOf(modeloCarrinho.getValueAt(i, 4)));

            ItemVenda iv = new ItemVenda();
            iv.setCodigoProduto(codigo);
            iv.setDescricao(descricao);
            iv.setQuantidade(qtd);
            iv.setValorUnitario(valorUnitario);
            iv.setValorTotalProduto(valorTotalProduto);
            lista.add(iv);
        }
        return lista;
    }
    
    private void focarSpinner(JSpinner spinner) {
        if (spinner == null) return;

        JComponent editor = spinner.getEditor();
        if (editor instanceof DefaultEditor) {
            JTextField txt = ((DefaultEditor) editor).getTextField();
            txt.requestFocusInWindow();
            txt.selectAll(); // deixa o valor selecionado pra digitar por cima
            
        } else {
            spinner.requestFocusInWindow();
        }
    }
    
}
