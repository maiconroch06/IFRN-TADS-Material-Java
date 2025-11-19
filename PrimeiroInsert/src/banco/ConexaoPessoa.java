/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anchieta
 */
public class ConexaoPessoa extends ConexaoBD{
    
    public void inserirJoao(){
        String sql = "insert into pessoa (cpf,nome,idade) "
            + "values (000.000.000-02','joão',25)";
        conectar();
        try {
            estado.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir");
        }finally{
            fecharConexao();
        }
    
    }
    
    public void inserirPessoa(String cpf, String nome, int idade){
      String sql = "insert into pessoa (cpf,nome,idade) values (?,?,?)";  
      PreparedStatement estado1;
      conectar();
        try {
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, cpf);
            estado1.setString(2, nome);
            estado1.setInt(3, idade);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao inserir");
        }finally{
            fecharConexao();
        }
    }
    
    
    
    
    
    
    
    
    
    public void atualizarJoao(){
        String sql = "update pessoa set nome = 'josé' where cpf = '000.000.000-01'";
        conectar();
        try {
            estado.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }finally{
            fecharConexao();
        }
    
    }
    
}
