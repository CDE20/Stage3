package com.cognizant.ormlearn.service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;



@Service
public class StockService {

	@Autowired
	StockRepository stockRepository;
	
	
	public List<Stock> getAllStock()
	{
		return stockRepository.findAll();
	}
	
    public List<Stock> findAllStockgreaterThan()
	{
		return stockRepository.findAllWithStockPriceGreater();
	}
    
    public List<Stock> findTopThree()
    {
    	return stockRepository.findAllTopThree();
    }
	
    public List<Stock> lowestNetflix()
    {
    	return stockRepository.findLowestNetflix();
    }
	
    public List<Stock> FbStockDetails()
    {
    	return stockRepository.findFbStockDetails();
    }
	
	
	
}
