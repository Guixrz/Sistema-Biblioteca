package develop.entidades;

import develop.servicos.Acervo;

import java.time.LocalDate;

public class Funcionario extends Usuario{

    private String emailFuncionario;
    private String departamento;
    private Acervo acervo;

    public Funcionario(String nome, LocalDate dataDeNascimento, Integer ID, String cargo,String emailFuncionario,String departamento) {
        super(nome, dataDeNascimento, ID, cargo);
        this.emailFuncionario = emailFuncionario;
        this.departamento = departamento;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean adicionarMaterial(Material material) {
        boolean parametroAdicao = acervo.getMateriais().add(material);
        return parametroAdicao;
    }

    public boolean removerMaterial(String titulo) {
        Material material = acervo.buscarMaterial(titulo);
        boolean parametroRemocao = acervo.getMateriais().remove(material);
        return parametroRemocao;
    }
}
