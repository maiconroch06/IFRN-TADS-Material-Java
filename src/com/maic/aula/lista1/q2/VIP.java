package com.maic.pooprojeto.lista1.q2;

public class VIP extends Ingresso {
    protected double adicional;
    
    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }
    
    double valorIngressoVIP(double valor, double adicional){
        return valor + adicional;
    }
    
}
