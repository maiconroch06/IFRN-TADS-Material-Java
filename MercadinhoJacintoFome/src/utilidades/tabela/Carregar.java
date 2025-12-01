package utilidades.tabela;

import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import classes.*;

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
    public static void tabelaProdutos(DefaultTableModel modelo, HashMap<String, Produto> produtos) {
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

    // CARREGAR CLIENTES
    public static void tabelaClientes(DefaultTableModel modeloTableProduto, HashMap<String, Cliente> clientes) {
        modeloTableProduto.setRowCount(0);

        for (Cliente c : clientes.values()) {
            modeloTableProduto.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getTelefone(),
                c.getEndereco()
            });
        }
    }

    // CARREGAR FUNCIONÁRIOS
    public static void tabelaFuncionarios(DefaultTableModel modeloTableFuncionario, HashMap<String, Funcionario> funcionarios) {
        modeloTableFuncionario.setRowCount(0);

        for (Funcionario f : funcionarios.values()) {
            modeloTableFuncionario.addRow(new Object[]{
                f.getNome(),
                f.getCPF()
            });
        }
    }

    // CARREGAR VENDAS
    public static void tabelaVendas(DefaultTableModel modelo, HashMap<String, RegistroVenda> vendas) {
        modelo.setRowCount(0);

        for(RegistroVenda v : vendas.values()) {
            modelo.addRow(new Object[]{
                v.getId(),
                v.getNomeFuncionario(),
                v.getNomeCliente(),
                v.getQuantidadeTotalItens(),  // Quantidade Total de itens
                String.format("R$ %.2f", v.getTotal())  // Valor Total
            });
        }
    }
}
