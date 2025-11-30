package utilidades.tabela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.Sistema.Gerenciamento;
import utilidades.classes.*;

public class Pesquisar {
    public static void pesqProduto(String codigo, DefaultTableModel jTProduto, Gerenciamento g) {
        jTProduto.setRowCount(0);

        Produto p = g.getListaDeProdutos().get(codigo);

        if (p != null) {
            jTProduto.addRow(new Object[]{
                p.getCodigoProduto(),
                p.getDescricao(),
                p.getQuantidade(),
                p.getValorUnitario()
            });
        } else {
            Carregar.tabelaProdutos(jTProduto, g.getListaDeProdutos());
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
    }

    public static void pesqCliente(String cpf, DefaultTableModel jTCliente, Gerenciamento g) {
        jTCliente.setRowCount(0);

        Cliente c = g.getListaDeClientes().get(cpf);

        if (c != null) {
            jTCliente.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getEndereco(),
                c.getTelefone()
            });
        } else {
            Carregar.tabelaClientes(jTCliente, g.getListaDeClientes());
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
    }

    public static void pesqFuncionario(String cpf, DefaultTableModel jTFuncionario, Gerenciamento g) {
        jTFuncionario.setRowCount(0);

        Funcionario f = g.getListaDeFuncionarios().get(cpf);

        if (f != null) {
            jTFuncionario.addRow(new Object[]{
                f.getNome(),
                f.getCPF()
            });
        } else {
            Carregar.tabelaFuncionarios(jTFuncionario, g.getListaDeFuncionarios());
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
        }
    }

    public static void pesqVenda(String id, DefaultTableModel jTVenda, Gerenciamento g) {
        jTVenda.setRowCount(0);

        Venda v = g.getListaDeVendas().get(id);

        if (v != null) {
            jTVenda.addRow(new Object[]{
                v.getID_Venda(),
                v.getCodigoProduto(),
                v.getQuantidade(),
                v.getValorUnitario(),
                v.getValorTotal()
            });
        } else {
            Carregar.tabelaVendas(jTVenda, g.getListaDeVendas());
            JOptionPane.showMessageDialog(null, "Venda não encontrada");
        }
    }
}
