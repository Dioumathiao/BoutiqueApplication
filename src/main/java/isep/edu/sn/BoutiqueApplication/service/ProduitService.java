package isep.edu.sn.BoutiqueApplication.service;

import isep.edu.sn.BoutiqueApplication.entity.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> getAll();
    Produit getById(Long id);
    Produit save(Produit produit);
    Produit update(Long id, Produit produit);
    void delete(Long id);
}

