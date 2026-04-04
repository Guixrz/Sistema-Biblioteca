package develop.servicos;

import develop.entidades.Material;

import java.util.ArrayList;


public class Acervo {
    private ArrayList<Material> materiais;
    private BuscaMaterialServico buscaServico;
    private EmprestarMaterialServico emprestarServico;
    private DevolverMaterialServico devolverServico;

    public Acervo(ArrayList<Material> materiais,BuscaMaterialServico buscaServico,EmprestarMaterialServico emprestarServico,DevolverMaterialServico devolverServico){
        this.materiais = materiais;
        this.buscaServico = buscaServico;
        this.emprestarServico = emprestarServico;
        this.devolverServico = devolverServico;
    }

    public ArrayList<Material> getMateriais() {
        return materiais;
    }

    public BuscaMaterialServico getBuscaServico() {
        return buscaServico;
    }

    public void setBuscaServico(BuscaMaterialServico buscaServico) {
        this.buscaServico = buscaServico;
    }

    public EmprestarMaterialServico getEmprestarServico() {
        return emprestarServico;
    }

    public void setEmprestarServico(EmprestarMaterialServico emprestarServico) {
        this.emprestarServico = emprestarServico;
    }

    public DevolverMaterialServico getDevolverServico() {
        return devolverServico;
    }

    public void setDevolverServico(DevolverMaterialServico devolverServico) {
        this.devolverServico = devolverServico;
    }

    public Material buscarMaterial(String titulo){
        return getBuscaServico().buscarMaterial(materiais,titulo);
    }

    public Material emprestarMaterial(String titulo){
        Material material = this.buscarMaterial(titulo);
        return getEmprestarServico().emprestarMaterial(material);
    }

    public Material devolverMaterial(String titulo){
        Material material = this.buscarMaterial(titulo);
        return getDevolverServico().devolverMaterial(material);
    }
}
