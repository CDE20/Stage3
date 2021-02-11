package com.cognizant.truyum.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepository;

@Service
public class MenuItemService {
	@Autowired
	MenuItemRepository menuItemRepository;
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemRepository.findAll();
	}
	
	public List<MenuItem> getMenuItemListCustomer(){
		return menuItemRepository.getMenuItemListCustomer();
	}
	
	@Transactional
	public MenuItem getMenuItem(int id) {
		return menuItemRepository.findById(id).get();
	}
	
	@Transactional
	public void modifyMenuItem(MenuItem menuItem) {
		Optional<MenuItem> result = menuItemRepository.findById(menuItem.getId());
		if(result.isPresent()) {
			MenuItem item = result.get();
			item.setActive(menuItem.isActive());
			item.setCategory(menuItem.getCategory());
			item.setDateOfLaunch(menuItem.getDateOfLaunch());
			item.setFreeDelivery(menuItem.isFreeDelivery());
			item.setName(menuItem.getName());
			item.setPrice(menuItem.getPrice());
			menuItemRepository.save(item);
		}
	}
}
