package Q2Funcionario;

public class Vendedor extends Funcionario {
    
    public double calcularComissao() {
        return getSalario() + (getSalario() * 0.1);
    }
    
}
