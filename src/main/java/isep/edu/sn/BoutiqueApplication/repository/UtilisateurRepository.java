package isep.edu.sn.BoutiqueApplication.repository;


import isep.edu.sn.BoutiqueApplication.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findAllByUsername(String username);

    Utilisateur findByUsername(String username);
}

