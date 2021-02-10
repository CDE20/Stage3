package com.cognizant.truyum;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	List<MenuItem> mi =(List<MenuItem>) act.getBean("menuItems");
    	
    	MenuItem m = (MenuItem) act.getBean("burgerItem");
    	MenuItemService ms = new MenuItemService();
    	
    	ms.modifyMenuItem(m);
    	
    	System.out.println(ms.getMenuItem(2));
    }
}
