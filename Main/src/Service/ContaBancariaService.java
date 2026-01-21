package Service;

import classes.ContaBancaria;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import java.util.HashMap;

public class ContaBancariaService {
    
    HashMap<String, ContaBancaria> contas = new HashMap<>();
    
    private int sequenciaCorrente = 0;
    private int sequenciaPoupanca = 0;

    public void cadastrar(ContaCorrente corrente, ContaPoupanca poupanca) {
        contas.put(corrente.getNumero(), corrente);
        contas.put(poupanca.getNumero(), poupanca);
    }
    
    public boolean remover(String numero) {
        return contas.remove(numero) != null;
    }
    
    public ContaBancaria buscar(String numero) {
        return contas.get(numero);
    }
    
    public HashMap<String, ContaBancaria> listar(){
        return contas;
    }
    
    public String gerarNumeroCorrente() {
        sequenciaCorrente++;
        return String.format("01%02d", sequenciaCorrente);
    }
    
    public String gerarNumeroPoupanca() {
        sequenciaPoupanca++;
        return String.format("02%02d", sequenciaPoupanca);
    }
    
}

// #######_Caso_Precise_#######
    
//    public void cadastrar(ContaCorrente corrente) {
//        contas.put(gerarNumeroCorrente(), corrente);
//    }
//    
//    public void cadastrar(ContaPoupanca poupanca) {
//        contas.put(gerarNumeroPoupanca(), poupanca);
//    }
    
