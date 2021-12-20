package tn.esprit.spring;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.IClientService;

@SuppressWarnings("deprecation")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceTest {
	@Autowired
	IClientService clientService;

	@Test
	public void testGetClientsByDateNaissance() {
		Date dateDebut = new Date("01/01/1995");
		Date dateFin = new Date("31/12/1995");
		List<Client> clients = clientService.retrieveAllClientsByDateNaissance(dateDebut, dateFin);
		for (Client c : clients) {
			int year = c.getDateNaissance().getYear() + 1900;
			System.out.println("year = " + year);
			assertEquals(year, 1995);
		}
	}
}