package trabalho.herança;

public class ContaPoupanca extends ContaBancaria {
    
    private double saldoPoupanca;

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