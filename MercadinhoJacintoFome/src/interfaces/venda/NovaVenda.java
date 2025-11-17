package interfaces.venda;

import classes.Gerenciamento;
import classes.Produto;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class NovaVenda extends javax.swing.JDialog {

    private Gerenciamento g;

    public NovaVenda(Gerenciamento g) {
        this.g = g;
        initComponents();
        carregarTabelaProdutos();
        this.setLocationRelativeTo(this);
        
        ativarOrdenacaoNaTabela(TableProdutos);
        
        //int linha = TableCarrinho.getSelectedRow();
        //jSpinner1.setMaximumSize(Integer.parseInt(TableCarrinho.getModel(getValueAt(linha, 2).toString())));

        // (opcional) permitir duplo-clique para adicionar ao carrinho
        TableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
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
    }
    
    // Ativar onrdenação na primeira coluna
    private void ativarOrdenacaoNaTabela(JTable tabela) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabela.getModel());
        tabela.setRowSorter(sorter);
        sorter.toggleSortOrder(0); // ordena pela 1ª coluna
    }
    
    private void carregarTabelaProdutos() {
        DefaultTableModel modelo = (DefaultTableModel) TableProdutos.getModel();
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
    
    // Pega na linha selecionada da tabela de produto o preço do produto.
    private void atualizarTotalCompra() {
        DefaultTableModel modeloCarrinho = (DefaultTableModel) TableCarrinho.getModel();
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
        DefaultTableModel modeloCarrinho = (DefaultTableModel) TableCarrinho.getModel();
        modeloCarrinho.setRowCount(0); // remove todas as linhas da tabela;
        jLabelTotalDaCompra.setText("0.00"); // reinicia o total da compra;
    }
    
    // obs*: esse metodo importa temporariamente a classe Venda e biblis? 
    private List<classes.Venda> montarVendasDoCarrinho() {
        DefaultTableModel m = (DefaultTableModel) TableCarrinho.getModel();
        List<classes.Venda> lista = new ArrayList<>();
        
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProdutos = new javax.swing.JTable();
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
        TableCarrinho = new javax.swing.JTable();
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

        TableProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        TableProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableProdutos);
        if (TableProdutos.getColumnModel().getColumnCount() > 0) {
            TableProdutos.getColumnModel().getColumn(0).setResizable(false);
            TableProdutos.getColumnModel().getColumn(1).setResizable(false);
            TableProdutos.getColumnModel().getColumn(2).setResizable(false);
            TableProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

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

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

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
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel4.setText("Q. de produto:");

        TableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCarrinho.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TableCarrinho);
        if (TableCarrinho.getColumnModel().getColumnCount() > 0) {
            TableCarrinho.getColumnModel().getColumn(0).setResizable(false);
            TableCarrinho.getColumnModel().getColumn(1).setResizable(false);
            TableCarrinho.getColumnModel().getColumn(2).setResizable(false);
            TableCarrinho.getColumnModel().getColumn(3).setResizable(false);
            TableCarrinho.getColumnModel().getColumn(4).setResizable(false);
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
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int linhaSelecionada = TableProdutos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto da lista!");
            return;
        }

        // Converter índice visual para índice real do modelo da tabela ordenada
        linhaSelecionada = TableProdutos.convertRowIndexToModel(linhaSelecionada);

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

        DefaultTableModel modeloProdutos = (DefaultTableModel) TableProdutos.getModel();
        DefaultTableModel modeloCarrinho = (DefaultTableModel) TableCarrinho.getModel();

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

        // reduzir o estoque visualmente
        modeloProdutos.setValueAt(estoque - quantidadeDesejada, linhaSelecionada, 2);

        // limpa campos
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
        double total = g.obterTotalDaCompra(jLabelTotalDaCompra.getText().trim());
        Pagamento pagGUI = new Pagamento(this, true, g, total);
        pagGUI.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pagGUI.setVisible(true);
        
        if (pagGUI.isFinalizada()) {                                        // //
            List<classes.Venda> itens = montarVendasDoCarrinho(); // //
            String id = g.gerarIDVenda();                       // //
            
            g.salvarVendasDoCarrinho(id, itens);          // //
            g.atualizarEstoque(itens);
            limparCarrinho();                                              // //
            carregarTabelaProdutos();
        }
    }//GEN-LAST:event_btPagamentoActionPerformed

    private void btPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPesquisarKeyPressed
        
    }//GEN-LAST:event_btPesquisarKeyPressed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String codigo = txtCodigo.getText().trim();
        if (codigo.isEmpty()) {
            // mostra todos novamente
            carregarTabelaProdutos();
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) TableProdutos.getModel();
        modelo.setRowCount(0);

        Produto p = g.getListaDeProdutos().get(codigo);
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
            carregarTabelaProdutos();
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linha = TableCarrinho.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um item no carrinho para remover.");
            txtCodigo.setText("");
            jSpinner2.setValue(0);
            return;
        }
        
        // Converter índice visual para índice real do modelo da tabela ordenada
        //linha = TableCarrinho.convertRowIndexToModel(linha); // Somente se tabela do carrinho estiver ordernada

        int quantidadeRemover;
        try {
            quantidadeRemover = Integer.parseInt(jSpinner2.getValue().toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida!");
            return;
        }

        if (quantidadeRemover <= 0) {
            JOptionPane.showMessageDialog(this, "Informe uma quantidade válida para remover!");
            return;
        }

        DefaultTableModel modeloCarrinho = (DefaultTableModel) TableCarrinho.getModel();
        DefaultTableModel modeloProdutos = (DefaultTableModel) TableProdutos.getModel();

        // Dados do item selecionado no carrinho
        String codigoCarrinho = modeloCarrinho.getValueAt(linha, 0).toString();
        int quantidadeAtual = Integer.parseInt(modeloCarrinho.getValueAt(linha, 2).toString());
        double valorUnitario = Double.parseDouble(modeloCarrinho.getValueAt(linha, 3).toString());

        
        if(quantidadeRemover > quantidadeAtual){
        JOptionPane.showMessageDialog(this, "Quantidade inválida! favor selecionar corretamente!");
        }
        // Atualiza o carrinho
        else if (quantidadeRemover == quantidadeAtual) {
            modeloCarrinho.removeRow(linha);
        } else {
            int novaQuantidade = quantidadeAtual - quantidadeRemover;
            double novoTotal = novaQuantidade * valorUnitario;
            modeloCarrinho.setValueAt(novaQuantidade, linha, 2);
            modeloCarrinho.setValueAt(novoTotal, linha, 4);
        }

        // Agora devolve ao estoque (tabela de produtos) - Quando o usuario decide tirar produto do carrinho.
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCarrinho;
    private javax.swing.JTable TableProdutos;
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
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
