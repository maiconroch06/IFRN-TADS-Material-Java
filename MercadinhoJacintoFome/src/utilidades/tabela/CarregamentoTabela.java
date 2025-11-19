package utilidades.tabela;

import java.util.Map;
import javax.swing.table.DefaultTableModel;
import utilidades.classes.*;

public class CarregamentoTabela {
    
    // CARREGAR PRODUTOS
    public static void carregarTabelaProdutos(DefaultTableModel modelo, Map<String, Produto> produtos) {
        modelo.setRowCount(0);

        for (Produto p : produtos.values()) {
            modelo.addRow(new Object[]{
                p.getCodigoProduto(),
                p.getDescricao(),
                p.getQuantidade(),
                p.getValorUnitario()
            });
        }
    }

    // CARREGAR FUNCIONÁRIOS
    public static void carregarTabelaFuncionarios(DefaultTableModel modelo, Map<String, Funcionario> funcionarios) {
        modelo.setRowCount(0);

        for (Funcionario f : funcionarios.values()) {
            modelo.addRow(new Object[]{
                f.getCPF(),
                f.getNome(),
            });
        }
    }

    // CARREGAR CLIENTES
    public static void carregarTabelaClientes(DefaultTableModel modelo, Map<String, Cliente> clientes) {
        modelo.setRowCount(0);

        for (Cliente c : clientes.values()) {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getTelefone(),
                c.getEndereco()
            });
        }
    }

    // CARREGAR VENDAS
    public static void carregarTabelaVendas(DefaultTableModel modelo, Map<String, Venda> vendas) {
        modelo.setRowCount(0);

        for (Venda v : vendas.values()) {
            modelo.addRow(new Object[]{
                v.getID_Venda(),
                v.getCodigoProduto(),
                v.getQuantidade(),
                v.getValorUnitario()
            });
        }
    }
}
