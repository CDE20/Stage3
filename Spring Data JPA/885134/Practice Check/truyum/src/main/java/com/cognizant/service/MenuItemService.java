package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.MenuItem;
import com.cognizant.repository.MenuRepository;

@Service
public class MenuItemService {

	@Autowired
	private MenuRepository menuRepository;

	public void saveAll(List<MenuItem> list) {

		menuRepository.saveAll(list);
	}

	public List<MenuItem> getMenuItemListAdmin() {
		return menuRepository.findAll();
	}

	public List<MenuItem> getMenuItemListCustomer() {
		return menuRepository.findByActiveTrue();
	}

	public void modifyItem(int id ,MenuItem menuItem) {

		MenuItem toupdate = menuRepository.findById(id).get();
		toupdate.setActive(menuItem.isActive());
		toupdate.setCategory(menuItem.getCategory());
		toupdate.setDateOfLaunch(menuItem.getDateOfLaunch());
		toupdate.setFreeDelivery(menuItem.isFreeDelivery());
		toupdate.setName(menuItem.getName());
		toupdate.setPrice(menuItem.getPrice());
		menuRepository.save(toupdate);
		
	}

	public MenuItem getMenuItem(int id) {

		return menuRepository.findById(id).get();
	}
}
