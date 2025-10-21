package trabalho.herança;

import javax.swing.JOptionPane;


public class ContaBancaria {
    private String nome;
    private Integer numConta;
    private double saldo;

    public ContaBancaria(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }
    
    public ContaBancaria(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numeroConta) {
        this.numConta = numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void show() {
        System.out.println("Olá " + nome + ", seu saldo é: " + saldo + " reais.");
    }

    public void creditar(double valor) {
        if(valor > saldo) {
            saldo += valor;
        } else {
            JOptionPane.showMessageDialog(null, "Deposite um valor acima do numero 0(zero)!");
        }
    }

    public void debitar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        }
    }
}
