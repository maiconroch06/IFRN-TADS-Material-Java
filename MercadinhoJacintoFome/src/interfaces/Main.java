package interfaces;

import classes.*;
import interfaces.cadastrar.CadFuncionario;
import interfaces.cadastrar.CadProduto;
import interfaces.cadastrar.CadCliente;
import interfaces.venda.NovaVenda;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Main extends javax.swing.JFrame {
    
    private Gerenciamento g = new Gerenciamento();
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);         // Tela main centralizada
        setExtendedState(MAXIMIZED_BOTH); // Tela cheia
        
            JPanel centralizador = new JPanel(new java.awt.GridBagLayout());
            centralizador.setOpaque(false);
            centralizador.add(painelImagem);
            setLayout(new java.awt.BorderLayout());
            add(centralizador, java.awt.BorderLayout.CENTER);

            painelImagem.setLayout(new javax.swing.GroupLayout(painelImagem));
            painelImagem.add(jLabel1);
            painelImagem.add(jLabel2);

            // Atualiza o painel no JFrame
            getContentPane().removeAll();
            getContentPane().add(painelImagem);
            getContentPane().revalidate();
            getContentPane().repaint();

        // Atalhos 1 2 3 4 para as abas
        for (int i = 0; i < 4; i++) {
            final int index = i;
            Abas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(String.valueOf(i + 1)), "tab" + i);

            Abas.getActionMap().put("tab" + i, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Abas.setSelectedIndex(index);
                }
            });
        }

        // Sempre ao executar o main, adicionar valores pre definidos às tabelas
        g.carregarProdutosPadrao();
        g.carregarClientesPadrao();
        g.carregarFuncionariosPadrao();
        // Sempre ao executar o main, atualizar as tabelas
        carregarTabelaProdutos();
        carregarTabelaFuncionarios();
        carregarTabelaClientes();
        carregarTabelaVendas();
        // Sempre ao executar o main, ativar ordernação em todas as tabelas
        ativarOrdenacaoNaTabela(TableProdutos);
        ativarOrdenacaoNaTabela(TableFuncionarios);
        ativarOrdenacaoNaTabela(TableVendas);
        ativarOrdenacaoNaTabela(TableClientes);

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
                C.getCPF(),
                C.getNome(),
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        painelImagem = new javax.swing.JPanel();
        Abas = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProdutos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFuncionarios = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableVendas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnNovaVenda = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnCadProduto = new javax.swing.JMenuItem();
        mnCadFuncionario = new javax.swing.JMenuItem();
        mnCliente = new javax.swing.JMenuItem();
        btnMnMais = new javax.swing.JMenu();
        mnAtualizar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

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
        jScrollPane3.setViewportView(TableProdutos);

        Abas.addTab("Tabela de Produtos", jScrollPane3);

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                "CPF", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jScrollPane4.setViewportView(TableVendas);

        Abas.addTab("Tabela de Vendas", jScrollPane4);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mercadinho Jacinto Fome");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle de Estoque");

        javax.swing.GroupLayout painelImagemLayout = new javax.swing.GroupLayout(painelImagem);
        painelImagem.setLayout(painelImagemLayout);
        painelImagemLayout.setHorizontalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(Abas, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelImagemLayout.setVerticalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Abas, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jMenu3.setText("Menu");

        mnNovaVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnNovaVenda.setText("N. VENDA");
        mnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovaVendaActionPerformed(evt);
            }
        });
        jMenu3.add(mnNovaVenda);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Cadastrar");

        mnCadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mnCadProduto.setText("Produto");
        mnCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadProdutoActionPerformed(evt);
            }
        });
        jMenu4.add(mnCadProduto);

        mnCadFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        mnCadFuncionario.setText("Funcionario");
        mnCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadFuncionarioActionPerformed(evt);
            }
        });
        jMenu4.add(mnCadFuncionario);

        mnCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenu4.add(mnCliente);

        jMenuBar2.add(jMenu4);

        btnMnMais.setText("Mais");
        btnMnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMnMaisActionPerformed(evt);
            }
        });

        mnAtualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mnAtualizar.setText("Atualizar");
        mnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAtualizarActionPerformed(evt);
            }
        });
        btnMnMais.add(mnAtualizar);

        jMenu6.setText("jMenu6");

        jMenuItem2.setText("jMenuItem2");
        jMenu6.add(jMenuItem2);

        jMenuItem1.setText("jMenuItem1");
        jMenu6.add(jMenuItem1);

        btnMnMais.add(jMenu6);

        jMenuBar2.add(btnMnMais);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnMnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMnMaisActionPerformed
        carregarTabelaProdutos();
        carregarTabelaFuncionarios();
        carregarTabelaClientes();
    }//GEN-LAST:event_btnMnMaisActionPerformed

    private void TableClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TableClientesFocusGained

    }//GEN-LAST:event_TableClientesFocusGained

    private void mnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAtualizarActionPerformed
        carregarTabelaProdutos();
        carregarTabelaFuncionarios();
        carregarTabelaClientes();
    }//GEN-LAST:event_mnAtualizarActionPerformed

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
    private javax.swing.JMenu btnMnMais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem mnAtualizar;
    private javax.swing.JMenuItem mnCadFuncionario;
    private javax.swing.JMenuItem mnCadProduto;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnNovaVenda;
    private javax.swing.JPanel painelImagem;
    // End of variables declaration//GEN-END:variables
}
