package isep.edu.sn.BoutiqueApplication.dto;

import isep.edu.sn.BoutiqueApplication.entity.Produit;

public class ProduitMapper {

    public static ProduitDto toDto(Produit produit) {
        return new ProduitDto(
                produit.getId(),
                produit.getNom(),
                produit.getDescription(),
                produit.getPrixUnitaire()
        );
    }

    public static Produit toEntity(ProduitCreateDto dto) {
        return new Produit(null, dto.getNom(), dto.getDescription(), dto.getPrixUnitaire());
    }

    public static void updateEntityFromDto(ProduitUpdateDto dto, Produit produit) {
        produit.setNom(dto.getNom());
        produit.setDescription(dto.getDescription());
        produit.setPrixUnitaire(dto.getPrixUnitaire());
    }
}

