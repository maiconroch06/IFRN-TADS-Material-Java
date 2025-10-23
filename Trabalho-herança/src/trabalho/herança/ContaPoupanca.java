package trabalho.herança;

public class ContaPoupanca extends ContaBancaria {
    private double saldoPoupanca = getSaldo() * 10;

    public ContaPoupanca(String numConta, String nome, double saldoInicial) {
        this.saldoPoupanca = 0.0;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }
    
}