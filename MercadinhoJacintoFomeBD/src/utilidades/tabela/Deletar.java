package utilidades.tabela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.Gerenciamento;

public class Deletar {
    
    public static void deletarProduto(DefaultTableModel modeloTableProduto, int linha, String chave, Gerenciamento g){
        if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir o produto " + chave + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)

            g.removerProduto(chave);
            Carregar.tabelaProdutos(modeloTableProduto, g.getListaDeProdutos());
    }
    
    public static void deletarCliente(DefaultTableModel modeloTableCliente, int linha, String chave, Gerenciamento g){
        if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir o cliente CPF: " + chave + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            g.removerCliente(chave);
            Carregar.tabelaClientes(modeloTableCliente, g.getListaDeClientes());
        }
    }
    
    public static void deletarFuncionario(DefaultTableModel modeloTableFuncionario, int linha, String chave, Gerenciamento g){
        if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir o funcionário CPF: " + chave + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            g.removerFuncionario(chave);
            Carregar.tabelaFuncionarios(modeloTableFuncionario, g.getListaDeFuncionarios());
        }
    }
    
    public static void deletarVenda(DefaultTableModel modeloTabelaVenda, int linha, String chave, Gerenciamento g){
        if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir a venda ID: " + chave + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            g.getHistoricoDeVendas().remove(chave);
            Carregar.tabelaVendas(modeloTabelaVenda, g.getHistoricoDeVendas());
        }
    }
}
