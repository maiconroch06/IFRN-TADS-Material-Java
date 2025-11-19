package utilidades.tabela;

import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.Sistema.Gerenciamento;
import utilidades.classes.*;

public class Pesquisar {
    public void pesqProduto(String codigo, DefaultTableModel jTProduto, Map<String, Produto> produtos, Gerenciamento g) {
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

/*    public void pesquisarCliente(String cpf) {
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
            Carregar.tabelaClientes((DefaultTableModel)TableClientes.getModel(), g.getListaDeClientes());
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
        }
    }

    public void pesquisarFuncionario(String cpf) {
        DefaultTableModel modelo = (DefaultTableModel) TableFuncionarios.getModel();
        modelo.setRowCount(0);

        Funcionario f = g.getListaDeFuncionarios().get(cpf);

        if (f != null) {
            modelo.addRow(new Object[]{
                f.getNome(),
                f.getCPF()
            });
        } else {
            Carregar.tabelaFuncionarios((DefaultTableModel)TableFuncionarios.getModel(), g.getListaDeFuncionarios());
            JOptionPane.showMessageDialog(this, "Funcionário não encontrado");
        }
    }

    public void pesquisarVenda(String id) {
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
            Carregar.tabelaFuncionarios((DefaultTableModel)TableFuncionarios.getModel(), g.getListaDeFuncionarios());
            JOptionPane.showMessageDialog(this, "Venda não encontrada");
        }
    }*/
}
