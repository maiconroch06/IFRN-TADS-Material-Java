package conexao;

import classes.Cliente;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoCliente extends ConexaoBD {
    
    public void cadastrarCliente(Cliente c) {
        String sql = "insert into funcionario (nome, cpf, endereco, telefone) values (?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, c.getNome());
            estado.setString(2, c.getCPF());
            estado.setString(3, c.getEndereco());
            estado.setString(4, c.getTelefone());
            
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
