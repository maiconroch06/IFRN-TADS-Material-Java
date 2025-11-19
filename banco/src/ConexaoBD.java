

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1037100
 */
public class ConexaoBD {
    
    String banco = "concessionaria";
    String host = "localhost";
    String driver ="org.postgresql.Driver";
    String str_con = "jdbc:postgresql://"+host+":5432/"+banco;
    String usuario = "postgres";
    String senha = "ifrn";
    
    
    Connection con;
    PreparedStatement estado;
    
    public void conectar(){
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(str_con, usuario, senha);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar o driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar");
        }
                
    }
    
    
    public void fecharConexao(){
        try {
            estado.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão");
        }
    }
    
}
