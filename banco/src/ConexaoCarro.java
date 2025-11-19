import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class ConexaoCarro extends ConexaoBD{
    
    public void inserir(Carro c){
        String sql= "insert into carro values (?,?,?)";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, c.getPlaca());
            estado.setString(2, c.getDescricao());
            estado.setString(3, c.getModelo());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (SQLException ex) {
            
            if(ex.getMessage().startsWith("ERRO: duplicar valor")){
               JOptionPane.showMessageDialog(null, "Chave primária já existe"); 
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        }
        
    }
    
    
    public void atualizar(Carro c){
        String sql= "update carro set descricao = ?, modelo = ? where placa = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(3, c.getPlaca());
            estado.setString(1, c.getDescricao());
            estado.setString(2, c.getModelo());
            
            estado.execute();
            
                       
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
        
    }
    
    public void remover(Carro c){
        String sql= "delete from carro where placa = ?";
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, c.getPlaca());
            
            estado.execute();
            
            JOptionPane.showMessageDialog(null, "removido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover");
        }
        
    }
    
    public ArrayList<Carro> consulta(){
        String sql = "select * from carro";
        ResultSet resultado;
        ArrayList<Carro> lista = new ArrayList<Carro>();
        conectar();
        
        try {
            estado = con.prepareStatement(sql);
            resultado = estado.executeQuery();
            
            while(resultado.next()){
                Carro c = new Carro();
                c.setPlaca(resultado.getString("placa"));
                c.setModelo(resultado.getString("modelo"));
                c.setDescricao(resultado.getString("descricao"));
                
                lista.add(c);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        
        return lista;
    }
    
}
