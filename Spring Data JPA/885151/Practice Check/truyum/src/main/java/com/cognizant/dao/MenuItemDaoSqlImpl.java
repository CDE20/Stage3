package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.model.MenuItem;
import com.cognizant.service.MenuItemService;



public class MenuItemDaoSqlImpl implements MenuItemDao {

	@Autowired
	private MenuItemService menuService;
	
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuService.getMenuItemListAdmin();
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		return null;
	}

}