package br.com.contas.exercicio_02.classes;

public class ContaCorrente extends ContaBancaria {

    private final double LIMITE_CREDITO = getSaldo() * 10;

    public double getLimiteCredito() {
        return LIMITE_CREDITO;
    }

    @Override
    public void show() {
        System.out.println("Olá, " + getNome() + ", seu saldo é R$ " + (getSaldo() + getLimiteCredito()) + " reais.");
    }

    public double mostraSaldoTotal() {
        return getSaldo() + LIMITE_CREDITO;
    }

}
