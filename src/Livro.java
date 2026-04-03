import java.time.LocalDate;

public class Livro{
    private String titulo;
    private LocalDate ano;
    private String autor;
    private String descricao;
    private Boolean disponivel;

    public Livro(String titulo, LocalDate ano, String autor, String descricao){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.descricao = descricao;
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}


