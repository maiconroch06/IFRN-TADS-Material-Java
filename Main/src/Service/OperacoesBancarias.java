package Service;

import classes.ContaBancaria;
import classes.ContaPoupanca;

public class OperacoesBancarias extends ContaBancariaService {
    
    public void creditar(ContaBancaria conta, double valor) {
        conta.creditar(valor);
    }

    public void debitar(ContaBancaria conta, double valor) {
        if (verificarSaldoSuficiente(conta, valor)) {
            conta.debitar(valor);
        } else {
        }
    }

    public void creditarEmPoupanca(ContaPoupanca contaP, double valor) {
        if (verificarSaldoSuficiente(contaP, valor)) {
            contaP.creditarPoupanca(valor);
        } else {
        }
    }

    public boolean verificarSaldoSuficiente(ContaBancaria conta, double valor) {
        return conta.mostrarSaldo()>= valor;
    }

    public void debitarDaPoupanca(ContaPoupanca contaP, double valor) {
        if (verificarSaldoPoupanca(contaP, valor)) {
            contaP.debitarPoupanca(valor);
        } else {
        }
    }
    
    public boolean verificarSaldoPoupanca(ContaPoupanca contaP, double valor) {
        return contaP.getSaldoPoupanca() >= valor;
    }

    public void transferenciaBancaria(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (verificarSaldoSuficiente(origem, valor)) {
            origem.debitar(valor);
            destino.creditar(valor);
            
        } else {
        }
    }
}
