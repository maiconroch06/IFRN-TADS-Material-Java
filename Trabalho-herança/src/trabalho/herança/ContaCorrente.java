package trabalho.herança;

public class ContaCorrente extends ContaBancaria {
    private final double limite = 100.0;

    public ContaCorrente(String nome, double saldoInicial) {
        super(nome, saldoInicial);
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void show() {
        System.out.println("Olá " + getNome() + 
            ", seu saldo é: " + (getSaldo() + limite) + " reais já incluso os 100 reais de crédito.");
    }

    public double mostrarSaldoTotal() {
        return getSaldo() + limite;
    }
}

