package develop.entidades;

import java.time.LocalDate;

public class Revista extends  Material{

    private String autorPrincipal;
    private String areaConhecimento;

    public Revista(String titulo, LocalDate ano, String tipo,String autorPrincipal,String areaConhecimento) {
        super(titulo, ano, tipo);
        this.autorPrincipal = autorPrincipal;
        this.areaConhecimento = areaConhecimento;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }
}
