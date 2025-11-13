package classes;

public class Venda{
    private int ID_Venda;
    private String codigoProduto;
    private int quantidade;
    private double valorUnitario;
    private String nomeCliente;
    private String nomeFuncionario;
    private double valorTotal;

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
    
    
    public int getID_Venda() { 
        return ID_Venda;
    }

    public void setID_Venda(int ID_Venda) { 
        this.ID_Venda = ID_Venda;
    }

    public String getCodigoProduto() { 
        return codigoProduto;
    }
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidade() { 
        return quantidade; 
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) { 
        this.valorUnitario = valorUnitario;
    }


    public double getValorTotal() {
        return quantidade * valorUnitario;
    }  

}
