package conexao;

import classes.Funcionario;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.tabela.Carregar;

public class ConexaoFuncionario extends ConexaoBD {
    
    private boolean funcionariosAtualizados = false;
        
    public void cadastrarFuncionario(Funcionario f) {
        String sql = "INSERT INTO funcionario (nome, cpf) VALUES (?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, f.getNome());
            estado.setString(2, f.getCPF());
            
            estado.execute();
            
            setFuncionariosAtualizados(true);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (SQLException ex) {
            if(ex.getMessage().startsWith("ERRO: duplicar valor")){
               JOptionPane.showMessageDialog(null, "Chave primária já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        }
    }
    
//    public void cadastrarFuncionario(Funcionario f) {
//        String sql = "INSERT INTO funcionario (nome, cpf) VALUES (?, ?)";
//        conectar(); // pressupõe que 'con' fica disponível
//
//        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
//            ps.setString(1, f.getNome());
//            ps.setString(2, f.getCPF());
//
//            int affected = ps.executeUpdate();
//
//            if (affected == 0) {
//                JOptionPane.showMessageDialog(null, "Nenhuma linha inserida.");
//                return;
//            }
//
//            try (ResultSet keys = ps.getGeneratedKeys()) {
//                if (keys.next()) {
//                    int idGerado = keys.getInt(1);
//                    // se quiser armazenar no objeto:
//                    // f.setId(idGerado);
//                }
//            }
//
//            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
//        } catch (SQLException ex) {
//            // Diagnóstico mais claro: mostra a mensagem real do banco no diálogo
//            String msg = ex.getMessage() == null ? ex.toString() : ex.getMessage();
//
//            // Tratamento específico para duplicata (MySQL error 1062; Postgres tem outra mensagem)
//            if (msg.toLowerCase().contains("duplicate") || msg.contains("1062")) {
//                JOptionPane.showMessageDialog(null, "CPF já existe (registro duplicado).");
//            } else {
//                JOptionPane.showMessageDialog(null, "Erro ao inserir: " + msg);
//            }
//
//            // opcional: imprimir stacktrace no console para debug
//            ex.printStackTrace();
//        } finally {
//            // se seu conectar() não usar try-with-resources, você pode fechar aqui
//            // desconectar();  // apenas se for o padrão do seu projeto
//        }
//    }
    
    public void atualizarFuncionario(Funcionario f){
        String sql= "UPDATE funcionario SET nome = ?, cpf = ? WHERE cpf = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, f.getNome());
            estado.setString(2, f.getCPF());
            estado.setString(3, f.getCPF());
            
            estado.execute();       
            
            setFuncionariosAtualizados(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
        
    }
    
    public void removerFuncionario(DefaultTableModel modeloTableFuncionario, String cpf){
        String sql= "DELETE FROM funcionario WHERE cpf = ?";
        conectar();
        
        try {
            if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir o funcionario CPF: " + cpf + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "removido com sucesso");
            
                estado = con.prepareStatement(sql);
                estado.setString(1, cpf);
            
                estado.execute();

                setFuncionariosAtualizados(true);
                JOptionPane.showMessageDialog(null, "removido com sucesso");
                Carregar.tabelaFuncionarios(modeloTableFuncionario);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover");
        }
        
    }
    
    public Funcionario consultarFuncionario(String cpf) {
        String sql = "SELECT * FROM funcionario WHERE cpf = ?";
        conectar();

        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, cpf);
            ResultSet resultado = estado.executeQuery();

            if (resultado.next()) {
                Funcionario f = new Funcionario();
                f.setNome(resultado.getString("nome"));
                f.setCPF(resultado.getString("cpf"));
                return f;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar por CPF");
        }

        return null; // não encontrado
    }

    
    public ArrayList<Funcionario> consultarFuncionario(){
        String sql = "SELECT * FROM funcionario";
        ResultSet resultado;
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            resultado = estado.executeQuery();
            
            while(resultado.next()){
                Funcionario f = new Funcionario();
                f.setNome(resultado.getString("nome"));
                f.setCPF(resultado.getString("cpf"));
                
                lista.add(f);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        
        return lista;
    }

    public boolean isFuncionariosAtualizados() {
        return funcionariosAtualizados;
    }

    public void setFuncionariosAtualizados(boolean funcionariosAtualizados) {
        this.funcionariosAtualizados = funcionariosAtualizados;
    }
}
