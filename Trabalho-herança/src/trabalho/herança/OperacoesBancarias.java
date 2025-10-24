package trabalho.herança;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class OperacoesBancarias {
    
    private HashMap<String, ContaCorrente> listaContasCorrente;
    private HashMap<String, ContaPoupanca> listaContasPoupanca;

    public HashMap<String, ContaCorrente> getListaContasCorrente() {
        return listaContasCorrente;
    }

    public void setListaContasCorrente(HashMap<String, ContaCorrente> listaContasCorrente) {
        this.listaContasCorrente = listaContasCorrente;
    }

    public HashMap<String, ContaPoupanca> getListaContasPoupanca() {
        return listaContasPoupanca;
    }

    public void setListaContasPoupanca(HashMap<String, ContaPoupanca> listaContasPoupanca) {
        this.listaContasPoupanca = listaContasPoupanca;
    }
    
    // Validar a existência da CONTA CORRENTE pela chave
    public ContaCorrente contaCorrenteValida(String chave) {
        if(listaContasPoupanca.get(chave) != null) {
            return listaContasCorrente.get(chave);
        } else {
            JOptionPane.showMessageDialog(null, "Conta inexistente!");
            return null;
        }
    }
    
    public ContaPoupanca contaPoupancaValida(String chave){ //Retorna null ou oq procuramos, tem a opção de retorn bool
        if(listaContasCorrente.get(chave) != null) {
            return listaContasPoupanca.get(chave);
        } else {
            JOptionPane.showMessageDialog(null, "Conta inexistente!");
            return null;
        }
    }
    
    public void creditarContaCorrente(ContaCorrente conta, double valor) {
        conta.creditar(valor);
    }

    public void creditarContaPoupanca( ContaPoupanca conta, double valor) {
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