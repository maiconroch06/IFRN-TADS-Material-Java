package classes;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Gerenciamento {
    //obs: Chave do funcionario e cliente é o "CPF", para produto será "CODIGO".
    private HashMap<String, Funcionario> ListaDeFuncionarios;
    private HashMap<String, Cliente> ListaDeClientes;
    private HashMap<String, Produto> ListaDeProdutos;

    // Funcionário (cadastrar, atualizar, remover e consultar)
    
    // Cadastro
    public boolean cadastrarPessoa(String CPF, Funcionario funcionario){        
        if(ListaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Já cadastrado, tente um CPF diferente!");
            return false; //
        } 
        
        ListaDeFuncionarios.put(CPF, funcionario);
            return true;
    }
    
    // att
    public boolean atualizarPessoa(String CPF, Funcionario funcionario){        
        if(!ListaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Não existe cadastro para atualizar! Cadastre primeiro.!");
            return false; //
        } 
        
        ListaDeFuncionarios.put(CPF, funcionario);
            return true;
    }
    
    // remover
    public void removerPessoa(String CPF, Funcionario funcionario){
        ListaDeFuncionarios.remove(CPF, funcionario); 
    }
    
    public void ConsultarPessoa(String CPF){
        ListaDeFuncionarios.get(CPF);
    }
    
    //TO MEXENDO AQUI (LAEL)
    // Produto (cadastrar, atualizar, remover e consultar)
    
    public void CadastrarProduto(String codigo, Produto produto){
        ListaDeProdutos.put(codigo, produto);
    }
    
    public void AtualizarProduto (String codigo, Produto atualizado){
        ListaDeProdutos.put(codigo, atualizado);
    }
    
    public void RemoverProduto(String codigo){
        ListaDeProdutos.remove(codigo);
    }
    
    public void ConsultarProduto(String codigo){
        ListaDeProdutos.get(codigo);
    }
    
    // Cliente (cadastrar, atualizar, remover e consultar)
    
     public boolean cadastrarPessoa(String CPF, Cliente cliente){        
        if(ListaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Já cadastrado, tente um CPF diferente!");
            return false; //
        } 
        
        ListaDeClientes.put(CPF, cliente);
            return true;
    }
    
    // att
    public boolean atualizarPessoa(String CPF, Cliente cliente){        
        if(!ListaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Não existe cadastro para atualizar! Cadastre primeiro.!");
            return false; //
        } 
        
        ListaDeClientes.put(CPF, cliente);
            return true;
    }
    
    // remover
    public void removerPessoa(String CPF, Cliente cliente){
        ListaDeClientes.remove(CPF, cliente); 
    }
    
    // consultar
    public void ConsultarPessoa(String CPF, Cliente cliente){
        ListaDeClientes.get(CPF);
    }
    
    
    public HashMap<String, Funcionario> getListaDeFuncionarios() {
        return ListaDeFuncionarios;
    }

    public void setListaDeFuncionarios(HashMap<String, Funcionario> ListaDeFuncionarios) {
        this.ListaDeFuncionarios = ListaDeFuncionarios;
    }

    public HashMap<String, Cliente> getListaDeClientes() {
        return ListaDeClientes;
    }

    public void setListaDeClientes(HashMap<String, Cliente> ListaDeClientes) {
        this.ListaDeClientes = ListaDeClientes;
    }

    public HashMap<String, Produto> getListaDeProdutos() {
        return ListaDeProdutos;
    }

    public void setListaDeProdutos(HashMap<String, Produto> ListaDeProdutos) {
        this.ListaDeProdutos = ListaDeProdutos;
    }

    private void ListaDeClientes(String cpf, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}