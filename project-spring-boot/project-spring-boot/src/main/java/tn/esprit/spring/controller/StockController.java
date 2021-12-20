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
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.StockService;

@RestController
@Api(tags = "Gestion de stock")
public class StockController {
	@Autowired
	StockService stockService;

	
// Postman test : GET : http://localhost:8080/api/allstocks
	
	@ApiOperation(value = "Récupérer la liste des stocks")
	@GetMapping("/allstocks")
	private List<Stock> getAllStocks() {
		return stockService.retrieveAllStocks();
	}

// Postman test : GET :	http://localhost:8080/api/stocks/2

	@ApiOperation(value = "Récupérer un stock par son ID")
	@GetMapping("/stocks/{id}")
	private Stock getStock(@PathVariable("id") Long id) {
		return stockService.retrieveStock(id);
	}

// Postman test : POST : http://localhost:8080/api/stocks
	
	@ApiOperation(value = "Ajouter un stock")
	@PostMapping("/stocks")
	private Stock saveStock(@RequestBody Stock s) {
		Stock savedStock = stockService.addStock(s);
		return savedStock;
	}

// Postman test : PUT : http://localhost:8080/api/modifystocks
	
	@ApiOperation(value = "Modifier un stock")
	@PutMapping("/modifystocks")
	private Stock updateStock(@RequestBody Stock s) {
		Stock updatedStock = stockService.updateStock(s);
		return updatedStock;
	}
// Postman test :  DELETE : http://localhost:8080/api/deletestocks/3
	
	@ApiOperation(value = "Supprimer un stock")
	@DeleteMapping("/deletestocks/{id}")
	private void deleteClient(@PathVariable("id") Long id) {
		stockService.deleteStock(id);
	}
}
