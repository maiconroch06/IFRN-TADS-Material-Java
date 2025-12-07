package interfaces.atualizar;

import classes.ItemVenda;
import classes.RegistroVenda;
import conexao.ConexaoVenda;
import java.awt.Frame;
import javax.swing.table.DefaultTableModel;

public class VerMais extends javax.swing.JDialog {    
    
    private RegistroVenda venda;
    ConexaoVenda conexaoVenda;
    
//    public VerMais(ConexaoVenda conexaoVenda) {
//        initComponents();
//        this.setLocationRelativeTo(this);
//        this.conexaoVenda = conexaoVenda;
//    }

    public VerMais(Frame parent, boolean modal, ConexaoVenda conexaoVenda, RegistroVenda venda) {
        super(parent, modal);
        this.setLocationRelativeTo(this);
        initComponents();
        carregarDados();
        this.venda = venda;
        this.conexaoVenda = conexaoVenda;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JLabel();
        Atendente = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCompra = new javax.swing.JTable();
        ttCompra = new javax.swing.JLabel();
        txtTotalCompra = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        txtIdVenda = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtMetodoPagamento = new javax.swing.JLabel();
        metodoPag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Compras");

        Cliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cliente.setText("Cliente:");

        txtNomeCliente.setText("'nome'");

        Atendente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Atendente.setText("Atendente:");

        txtNomeFuncionario.setText("'nome funcionario'");

        TableCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCompra.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableCompra);
        if (TableCompra.getColumnModel().getColumnCount() > 0) {
            TableCompra.getColumnModel().getColumn(0).setResizable(false);
            TableCompra.getColumnModel().getColumn(1).setResizable(false);
            TableCompra.getColumnModel().getColumn(2).setResizable(false);
            TableCompra.getColumnModel().getColumn(3).setResizable(false);
            TableCompra.getColumnModel().getColumn(4).setResizable(false);
        }

        ttCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ttCompra.setText("Total da Compra: R$");

        txtTotalCompra.setText("00,00");

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id.setText("ID:");

        txtIdVenda.setText("'1'");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtMetodoPagamento.setText("'Método de Pagamento'");

        metodoPag.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        metodoPag.setText("Método:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(metodoPag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetodoPagamento)
                        .addGap(18, 18, 18)
                        .addComponent(ttCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalCompra))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Atendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(metodoPag)
                        .addComponent(txtMetodoPagamento))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cliente)
                        .addComponent(txtNomeCliente)
                        .addComponent(ttCompra)
                        .addComponent(txtTotalCompra)
                        .addComponent(id)
                        .addComponent(txtIdVenda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Atendente)
                        .addComponent(txtNomeFuncionario))
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JLabel Cliente;
    private javax.swing.JTable TableCompra;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel metodoPag;
    private javax.swing.JLabel ttCompra;
    private javax.swing.JLabel txtIdVenda;
    private javax.swing.JLabel txtMetodoPagamento;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JLabel txtNomeFuncionario;
    private javax.swing.JLabel txtTotalCompra;
    // End of variables declaration//GEN-END:variables

    //Métodos
    private void carregarDados() {
        DefaultTableModel model = (DefaultTableModel) TableCompra.getModel();
        model.setRowCount(0);

        for(ItemVenda item : venda.getItens()) {
            model.addRow(new Object[]{
                item.getCodigoProduto(),
                item.getDescricao(),
                item.getQuantidade(),
                item.getValorUnitario(),
                item.getValorTotal()
            });
        }
        txtIdVenda.setText(venda.getId());
        txtTotalCompra.setText(String.format("R$ %.2f", venda.getTotalValor()));
        txtNomeCliente.setText(venda.getCpfCliente());
        txtNomeFuncionario.setText(venda.getCpfFuncionario());
        txtMetodoPagamento.setText(venda.getMetodo());
    }
}


