package com.cognizant.truyum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.service.MenuItemService;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Autowired
	MenuItemService service;
	
	@Autowired
	MenuItemDao dao;
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGetMenuItemService()
    {
    	
    	
    }
}
