package com.maic.aula.lista1.q3;

public class Novo extends Imovel {
    private double adicional;
    
    

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public void imprimirAdicional(double valor){
        System.out.println(valor + adicional);
    }
}
