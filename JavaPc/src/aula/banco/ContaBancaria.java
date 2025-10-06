package aula.banco;

public class ContaBancaria {
    private String nomeDono;
    private double saldo;

    public ContaBancaria(String nomeDono, double saldoInicial) {
        this.nomeDono = nomeDono;
        this.saldo = saldoInicial;
    }

    // Métodos assessores
    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos de operação
    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void show() {
        System.out.println("Olá " + nomeDono + ", seu saldo é: " + saldo + " reais.");
    }
}

