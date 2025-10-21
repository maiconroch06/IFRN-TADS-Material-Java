package Q1produto;

public class ProdutoImportado extends Produto{
    private double taxaImpotacao;
    
    public double calcularPrecoFinal(){
        return getPreco() + (getPreco() * taxaImpotacao);
    }

    public void setTaxaImpotacao(double taxaImpotacao) {
        this.taxaImpotacao = taxaImpotacao;
    }
    
    public void show(){
        System.out.println("Nome Produto: " + getNome());
        System.out.println("Preço Produto: " + calcularPrecoFinal());
    }
}
