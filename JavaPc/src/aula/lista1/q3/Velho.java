package aula.lista1.q3;

public class Velho extends Imovel{
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void imprimirDesconto(double valor) {
        System.out.println(valor + desconto);
    }
    
    
}
