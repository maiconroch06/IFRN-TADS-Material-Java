package com.maic.pooprojeto.lista1.q2;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }
    
    void imprimirValor(){
        System.out.println("Valor do ingresso: R$" + valor);
    }
    
}
