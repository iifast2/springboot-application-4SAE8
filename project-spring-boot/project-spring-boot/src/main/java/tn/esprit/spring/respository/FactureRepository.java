package tn.esprit.spring.respository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Facture;

public interface FactureRepository extends CrudRepository<Facture, Long> {

}
