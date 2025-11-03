package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Livro;

public class LivroDAO {
    
    public void cadastrarLivro(Livro livro) {
        String sql = "INSERT INTO livro (CDU, ISBN, titulo, autor, editora, ano) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = Conexao.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, livro.getCDU());
            ps.setString(2, livro.getISBN());
            ps.setString(3, livro.getTitulo());
            ps.setString(4, livro.getAutor());
            ps.setString(5, livro.getEditora());
            ps.setString(6, livro.getAnoPublicacao());
            
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao cadastrar aluno: " + e.getMessage(),
                "Erro no Banco de Dados",
                JOptionPane.ERROR_MESSAGE);
        }
    }
}
