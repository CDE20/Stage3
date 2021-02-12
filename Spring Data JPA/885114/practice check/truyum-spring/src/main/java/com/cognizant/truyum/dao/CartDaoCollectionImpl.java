package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

@Component("cartDao")
public class CartDaoCollectionImpl implements CartDao {

	private HashMap<Long, Cart> userCarts;

	@Autowired
	private MenuItemDao menuItemDao;

	@Override
	public void addCartItem(long userId, long menuItemId) {
//		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		MenuItemDao menuItemDao = context.getBean("menuItemDao", MenuItemDaoCollectionImpl.class);
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);

		if (userCarts.containsKey(userId)) {
			Set<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
			menuItemList.add(menuItem);
		} else {
			Set<MenuItem> menuItemList = new HashSet<>();
			Cart cart = new Cart(menuItemList, 0);
			menuItemList.add(menuItem);
			userCarts.put(userId, cart);
		}
	}

	@Override
	public Set<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		Cart cart = userCarts.getOrDefault(userId, new Cart(new HashSet<MenuItem>(), 0));

		Set<MenuItem> menuItemList = cart.getMenuItemList();

		if (menuItemList.isEmpty()) {
			throw new CartEmptyException("Cart is Empty");
		} else {
			double total = 0;
			for (MenuItem m : menuItemList) {
				total += m.getPrice();
			}
			cart.setTotal(total);
			userCarts.put(userId, cart);
		}
		return menuItemList;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		Cart cart = userCarts.get(userId);
		if (cart != null) {
			Set<MenuItem> menuItemList = cart.getMenuItemList();
			
			for (MenuItem menuItem : menuItemList) {
			    if (menuItem.getId() == menuItemId) {
			    	menuItemList.remove(menuItem);
			    }
				
			}
		}
	}

	public void setUserCarts(HashMap<Long, Cart> userCarts) {
		this.userCarts = userCarts;
	}

}
