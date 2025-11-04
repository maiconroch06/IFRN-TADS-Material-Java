package classes;

import java.util.HashMap;

public class Gerenciamento {
    //obs: Chave do funcionario é o "CPF".
    private HashMap<String, Funcionario> ListaDeFuncionarios;
    //obs: Chave do cliente é o "CPF".
    private HashMap<String, Cliente> ListaDeClientes;
    //obs: Chave do produto é o "CODIGO".
    private HashMap<String, Produto> ListaDeProdutos;

    // Funcionário (cadastrar, atualizar, remover e consultar)
    // Cadastro
    public void cadastrarFuncionario(String CPF, String nome){
        
    }
    
    // Cadastro
    // atualizar
    // remover
    // consultar
    
    // Produto (cadastrar, atualizar, remover e consultar)
    // Cadastro
    // atualizar
    // remover
    // consultar
    
    // Cliente (cadastrar, atualizar, remover e consultar)
    // Cadastro
    // atualizar
    // remover
    // consultar
    
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
    
}
