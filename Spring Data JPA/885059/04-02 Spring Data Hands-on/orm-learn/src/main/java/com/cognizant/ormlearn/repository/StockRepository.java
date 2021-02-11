package com.cognizant.ormlearn.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	List<Stock> findByCodeAndDateBetween(String media, Date start, Date end);
	List<Stock> findByCodeAndCloseGreaterThan(String media, BigDecimal value);
	List<Stock> findTop3ByOrderByVolumeDesc();
	List<Stock> findTop3ByCodeOrderByClose(String code);
	
}
