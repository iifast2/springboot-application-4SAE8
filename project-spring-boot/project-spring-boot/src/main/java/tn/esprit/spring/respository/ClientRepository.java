package tn.esprit.spring.respository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	@Query("SELECT c FROM Client c WHERE c.dateNaissance BETWEEN ?1 AND ?2")
	List<Client> retrieveClientsByDateNaissance(Date dateDebut, Date dateFin);
}
