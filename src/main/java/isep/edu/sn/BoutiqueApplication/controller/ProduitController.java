package isep.edu.sn.BoutiqueApplication.controller;

import isep.edu.sn.BoutiqueApplication.entity.Produit;
import isep.edu.sn.BoutiqueApplication.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @GetMapping
    public List<Produit> all() {
        return produitService.getAll();
    }

    @GetMapping("/{id}")
    public Produit get(@PathVariable Long id) {
        return produitService.getById(id);
    }

    @PostMapping
    public Produit create(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @PutMapping("/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        return produitService.update(id, produit);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produitService.delete(id);
    }



}

