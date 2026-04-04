package develop.entidades;

import java.time.LocalDate;

public class Quadrinhos extends Material{

    private String descricaoBreve;
    private String tipoIlustracao;
    private String ilustrador;

    public Quadrinhos(String titulo, LocalDate ano, String tipo,String descricaoBreve,String tipoIlustracao,String ilustrador) {
        super(titulo, ano, tipo);
        this.descricaoBreve = descricaoBreve;
        this.tipoIlustracao = tipoIlustracao;
        this.ilustrador = ilustrador;
    }

    public String getDescricaoBreve() {
        return descricaoBreve;
    }

    public void setDescricaoBreve(String descricaoBreve) {
        this.descricaoBreve = descricaoBreve;
    }

    public String getTipoIlustracao() {
        return tipoIlustracao;
    }

    public void setTipoIlustracao(String tipoIlustracao) {
        this.tipoIlustracao = tipoIlustracao;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }
}
