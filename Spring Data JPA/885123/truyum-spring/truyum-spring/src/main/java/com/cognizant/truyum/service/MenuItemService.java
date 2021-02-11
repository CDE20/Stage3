package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@Service(value="menuItemService")
public class MenuItemService {
	
	@Autowired
	@Qualifier("daoImpl")
	private MenuItemDao menuItemDao;
	
	
	public List<MenuItem> getMenuItemListAdmin(){
		return menuItemDao.getMenuItemListAdmin();
	}
	
	public List<MenuItem> getMenuItemListCustomer(){
		return menuItemDao.getMenuItemListCustomer();
	}
	
	public MenuItem getMenuItem(long id) {
		return menuItemDao.getMenuItem(id);
	}
	
	public void modifyMenuItem(MenuItem menuItem) {
		menuItemDao.modifyMenuItem(menuItem);
	}

}
