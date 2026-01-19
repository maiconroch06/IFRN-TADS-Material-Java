package Services;

import Classes.ContaBancaria;
import java.util.HashMap;

public class ContaBancariaService {
    
    HashMap<String, ContaBancaria> contas = new HashMap<>();
    
    public boolean criar(ContaBancaria conta) {
        if(contas.containsKey(conta.getNumero())){
            return false;
        }
        contas.put(conta.getNumero(), conta);
        return true;
    }
    
    public void depositar(double valor) {
        
    }

    public void buscar() {
        
    }
    
    public void deletar() {
        
    }

    public void listar() {
        
    }
    
    
    
}
