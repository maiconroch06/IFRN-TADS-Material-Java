package trabalho.herança;

import javax.swing.JOptionPane;


public class ContaBancaria {
    private String nome;
    private String numConta;
    private double saldo;
    
    public ContaBancaria(){}
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void show() {
        System.out.println("Olá " + nome + ", seu saldo é: " + saldo + " reais.");
    }

    public void creditar(double valor) {
        if(valor > saldo) {
            saldo += valor;
        } else {
            //JOptionPane.showMessageDialog(null, "Deposite um valor acima do numero 0(zero)!");
        }
    }

    public void debitar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            //JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        }
    }
}
