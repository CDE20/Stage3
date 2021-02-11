package com.cognizant.truyum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
	@Query("select c from Cart c left join fetch c.user u where u.id= :id")
	public List<Cart> findById(@Param("id") int id);
}