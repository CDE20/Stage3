package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

@Component("menuItemDao")
public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private List<MenuItem> menuItemList;

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {

		ArrayList<MenuItem> menuItems = new ArrayList<>();
		Date currentDate = new Date();
		for (MenuItem mi : menuItemList) {
			if (mi.getDateOfLaunch().compareTo(currentDate) <= 0) {
				if (mi.isActive())
					menuItems.add(mi);
			}
		}

		return menuItems;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		for (int i = 0; i < menuItemList.size(); i++) {
			if (menuItemList.get(i).equals(menuItem)) {
				menuItemList.remove(i);
				menuItemList.add(i, menuItem);
			}
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		for (MenuItem m : menuItemList) {
			if (m.getId() == menuItemId)
				return m;
		}
		return null;
	}

	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

}
