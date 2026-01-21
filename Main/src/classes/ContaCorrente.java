package classes;

public class ContaCorrente extends ContaBancaria {
    
    private final double LIMITE = 100.00;
    
    @Override
    public void debitar(double valor){
        if(valor <= LIMITE + getSaldo()) {
            debitar(getSaldo() - valor);
        }
    }
    
    @Override
    public void creditar(double valor){
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }
    
    @Override
    public double mostrarSaldo(){
        return getSaldo() + LIMITE;
    }
    
}
