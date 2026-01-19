package classes;

public class ContaPoupanca extends ContaBancaria {
    
    private double saldoPoupanca;
    
    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            debitar(valor);
            return true;
        }
        return false;
    }
    
    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public double saldoAtual() {
        return getSaldo();
    }
    
}