package Q1produto;

public class Main {
   
    public static void main(String[] args) {
        ProdutoImportado produto1 = new ProdutoImportado();
        
        produto1.setNome("Caneta");
        produto1.setPreco(100.00);
        produto1.setTaxaImpotacao(0.05);
        
        produto1.show();
        
    }
}
