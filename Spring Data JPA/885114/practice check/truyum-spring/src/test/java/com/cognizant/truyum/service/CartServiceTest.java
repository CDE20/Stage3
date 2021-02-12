package com.cognizant.truyum.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class CartServiceTest {

	public CartService cartService;

	@Before
	public void initializeService() {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("com.cognizant.tryum");
//		context.refresh();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		cartService = (CartService) context.getBean("cartService");
	}

	@Test(expected = CartEmptyException.class)
	public void testGetAllCartItems() throws CartEmptyException {
		Set<MenuItem> cartItems = cartService.getAllCartItems(1);
	}

	@Test
	public void testAddCartItem() throws CartEmptyException {
		MenuItem menuItem = new MenuItem(1, "Sandwich", 99.00f, true, DateUtil.convertToDate("15/03/2017"),
				"Main Course", true);
		cartService.addCartItem(1, 1);

		Set<MenuItem> cartItems = cartService.getAllCartItems(1);
		assertTrue(cartItems.contains(menuItem));
	}

	@Test
	public void testRemoveCartItem() throws CartEmptyException {
		cartService.addCartItem(1, 1);
		cartService.addCartItem(1, 2);
		cartService.removeCartItem(1, 1);

		assertEquals(1, cartService.getAllCartItems(1).size());
	}

}
