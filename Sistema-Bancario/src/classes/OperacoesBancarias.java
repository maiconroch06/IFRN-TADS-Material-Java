package classes;

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
    
    public void creditarContaCorrente(ContaCorrente conta, double valor) {
        conta.creditar(valor);
    }

    public void creditarContaPoupanca( ContaPoupanca conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
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
    // *************************************************
    public void debitarDaPoupanca(ContaPoupanca conta, double valor) {
        if (verificarSaldoPoupancaSuficiente(conta, valor)) {
            conta.setSaldoPoupanca(conta.getSaldoPoupanca() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
        } else {
            System.out.println("Saldo insuficiente na poupança.");
        }
    }
    // *************************************************

    
    // *************** Fazer exeções para verificações *****************
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
            
            JOptionPane.showMessageDialog(null, "Transferência realizada!\nValor de: R$ " + valor);
            
        } else {
            JOptionPane.showMessageDialog(null, "Transferência não realizada. SALDO INSUFICIENTE!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void transferenciaBancaria(ContaPoupanca origem, ContaPoupanca destino, double valor) {
        if (verificarSaldoSuficiente(origem, valor)) {
            origem.debitar(valor);
            destino.creditar(valor);
            
            JOptionPane.showMessageDialog(null, "Transferência realizada!\nValor de: R$ " + valor);
            
        } else {
            JOptionPane.showMessageDialog(null, "Transferência não realizada. SALDO INSUFICIENTE!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}