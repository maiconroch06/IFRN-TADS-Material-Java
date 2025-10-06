package aula.lista1.q1;

public class Animal {
    private String nome;
    private String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal(){
        
    }
    
    public String caminha() {
        return nome + " caminha";
    }
    
}
