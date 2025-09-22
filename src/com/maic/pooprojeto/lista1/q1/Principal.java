package com.maic.pooprojeto.lista1.q1;
//sout atalho do print
//psvm atalho do class main
public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal("Peixe");
        System.out.println(animal.caminha());
        
        Cachorro c = new Cachorro();
        c.late();
        System.out.println(c.caminha());
        
        Gato g = new Gato();
        g.mia();
        System.out.println(g.caminha());
    
        
    }
        
}
