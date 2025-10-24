package trabalho.herança;

public class ContaPoupanca extends ContaBancaria {
    private double saldoPoupanca = getSaldo() * 10;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }
    
}