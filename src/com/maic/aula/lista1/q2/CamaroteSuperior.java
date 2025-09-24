package com.maic.pooprojeto.lista1.q2;

public class CamaroteSuperior extends VIP {
    private double adicionalSuperior;
    
    public double imprimevalorVIP(){
        return super.valorIngressoVIP() + adicionalSuperior;
    }
}
