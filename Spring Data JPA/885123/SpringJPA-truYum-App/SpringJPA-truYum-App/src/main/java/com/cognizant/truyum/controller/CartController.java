package com.cognizant.truyum.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.CartService;
import com.cognizant.truyum.service.MenuItemService;

@Controller
public class CartController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);
	@Autowired
	private CartService cartService;
	@Autowired
	private MenuItemService menuItemService;

	@GetMapping("/add-to-cart")
	public String addToCart(@RequestParam int menuItemId, ModelMap map) {
		LOGGER.info("Start ");
		List<MenuItem> menuItemList = menuItemService.getMenuItemListCustomer();
		map.put("menuItemList", menuItemList);
		LOGGER.debug("List:{}", menuItemList);
		cartService.addToCart(menuItemId);
		LOGGER.info("End ");
		return "menu-item-list-customer-notification";
	}

	@GetMapping("/cart")
	public String cart(ModelMap model) throws Exception {
		LOGGER.info("Start");
		List<Cart> carts = cartService.getCart();
		LOGGER.debug("Cart:{}", carts);
		int total=0;
		if(carts.size()==0)
			return "cart-empty";
		for (Cart cart : carts) {
			total+=cart.getMenuItem().getPrice();
		}
		model.put("cart", carts);
		model.put("total", total);
		LOGGER.info("End");
		return "cart";
	}
	@GetMapping("/delete")
	public String deleteItem(@RequestParam int productId, ModelMap model) {
		LOGGER.info("Start");
		cartService.deleteItem(productId);
		List<Cart> carts = cartService.getCart();
		LOGGER.debug("Cart:{}", carts);
		int total=0;
		if(carts.size()==0)
			return "cart-empty";
		for (Cart cart : carts) {
			total+=cart.getMenuItem().getPrice();
		}
		model.put("cart", carts);
		model.put("total", total);
		LOGGER.info("End");
		return "cart-notification";
	}
}