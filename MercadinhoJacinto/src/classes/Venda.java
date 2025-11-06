package classes;

public class Venda extends Produto {
    private Integer ID_Venda;
    
    public int getID_Venda() {
        return ID_Venda;
    }

    public void setID_Venda(int ID_Venda) {
        this.ID_Venda = ID_Venda;
    }
    
    public double mostrarValorTotal() {
        return getValorUnitario() * getQuantidade();
    }

}
