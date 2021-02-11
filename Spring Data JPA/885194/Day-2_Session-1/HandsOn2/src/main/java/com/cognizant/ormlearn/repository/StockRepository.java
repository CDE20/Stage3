package com.cognizant.ormlearn.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	List<Stock> findByCodeAndDateBetween(String code, Date open, Date close);
	List<Stock> findByCloseGreaterThan(double price);
	List <Stock> findFirst3ByOrderByVolumeDesc();
	List <Stock> findFirst3ByCodeOrderByCloseAsc(String name);

}
