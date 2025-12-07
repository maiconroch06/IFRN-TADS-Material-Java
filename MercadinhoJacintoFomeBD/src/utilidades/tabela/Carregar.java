package utilidades.tabela;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import classes.*;
import conexao.*;

public class Carregar {
    
    // CARREGAR ORDENAÇÃO NA TABELA
    public static void ordenacao(JTable tabela){
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabela.getModel());
        tabela.setRowSorter(sorter);
        sorter.toggleSortOrder(0);
    }
    
    // CARREGAR ORDENAÇÃO NA TABELA - SELECIONANDO COLUNA
    public static void ordenacao(JTable tabela, int coluna) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabela.getModel());
        tabela.setRowSorter(sorter);
        sorter.toggleSortOrder(coluna);
    }
    
    // CARREGAR PRODUTOS
    public static void tabelaProdutos(DefaultTableModel modeloTableProdutos) {
        ConexaoProduto cp = new ConexaoProduto();
        modeloTableProdutos.setRowCount(0);

        for (Produto p : cp.consultarProduto()) {
            modeloTableProdutos.addRow(new Object[]{
                p.getCodigoProduto(),
                p.getDescricao(),
                p.getQuantidade(),
                p.getValorUnitario()
            });
        }
    }

    // CARREGAR CLIENTES
    public static void tabelaClientes(DefaultTableModel modeloTableCliente) {
        ConexaoCliente cc = new ConexaoCliente();
        modeloTableCliente.setRowCount(0);

        for (Cliente c : cc.consultarCliente()) {
            modeloTableCliente.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getTelefone(),
                c.getEndereco()
            });
        }
    }

    // CARREGAR FUNCIONÁRIOS
    public static void tabelaFuncionarios(DefaultTableModel modeloTableFuncionario) {
        ConexaoFuncionario cf = new ConexaoFuncionario();
        modeloTableFuncionario.setRowCount(0);
         
        for(Funcionario f : cf.consultarFuncionario()) {
            modeloTableFuncionario.addRow(new Object[]{
                f.getNome(),
                f.getCPF()
            });
        }
    }

    // CARREGAR VENDAS
    public static void tabelaVendas(DefaultTableModel modelo) {
        ConexaoVenda cv = new ConexaoVenda();
        modelo.setRowCount(0);

        for(RegistroVenda v : cv.consultarVenda()) {
            modelo.addRow(new Object[]{
                v.getId(),
                v.getCpfFuncionario(),
                v.getCpfCliente(),
                v.getMetodo(),
                v.getQuantidadeTotalItens(),
                String.format("R$ %.2f", v.getTotalValor())
            });
        }
    }
}
