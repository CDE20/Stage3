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
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static StockService stockService;
	
	public static void main(String[] args) {
		LOGGER.info("Inside main");
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		stockService = context.getBean(StockService.class);
		
		List<Stock> list=stockService.getStockByCodeAndDate();
		List<Stock> l2=stockService.getStockGreaterThan();
		List<Stock> l3=stockService.getTop3ByVolume();
		List<Stock> l4=stockService.getTop3ByCode();
		for(Stock s: l3) {
			System.out.println(s.toString());
		}
		
	}
	
}


