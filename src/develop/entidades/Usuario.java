package develop.entidades;

import java.time.LocalDate;

public class Usuario{
    private String nome;
    private LocalDate dataDeNascimento;
    private Integer ID;
    private String cargo;

    public Usuario(String nome, LocalDate dataDeNascimento, Integer ID, String cargo) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.ID = ID;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return ID;
    }

    public void setCodigo(Integer ID) {
        this.ID = ID;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCargo() {
        return cargo;
    }
}


