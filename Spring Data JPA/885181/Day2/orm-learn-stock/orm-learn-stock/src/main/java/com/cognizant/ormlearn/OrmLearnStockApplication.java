package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.service.StockService;


import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
@SpringBootApplication
public class OrmLearnStockApplication {
	private static StockService stockService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnStockApplication.class);
	public static void main(String[] args) {
	//	SpringApplication.run(OrmLearnStockApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(OrmLearnStockApplication.class, args);

		stockService = context.getBean(StockService.class);
		LOGGER.info("Inside main");
		//testGetAllStock();
		//testFindStockGreaterThanValue();
		//testFindTopThree();
		 //testLowestNetflix();
		testFbStockDetails();
	}
	
	
	private static void testGetAllStock() {

		LOGGER.info("Start");

		List<Stock> stocks = stockService.getAllStock();

		LOGGER.debug("stocks={}", stocks);

		LOGGER.info("End");

		}  
	
	private static void testFindStockGreaterThanValue()
	{
		LOGGER.info("Start");
		List<Stock> stockList = stockService.findAllStockgreaterThan();
		LOGGER.info("End");

	} 
	
	private static void testFindTopThree()
	{
		LOGGER.info("Start");
		List<Stock> stockList = stockService.findTopThree();
		LOGGER.debug("stockList={}", stockList);
		LOGGER.info("End");

	} 
	
	private static void testLowestNetflix()
	{
		LOGGER.info("Start");
		List<Stock> stockList = stockService.lowestNetflix();
		LOGGER.debug("stockList={}", stockList);
		LOGGER.info("End");

	}
	
	private static void testFbStockDetails()
	{
		LOGGER.info("Start");
		List<Stock> stockList = stockService.FbStockDetails();
		LOGGER.debug("stockList={}", stockList);
		LOGGER.info("End");

	}
	
	
	
}
