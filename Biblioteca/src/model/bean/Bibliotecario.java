package model.bean;

public class Bibliotecario {

    private String nome;
    private String CPF;
    private String matricula;
    private String email;
    private String telefone;
    private String contratacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    public String getContratacao() {
        return contratacao;
    }

    public void setContratacao(String contratacao) {
        this.contratacao = contratacao;
    }
    
}
