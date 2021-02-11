package com.cognizant.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.MenuItem;
import com.cognizant.repository.MenuItemRepository;
import com.cognizant.util.DateUtil;

@Service
public class MenuItemService {
	@Autowired
	private MenuItemRepository menuItemRepository;
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin()
	{
		return menuItemRepository.findAll();
	}
	@Transactional
	public List<MenuItem> getMenuItemListCustomer()
	{
		
		return menuItemRepository.findByActiveTrueAndDateOfLaunchBefore(new Date());
	}
	@Transactional
	public void modifyItem(int id, MenuItem menuItem)
	{
		MenuItem item=menuItemRepository.findById(id).get();
		item.setName(menuItem.getName());
		item.setPrice(menuItem.getPrice());
		item.setActive(menuItem.isActive());
		item.setDateOfLaunch(menuItem.getDateOfLaunch());
		item.setCategory(menuItem.getCategory());
		item.setFreeDelivery(menuItem.isFreeDelivery());
		menuItemRepository.save(item);
		
	}
	@Transactional
	public MenuItem getMenuItem(int id){
		return menuItemRepository.findById(id).get();
	}
	

}
