package isep.edu.sn.BoutiqueApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitCreateDto {
    private String nom;
    private String description;
    private double prixUnitaire;
}
