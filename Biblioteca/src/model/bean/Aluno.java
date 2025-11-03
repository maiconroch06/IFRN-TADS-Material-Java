package model.bean;

public class Aluno {
    
    private int ID_aluno;
    private String nome;
    private String matricula;
    private String email;
    private String telefone;

    public int getID_aluno() {
        return ID_aluno;
    }

    public void setID_aluno(int ID_aluno) {
        this.ID_aluno = ID_aluno;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
