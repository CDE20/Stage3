package com.cognizant.truyum.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

@Controller
public class MenuItemController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);
	@Autowired
	private MenuItemService menuItemService;

	@GetMapping("/show-menu-list-admin")
	public String showMenuItemListAdmin(ModelMap model) throws Exception {
		LOGGER.info("Start");
		List<MenuItem> menuItemList = menuItemService.getMenuItemListAdmin();
		LOGGER.debug("Admin Menu List: {}", menuItemList);
		model.put("menuItemList", menuItemList);
		LOGGER.info("End");
		return "menu-item-list-admin";
	}

	@GetMapping("/show-menu-list-customer")
	public String showMenuItemListCustomer(ModelMap model) throws Exception {
		LOGGER.info("Start");
		List<MenuItem> menuItemList = menuItemService.getMenuItemListCustomer();
		model.put("menuItemList", menuItemList);
		LOGGER.debug("Customer Menu List: {}", menuItemList);
		LOGGER.info("End");
		return "menu-item-list-customer";
	}

	@GetMapping("/show-edit-menu-item")
	public String showEditMenuItem(ModelMap model, @RequestParam("menuItemId") int id) throws ClassNotFoundException {
		LOGGER.info("Start");
		MenuItem item = menuItemService.getMenuItem(id);
		model.put("menuItem", item);
		LOGGER.debug("Items:{}", item);
		LOGGER.info("End");
		return "edit-menu-item";
	}

	@PostMapping("/edit-menu-item")
	public String editMenuItem(@ModelAttribute MenuItem menuItem, BindingResult bindingResult) {
		LOGGER.info("Start");
		if (bindingResult.hasErrors()) {
			LOGGER.debug("{}", bindingResult.getFieldErrors());
		}
		if(menuItem.getFreeDelivery()==null)
				menuItem.setFreeDelivery("No");
		menuItemService.editMenuItem(menuItem);
		LOGGER.info("End");
		return "edit-menu-item-status";
	}
}