package com.cognizant.truyum;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;
import com.cognizant.truyum.util.DateUtil;

@SpringBootApplication
public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	private static MenuItemService menuItemService;

	public static void main(String[] args) {
		
		LOGGER.info("Inside main");
		
		ApplicationContext context = SpringApplication.run(App.class, args);
		menuItemService = context.getBean(MenuItemService.class);

		testGetAllItems();
		testGetCustomerList();
		testModifyMenuItem();
	}

	private static void testGetAllItems() {
		LOGGER.info("Start");
		List<MenuItem> menuItems = menuItemService.getMenuItemListAdmin();
		LOGGER.debug("Items= {}", menuItems);
		LOGGER.info("End");
	}

	private static void testGetCustomerList() {
		LOGGER.info("Start");
		List<MenuItem> menuItems = menuItemService.getMenuItemListCustomer();
		LOGGER.debug("Items= {}", menuItems);
		LOGGER.info("End");

	}

	private static void testModifyMenuItem() {
		LOGGER.info("Start");
		MenuItem m = new MenuItem(3, "Dominos Pizza", 149.00f, true, DateUtil.convertToDate("05/02/2021"),
				"Main Course", false);
		menuItemService.modifyMenuItem(m);
		LOGGER.debug("Items= {}", m);
		LOGGER.info("End");

	}
}