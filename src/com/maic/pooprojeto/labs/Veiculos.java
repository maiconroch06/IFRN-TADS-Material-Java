package com.maic.pooprojeto.labs;

public class Veiculos {
    
    private String modelo;
    private int ano;
    private String placa;
    private String proprietario;

    public Veiculos(String modelo, int ano, String placa, String proprietario) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.proprietario = proprietario;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void show (){
        System.out.println("=============== Detalhes do Veiculo =============");
        System.out.println(" 1 - Placa: " + placa);
        System.out.println(" 2 - Modelo: " + modelo);
        System.out.println(" 3 - Ano: " + ano);
        System.out.println(" 4 - Proprietario: " + proprietario);
        System.out.println("=================================================");
    }
    
    public void delete(){
        placa = null;
        modelo = null;
        ano = 0;
        proprietario = null;
        
        show();
        
    }
    
}
