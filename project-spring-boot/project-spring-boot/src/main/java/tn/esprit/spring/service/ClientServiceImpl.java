package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.respository.ClientRepository;

@Slf4j
@Service
public class ClientServiceImpl implements IClientService {
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		List<Client> clients = new ArrayList<>();
		clientRepository.findAll().forEach(c -> clients.add(c));
		for (Client c : clients) {
			log.info("client " + c);
		}
		return clients;
	}

	@Override
	public Client addClient(Client c) {
		log.info("client " + c);
		return clientRepository.save(c);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client c) {
		log.info("client " + c);
		return clientRepository.save(c);
	}

	@Override
	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> retrieveAllClientsByDateNaissance(Date dateDebut, Date dateFin) {
		return clientRepository.retrieveClientsByDateNaissance(dateDebut, dateFin);
	}

}
