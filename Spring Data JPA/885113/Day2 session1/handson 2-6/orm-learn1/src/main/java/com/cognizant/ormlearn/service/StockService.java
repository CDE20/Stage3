package com.cognizant.ormlearn.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	StockRepository stockRepository;
	
	@Transactional
	public Stock get(int id) {
		return stockRepository.findById(id).get();
	}
	
	@Transactional
	public void save(Stock stock) {
		stockRepository.save(stock);
	}
}
