package utilidades.tabela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.*;

public class Pesquisar {
    public static void pesqProduto(String codigo, DefaultTableModel modeloTableProduto, Gerenciamento g) {
        modeloTableProduto.setRowCount(0);

        Produto p = g.consultarProduto(codigo);

        if (p != null) {
            modeloTableProduto.addRow(new Object[]{
                p.getCodigoProduto(),
                p.getDescricao(),
                p.getQuantidade(),
                p.getValorUnitario()
            });
            
        } else {
            Carregar.tabelaProdutos(modeloTableProduto, g.getListaDeProdutos());
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
    }

    public static void pesqCliente(String cpf, DefaultTableModel modeloTableCliente, Gerenciamento g) {
        modeloTableCliente.setRowCount(0);

        Cliente c = g.consultarCliente(cpf);

        if (c != null) {
            modeloTableCliente.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getEndereco(),
                c.getTelefone()
            });
            
        } else {
            Carregar.tabelaClientes(modeloTableCliente, g.getListaDeClientes());
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
    }

    public static void pesqFuncionario(String cpf, DefaultTableModel modeloTableFuncionario, Gerenciamento g) {
        modeloTableFuncionario.setRowCount(0);

        Funcionario f = g.consultarFuncionario(cpf);

        if (f != null) {
            modeloTableFuncionario.addRow(new Object[]{
                f.getNome(),
                f.getCPF()
            });
            
        } else {
            Carregar.tabelaFuncionarios(modeloTableFuncionario, g.getListaDeFuncionarios());
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
        }
    }

    public static void pesqVenda(String id, DefaultTableModel modeloTableVenda, Gerenciamento g) {
        modeloTableVenda.setRowCount(0);

        RegistroVenda v = g.consultarVenda(id);

        if (v != null) {
            modeloTableVenda.addRow(new Object[]{
                v.getIdVenda(),
                String.format("R$ %.2f", v.getTotalValor()),
                v.getItensComprados().size()
            });
            
        } else {
            Carregar.tabelaVendas(modeloTableVenda, g.getHistoricoDeVendas());
            JOptionPane.showMessageDialog(null, "Venda não encontrada");
        }
    }
    
}
