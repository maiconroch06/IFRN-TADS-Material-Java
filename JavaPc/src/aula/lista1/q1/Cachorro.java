package aula.lista1.q1;

public class Cachorro extends Animal {
    public void late(){
        System.out.println("Auau");
    }
    
    @Override
    public String caminha() {
        return "Cachorro caminha";
    }
}
