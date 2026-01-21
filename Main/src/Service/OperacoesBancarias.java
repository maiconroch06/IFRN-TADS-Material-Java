package Service;

import classes.ContaBancaria;
import classes.ContaPoupanca;
import javax.swing.JOptionPane;

public class OperacoesBancarias extends ContaBancariaService {
    
    public void creditar(ContaBancaria conta, double valor) {
        conta.creditar(valor);
    }

    public void creditarEmPoupanca(ContaPoupanca contaP, double valor) {
        if (verificarSaldoSuficiente(contaP, valor)) {
            
            contaP.debitar(contaP.getSaldo() - valor);
            
            contaP.setSaldoPoupanca(contaP.getSaldoPoupanca() + valor);
            
        } else {
            System.out.println("Saldo insuficiente para transferir para a poupança.");
        }
    }

    public void debitar(ContaBancaria conta, double valor) {
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }


    public void debitarDaPoupanca(ContaPoupanca contaP, double valor) {
        if (verificarSaldoPoupanca(contaP, valor)) {
            
            contaP.setSaldo(contaP.getSaldo() + valor);
            
            contaP.setSaldoPoupanca(contaP.getSaldo() - valor);
            
        } else {
            System.out.println("Saldo insuficiente na poupança.");
        }
    }
    
    
    public boolean verificarSaldoSuficiente(ContaBancaria conta, double valor) {
        return conta.mostrarSaldo()>= valor;
    }

    public boolean verificarSaldoPoupanca(ContaPoupanca contaP, double valor) {
        return contaP.getSaldoPoupanca() >= valor;
    }

    public void transferenciaBancaria(ContaBancaria origem, ContaBancaria destino, double valor) {
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
