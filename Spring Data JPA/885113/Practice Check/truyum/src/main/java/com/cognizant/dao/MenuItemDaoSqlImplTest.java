package com.cognizant.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cognizant.model.DateUtil;
import com.cognizant.model.MenuItem;
import com.cognizant.service.MenuItemService;

@SpringBootApplication
@EntityScan(basePackages = { "com" })
@ComponentScan(basePackages = { "com.cognizant.service" })
@EnableJpaRepositories(basePackages = { "com.cognizant.repository" })
public class MenuItemDaoSqlImplTest implements CommandLineRunner{
	
	@Autowired
	private  MenuItemService itemService;	
	
	public static void main(String[] args) {

		SpringApplication.run(MenuItemDaoSqlImplTest.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String choice;

		do {
			System.err.println("Menu");
			System.err.println("****************************************");
			System.err.println("1. Admin");
			System.err.println("2. Customer");
			System.err.println("3. Exit");
			System.err.println("****************************************");

			choice = sc.nextLine();
			System.err.println("****************************************");

			switch (choice) {
			case "1": {
				String adminChoice;
				do {
					System.err.println("Admin Menu");
					System.err.println("****************************************");
					System.err.println("1. Get Menu Item List");
					System.err.println("2. Modify Menu Item");
					System.err.println("3. Get Menu Item");
					System.err.println("4. Main Menu");
					System.err.println("****************************************");

					adminChoice = sc.nextLine();
					System.err.println("****************************************");

					switch (adminChoice) {
					case "1": {
						System.err.println("Admin Menu Item List");
						System.err.println("****************************************");
						testGetMenuItemListAdmin(); 
						break;
					}
					case "2": {
						System.err.println("Item 2 is modified. Enter 3 to display the changes.");
						System.err.println("****************************************");
						testModifyMenuItem(2);  // id no.2 is modifing in the impl
						break;
					}
					case "3": {
						System.err.println("2nd Menu Item is displayed");
						System.err.println("****************************************");
						testGetMenuItem(2); //Modified item 2 is diplasyed
						break;
					}
					case "4": {
						break;
					}
					default: {
						System.err.println("Enter valid choice");
					}
					}
				} while (adminChoice.equals("1")||adminChoice.equals("2")||adminChoice.equals("3"));
				choice="3";
				break;
			}
			case "2": {
				System.err.println("Customer Menu Item List");
				System.err.println("****************************************");
				testGetMenuItemListCustomer();
				break;
			}
			case "3": {
				System.err.println("Thank YOU");
				System.exit(0);
				break;
			}
			default: {
				System.err.println("Enter valid choice");
			}
			}
		} while (choice.equals("3"));
		System.err.println("Thank you");
		sc.close();
	}

	public  void testGetMenuItemListAdmin() {

 		List<MenuItem> list = itemService.getMenuItemListAdmin();
		list.forEach(e->System.err.println(e));
		
	}

	public  void testGetMenuItemListCustomer() {

		List<MenuItem> list = itemService.getMenuItemListCustomer();
		list.forEach(e->System.err.println(e));
	}

	public  void testModifyMenuItem(int id) {
		MenuItem menuItem = new MenuItem("Hotdog", 129f, true,DateUtil.convertToDate("23/12/2017"), "Main Course", false);
		itemService.modifyItem(id,menuItem);

	}

	public  void testGetMenuItem(int id) {

		MenuItem list = itemService.getMenuItem(id);
		System.err.println(list);
	}
	
	
	
}