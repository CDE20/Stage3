package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}