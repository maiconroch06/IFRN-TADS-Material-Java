package codigos.banco;

public class ContaCorrente extends ContaBancaria{
    private final double limite = 100;

    public double getLimite() {
        return limite;
    }
    
    public double mostrarSaldoTotal(){
        return getSaldo() + limite;
    }
    
    @Override
    void show(String nome, double saldo) {
        System.out.println("Olá " + nome + ", seu saldo é: " + getSaldo() + 100 + " reais já incluso os " + limite + " reais de crédito.");
    }
    
}
