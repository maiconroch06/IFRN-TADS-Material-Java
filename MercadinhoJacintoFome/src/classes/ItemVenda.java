package classes;

public class ItemVenda{
    
    private String codigoProduto;
    private String produto;
    private int quantidade;
    private double valorUnitario;

    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
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
