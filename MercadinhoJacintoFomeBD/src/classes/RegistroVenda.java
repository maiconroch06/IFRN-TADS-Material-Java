package classes;

import java.util.List;

public class RegistroVenda {
    private String id;
    private String cpfFuncionario;
    private String cpfCliente;
    private String metodo;
    private double totalValor;
    private int quantidadeTotalItens;
    private List<ItemVenda> itens;

//    public RegistroVenda(){}
    
//    public RegistroVenda(String cpfFuncionario, String cpfCliente, String metodo, double totalValor) {
//        this.cpfFuncionario = cpfFuncionario;
//        this.cpfCliente = cpfCliente;
//        this.totalValor = totalValor;
//        this.metodo = metodo;
//    }

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

    public void setId(String id) {
        this.id = id;
    }

    public void setTotalValor(double total) {
        this.totalValor = total;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
    
    public void setQuantidadeTotalItens(int quantidadeTotalItens) {
        this.quantidadeTotalItens = quantidadeTotalItens;
    }
    

    
    
    public String getId() { 
        return id; 
    }
    public List<ItemVenda> getItens() { 
        return itens; 
    }
    public double getTotalValor() { 
        return totalValor; 
    }

    public String getMetodo() {
        return metodo;
    }
    
    public int getQuantidadeTotalItens() {
        int soma = 0;
        for (ItemVenda iv : itens) {
            soma += iv.getQuantidade();
        }
        return soma;
    }
}