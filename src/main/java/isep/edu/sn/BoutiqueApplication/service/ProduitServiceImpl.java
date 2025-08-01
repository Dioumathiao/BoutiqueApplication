package isep.edu.sn.BoutiqueApplication.service;

import isep.edu.sn.BoutiqueApplication.entity.Produit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import isep.edu.sn.BoutiqueApplication.repository.ProduitRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitServiceImpl implements ProduitService {
    private final ProduitRepository produitRepository;

    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    public Produit getById(Long id) {
        return produitRepository.findById(id).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
    }

    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit update(Long id, Produit p) {
        Produit existing = getById(id);
        existing.setNom(p.getNom());
        existing.setDescription(p.getDescription());
        existing.setPrixUnitaire(p.getPrixUnitaire());
        return produitRepository.save(existing);
    }

    public void delete(Long id) {
        produitRepository.deleteById(id);
    }
}
