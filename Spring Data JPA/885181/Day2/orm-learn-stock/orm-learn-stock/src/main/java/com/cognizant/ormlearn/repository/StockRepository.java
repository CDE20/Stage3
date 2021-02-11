package com.cognizant.ormlearn.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	@Query("select s from Stock s where s.close>1250.00")
	public List<Stock>  findAllWithStockPriceGreater();
	
	@Query(nativeQuery = true , value="select * from Stock order by st_volume desc Limit 3")
	public List<Stock> findAllTopThree();
	
	@Query(nativeQuery = true , value="select * from  Stock where st_code='NFLX' order by st_volume asc Limit 3")
	public List<Stock> findLowestNetflix();
	
	@Query("select s from  Stock s where s.code='FB' and s.date between '2019-09-01' and '2019-09-30'" )
	public List<Stock> findFbStockDetails();
}

