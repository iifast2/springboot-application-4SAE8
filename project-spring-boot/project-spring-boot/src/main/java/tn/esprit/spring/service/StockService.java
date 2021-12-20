package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.respository.StockRepository;

@Slf4j
@Service
public class StockService implements IStockService {
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		List<Stock> stocks = new ArrayList<>();
		stockRepository.findAll().forEach(s -> stocks.add(s));
		for (Stock s : stocks) {
			log.info("stock : ", s);
		}
		return stocks;
	}

	@Override
	public Stock addStock(Stock s) {
		log.info("stock : ", s);
		return stockRepository.save(s);
	}

	@Override
	public Stock updateStock(Stock s) {
		log.info("stock : ", s);
		return stockRepository.save(s);
	}

	@Override
	public Stock retrieveStock(Long id) {
		return stockRepository.findById(id).get();
	}

	@Override
	public void deleteStock(Long id) {
		stockRepository.deleteById(id);
	}

}
