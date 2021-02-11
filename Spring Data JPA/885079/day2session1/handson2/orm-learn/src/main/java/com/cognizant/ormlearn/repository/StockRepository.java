package com.cognizant.ormlearn.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
	 List<Stock> findByCodeAndDateBetween(String code,Date d1,Date d2);
	 List<Stock> findByCodeAndCloseGreaterThan(String code, java.math.BigDecimal close);
	 List<Stock> findTop3ByOrderByVolumeAsc();
	 List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
}