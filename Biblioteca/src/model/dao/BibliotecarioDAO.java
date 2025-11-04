package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Bibliotecario;

public class BibliotecarioDAO {
    
    public void cadastrarBibliotecario(Bibliotecario bibli) {
        String sql = "INSERT INTO bibliotecario (nome, CPF, matricula, email, telefone, contratacao) VALUES (?, ?, ?, ?, ?, ?)";
        
        
        try (Connection conn = Conexao.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, bibli.getNome());
            ps.setString(2, bibli.getCPF());
            ps.setString(3, bibli.getMatricula());
            ps.setString(4, bibli.getEmail());
            ps.setString(5, bibli.getTelefone());
            ps.setString(6, bibli.getContratacao());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao cadastrar aluno: " + e.getMessage(),
                "Erro no Banco de Dados",
                JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
