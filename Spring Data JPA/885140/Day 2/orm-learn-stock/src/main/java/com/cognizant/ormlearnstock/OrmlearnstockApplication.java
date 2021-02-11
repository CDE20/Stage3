package com.cognizant.ormlearnstock;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearnstock.model.Stock;
import com.cognizant.ormlearnstock.service.StockService;

@SpringBootApplication
@ComponentScan("com.*")
public class OrmlearnstockApplication {
	
	@Autowired
	private static StockService stockService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmlearnstockApplication.class);
	
	public static void testGetStockByMonth() {
			List<Stock> list = stockService.findAllStockByMonth();
			for (Stock stock : list) {
				System.out.println(stock.getId() + "\t" + stock.getCode() + "\t" + stock.getDate() + "\t" + stock.getOpen() + "\t" + stock.getClose() + "\t" + stock.getVolume());
			}
	}
	
	public static void testGetStockByPrice() {
		List<Stock> list = stockService.findAllStockWithPrice();
		for (Stock stock : list) {
			System.out.println(stock.getId() + "\t" + stock.getCode() + "\t" + stock.getDate() + "\t" + stock.getOpen() + "\t" + stock.getClose() + "\t" + stock.getVolume());
		}
	}
	
	public static void testFindTopThreeStock() {
		List<Stock> list = stockService.findTopThree();
		for (Stock stock : list) {
			System.out.println(stock.getId() + "\t" + stock.getCode() + "\t" + stock.getDate() + "\t" + stock.getOpen() + "\t" + stock.getClose() + "\t" + stock.getVolume());
		}
	}
	
	public static void testFindLeastThree() {
		List<Stock> list = stockService.findLeastThreeNetflix();
		for (Stock stock : list) {
			System.out.println(stock.getId() + "\t" + stock.getCode() + "\t" + stock.getDate() + "\t" + stock.getOpen() + "\t" + stock.getClose() + "\t" + stock.getVolume());
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmlearnstockApplication.class, args);
		stockService = context.getBean(StockService.class);
		//testGetStockByMonth();
		//testGetStockByPrice();
		//testFindTopThreeStock();
		testFindLeastThree();
	}

}
