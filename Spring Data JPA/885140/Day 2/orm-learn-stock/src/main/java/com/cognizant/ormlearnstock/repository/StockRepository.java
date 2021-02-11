package com.cognizant.ormlearnstock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearnstock.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	@Query("select s from Stock s where s.code='FB' and month(s.date)=9")
	public List<Stock> findAllFacebookStockByMonth();
	
	@Query("select s from Stock s where s.close>=1250")
	public List<Stock> findAllWithStockPrice();
	
	@Query(nativeQuery = true , value="select * from Stock  order by st_volume desc limit 3")
	public List<Stock> findTopThreeHighestVolumeStock();
	
	@Query(nativeQuery = true , value="select * from Stock where st_code='NFLX' order by st_volume asc limit 3")
	public List<Stock> findLeastThreeNetflixStock();

}
