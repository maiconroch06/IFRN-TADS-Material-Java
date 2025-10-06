package codigos.banco;

public class OperacoesBancarias {
    
    public void creditarContaCorrente(ContaCorrente conta, double valor) {
        conta.creditar(valor);
    }

    public void creditarContaPoupanca(ContaPoupanca conta, double valor) {
        conta.creditar(valor);
    }
    
    public void creditarEmpoupanca(ContaPoupanca conta, double valor){
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
            conta.setSaldoPoupanca(conta.getSaldoPoupanca() + valor);
        }
    }
    
    public void debitarContaCorrente(ContaPoupanca conta, double valor){
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
            conta.setSaldoPoupanca(conta.getSaldoPoupanca() + valor);
        }
    }
    
    public void debitarContaPoupança(ContaPoupanca conta, double valor){
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
            conta.setSaldoPoupanca(conta.getSaldoPoupanca() + valor);
        }
    }
    
    public void debitarDapoupanca(ContaPoupanca conta, double valor){
        if (verificarSaldoPoupancaSuficiente(conta, valor)) {
            conta.debitar(valor);
            conta.setSaldoPoupanca(conta.getSaldoPoupanca() + valor);
        }
    }
    
    public boolean verificarSaldoSuficiente(ContaCorrente conta, double valor){
        return conta.mostrarSaldoTotal() >= valor;
    }
    
    public boolean verificarSaldoSuficiente(ContaPoupanca conta, double valor){
        return conta.getSaldoPoupanca() >= valor;
    }
    
    public boolean verificarSaldoPoupancaSuficiente(ContaPoupanca conta, double valor){
        return conta.getSaldoPoupanca() <= valor;
    }
    
    public void transferenciaBancaria(ContaCorrente origem, ContaCorrente destino, double valor){
        if(verificarSaldoSuficiente(origem, valor)){
            origem.debitar(valor);
            destino.creditar(valor);
        }
    }
    
}
