package classes;

import java.util.List;

public class RegistroVenda {
    private String id;
    private String nomeFuncionario;
    private String nomeCliente;
    private String cpfFuncionario;
    private String cpfCliente;
    private double total;
    private String metodo;
    private List<ItemVenda> itens;

    public RegistroVenda(String id, String nomeFuncionario, String nomeCliente, double total, String metodo, List<ItemVenda> itens) {
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.nomeCliente = nomeCliente;
        this.total = total;
        this.metodo = metodo;
        this.itens = itens;
    }

    public RegistroVenda(String cpfFuncionario, String cpfCliente, String metodo, double total) {
        this.cpfFuncionario = cpfFuncionario;
        this.cpfCliente = cpfCliente;
        this.total = total;
        this.metodo = metodo;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    
    
    public String getId() { 
        return id; 
    }
    public List<ItemVenda> getItens() { 
        return itens; 
    }
    public double getTotal() { 
        return total; 
    }

    public String getMetodo() {
        return metodo;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    public int getQuantidadeTotalItens() {
        int soma = 0;
        for (ItemVenda iv : itens) {
            soma += iv.getQuantidade();
        }
        return soma;
    }
}