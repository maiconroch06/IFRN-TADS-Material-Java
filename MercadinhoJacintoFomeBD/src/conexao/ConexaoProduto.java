package conexao;

import classes.Produto;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoProduto extends ConexaoBD {
    
    public void cadastrarFuncionario(Produto p) {
        String sql = "insert into produto (codigo, descricao, quantidade, valorUnitario) values (?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, p.getCodigoProduto());
            estado.setString(2, p.getDescricao());
            estado.setInt(3, p.getQuantidade());
            estado.setDouble(4, p.getValorUnitario());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (SQLException ex) {
            if(ex.getMessage().startsWith("ERRO: duplicar valor")){
               JOptionPane.showMessageDialog(null, "Chave primária já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        }
    }
    
}
