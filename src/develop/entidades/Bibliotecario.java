package develop.entidades;

import develop.servicos.Acervo;

import java.time.LocalDate;

public class Bibliotecario extends Usuario{

    private String emailChefe;
    private Acervo acervo;

    public Bibliotecario(String nome, LocalDate dataDeNascimento, Integer ID, String cargo,String emailChefe) {
        super(nome, dataDeNascimento, ID, cargo);
        this.emailChefe = emailChefe;
    }

    public String getEmailChefe() {
        return emailChefe;
    }

    public void setEmailChefe(String emailChefe) {
        this.emailChefe = emailChefe;
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
