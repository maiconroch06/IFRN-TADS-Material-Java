package com.maic.pooprojeto.lista1.q1;

public class Gato extends Animal {
    public void mia(){
        System.out.println("Miau");
    }
    
    @Override
    public String caminha() {
        return "Gato caminha";
    }
}
