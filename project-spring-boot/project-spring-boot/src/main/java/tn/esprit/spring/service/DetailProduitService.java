package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.respository.DetailProduitRepository;

public class DetailProduitService implements IDetailProduitService {
	@Autowired
	DetailProduitRepository detailProduitRepository;

	@Override
	public DetailProduit addDetailProduit(DetailProduit dp) {
		return detailProduitRepository.save(dp);
	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit dp) {
		return detailProduitRepository.save(dp);
	}

	@Override
	public DetailProduit retrieveDetailProduit(Long id) {
		return detailProduitRepository.findById(id).get();
	}

}
