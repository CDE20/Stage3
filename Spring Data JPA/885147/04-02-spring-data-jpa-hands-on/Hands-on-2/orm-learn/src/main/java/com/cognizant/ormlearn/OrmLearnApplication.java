package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.StockService;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static StockService stockService;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");
		stockService = context.getBean(StockService.class);
		List<Stock> list = stockService.getByCodeAndDate();
		List<Stock> list1 = stockService.getByCodeAndStockPrice();
		List<Stock> list2 = stockService.getTop3ByVolume();
		List<Stock> list3 = stockService.getTop3ByCode();

		System.out.println("By Code and Date : ");
		for (Stock s : list) {

			System.out.println(s.toString());
		}

		System.out.println("By Code and Stock Price : ");
		for (Stock s : list1) {

			System.out.println(s.toString());
		}
		System.out.println("Top 3 by Volume : ");
		for (Stock s : list2) {

			System.out.println(s.toString());
		}
		System.out.println("Top 3 By Code : ");
		for (Stock s : list3) {

			System.out.println(s.toString());
		}

	}

}