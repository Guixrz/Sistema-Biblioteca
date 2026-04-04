package develop.entidades;

import java.time.LocalDate;

public class Professor extends Usuario{

    private String emailProfissional;
    private String instituicao;
    private String departamento;

    public Professor(String nome, LocalDate dataDeNascimento, Integer ID, String cargo,String emailProfissional,String instituicao,String departamento) {
        super(nome, dataDeNascimento, ID, cargo);
        this.emailProfissional = emailProfissional;
        this.instituicao = instituicao;
        this.departamento = departamento;
    }

    public String getEmailProfissional() {
        return emailProfissional;
    }

    public void setEmailProfissional(String emailProfissional) {
        this.emailProfissional = emailProfissional;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
