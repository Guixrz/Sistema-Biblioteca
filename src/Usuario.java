import java.time.LocalDate;

public class Usuario{
    private String nome;
    private LocalDate dataDeNascimento;
    private Integer codigo;
    private String email;

    public Usuario(String nome, LocalDate dataDeNascimento, Integer codigo, String email) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}


