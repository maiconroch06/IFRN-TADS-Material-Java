package classes;

public class ContaPoupanca extends ContaBancaria {
    
    private double poupanca = 0;
    
    @Override
    public void debitar(double valor){
        if(valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        }
    }
    
    @Override
    public void creditar(double valor){
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }
    
    @Override
    public double mostrarSaldo() {
        return getSaldo();
    }
    
    public void debitarPoupanca(double valor){
        if(valor <= getSaldoPoupanca()) {
            creditar(valor);
            setSaldoPoupanca(getSaldoPoupanca()- valor);
        }
    }
    
    public void creditarPoupanca(double valor){
        if(valor > 0) {
            debitar(valor);
            setSaldoPoupanca(getSaldoPoupanca() + valor);
        }
    }

    public double getSaldoPoupanca() {
        return poupanca;
    }

    public void setSaldoPoupanca(double poupanca) {
        this.poupanca = poupanca;
    }
    
    
    
}
