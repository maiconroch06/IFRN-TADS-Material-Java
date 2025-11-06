package classes;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Gerenciamento {
    //obs: Chave do funcionario e cliente é o "CPF", para produto será "CODIGO".
    private HashMap<String, Funcionario> listaDeFuncionarios;
    private HashMap<String, Cliente> listaDeClientes;
    private HashMap<String, Produto> listaDeProdutos;

    // Funcionário (cadastrar, atualizar, remover e consultar)
    public boolean cadastrarFuncionario(String CPF, Funcionario funcionario){        
        if(listaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Já cadastrado, tente um CPF diferente!");
            return false;
        } 
        listaDeFuncionarios.put(CPF, funcionario);
            return true;
    }
    
    public boolean atualizarFuncionario(String CPF, Funcionario funcionario){        
        if(!listaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Não existe cadastro para atualizar! Cadastre primeiro.!");
            return false;
        } 
        listaDeFuncionarios.put(CPF, funcionario);
            return true;
    }
    
    public void removerFuncionario(String CPF, Funcionario funcionario){
        listaDeFuncionarios.remove(CPF, funcionario); 
    }
    
    public void consultarFuncionario(String CPF){
        listaDeFuncionarios.get(CPF);
    }
    
    //TO MEXENDO AQUI (LAEL)
    // Produto (cadastrar, atualizar, remover e consultar)
    
    public void cadastrarProduto(String codigo, Produto produto){
        listaDeProdutos.put(codigo, produto);
    }
    
    public void AtualizarProduto (String codigo, Produto atualizado){
        listaDeProdutos.put(codigo, atualizado);
    }
    
    public void RemoverProduto(String codigo){
        listaDeProdutos.remove(codigo);
    }
    
    public void ConsultarProduto(String codigo){
        listaDeProdutos.get(codigo);
    }
    
    // Cliente (cadastrar, atualizar, remover e consultar)
     public boolean cadastrarCliente(String CPF, Cliente cliente){        
        if(listaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Já cadastrado, tente um CPF diferente!");
            return false;
        } 
        listaDeClientes.put(CPF, cliente);
            return true;
    }
    
    public boolean atualizarCliente(String CPF, Cliente cliente){        
        if(!listaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Não existe cadastro para atualizar! Cadastre primeiro.!");
            return false;
        } 
        listaDeClientes.put(CPF, cliente);
            return true;
    }
    
    public void removerCliente(String CPF, Cliente cliente){
        listaDeClientes.remove(CPF, cliente); 
    }
    
    public void consultarCliente(String CPF, Cliente cliente){
        listaDeClientes.get(CPF);
    }
    
    // Getters
    public HashMap<String, Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public HashMap<String, Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public HashMap<String, Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }
    
}