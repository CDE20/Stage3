package com.cognizant.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu_item")
public class MenuItem {
	public MenuItem() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="me_id")
	private int id;
	@Column(name="me_name")
	private String name;
	@Column(name="me_price")
	private float price;
	@Column(name="me_active")
	private boolean active;
	@Column(name="me_date_of_launch")
	private Date dateOfLaunch;
	@Column(name="me_category")
	private String category;
	@Column(name="me_free_delivery")
	private boolean freeDelivery;
	
	public MenuItem(int id, String name, float price, boolean active, Date dateOfLaunch, String category,
			boolean freeDelivery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}
	
	public MenuItem(String name, float price, boolean active, Date dateOfLaunch, 
			String category, boolean freeDelivery) {
		super();
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		category = category;
	}

	public boolean isFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	@Override
	public String toString() {
		return "Id = " + id + "\nName = " + name + "\nPrice = " + price + "\nActive = " + active +
				"\nDate Of Launch = " + dateOfLaunch + "\nCategory = " + category + 
				"\nFree Delivery = " + freeDelivery + "\n***************************************";
	}
	
	
	

}
