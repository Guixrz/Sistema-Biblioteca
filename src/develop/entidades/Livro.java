package develop.entidades;

import java.time.LocalDate;

public class Livro extends Material{

    private String descricaoBreve;
    private String autorPrincipal;

    public Livro(String titulo, LocalDate ano, String tipo,String descricaoBreve,String autorPrincipal) {
        super(titulo, ano, tipo);
        this.descricaoBreve = descricaoBreve;
        this.autorPrincipal = autorPrincipal;
    }

    public String getDescricaoBreve() {
        return descricaoBreve;
    }

    public void setDescricaoBreve(String descricaoBreve) {
        this.descricaoBreve = descricaoBreve;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }
}
