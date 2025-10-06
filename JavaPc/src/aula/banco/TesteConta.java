package aula.banco;

public class TesteConta {

    public static void main(String[] args) {
        // Criando contas
        ContaCorrente conta1 = new ContaCorrente("João", 200);
        ContaCorrente conta2 = new ContaCorrente("Maria", 50);
        ContaPoupanca poupanca = new ContaPoupanca("Carlos", 500);

        OperacoesBancarias op = new OperacoesBancarias();

        // Testando show
        conta1.show();
        conta2.show();
        poupanca.show();

        System.out.println("\n--- Testando operações ---");

        // Creditando valores
        op.creditarContaCorrente(conta1, 100);
        op.creditarContaPoupanca(poupanca, 200);

        // Exibindo saldos após crédito
        conta1.show();
        poupanca.show();

        // Debitanto valores
        op.debitarContaCorrente(conta1, 50);
        op.debitarContaPoupanca(poupanca, 100);

        conta1.show();
        poupanca.show();

        // Transferindo para poupança
        op.creditarEmpoupanca(poupanca, 200);
        System.out.println("Saldo poupança de " + poupanca.getNomeDono() + ": " + poupanca.getSaldoPoupanca());

        // Retirando da poupança
        op.debitarDapoupanca(poupanca, 100);
        System.out.println("Saldo poupança de " + poupanca.getNomeDono() + ": " + poupanca.getSaldoPoupanca());
        poupanca.show();

        // Transferência entre contas correntes
        op.transferenciaBancaria(conta1, conta2, 150);

        conta1.show();
        conta2.show();
    }
}
