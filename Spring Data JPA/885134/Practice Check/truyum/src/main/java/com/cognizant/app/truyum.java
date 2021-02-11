package com.cognizant.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cognizant.model.DateUtil;
import com.cognizant.model.MenuItem;
import com.cognizant.service.MenuItemService;


@SpringBootApplication
@EntityScan(basePackages = { "com" })
@ComponentScan(basePackages = { "com.cognizant.service" })
@EnableJpaRepositories(basePackages = { "com.cognizant.repository" })
public class truyum {

	
	private static MenuItemService itemService;
	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(truyum.class, args);
		itemService=context.getBean(MenuItemService.class);
		List<MenuItem> list = getMenuItemListAdmin();
		itemService.saveAll(list);
		System.err.println("Finished Storing data");
		
		System.err.println("Admin Menu Item List");
		System.err.println("****************************************");
		testGetMenuItemListAdmin(); 
		System.err.println("****************Implement MenuItemDaoSqlImplTest for more options************************");
	}
	
	private static List<MenuItem> getMenuItemListAdmin() {
		List<MenuItem> menuItemList = new ArrayList<MenuItem>();
		MenuItem menuItem;

		menuItem = new MenuItem("Sandwich", 99f, true, DateUtil.convertToDate("15/03/2017"),
				"Main Course", true);
		menuItemList.add(menuItem);
		MenuItem menuItem2 = new MenuItem("Burger", 129f, true, DateUtil.convertToDate("23/12/2017"), 
				"Main Course", false);
		menuItemList.add(menuItem2);
		MenuItem menuItem3 = new MenuItem( "Pizza", 149f, true, DateUtil.convertToDate("21/08/2018"), 
				"Main Course", false);
		
		menuItemList.add(menuItem3);
		MenuItem menuItem4 = new MenuItem("French Fries", 57f, false, 
				DateUtil.convertToDate("02/07/2017"), "Starters", true);
		menuItemList.add(menuItem4);
		MenuItem menuItem5 = new MenuItem("Chocolate Brownie", 32f, true, 
				DateUtil.convertToDate("02/11/2022"), "Dessert", true);
		menuItemList.add(menuItem5);
		return menuItemList;
	}
	
	public static void testGetMenuItemListAdmin() {

 		List<MenuItem> list = itemService.getMenuItemListAdmin();
		list.forEach(e->System.err.println(e));
		
	}

}
