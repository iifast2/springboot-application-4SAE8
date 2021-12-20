package tn.esprit.spring.respository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Stock;

public interface StockRepository extends CrudRepository<Stock, Long> {

}
