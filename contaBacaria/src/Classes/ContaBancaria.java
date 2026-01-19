package Classes;

public abstract class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        }
    }

    public abstract boolean sacar(double valor);

    protected void debitar(double valor){
        saldo -= valor;
    }

    protected void creditar(double valor){
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
