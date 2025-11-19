/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author anchieta
 */
public class ConexaoBD {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String banco = "primeiro";
    private String host = "localhost";
    private String str_con = "jdbc:mysql://"+host+":3306/"+banco;
    private String usuario = "root";
    private String senha = "malaca";
    
    Connection conexao;
    Statement estado;
        
    public void conectar(){
    
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(str_con, usuario, senha);
            estado = conexao.createStatement();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não encontrou o driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao conectar");
        }
    
    }
    
    public void fecharConexao(){
        try {
            estado.close();
            conexao.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao fechar a conexão");
        }    
    } 
}
