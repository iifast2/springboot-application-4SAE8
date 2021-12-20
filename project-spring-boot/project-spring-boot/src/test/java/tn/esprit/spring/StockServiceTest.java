package tn.esprit.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.IStockService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceTest {
	@Autowired
	IStockService stockService;

	@Test
	public void testAddStock() {
		Stock s = new Stock();
		s.setLibelleStock("stock test");
		s.setQte(10);
		s.setQteMin(100);
		Stock savedStock = stockService.addStock(s);
		assertNotNull(savedStock.getIdStock());
		assertNotNull(savedStock.getLibelleStock());
		stockService.deleteStock(savedStock.getIdStock());
	}

	@Test
	public void testDeleteStock() {
		int expected = stockService.retrieveAllStocks().size();
		Stock s = new Stock();
		s.setLibelleStock("stock test!!!");
		s.setQte(10);
		s.setQteMin(100);
		Stock savedStock = stockService.addStock(s);
		stockService.deleteStock(savedStock.getIdStock());
		assertEquals(expected, stockService.retrieveAllStocks().size());
	}

}