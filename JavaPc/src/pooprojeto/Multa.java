package pooprojeto;

import java.util.Date;

public class Multa {

    private int codigo;
    private String nomeFiscal;
    private String descricao;
    private double valor;
    private Date data;
    
    public Multa(int codigo, String nomeFiscal, String descricao, double valor, Date data) {
        this.codigo = codigo;
        this.nomeFiscal = nomeFiscal;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeFiscal() {
        return nomeFiscal;
    }

    public void setNomeFiscal(String nomeFiscal) {
        this.nomeFiscal = nomeFiscal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void show() {
        System.out.println("=============== Detalhes da Multa ===============");
        System.out.println(" 1 - Código: " + getCodigo());
        System.out.println(" 2 - Valor: " + getValor());
        System.out.println(" 3 - Descrição: " + getDescricao());
        System.out.println(" 4 - Data de Expedição: " + getData());
        System.out.println("=================================================");
    }

    public void delete() {
        setCodigo(0);
        setValor(0.0);
        setDescricao("");
        setData(null);
        
        show();
    
    }
}
