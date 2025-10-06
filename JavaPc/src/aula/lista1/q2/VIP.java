package aula.lista1.q2;

import aula.lista1.q2.Ingresso;

public class VIP extends Ingresso {
    private double valorAdicional;
    
    public double valorIngressoVIP(){
        return valor + valorAdicional;
    }
}

