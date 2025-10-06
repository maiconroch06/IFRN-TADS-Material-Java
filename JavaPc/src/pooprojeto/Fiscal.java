package pooprojeto;

public class Fiscal {

    private String nomeFiscal;
    private String email;
    private String matricula;
    private String turno;
    private String localDeTrabalho;

    // Contrutor - Serve para adicionar valores por parametro do arquivo TesteTransito
    public Fiscal(String nomeFiscal, String email, String matricula, String turno, String localDeTrabalho) {
        this.nomeFiscal = nomeFiscal;
        this.email = email;
        this.matricula = matricula;
        this.turno = turno;
        this.localDeTrabalho = localDeTrabalho;
    }
    
    // getNome - Serve para acessar o valor do atributo privado nome da classe Fiscal. Ele lê o valor que já está armazenado em nome.
    public String getNome() {
        return nomeFiscal;
    }
    
    // setNome - Serve para modificar o valor do atributo privado nome. É uma forma controlada de alterar o conteúdo da variável nome.
    public void setNome(String nomeFiscal) {
        this.nomeFiscal = nomeFiscal;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void show(){
        System.out.println("=============== Detalhes do Fiscal ==============");
        System.out.println(" 1 - Nome Fiscal: " + nomeFiscal);
        System.out.println(" 2 - Email: " + email);
        System.out.println(" 3 - Matricula: "+ matricula);
        System.out.println(" 4 - Local de Trabalho: " + localDeTrabalho);
        System.out.println(" 5 - Turno: " + turno);
        System.out.println("=================================================");
    }
    
    // delete - Substitui os valores das variaveis
    public void delete(){
        nomeFiscal = null;
        email = null;
        matricula = null;
        turno = null;
        localDeTrabalho = null;
        
        show();
        
    }

}
