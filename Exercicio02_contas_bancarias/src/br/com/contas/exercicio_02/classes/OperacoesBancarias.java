package br.com.contas.exercicio_02.classes;

import javax.swing.JOptionPane;

public class OperacoesBancarias {

    public void creditarContaCorrente(ContaCorrente contaCorrente, double novoValor) {
        if (novoValor >= 0) {
            contaCorrente.crediditar(novoValor);
            JOptionPane.showMessageDialog(null, "Operação de depósito realizada com sucesso\nTitular: "+contaCorrente.getNome()+"\nSaldo atual: "+contaCorrente.getSaldo());     
        } else {
            JOptionPane.showMessageDialog(null,"O valor não pode ser negativo");
        }

    }

    public void creditarContaPoupanca(ContaPoupanca contaPoupanca, double novoValor) {
        if (novoValor >= 0) {
            contaPoupanca.crediditar(novoValor);
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!\n"+contaPoupanca.getNome()+" o seu saldo atual é de "+contaPoupanca.getSaldo());

        } else {
           // System.out.println("O valor não pode ser negativo");
            JOptionPane.showMessageDialog(null, "O valor não pode ser negativo");

        }

    }

    public void creditarEmPoupanca(ContaPoupanca contaPoupanca, double novoValor) {
        if (verificarSaldoSuficiente(contaPoupanca, novoValor)) {
            contaPoupanca.debitar(novoValor);
            contaPoupanca.setSaldoPoupanca(contaPoupanca.getSaldoPoupanca() + novoValor); // verificar depois
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!\nTitular: "+contaPoupanca.getNome()+"\nSaldo atual: "+contaPoupanca.getSaldo()+"\nSaldo da poupança: "+contaPoupanca.getSaldoPoupanca());

        } else {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente.\n"+"Saldo da conta poupança: "+contaPoupanca.getSaldo());

        }
    }

    public boolean verificarSaldoSuficiente(ContaCorrente contaCorrente, double valor) {
        
        if (contaCorrente.getSaldo() >= valor) {
            return true;
        } else {
            return false;
        }

    }

    public boolean verificarSaldoSuficiente(ContaPoupanca contaPoupanca, double valor) {
        if (contaPoupanca.getSaldo() >= valor) {
            return true;
        } else {
            return false;
        }

    }

    public void debitarContaCorrente(ContaCorrente contaCorrente, double valorDebito) {
        if (verificarSaldoSuficiente(contaCorrente, valorDebito)) {
            contaCorrente.debitar(valorDebito);
            JOptionPane.showMessageDialog(null, "Operação de débito realizada com sucesso\nTitular: "+contaCorrente.getNome()+"\nSaldo atual: "+contaCorrente.getSaldo());

        } else {
           JOptionPane.showMessageDialog(null,"Saldo insificiente para debitar conta corrente.");
        }
    }

    public void debitarContaPoupanca(ContaPoupanca contaPoupanca, double valorDebito) {

        if (verificarSaldoSuficiente(contaPoupanca, valorDebito)) {
            contaPoupanca.debitar(valorDebito);
            JOptionPane.showMessageDialog(null, "Operação de débito realizada com sucesso\nTitular: "+contaPoupanca.getNome()+"\nSaldo atual: "+contaPoupanca.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insificiente para debitar conta poupança.");
        }

    }

    public void debitarDaPoupanca(ContaPoupanca contaPoupanca, double valorDebito) {
        if (vericarSaldoPoupancaSuficiente(contaPoupanca.getSaldoPoupanca(), valorDebito)) {
            double somaDebito = contaPoupanca.getSaldoPoupanca() - valorDebito;

            contaPoupanca.setSaldoPoupanca(somaDebito);
            contaPoupanca.crediditar(valorDebito);
            JOptionPane.showMessageDialog(null, "Operação de débito realizada com sucesso\nTitular: "+contaPoupanca.getNome()+"\nSaldo atual: "+contaPoupanca.getSaldo()+"\nSaldo da poupança: "+contaPoupanca.getSaldoPoupanca());
        }else{
           JOptionPane.showMessageDialog(null, "Saldo da poupança insificiente para debitar conta poupança!\nSaldo poupança: "+contaPoupanca.getSaldoPoupanca());

        }

    }

    public boolean vericarSaldoPoupancaSuficiente(double saldPoupanca, double valor) {
        if (saldPoupanca <= valor) {
            return false;
        } else {
            return true;
        }

    }

    public void transferenciaBancaria(ContaCorrente contaOrigem, ContaCorrente contaDestino, double valor) {
        if (verificarSaldoSuficiente(contaOrigem, valor)) {
            contaOrigem.debitar(valor);
            contaDestino.crediditar(valor);
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso\n\nConta Origem: "+contaOrigem.getNome()+"\nConta Destino: "+contaDestino.getNome()+"\nValor Transferido: "+valor);

        }else{
          JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar a transferência!\nSaldo total: "+contaOrigem.getSaldo());

        }

    }

}
