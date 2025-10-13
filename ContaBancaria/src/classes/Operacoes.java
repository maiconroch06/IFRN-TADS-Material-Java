package classes;

import javax.swing.JOptionPane;

public class Operacoes {
    
    public void creditarContaCorrente(ContaCorrente contaCorrente, double novoValor) {
        if (novoValor >= 0) {
            contaCorrente.creditar(novoValor);
            JOptionPane.showMessageDialog(null, "Operação de depósito realizada com sucesso\nTitular: "+contaCorrente.getNome()+"\nSaldo atual: "+contaCorrente.getSaldo());     
        } else {
            JOptionPane.showMessageDialog(null,"O valor não pode ser negativo");
        }
    }
    
    
    
}
