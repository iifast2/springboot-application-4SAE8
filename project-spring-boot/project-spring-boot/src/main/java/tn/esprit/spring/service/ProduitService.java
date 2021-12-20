package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.respository.ProduitRepository;

@Slf4j
@Service
class ProduitService implements IProduitService {
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits = new ArrayList<>();
		produitRepository.findAll().forEach(p -> produits.add(p));
		for (Produit p : produits) {
			log.info("produit : " + p);
		}
		return produits;
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		// DetailProduitService detailProduitService = new
		// DetailProduitService();
		StockService stockService = new StockService();
		p.setStock(stockService.retrieveStock(idStock));
		log.info("produit : " + p);
		return produitRepository.save(p);
	}

	@Override
	public Produit retrieveProduit(Long id) {
		return produitRepository.findById(id).get();
	}

}
