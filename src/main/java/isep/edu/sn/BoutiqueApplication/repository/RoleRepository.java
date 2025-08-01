package isep.edu.sn.BoutiqueApplication.repository;


import isep.edu.sn.BoutiqueApplication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByNom(String nom);
}
