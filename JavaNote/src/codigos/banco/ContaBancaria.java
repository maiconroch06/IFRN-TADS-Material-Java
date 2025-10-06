package codigos.banco;

public class ContaBancaria {
    private String nome; 
    private double saldo; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void creditar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }
    
    public void debitar(double valor){
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void show(String nome, double saldo){
        System.out.println("Olá " + getNome() + ", seu saldo é: " + getSaldo() + " reais.");
    }
}
