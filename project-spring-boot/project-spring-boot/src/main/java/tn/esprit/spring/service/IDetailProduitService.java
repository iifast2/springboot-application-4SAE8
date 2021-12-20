package tn.esprit.spring.service;

import tn.esprit.spring.entity.DetailProduit;

public interface IDetailProduitService {

	DetailProduit addDetailProduit(DetailProduit dp);

	// void deleteDetailProduit(Long id);

	DetailProduit updateDetailProduit(DetailProduit dp);

	DetailProduit retrieveDetailProduit(Long id);
}
