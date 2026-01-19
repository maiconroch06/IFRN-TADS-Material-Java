package classes;

public abstract class ContaBancaria {
    private String nome;
    private String numero;
    private double saldo;
    
    public ContaBancaria(){}
    
    public abstract boolean sacar(double valor);
    
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        }
    }
    
    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void show() {
        System.out.println("Olá " + nome + ", seu saldo é: " + saldo + " reais.");
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
