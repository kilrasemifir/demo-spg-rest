package fr.kira.formation.spring.demorest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path = "utilisateurs",
        collectionResourceRel = "utilisateurs")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
