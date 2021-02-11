package com.cognizant.truyum.service;

import java.util.Date;
import java.util.List;

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
	public List<MenuItem> getMenuItemListAdmin(){
		return menuItemRepository.findAll();
	}
	
	public List<MenuItem> getMenuItemListCustomer(){
		return menuItemRepository.findByActiveNotAndDateOfLaunchBefore(false, new Date());
	}
	
	public MenuItem getMenuItem(int id) {
		return menuItemRepository.findById(id).get();
	}
	
	public void modifyMenuItem(MenuItem menuItem) {
		MenuItem menuItemNew = menuItemRepository.getOne(menuItem.getId());
		menuItemNew=menuItem;
		menuItemRepository.save(menuItemNew);
	}

}