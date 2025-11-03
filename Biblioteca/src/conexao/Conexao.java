package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD  = "";
    
    private static Connection conn;
    
    public static Connection getConexao () {
        try {
            if (conn == null) { // Caso a conexão não tenha sido criada, ele cria.
                return conn = DriverManager.getConnection(URL, USER, PASSWORD);
            } else {
                return conn;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao conectar com o banco: " + e.getMessage(),
                "Erro no Banco de Dados",
                JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Erro ao fechar a conexão: " + e.getMessage(),
                "Erro no Banco de Dados",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps) {
        
        closeConnection(conn);
        
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Erro ao fechar a conexão: " + e.getMessage(),
                "Erro no Banco de Dados",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) {
        
        closeConnection(conn, ps);
        
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Erro ao fechar a conexão: " + e.getMessage(),
                "Erro no Banco de Dados",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
// metodo de gpt, qual a diferença???
//    public static void fecharConexao() {
//        try {
//            if (conn != null && !conn.isClosed()) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null,
//                "Erro ao fechar a conexão: " + e.getMessage(),
//                "Erro no Banco de Dados",
//                JOptionPane.ERROR_MESSAGE);
//        }
//    }
}
