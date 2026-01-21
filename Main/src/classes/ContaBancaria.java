package classes;

public abstract class ContaBancaria {
    private String numero;
    private String nome;
    private double saldo = 0;
    private String tipoConta;
    private String senha;
    
    public abstract void creditar(double valor);
    
    public abstract void debitar(double valor);
    
    public abstract double mostrarSaldo();
    
    // Metodos Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
}
