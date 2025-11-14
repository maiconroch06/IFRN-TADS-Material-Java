package interfaces;

import interfaces.atualizar.VerMais;
import classes.*;
import interfaces.atualizar.*;
import interfaces.cadastrar.*;
import interfaces.venda.NovaVenda;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Main extends javax.swing.JFrame {
    
    private Gerenciamento g = new Gerenciamento();
    public static String codigoSelecionado = null;

    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);      // Tela main centralizada
        setExtendedState(MAXIMIZED_BOTH); // Tela cheia

            painelImagem.setLayout(new javax.swing.GroupLayout(painelImagem));
            painelImagem.add(jLabel1);
            painelImagem.add(jLabel2);

            // Atualiza o painel no JFrame
            getContentPane().removeAll();
            getContentPane().add(painelImagem);
            getContentPane().revalidate();
            getContentPane().repaint();

        // Sempre ao executar o main, adicionar valores pre definidos às tabelas
        g.carregarProdutosPadrao();
        g.carregarClientesPadrao();
        g.carregarFuncionariosPadrao();
        
        verMais(TableClientes);
        verMais(TableFuncionarios);
        verMais(TableProdutos);
        verMais(TableVendas);
        
        // Sempre ao executar o main, atualiza a tabela
        carregarTabelaProdutos();
        
        // Sempre ao executar o main, ativar ordernação em todas as tabelas
        ativarOrdenacaoNaTabela(TableProdutos);
        ativarOrdenacaoNaTabela(TableFuncionarios);
        ativarOrdenacaoNaTabela(TableClientes);
        ativarOrdenacaoNaTabela(TableVendas);
        
        // Habilida a função de sempre mostrar lista inteira, mesmo depois de ter feito uma pesquisa anteriomente.
        Abas.addChangeListener(e -> {
            int index = Abas.getSelectedIndex();

            switch (index) {
                case 0: // Produtos
                    carregarTabelaProdutos();
                    break;

                case 1: // Clientes
                    carregarTabelaClientes();
                    break;

                case 2: // Funcionários
                    carregarTabelaFuncionarios();
                    break;

                case 3: // Vendas
                    carregarTabelaVendas();
                    break;
            }
        });
    }
    
    public void verMais(JTable tabela) {
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {

                    // AQUI IDENTIFICA QUAL TABELA É
                    if (tabela == TableProdutos) {
                        int linha = tabela.getSelectedRow();
                        codigoSelecionado = tabela.getValueAt(linha, 0).toString();

                        AtuProduto AtualizarProd = new AtuProduto(g);

                        AtualizarProd.setModal(true);
                        AtualizarProd.setVisible(true);
                    }

                    else if (tabela == TableFuncionarios) {
                        int linha = tabela.getSelectedRow();
                        codigoSelecionado = tabela.getValueAt(linha, 1).toString();
                        
                        AtuFuncionario AtualizarFun = new AtuFuncionario(g);

                        AtualizarFun.setModal(true);
                        AtualizarFun.setVisible(true);
                    }
                    
                    else if (tabela == TableClientes) {
                        int linha = tabela.getSelectedRow();
                        codigoSelecionado = tabela.getValueAt(linha, 1).toString();
                        
                        AtuCliente AtualizarCli = new AtuCliente(g);

                        AtualizarCli.setModal(true);
                        AtualizarCli.setVisible(true);
                    }

                    else if (tabela == TableVendas) {
                        VerMais vm = new VerMais(g);
                        
                        vm.setModal(true);
                        vm.setVisible(true);
                    }
                }
            }
        });
    }

    
    // Ativar onrdenação na primeira coluna
    private void ativarOrdenacaoNaTabela(JTable tabela) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabela.getModel());
        tabela.setRowSorter(sorter);
        sorter.toggleSortOrder(0); // ordena pela 1ª coluna
    }
    
    
    public void carregarTabelaProdutos() {
        DefaultTableModel modelo = (DefaultTableModel) TableProdutos.getModel();
        modelo.setRowCount(0); // limpa a tabela antes de preencher

        for (Produto p : g.getListaDeProdutos().values()) {
            modelo.addRow(new Object[] {
                p.getCodigoProduto(),
                p.getDescricao(),
                p.getQuantidade(),
                p.getValorUnitario()
            });
        }
    }
    
    public void carregarTabelaFuncionarios() {
        DefaultTableModel modelo = (DefaultTableModel) TableFuncionarios.getModel();
        modelo.setRowCount(0);

        for (Funcionario f : g.getListaDeFuncionarios().values()) {
            modelo.addRow(new Object[] {
                f.getNome(),
                f.getCPF()
            });
        }
    }
    
    public void carregarTabelaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) TableClientes.getModel();
        modelo.setRowCount(0);

        for (Cliente C : g.getListaDeClientes().values()) {
            modelo.addRow(new Object[] {
                C.getNome(),
                C.getCPF(),
                C.getEndereco(),
                C.getTelefone()
            });
        }
    }
    
    public void carregarTabelaVendas() {
        javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) TableVendas.getModel();
        modelo.setRowCount(0);
        for (classes.Venda v : g.getListaDeVendas().values()) {
            modelo.addRow(new Object[] {
                v.getID_Venda(),
                v.getCodigoProduto(),
                v.getQuantidade(),
                v.getValorUnitario(),
                v.getValorTotal()
            });
        }
    }
    
    private void pesquisarProduto(String codigo) {
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
            carregarTabelaProdutos();
            JOptionPane.showMessageDialog(this, "Produto não encontrado");
        }
    }

    private void pesquisarCliente(String cpf) {
        DefaultTableModel modelo = (DefaultTableModel) TableClientes.getModel();
        modelo.setRowCount(0);

        Cliente c = g.getListaDeClientes().get(cpf);

        if (c != null) {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getEndereco(),
                c.getTelefone()
            });
        } else {
            carregarTabelaClientes();
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
        }
    }

    private void pesquisarFuncionario(String cpf) {
        DefaultTableModel modelo = (DefaultTableModel) TableFuncionarios.getModel();
        modelo.setRowCount(0);

        Funcionario f = g.getListaDeFuncionarios().get(cpf);

        if (f != null) {
            modelo.addRow(new Object[]{
                f.getNome(),
                f.getCPF()
            });
        } else {
            carregarTabelaFuncionarios();
            JOptionPane.showMessageDialog(this, "Funcionário não encontrado");
        }
    }

    private void pesquisarVenda(String id) {
        DefaultTableModel modelo = (DefaultTableModel) TableVendas.getModel();
        modelo.setRowCount(0);

        Venda v = g.getListaDeVendas().get(id);

        if (v != null) {
            modelo.addRow(new Object[]{
                v.getID_Venda(),
                v.getCodigoProduto(),
                v.getQuantidade(),
                v.getValorUnitario(),
                v.getValorTotal()
            });
        } else {
            carregarTabelaVendas();
            JOptionPane.showMessageDialog(this, "Venda não encontrada");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        painelImagem = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Abas = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProdutos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFuncionarios = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableVendas = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        txtReferencia = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnNovaVenda = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mnCadProduto = new javax.swing.JMenuItem();
        mnCliente = new javax.swing.JMenuItem();
        mnCadFuncionario = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        mnAtuProduto = new javax.swing.JMenuItem();
        mnAtuCliente = new javax.swing.JMenuItem();
        mnAtuFuncionario = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelImagem = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                java.awt.Image img = new javax.swing.ImageIcon(
                    getClass().getResource("/interfaces/fundinhoAR.jpg")
                ).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        TableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Produto", "Descrição", "Quantidade (Un)", "Valor Unitario (R$)"
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
        jScrollPane3.setViewportView(TableProdutos);
        if (TableProdutos.getColumnModel().getColumnCount() > 0) {
            TableProdutos.getColumnModel().getColumn(0).setResizable(false);
            TableProdutos.getColumnModel().getColumn(1).setResizable(false);
            TableProdutos.getColumnModel().getColumn(2).setResizable(false);
            TableProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

        Abas.addTab("Tabela de Produtos", jScrollPane3);

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableClientes.getTableHeader().setReorderingAllowed(false);
        TableClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableClientesFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(TableClientes);

        Abas.addTab("Tabela de Clientes", jScrollPane2);

        TableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableFuncionarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableFuncionarios);

        Abas.addTab("Tabela de Funcionario", jScrollPane1);

        TableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Venda", "Codigo Produto", "Quantidade", "Valor Unitario (R$)", "Valor Total (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableVendas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TableVendas);

        Abas.addTab("Tabela de Vendas", jScrollPane4);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Abas, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtReferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Abas, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mercadinho Jacinto Fome");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle de Estoque");

        javax.swing.GroupLayout painelImagemLayout = new javax.swing.GroupLayout(painelImagem);
        painelImagem.setLayout(painelImagemLayout);
        painelImagemLayout.setHorizontalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelImagemLayout.setVerticalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jMenu7.setText("Operações");

        mnNovaVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnNovaVenda.setText("Nova Venda");
        mnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovaVendaActionPerformed(evt);
            }
        });
        jMenu7.add(mnNovaVenda);

        jMenu8.setText("Cadastrar");

        mnCadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mnCadProduto.setText("Produto");
        mnCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadProdutoActionPerformed(evt);
            }
        });
        jMenu8.add(mnCadProduto);

        mnCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenu8.add(mnCliente);

        mnCadFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        mnCadFuncionario.setText("Funcionario");
        mnCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadFuncionarioActionPerformed(evt);
            }
        });
        jMenu8.add(mnCadFuncionario);

        jMenu7.add(jMenu8);

        jMenu9.setText("Atualizar");

        mnAtuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mnAtuProduto.setText("Produto");
        mnAtuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAtuProdutoActionPerformed(evt);
            }
        });
        jMenu9.add(mnAtuProduto);

        mnAtuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        mnAtuCliente.setText("Cliente");
        mnAtuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAtuClienteActionPerformed(evt);
            }
        });
        jMenu9.add(mnAtuCliente);

        mnAtuFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        mnAtuFuncionario.setText("Funcionario");
        mnAtuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAtuFuncionarioActionPerformed(evt);
            }
        });
        jMenu9.add(mnAtuFuncionario);

        jMenu7.add(jMenu9);

        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovaVendaActionPerformed
        NovaVenda vendaGUI = new NovaVenda(g);
        vendaGUI.setModal(true);
        vendaGUI.setVisible(true);
        
        carregarTabelaVendas();
    }//GEN-LAST:event_mnNovaVendaActionPerformed

    private void mnCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadProdutoActionPerformed
        CadProduto cadVGUI = new CadProduto(g);
        cadVGUI.setModal(true);
        cadVGUI.setVisible(true);
        
        carregarTabelaProdutos();
    }//GEN-LAST:event_mnCadProdutoActionPerformed

    private void mnCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadFuncionarioActionPerformed
        CadFuncionario cadFGUI = new CadFuncionario(g);
        cadFGUI.setModal(true);
        cadFGUI.setVisible(true);
        
        carregarTabelaFuncionarios();
    }//GEN-LAST:event_mnCadFuncionarioActionPerformed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        CadCliente cadCGUI = new CadCliente(g);
        cadCGUI.setModal(true);
        cadCGUI.setVisible(true);

        carregarTabelaClientes();
    }//GEN-LAST:event_mnClienteActionPerformed

    private void TableClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TableClientesFocusGained

    }//GEN-LAST:event_TableClientesFocusGained

    private void mnAtuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAtuProdutoActionPerformed
        AtuProduto AtualizarProd = new AtuProduto(g);
        AtualizarProd.setModal(true);
        AtualizarProd.setVisible(true);
        
        carregarTabelaProdutos();
    }//GEN-LAST:event_mnAtuProdutoActionPerformed

    private void mnAtuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAtuFuncionarioActionPerformed
        AtuFuncionario AtualizarFun = new AtuFuncionario(g);
        AtualizarFun.setModal(true);
        AtualizarFun.setVisible(true);

        carregarTabelaFuncionarios();
    }//GEN-LAST:event_mnAtuFuncionarioActionPerformed

    private void mnAtuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAtuClienteActionPerformed
        AtuCliente AtualizarCli = new AtuCliente(g);
        AtualizarCli.setModal(true);
        AtualizarCli.setVisible(true);
        
        carregarTabelaClientes();
    }//GEN-LAST:event_mnAtuClienteActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String ref = txtReferencia.getText().trim(); // chave que o usuario procura
        int index = Abas.getSelectedIndex();         // indice da aba atual aberta

        switch (index) {

            // ------------------- PRODUTOS -------------------
            case 0:
                if (ref.isEmpty()) {
                    carregarTabelaProdutos();
                    return;
                }
                pesquisarProduto(ref);
                break;

            // ------------------- CLIENTES -------------------
            case 1:
                if (ref.isEmpty()) {
                    carregarTabelaClientes();
                    return;
                }
                pesquisarCliente(ref);
                break;

            // ------------------- FUNCIONÁRIOS -------------------
            case 2:
                if (ref.isEmpty()) {
                    carregarTabelaFuncionarios();
                    return;
                }
                pesquisarFuncionario(ref);
                break;

            // ------------------- VENDAS -------------------
            case 3:
                if (ref.isEmpty()) {
                    carregarTabelaVendas();
                    return;
                }
                pesquisarVenda(ref);
                break;
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int aba = Abas.getSelectedIndex(); // Identifica aba atual
        int linha = -1;
        String chave = "";

        switch (aba) {
            // ---------------------- PRODUTOS ----------------------
            case 0:
                linha = TableProdutos.getSelectedRow();
                if (linha == -1) {
                    JOptionPane.showMessageDialog(this, "Selecione um produto para excluir!");
                    return;
                }

                // Pega chave (codigo do produto) da 1ª coluna
                chave = TableProdutos.getValueAt(linha, 0).toString();

                // Confirma antes de excluir
                if (JOptionPane.showConfirmDialog(this,
                        "Deseja excluir o produto " + chave + "?",
                        "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    g.removerProduto(chave);
                    carregarTabelaProdutos();
                }
                break;

            // ---------------------- CLIENTES ----------------------
            case 1:
                linha = TableClientes.getSelectedRow();
                if (linha == -1) {
                    JOptionPane.showMessageDialog(this, "Selecione um cliente para excluir!");
                    return;
                }

                // chave = CPF (2ª coluna)
                chave = TableClientes.getValueAt(linha, 1).toString();

                if (JOptionPane.showConfirmDialog(this,
                        "Deseja excluir o cliente CPF: " + chave + "?",
                        "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    g.removerCliente(chave);
                    carregarTabelaClientes();
                }
                break;

            // ---------------------- FUNCIONÁRIOS ----------------------
            case 2:
                linha = TableFuncionarios.getSelectedRow();
                if (linha == -1) {
                    JOptionPane.showMessageDialog(this, "Selecione um funcionário para excluir!");
                    return;
                }

                // chave = CPF (2ª coluna)
                chave = TableFuncionarios.getValueAt(linha, 1).toString();

                if (JOptionPane.showConfirmDialog(this,
                        "Deseja excluir o funcionário CPF: " + chave + "?",
                        "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    g.removerFuncionario(chave);
                    carregarTabelaFuncionarios();
                }
                break;

            // ---------------------- VENDAS ----------------------
            case 3:
                linha = TableVendas.getSelectedRow();
                if (linha == -1) {
                    JOptionPane.showMessageDialog(this, "Selecione uma venda para excluir!");
                    return;
                }

                // chave = ID_Venda (1ª coluna)
                chave = TableVendas.getValueAt(linha, 0).toString();

                if (JOptionPane.showConfirmDialog(this,
                        "Deseja excluir a venda ID: " + chave + "?",
                        "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    g.getListaDeVendas().remove(chave);
                    carregarTabelaVendas();
                }
                break;
        }
    }//GEN-LAST:event_btExcluirActionPerformed

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


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abas;
    private javax.swing.JTable TableClientes;
    private javax.swing.JTable TableFuncionarios;
    private javax.swing.JTable TableProdutos;
    private javax.swing.JTable TableVendas;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem mnAtuCliente;
    private javax.swing.JMenuItem mnAtuFuncionario;
    private javax.swing.JMenuItem mnAtuProduto;
    private javax.swing.JMenuItem mnCadFuncionario;
    private javax.swing.JMenuItem mnCadProduto;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnNovaVenda;
    private javax.swing.JPanel painelImagem;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
