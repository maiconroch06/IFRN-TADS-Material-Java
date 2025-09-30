package com.maic.aula.banco;

public class ContaCorrente extends ContaBancaria {
    private final double limite = 100.0;

    public ContaCorrente(String nomeDono, double saldoInicial) {
        super(nomeDono, saldoInicial);
    }

    public double getLimite() {
        return limite;
    }

    public double mostrarSaldoTotal() {
        return getSaldo() + limite;
    }

    @Override
    public void show() {
        System.out.println("Olá " + getNomeDono() + ", seu saldo é: " + mostrarSaldoTotal()
                + " reais já incluso os 100 reais de crédito.");
    }
}

