package develop.servicos;

import develop.entidades.Material;

public class EmprestarMaterialServico {

    public Material emprestarMaterial(Material material) {
        if(material != null) {
            if(material.getDisponivel()) {
                material.setDisponivel(false);
                return material;
            } else {
                System.out.println("O material já está em uso.");
            }
        }
        return null;
    }
}
