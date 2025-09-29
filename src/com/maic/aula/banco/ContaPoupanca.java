package com.maic.aula.banco;

public class ContaPoupanca extends ContaBancaria {
    private double saldoPoupanca;

    public ContaPoupanca(String nomeDono, double saldoInicial) {
        super(nomeDono, saldoInicial);
        this.saldoPoupanca = 0;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }
}
