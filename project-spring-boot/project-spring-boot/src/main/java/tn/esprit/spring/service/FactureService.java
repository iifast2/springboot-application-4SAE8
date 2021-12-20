package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.respository.FactureRepository;

@Slf4j
@Service
public class FactureService implements IFactureService {
	@Autowired
	FactureRepository factureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures = new ArrayList<>();
		factureRepository.findAll().forEach(f -> factures.add(f));
		for (Facture f : factures) {
			log.info("Facture : " + f);
		}
		return factures;
	}

	@Override
	public void cancelFacture(Long id) {
		Facture facture = retrieveFacture(id);
		facture.setActive(false);
		factureRepository.save(facture);
	}

	@Override
	public Facture retrieveFacture(Long id) {
		return factureRepository.findById(id).get();
	}

}
