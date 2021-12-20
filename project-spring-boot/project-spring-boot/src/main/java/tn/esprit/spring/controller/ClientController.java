package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.ClientServiceImpl;

@RestController
@Api(tags = "Gestion des clients")
public class ClientController {
	@Autowired
	ClientServiceImpl clientService;

	@ApiOperation(value = "Récupérer la liste des clients")
	@GetMapping("/allclients")
	private List<Client> getAllClients() {
		return clientService.retrieveAllClients();
	}

	@ApiOperation(value = "Récupérer un client par son ID")
	@GetMapping("/clients/{id}")
	private Client getClient(@PathVariable("id") Long id) {
		return clientService.retrieveClient(id);
	}

	@ApiOperation(value = "Ajouter un client")
	@PostMapping("/addclients")
	private Client saveClient(@RequestBody Client client) {
		Client savedClient = clientService.addClient(client);
		return savedClient;
	}

	@ApiOperation(value = "Modifier un client")
	@PutMapping("/modifyclients")
	private Client updateClient(@RequestBody Client client) {
		Client updatedClient = clientService.updateClient(client);
		return updatedClient;
	}

	@ApiOperation(value = "Supprimer un client")
	@DeleteMapping("/deleteclients/{id}")
	private void deleteClient(@PathVariable("id") Long id) {
		clientService.deleteClient(id);
	}
}
