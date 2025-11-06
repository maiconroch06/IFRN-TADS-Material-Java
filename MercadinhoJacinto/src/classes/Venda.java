package classes;

public class Venda extends Produto {
    private int ID_Venda;
    private int ID_Cliente;
    private int ID_Funcionario;
    
    public int getID_Venda() {
        return ID_Venda;
    }

    public void setID_Venda(int ID_Venda) {
        this.ID_Venda = ID_Venda;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }

}
