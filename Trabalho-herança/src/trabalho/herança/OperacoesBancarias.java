package trabalho.herança;

public class OperacoesBancarias {

    public void creditarContaCorrente(ContaCorrente conta, double valor) {
        conta.creditar(valor);
    }

    public void creditarContaPoupanca(ContaPoupanca conta, double valor) {
        conta.creditar(valor);
    }

    public void creditarEmPoupanca(ContaPoupanca conta, double valor) {
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
            conta.setSaldoPoupanca(conta.getSaldoPoupanca() + valor);
        } else {
            System.out.println("Saldo insuficiente para transferir para a poupança.");
        }
    }

    public void debitarContaCorrente(ContaCorrente conta, double valor) {
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void debitarContaPoupanca(ContaPoupanca conta, double valor) {
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void debitarDaPoupanca(ContaPoupanca conta, double valor) {
        if (verificarSaldoPoupancaSuficiente(conta, valor)) {
            conta.setSaldoPoupanca(conta.getSaldoPoupanca() - valor);
            conta.creditar(valor);
        } else {
            System.out.println("Saldo insuficiente na poupança.");
        }
    }

    public boolean verificarSaldoSuficiente(ContaCorrente conta, double valor) {
        return conta.mostrarSaldoTotal() >= valor;
    }

    public boolean verificarSaldoSuficiente(ContaPoupanca conta, double valor) {
        return conta.getSaldo() >= valor;
    }

    public boolean verificarSaldoPoupancaSuficiente(ContaPoupanca conta, double valor) {
        return conta.getSaldoPoupanca() >= valor;
    }

    public void transferenciaBancaria(ContaCorrente origem, ContaCorrente destino, double valor) {
        if (verificarSaldoSuficiente(origem, valor)) {
            origem.debitar(valor);
            destino.creditar(valor);
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }
}