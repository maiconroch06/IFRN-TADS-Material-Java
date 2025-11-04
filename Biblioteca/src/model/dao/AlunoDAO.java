package model.dao;

import model.bean.Aluno;
import conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoDAO {

    public void cadastrarAluno(Aluno aluno) {
        
        Conexao con = new Conexao();
        PreparedStatement ps = null;
        
        try {
            String sql = "INSERT INTO aluno (nome, matricula, email, telefone) VALUES (?, ?, ?, ?)";
            
            
            ps = con.getConexao().prepareStatement(sql);

            
            
            
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getMatricula());
            ps.setString(3, aluno.getEmail());
            ps.setString(4, aluno.getTelefone());

            ps.execute();

            /*JOptionPane.showMessageDialog(null, 
                "Aluno cadastrado com sucesso! AlunoDAO",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);*/

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao cadastrar aluno: " + e.getMessage(),
                "Erro no Banco de Dados DAO1",
                JOptionPane.ERROR_MESSAGE);
        } finally { //Será que do jeito que está não precissa deste trecho?
           //con.closeConnection();
        }
    }
    
    
    public ArrayList<Aluno> read() {

        Connection conn;
        Conexao con = new Conexao();
        conn = con.getConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM aluno";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Aluno aluno = new Aluno();
                
                aluno.setID_aluno(rs.getInt("ID_alunos"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setTelefone(rs.getString("telefone"));
                alunos.add(aluno);
                
            }
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao selecionar aluno: " + e.getMessage(),
                "Erro no Banco de Dados",
                JOptionPane.ERROR_MESSAGE);
        } finally {
            con.closeConnection(conn, ps, rs);
        }
        
        return alunos;
        
//        String sql = "SELECT * FROM aluno";
//        ArrayList<Aluno> alunos = new ArrayList<>();
//        
//        try (Connection conn = Conexao.getConexao();
//             PreparedStatement ps = conn.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery()) {
//            
//            while (rs.next()) {
//                
//                Aluno aluno = new Aluno();
//                
//                aluno.setMatricula(rs.getString("matricula"));
//                aluno.setNome(rs.getString("nome"));
//                aluno.setEmail(rs.getString("email"));
//                aluno.setTelefone(rs.getString("telefone"));
//                alunos.add(aluno);
//                
//            }
//                    
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, 
//                "Erro ao cadastrar aluno: " + e.getMessage(),
//                "Erro no Banco de Dados DAO2",
//                JOptionPane.ERROR_MESSAGE);
//        }
//        
//        return alunos;

    }
}