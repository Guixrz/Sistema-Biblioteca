package develop.entidades;

import java.time.LocalDate;

public class Material {
    private String titulo;
    private LocalDate ano;
    private boolean disponivel;
    private String tipo; // livro, revista, quadrinhos.

    public Material(String titulo, LocalDate ano, String tipo) {
        this.titulo = titulo;
        this.ano = ano;
        this.tipo = tipo;
        this.disponivel = true;
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

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
