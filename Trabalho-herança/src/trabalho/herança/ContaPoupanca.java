/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.herança;


public class ContaPoupanca extends ContaBancaria {
    private double saldoPoupanca;

    public ContaPoupanca(String nome, double saldoInicial) {
        super(nome, saldoInicial);
        this.saldoPoupanca = 0.0;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }
    
}