package com.maic.pooprojeto.labs;

public class Motorista {

    private String nomeMotorista;
    private String cpf;
    private int numeroDeRegistro;
    private String categoriaCnh;
    private String validade;
        
    public Motorista(String nomeMotorista, String cpf, int numeroDeRegistro, String categoriaCnh, String validade) {
        this.nomeMotorista = nomeMotorista;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.categoriaCnh = categoriaCnh;
        this.validade = validade;
    }
    
    public String getNome() {
        return nomeMotorista;
    }
    
    public void setNome(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public String getCategoriaCnh() {
        return categoriaCnh;
    }
    
    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }
    
    public String getValidade() {
        return validade;
    }
    
    public void setValidade (String validade) {
        this.validade = validade;
    }

    
    public void show() {
        System.out.println("============= Detalhes do Motorista =============");
        System.out.println(" 1 - Nome Motorista: " + nomeMotorista);
        System.out.println(" 2 - Cpf: "+cpf);
        System.out.println(" 3 - Numero de Registro: "+numeroDeRegistro);
        System.out.println(" 4 - Categoria da Cnh: "+categoriaCnh);
        System.out.println(" 5 - Validade: "+validade);
        System.out.println("=================================================");
    }
    
    public void delete() {
        nomeMotorista = null;
        cpf = null;
        numeroDeRegistro = 0;
        categoriaCnh = null;
        validade = null;
    
        show();
    
    }
}
