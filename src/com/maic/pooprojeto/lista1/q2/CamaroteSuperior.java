package com.maic.pooprojeto.lista1.q2;

public class CamaroteSuperior extends VIP {
    private double adicionalSuperior;
    
    public CamaroteSuperior(double valor, double adicional, double adicionalSuperior){
        super(valor, adicional);
        this.adicionalSuperior = adicionalSuperior;
    }
    
    void imprimevalorVIP(){
        return super.valorIngressoVIP() + adicionalSuperior;
    }
}
