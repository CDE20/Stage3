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
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;

public class MenuItemServiceTest {

	private MenuItemService menuItemService;

	@Before
	public void initializeService() {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("com.cognizant.truyum");
//		context.refresh();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		menuItemService = (MenuItemService) context.getBean("menuItemService");

	}

	@Test
	public void testGetMenuItemListAdminSize() {
		assertThat(menuItemService.getMenuItemListAdmin().size(), is(5));
	}

	@Test
	public void testGetMenuItemListAdminContainsSandwich() {
		boolean contains = false;
		List<MenuItem> menuItemList = menuItemService.getMenuItemListAdmin();
		for (MenuItem menuItem : menuItemList) {
			if(menuItem.getName().contains("Sandwich")) 
				contains = true;
		}
		
		assertTrue(contains);
	}

	@Test
	public void getMenuItemListCustomerSize() {
		Set<MenuItem> menuItemListCustomer = menuItemService.getMenuItemListCustomer();
		assertThat(menuItemListCustomer.size(), is(3));
	}

	@Test
	public void testGetMenuItemListCustomerNotContainsFrenchFries() {
		boolean contains = false;
		Set<MenuItem> menuItemListCustomer = menuItemService.getMenuItemListCustomer();
		for (MenuItem menuItem : menuItemListCustomer) {
			if (menuItem.getName().contains("French Fries")) 
				contains = true;
		}
		assertFalse(contains);
	}

	@Test
	public void testGetMenuItem() {
		
		MenuItem menuItem = menuItemService.getMenuItem(1);
		
		assertEquals(1, menuItem.getId());
		assertEquals("Sandwich", menuItem.getName());
		assertEquals(99.00, menuItem.getPrice(), 0.00);
		assertTrue(menuItem.isActive());
		assertEquals(new Date(117, 02, 15), menuItem.getDateOfLaunch());
		assertEquals("Main Course", menuItem.getCategory());
		assertTrue(menuItem.isFreeDelivery());
		
	}

	@Test
	public void testModifyMenuItem() {
		MenuItem menuItem = menuItemService.getMenuItem(1);
		menuItem.setName("Samosa");
		menuItemService.modifyMenuItem(menuItem);
		
		assertEquals(menuItem, menuItemService.getMenuItem(1));
	}
}
