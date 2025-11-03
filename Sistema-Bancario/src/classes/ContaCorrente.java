package classes;

public class ContaCorrente extends ContaBancaria {
    
    private final double LIMITE_CREDITO = 100;

    public double getLimiteCredito() {
        return LIMITE_CREDITO;
    }

    @Override
    public void show() {
        System.out.println("Olá " + getNome() + 
                ", seu saldo é: " + (getSaldo() + LIMITE_CREDITO) + " reais já incluso os 100 reais de crédito.");
    }

    public double mostrarSaldoTotal() {
        return (getSaldo() + getLimiteCredito());
    }
    
    public double saldoAtual(){
        return getSaldo();
    }
}

