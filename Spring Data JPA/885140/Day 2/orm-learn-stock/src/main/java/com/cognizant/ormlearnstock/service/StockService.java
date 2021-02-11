package com.cognizant.ormlearnstock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearnstock.model.Stock;
import com.cognizant.ormlearnstock.repository.StockRepository;

@Service
public class StockService{

	@Autowired
	StockRepository stockRepository;
	
	public List<Stock> findAllStockByMonth(){
		
		return stockRepository.findAllFacebookStockByMonth();
	}
	
	public List<Stock> findAllStockWithPrice(){
		return stockRepository.findAllWithStockPrice();
	}
	
	public List<Stock> findTopThree(){
		return stockRepository.findTopThreeHighestVolumeStock();
	}
	
	public List<Stock> findLeastThreeNetflix(){
		return stockRepository.findLeastThreeNetflixStock();
	}
}
