package com.cognizant.truyum.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.CartDao;
import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private CartRepository cartRepository;
	
	public Set<MenuItem> getCartItems(long userId) {
		Cart cart = cartRepository.getOne(userId);
		System.out.println(cart);
		Set<MenuItem> menuItemList = cart.getMenuItemList();
		
//		Set<MenuItem> menuItemList = cartRepository.getCartItems(userId);
		
		return menuItemList;
	}

	public void addCartItem(long userId, long menuItemId) {
		cartDao.addCartItem(userId, menuItemId);
	}

	public Set<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		return cartDao.getAllCartItems(userId);
	}

	public void removeCartItem(long userId, long menuItemId) {
		cartDao.removeCartItem(userId, menuItemId);
	}

	public CartDao getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}

}
