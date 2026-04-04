package develop.servicos;

import develop.entidades.Material;

public class DevolverMaterialServico {

    public Material devolverMaterial(Material material) {
        if(material != null) {
            if(material.getDisponivel()) {
                System.out.println("Material não pode ser devolvido.");
            } else {
                material.setDisponivel(true);
            }
            return material;
        }
        return null;
    }
}
