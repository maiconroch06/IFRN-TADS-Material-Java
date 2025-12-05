package conexao;

import classes.RegistroVenda;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoVenda extends ConexaoBD {

    public void cadastrarVenda(RegistroVenda v) {
        String sql = "insert into historicoVenda (cpfFuncionario, cpfCliente, metodo, quantidade, total) values (?,?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, v.getCpfFuncionario());
            estado.setString(2, v.getCpfCliente());
            estado.setString(3, v.getMetodo());
            estado.setInt(4, v.getQuantidadeTotalItens());
            estado.setDouble(5, v.getTotal());
            
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
