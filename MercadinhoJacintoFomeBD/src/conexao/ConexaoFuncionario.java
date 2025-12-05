package conexao;

import classes.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConexaoFuncionario extends ConexaoBD {
    
    public void cadastrarFuncionario(Funcionario f) {
        String sql = "insert into funcionario (nome, cpf) values (?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, f.getNome());
            estado.setString(2, f.getCPF());
            
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
    
    public void atualizar(Funcionario f){
        String sql= "update funcionario set nome = ?, cpf = ? where cpf = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, f.getNome());
            estado.setString(2, f.getCPF());
            
            estado.execute();       
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
        
    }
    
    public void remover(Funcionario f){
        String sql= "delete from carro where placa = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, f.getCPF());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "removido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover");
        }
        
    }
    
    public ArrayList<Funcionario> consulta(){
        String sql = "select * from funcionario";
        ResultSet resultado;
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            resultado = estado.executeQuery();
            
            while(resultado.next()){
                Funcionario f = new Funcionario();
                f.setNome(resultado.getString("placa"));
                f.setCPF(resultado.getString("modelo"));
                
                lista.add(f);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        
        return lista;
    }
}
