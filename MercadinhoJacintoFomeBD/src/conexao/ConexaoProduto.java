package conexao;

import classes.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.tabela.Carregar;

public class ConexaoProduto extends ConexaoBD {
    
    private boolean produtosAtualizados = false;
    
    public void cadastrarProduto(Produto p) {
        String sql = "INSERT INTO produto (codigo, descricao, quantidade, valorUnitario) VALUES (?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, p.getCodigoProduto());
            estado.setString(2, p.getDescricao());
            estado.setInt(3, p.getQuantidade());
            estado.setDouble(4, p.getValorUnitario());
            
            estado.execute();
            
            setProdutosAtualizados(true);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (SQLException ex) {
            if(ex.getMessage().startsWith("ERRO: duplicar valor")){
               JOptionPane.showMessageDialog(null, "Chave primária já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        }
    }
    
    public void atualizarProduto(Produto p){
        String sql= "UPDATE produto SET codigo = ?, descricao = ?, quantidade = ?, valorUnitario = ? WHERE codigo = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, p.getCodigoProduto());
            estado.setString(2, p.getDescricao());
            estado.setInt(3, p.getQuantidade());
            estado.setDouble(4, p.getValorTotal());
            estado.setString(5, p.getCodigoProduto());
            
            estado.execute();       
            
            setProdutosAtualizados(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
    }
    
    public void atualizarQuantidade(String codigo, int quantidade){
        String sql= "UPDATE produto SET quantidade = ? WHERE codigo = ?";
        conectar();
        
        try {

            estado = con.prepareStatement(sql);
            estado.setInt(1, quantidade);
            estado.setString(2, codigo);
            
            estado.execute();       
            
            setProdutosAtualizados(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
    }
    
    public void removerProduto(DefaultTableModel modeloTableProduto, String codigo){
        String sql= "DELETE FROM produto WHERE codigo = ?";
        conectar();
        
        try {
            if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir o produto " + codigo + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                estado = con.prepareStatement(sql);
                estado.setString(1, codigo);

                estado.execute();

                setProdutosAtualizados(true);
                JOptionPane.showMessageDialog(null, "removido com sucesso");
                Carregar.tabelaProdutos(modeloTableProduto);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover");
        }
        
    }
    
    public Produto consultarProduto(String codigo) {
        String sql = "SELECT * FROM produto WHERE codigo = ?";
        conectar();

        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, codigo);
            ResultSet resultado = estado.executeQuery();

            if (resultado.next()) {
                Produto p = new Produto();
                p.setCodigoProduto(resultado.getString("codigo"));
                p.setDescricao(resultado.getString("descricao"));
                p.setQuantidade(resultado.getInt("quantidade"));
                p.setValorUnitario(resultado.getDouble("valorUnitario"));
                return p;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar pelo CODIGO");
        }

        return null; // não encontrado
    }

    
    public ArrayList<Produto> consultarProduto(){
        String sql = "SELECT * FROM produto";
        ResultSet resultado;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            resultado = estado.executeQuery();
            
            while(resultado.next()){
                Produto p = new Produto();
                p.setCodigoProduto(resultado.getString("codigo"));
                p.setDescricao(resultado.getString("descricao"));
                p.setQuantidade(resultado.getInt("quantidade"));
                p.setValorUnitario(resultado.getDouble("valorUnitario"));
                
                lista.add(p);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        
        return lista;
    }

    public boolean isProdutosAtualizados() {
        return produtosAtualizados;
    }

    public void setProdutosAtualizados(boolean produtosAtualizados) {
        this.produtosAtualizados = produtosAtualizados;
    }
}
