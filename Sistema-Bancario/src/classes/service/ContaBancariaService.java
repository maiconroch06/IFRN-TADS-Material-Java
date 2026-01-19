package classes.service;

import classes.ContaBancaria;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ContaBancariaService {
    
    HashMap<String, ContaBancaria> contas = new HashMap<>();
    private static int contadorCorrente = 1;
    private static int contadorPoupanca = 1;
    
    public boolean criar(ContaBancaria conta) {
        if(contas.containsKey(conta.getNumero())){
            return false;
        }
        contas.put(conta.getNumero(), conta);
        return true;
    }
    
    public boolean depositar(String numero, double valor) {
        ContaBancaria conta = contas.get(numero);
        
        if(conta == null || valor <= 0) {
            return false;
        } else {
            conta.depositar(valor);
            JOptionPane.showMessageDialog(null, "Deposite um valor acima do numero 0(zero)!");
            return true;
        }
    }

    public ContaBancaria buscar(String numero) {
        return contas.get(numero);
    }
    
    public boolean deletar(String numero) {
        return contas.remove(numero) != null;
    }

    public HashMap<String, ContaBancaria> listar() {
        return contas;
    }
    
    // Metodos de contagem de Prtocolo de Numero de Conta
    public String gerarNumeroContaCorrente() {
        String numero = String.format("01%02d", contadorCorrente);
        contadorCorrente++;
        return numero;
    }

    //String.format se a semelha com "prinf" de C
    public String gerarNumeroContaPoupanca() {
        String numero = String.format("02%02d", contadorPoupanca);
        contadorPoupanca++;
        return numero;
    }

    public boolean transferir(String origem, String destino, double valor) {
        ContaBancaria contaOrigem = contas.get(origem);
        ContaBancaria contaDestino = contas.get(destino);

        if (contaOrigem == null || contaDestino == null) {
            return false;
        }

        if (!contaOrigem.sacar(valor)) {
            return false;
        }

        contaDestino.depositar(valor); {
            return true;
        }
    }
    
}
