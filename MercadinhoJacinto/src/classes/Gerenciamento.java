package classes;

import java.util.HashMap;

public class Gerenciamento {
    //obs: Chave do funcionario e cliente é o "CPF", para produto será "CODIGO".
    private HashMap<String, Funcionario> ListaDeFuncionarios;
    private HashMap<String, Cliente> ListaDeClientes;
    private HashMap<String, Produto> ListaDeProdutos;

    // Funcionário (cadastrar, atualizar, remover e consultar)
    // Cadastro
    public void cadastrarFuncionario(String CPF, Funcionario funcionario){
        ListaDeFuncionarios.put(CPF, funcionario);
    }
    
    // atualizar e consultar, qual a diferença?
    
    // remover
    public void removerFuncionario(String CPF, Funcionario funcionario){
        ListaDeFuncionarios.remove(CPF, funcionario); 
    }
    
    // Produto (cadastrar, atualizar, remover e consultar)
    
    // Cliente (cadastrar, atualizar, remover e consultar)
    
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
