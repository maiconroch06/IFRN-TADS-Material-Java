package utilidades.tabela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.*;
import conexao.*;

public class Pesquisar {
    public static void pesqProduto(DefaultTableModel modeloTableProduto, String codigo) {
        modeloTableProduto.setRowCount(0);

        ConexaoProduto cp = new ConexaoProduto();
        Produto p = cp.consultarProduto(codigo);

        if (p != null) {
            modeloTableProduto.addRow(new Object[]{
                p.getCodigoProduto(),
                p.getDescricao(),
                p.getQuantidade(),
                p.getValorUnitario()
            });
        } else {
            Carregar.tabelaProdutos(modeloTableProduto);
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
    }

    public static void pesqCliente(DefaultTableModel modeloTableCliente, String cpf) {
        modeloTableCliente.setRowCount(0);

        ConexaoCliente cc = new ConexaoCliente();
        Cliente c = cc.consultarCliente(cpf);

        if (c != null) {
            modeloTableCliente.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getEndereco(),
                c.getTelefone()
            });
        } else {
            Carregar.tabelaClientes(modeloTableCliente);
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
    }

    public static void pesqFuncionario(DefaultTableModel modeloTableFuncionario, String cpf) {
        modeloTableFuncionario.setRowCount(0);
        
        ConexaoFuncionario cf = new ConexaoFuncionario();
        Funcionario f = cf.consultarFuncionario(cpf);

        if (f != null) {
            modeloTableFuncionario.addRow(new Object[]{
                f.getNome(),
                f.getCPF()
            });
        } else {
            Carregar.tabelaFuncionarios(modeloTableFuncionario);
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
        }
    }

    public static void pesqVenda(DefaultTableModel modeloTableVenda, String id) {
        modeloTableVenda.setRowCount(0);

        ConexaoVenda cv = new ConexaoVenda();
        RegistroVenda v = cv.consultarVenda(id);

        if (v != null) {
            modeloTableVenda.addRow(new Object[]{
            v.getId(),
            String.format("R$ %.2f", v.getTotalValor()),
            v.getItens().size()
        });
        } else {
            Carregar.tabelaVendas(modeloTableVenda);
            JOptionPane.showMessageDialog(null, "Venda não encontrada");
        }
    }
}
