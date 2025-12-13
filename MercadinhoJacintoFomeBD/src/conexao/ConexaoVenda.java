package conexao;

import classes.ItemVenda;
import classes.Produto;
import classes.RegistroVenda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.tabela.Carregar;

public class ConexaoVenda extends ConexaoBD {

    private boolean vendasAtualizadas = false;

    public void cadastrarVenda(RegistroVenda v) {
        String sql = "INSERT INTO historicoVenda (id_funcionario, id_cliente, metodo, "
            + "quantidadeTotalItens, totalValor) VALUES (?,?,?,?,?)";
        conectar();

        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, v.getCpfFuncionario());
            estado.setString(2, v.getCpfCliente());
            estado.setString(3, v.getMetodo());
            estado.setInt(4, v.getQuantidadeTotalItens());
            estado.setDouble(5, v.getTotalValor());

            estado.execute();

            setVendasAtualizadas(true);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (SQLException ex) {
            if(ex.getMessage().startsWith("ERRO: duplicar valor")){
               JOptionPane.showMessageDialog(null, "Chave primária já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        }
    }
    
    public void atualizarVenda(RegistroVenda v){
        String sql= "UPDATE historicoVenda SET cpfFuncionario = ?, cpfCliente = ?, metodo = ?, "
                + "quantidadeTotalItens = ?, totalValor = ? WHERE id_venda = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, v.getCpfFuncionario());
            estado.setString(2, v.getCpfCliente());
            estado.setString(3, v.getMetodo());
            estado.setInt(4, v.getQuantidadeTotalItens());
            estado.setDouble(5, v.getTotalValor());
            estado.setString(6, v.getId());
            
            estado.execute();       
            
            setVendasAtualizadas(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
        
    }
    
    public void removerVenda(DefaultTableModel modeloTableVenda, String id_venda){
        String sql= "DELETE FROM historicoVenda WHERE id_venda = ?";
        conectar();
        
        try {
            if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir a venda ID: " + id_venda + "?",
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                estado = con.prepareStatement(sql);
                estado.setString(1, id_venda);

                estado.execute();

                setVendasAtualizadas(true);
                JOptionPane.showMessageDialog(null, "removido com sucesso");
                Carregar.tabelaVendas(modeloTableVenda);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover");
        }
        
    }
    
    public RegistroVenda consultarVenda(String id_venda) {
        String sql = "SELECT * FROM historicoVenda WHERE id_venda = ?";
        conectar();

        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, id_venda);
            ResultSet resultado = estado.executeQuery();

            if (resultado.next()) {
                RegistroVenda v = new RegistroVenda();
                v.setId(resultado.getString("id_venda"));
                v.setCpfFuncionario(resultado.getString("cpfFuncionario"));
                v.setCpfCliente(resultado.getString("cpfCliente"));
                v.setMetodo(resultado.getString("metodo"));
                v.setQuantidadeTotalItens(resultado.getInt("quantidadeTotalItens"));
                v.setTotalValor(resultado.getDouble("totalValor"));
                return v;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar pelo ID da venda");
        }

        return null; // não encontrado
    }

    
    public ArrayList<RegistroVenda> consultarVenda(){
        String sql = "SELECT * FROM historicoVenda";
        ResultSet resultado;
        ArrayList<RegistroVenda> lista = new ArrayList<RegistroVenda>();
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            resultado = estado.executeQuery();
            
            while(resultado.next()){
                RegistroVenda v = new RegistroVenda();
                v.setId(resultado.getString("id_venda"));
                v.setCpfFuncionario(resultado.getString("cpfFuncionario"));
                v.setCpfCliente(resultado.getString("cpfCliente"));
                v.setMetodo(resultado.getString("metodo"));
                v.setQuantidadeTotalItens(resultado.getInt("quantidadeTotalItens"));
                v.setTotalValor(resultado.getDouble("totalValor"));
                
                lista.add(v);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        
        return lista;
    }
    
    public boolean isVendasAtualizadas() {
        return vendasAtualizadas;
    }

    public void setVendasAtualizadas(boolean vendasAtualizadas) {
        this.vendasAtualizadas = vendasAtualizadas;
    }
}
