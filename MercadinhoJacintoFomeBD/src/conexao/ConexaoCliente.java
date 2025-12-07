package conexao;

import classes.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.tabela.Carregar;

public class ConexaoCliente extends ConexaoBD {
    
    private boolean clientesAtualizados = false;
    
    public void cadastrarCliente(Cliente c) {
        String sql = "INSERT INTO cliente (nome, cpf, endereco, telefone) VALUES (?,?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, c.getNome());
            estado.setString(2, c.getCPF());
            estado.setString(3, c.getEndereco());
            estado.setString(4, c.getTelefone());
            
            estado.execute();
            
            setClientesAtualizados(true);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (SQLException ex) {
            if(ex.getMessage().startsWith("ERRO: duplicar valor")){
               JOptionPane.showMessageDialog(null, "Chave primária já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        }
    }
    
    public void atualizarFuncionario(Cliente c){
        String sql= "UPDATE cliente SET nome = ?, cpf = ?, endereco = ?, telefone = ? WHERE cpf = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, c.getNome());
            estado.setString(2, c.getCPF());
            estado.setString(3, c.getEndereco());
            estado.setString(4, c.getTelefone());
            estado.setString(5, c.getCPF());
            
            estado.execute();       
            
            setClientesAtualizados(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
        
    }
    
    public void removerFuncionario(DefaultTableModel modeloTableFuncionario, String cpf){
        String sql= "DELETE FROM cliente WHERE cpf = ?";
        conectar();
        
        try {
            if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir o funcionário CPF: " + cpf + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                estado = con.prepareStatement(sql);
                estado.setString(1, cpf);

                estado.execute();

                setClientesAtualizados(true);
                JOptionPane.showMessageDialog(null, "removido com sucesso");
                Carregar.tabelaFuncionarios(modeloTableFuncionario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover");
        }
        
    }
    
    public Cliente consultarCliente(String cpf) {
        String sql = "SELECT * FROM cliente WHERE cpf = ?";
        conectar();

        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, cpf);
            ResultSet resultado = estado.executeQuery();

            if (resultado.next()) {
                Cliente c = new Cliente();
                c.setNome(resultado.getString("nome"));
                c.setCPF(resultado.getString("cpf"));
                c.setEndereco(resultado.getString("endereco"));
                c.setTelefone(resultado.getString("telefone"));
                return c;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar por CPF");
        }

        return null; // não encontrado
    }

    
    public ArrayList<Cliente> consultarCliente(){
        String sql = "SELECT * FROM cliente";
        ResultSet resultado;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            resultado = estado.executeQuery();
            
            while(resultado.next()){
                Cliente c = new Cliente();
                c.setNome(resultado.getString("nome"));
                c.setCPF(resultado.getString("cpf"));
                c.setEndereco(resultado.getString("endereco"));
                c.setTelefone(resultado.getString("telefone"));
                
                lista.add(c);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        
        return lista;
    }

    public boolean isClientesAtualizados() {
        return clientesAtualizados;
    }

    public void setClientesAtualizados(boolean clientesAtualizados) {
        this.clientesAtualizados = clientesAtualizados;
    }
}
