package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entity.Client;

public interface IClientService {

	List<Client> retrieveAllClients();

	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);

	List<Client> retrieveAllClientsByDateNaissance(Date D1, Date D2);
}
