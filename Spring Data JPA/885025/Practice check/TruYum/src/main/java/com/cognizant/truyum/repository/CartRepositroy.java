package com.cognizant.truyum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.truyum.model.Cart;

public interface CartRepositroy extends JpaRepository<Cart, Integer> {

}