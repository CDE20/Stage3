package com.cognizant.truyum;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.CartService;
import com.cognizant.truyum.service.MenuItemService;
import com.cognizant.truyum.util.DateUtil;

@SpringBootApplication
@EntityScan(basePackages = { "com.cognizant.truyum" })
@EnableJpaRepositories(basePackages = { "com.cognizant.truyum" })
public class TruyumApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TruyumApplication.class);

	private static MenuItemService menuItemService;

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(TruyumApplication.class, args);
		menuItemService = context.getBean(MenuItemService.class);

		LOGGER.info("Start");
		testGetMenuItemListAdmin();

		testGetCustomerList();
		
		
		testModifyMenuItem();
		
		
		LOGGER.info("End");
	}


	private static void testGetMenuItemListAdmin() {
    	LOGGER.info("Start");
    	List<MenuItem> menuItemsList = menuItemService.getMenuItemListAdmin();
    	LOGGER.debug("Items= {}",menuItemsList);
    	LOGGER.info("End");
    }
    
    private static void testGetCustomerList() {
    	LOGGER.info("Start");
    	Set<MenuItem> menuItemsList = menuItemService.getMenuItemListCustomer();
    	LOGGER.debug("Items= {}",menuItemsList);
    	LOGGER.info("End");
    	
    }
    
    private static void testModifyMenuItem() {
    	LOGGER.info("Start");
    	MenuItem newItem = new MenuItem(5,"Pav Bhaji", 50.00f, true, DateUtil.convertToDate("2015/5/1"), "Main Course", true);
    	menuItemService.modifyMenuItem(newItem);
    	LOGGER.debug("Items= {}",newItem);
    	LOGGER.info("End");
    	
    }

}
