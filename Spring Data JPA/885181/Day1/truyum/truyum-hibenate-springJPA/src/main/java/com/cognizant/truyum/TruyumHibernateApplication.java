package com.cognizant.truyum;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;
import com.cognizant.truyum.util.DateUtil;

@SpringBootApplication
public class TruyumHibernateApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TruyumHibernateApplication.class);

	@Autowired
	private static MenuItemService menuItemService;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TruyumHibernateApplication.class, args);
		menuItemService = context.getBean(MenuItemService.class);
		
		//testGetAllMenuItemAdmin();
		//testGetAllMenuItemCustomer();
		//testModifyMenuItem();
		testGetMenuItemById();
	}
	private static void testGetAllMenuItemAdmin() {
		LOGGER.info("Start");
		List<MenuItem> list = menuItemService.getMenuItemListAdmin();
		LOGGER.debug("MenuItem:{}",list);
		LOGGER.info("End");
	}
	
	private static void testGetAllMenuItemCustomer() {
		LOGGER.info("Start");
		List<MenuItem> list = menuItemService.getMenuItemListCustomer();
		LOGGER.debug("MenuItem:{}",list);
		LOGGER.info("End");
	}
	
	private static void testGetMenuItemById() {
		LOGGER.info("Start");
		MenuItem menuItem = menuItemService.getMenuItem(002);
		LOGGER.debug("MenuItem:{}",menuItem.toString());
		System.out.println(menuItem.toString());
		LOGGER.info("End");
	}
	
	private static void testModifyMenuItem() {
		LOGGER.info("Start");
		MenuItem menuItem = new MenuItem(002, "Veg Burger", new BigDecimal("129.00"), true, DateUtil.convertToDate("23/08/2020"), "Main Course", false);
		menuItemService.modifyMenuItem(menuItem);
		LOGGER.info("End");
	}
	
	

}
