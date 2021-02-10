package com.cognizant.ormlearn.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;


@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	public List<Stock> findAllByCodeAndDateBetween(String code,Date date, Date date1);
	public List<Stock> findAllByCodeAndCloseGreaterThan(String code,java.math.BigDecimal close);
	public List<Stock> findTop3ByOrderByVolumeDesc();
	public List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
	

}
