package pooprojeto;

public class Estrada {
    
    private String nomeEstrada;
    private int limiteDeVelocidade;
    private int pesagem;
    private String tipo;

    public Estrada(String nomeEstrada, int limiteDeVelocidade, int pesagem, String tipo){
    this.nomeEstrada = nomeEstrada;
    this.limiteDeVelocidade = limiteDeVelocidade;
    this.pesagem = pesagem;
    this.tipo = tipo;
    }
    
    public String getNome(){
        return nomeEstrada;
    }
    
    public void setNome(String nomeEstrada){
    this.nomeEstrada = nomeEstrada;
    }

    public int getLimiteDeVelocidade() {
        return limiteDeVelocidade;
    }

    public void setLimiteDeVelocidade(int limiteDeVelocidade) {
        this.limiteDeVelocidade = limiteDeVelocidade;
    }

    public int getPesagem() {
        return pesagem;
    }

    public void setPesagem(int pesagem) {
        this.pesagem = pesagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void show(){
        System.out.println("============== Detalhes da Estrada ==============");
        System.out.println(" 1 - Nome da Estrada: "+ nomeEstrada);
        System.out.println(" 2 - Tipo de Estrada: "+ tipo);        
        System.out.println(" 3 - Limite de Velocidade: "+ limiteDeVelocidade);
        System.out.println(" 4 - Pesagem: "+ pesagem);
        System.out.println("=================================================");
    }
    
    public void delete(){
        nomeEstrada = null;
        limiteDeVelocidade = 0;
        pesagem = 0;
        tipo = null;

        show();
    
    }
    
}

