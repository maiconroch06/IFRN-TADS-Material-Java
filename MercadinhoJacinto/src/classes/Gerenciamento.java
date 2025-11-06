package classes;

import java.util.HashMap;
import javax.swing.JOptionPane;

/* Sumario:
    1.Metodos de cadastro
    2.Metodos de remover
    3.Metodos de consultar
    4.Metodos de atualizar
    
    99.Metodos Getters
*/

/* Algumas pendencias:
    
*/

public class Gerenciamento {
    private HashMap<String, Funcionario> listaDeFuncionarios = new HashMap<>();
    private HashMap<String, Cliente> listaDeClientes = new HashMap<>();
    private HashMap<String, Produto> listaDeProdutos = new HashMap<>();
    private HashMap<String, Venda> listaDeVendas = new HashMap<>();

    
    // 1.Metodos para verificar
    public boolean cadastrarFuncionario(String CPF, Funcionario funcionario) {
        if (listaDeFuncionarios.containsKey(CPF)) {
            JOptionPane.showMessageDialog(null, "Funcionário já cadastrado!");
            return false;
        }
        listaDeFuncionarios.put(CPF, funcionario);
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
        return true;
    }
    
    public boolean cadastrarCliente(String CPF, Cliente cliente){        
        if(listaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado!");
            return false;
        }
        listaDeClientes.put(CPF, cliente);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        return true;
    }
    
    public boolean cadastrarProduto(String codigo, Produto produto) {
        if(listaDeProdutos.containsKey(codigo)) {
            JOptionPane.showMessageDialog(null, "Produto já cadastrado!");
            return false;
        }
        listaDeProdutos.put(codigo, produto);
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        return true;
    }
    
    public boolean cadastrarVenda(String ID_Venda, Venda venda){        
        if(listaDeVendas.containsKey(ID_Venda)){
            JOptionPane.showMessageDialog(null, "Venda já cadastrada!");
            return false;
        }
        listaDeVendas.put(ID_Venda, venda);
        JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!");
        return true;
    }
    
    // 2.Metodos para remover
    public void removerFuncionario(String CPF, Funcionario funcionario){
        listaDeFuncionarios.remove(CPF, funcionario); 
    }
    
    public void removerCliente(String CPF, Cliente cliente){
        listaDeClientes.remove(CPF, cliente); 
    }
    
    public void removerProduto(String codigo){
        listaDeProdutos.remove(codigo);
    }
    
    // 3.Metodos para consultar
    public void consultarCliente(String CPF, Cliente cliente){
        listaDeClientes.get(CPF);
    }
    
    public void consultarProduto(String codigo){
        listaDeProdutos.get(codigo);
    }
    
    public void consultarFuncionario(String CPF){
        listaDeFuncionarios.get(CPF);
    }
    
    // 4.Metodos para atualizar
    public boolean atualizarFuncionario(String CPF, Funcionario funcionario){        
        if(!listaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeFuncionarios.put(CPF, funcionario);
        return true;
    }

    public boolean atualizarCliente(String CPF, Cliente cliente){        
        if(!listaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeClientes.put(CPF, cliente);
        return true;
    }
    
    public boolean atualizarProduto(String codigo, Produto atualizado){
        if(!listaDeProdutos.containsKey(codigo)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeProdutos.put(codigo, atualizado);
        return true;
    }
    
    // 99.Getters
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