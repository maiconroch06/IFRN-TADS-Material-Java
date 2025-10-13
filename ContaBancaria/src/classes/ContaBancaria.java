package classes;

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
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void show() { // exibir msg para teste
        System.out.println("Olá " + getNome() + ", seu saldo é: " + getSaldo() + " reais.");
    }

    public String showSaldo(){ // mostrar msg em outra janela
        return "Olá, " + getNome() + ", seu saldo é R$ " + getSaldo() + " reais.";
    }
    
    public void creditar(double saldo){
        if(saldo > 0){
            this.saldo += saldo;
        }
    }
    
    public void debitar(double saldo){
        if (saldo > 0 && this.saldo >= saldo) {
            this.saldo -= saldo;
        }
    }
    
}
