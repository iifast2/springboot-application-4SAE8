package tn.esprit.spring.respository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.DetailProduit;

public interface DetailProduitRepository extends CrudRepository<DetailProduit, Long> {

}
