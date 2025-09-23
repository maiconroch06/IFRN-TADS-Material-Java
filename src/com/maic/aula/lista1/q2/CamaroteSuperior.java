package com.maic.pooprojeto.lista1.q2;

public class CamaroteSuperior extends VIP {
    private double adicionalSuperior;

    public double getAdicionalSuperior() {
        return adicionalSuperior;
    }

    public void setAdicionalSuperior(double adicionalSuperior) {
        this.adicionalSuperior = adicionalSuperior;
    }
    
    public CamaroteSuperior(double valor, double adicional, double adicionalSuperior){
        super(valor, adicional);
        this.adicionalSuperior = adicionalSuperior;
    }
    
    public void imprimevalorVIP(){
        return super.valorIngressoVIP() + adicionalSuperior;
    }
}
