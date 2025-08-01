package isep.edu.sn.BoutiqueApplication.repository;


import isep.edu.sn.BoutiqueApplication.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {


}
