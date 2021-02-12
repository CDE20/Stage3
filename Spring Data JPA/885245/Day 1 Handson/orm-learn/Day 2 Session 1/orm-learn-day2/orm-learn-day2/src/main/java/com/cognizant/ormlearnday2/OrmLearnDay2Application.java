package com.cognizant.ormlearnday2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearnday2.model.Stock;
import com.cognizant.ormlearnday2.repository.StockRepository;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnDay2Application {
	
	private static StockRepository stockRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnDay2Application.class);

	public static void main(String[] args) throws ParseException {
		ApplicationContext context=	SpringApplication.run(OrmLearnDay2Application.class, args);
		stockRepository=context.getBean(StockRepository.class);
		stockRepository.findAll();
		testFindByDate();
		testFindPriceGreaterThan();
		testTopThreeHighestDetails();
		testTop3LowestTransactions();
		
		
		
		LOGGER.info("Inside main");
	}

	private static void testFindByDate() throws ParseException
	{
		List<Stock> result=stockRepository.findAllByCodeAndDateBetween("FB",new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-01"),new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-30") );
		
		
	}
	private static void testFindPriceGreaterThan()
	{
		stockRepository.findAllByCodeAndCloseGreaterThan("GOOGLE",new BigDecimal(1250.00));
	}
	private static void testTopThreeHighestDetails()
	{
		stockRepository.findTop3ByOrderByVolumeDesc();
	}
	private static void testTop3LowestTransactions()
	{
		stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");
	}

}


