package trabalho.herança;

public class TrabalhoHerança {

    public static void main(String[] args) {
        
         // Criando uma conta corrente e poupanca
        ContaCorrente cc = new ContaCorrente("João", 200);
        ContaPoupanca cp = new ContaPoupanca("Maria", 300);

        // Criando objeto para operações
        OperacoesBancarias op = new OperacoesBancarias();

        // Testando conta corrente
        cc.show();
        op.creditarContaCorrente(cc, 50);
        cc.show();
        op.debitarContaCorrente(cc, 100);
        cc.show();

        // Testando conta poupança
        cp.show();
        op.creditarEmPoupanca(cp, 100);
        System.out.println("Saldo na poupança: " + cp.getSaldoPoupanca());
        op.debitarDaPoupanca(cp, 50);
        System.out.println("Saldo na poupança: " + cp.getSaldoPoupanca());

        // Transferência entre correntes
        ContaCorrente cc2 = new ContaCorrente("Carlos", 100);
        op.transferenciaBancaria(cc, cc2, 80);

        cc.show();
        cc2.show();
        
    }
    
}
