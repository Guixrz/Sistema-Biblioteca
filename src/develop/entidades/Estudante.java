package develop.entidades;

import java.time.LocalDate;

public class Estudante extends Usuario {

    private String emailEstudante;
    private String instituicao;

    public Estudante(String nome, LocalDate dataDeNascimento, Integer ID, String cargo, String emailEstudante,String instituicao) {
        super(nome, dataDeNascimento, ID, cargo);
        this.emailEstudante = emailEstudante;
        this.instituicao = instituicao;
    }

    public String getEmailEstudante() {
        return emailEstudante;
    }

    public void setEmailEstudante(String emailEstudante) {
        this.emailEstudante = emailEstudante;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
