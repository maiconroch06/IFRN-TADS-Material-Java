package trabalho.herança;


public class ContaBancaria {
    private String nome;
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
        saldo += valor;
    }

    public void debitar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
