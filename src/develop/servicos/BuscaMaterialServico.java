package develop.servicos;

import java.util.ArrayList;
import develop.entidades.Material;

public class BuscaMaterialServico {

    public Material buscarMaterial(ArrayList<Material> materiais, String titulo) {
        for(Material material : materiais) {
            if(material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }
}
