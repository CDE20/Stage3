package com.cognizant.truyum.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="menu_item")
public class MenuItem {
	@Id
	@Column(name="me_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="me_name")
	private String name;
	@Column(name="me_price", columnDefinition = "decimal", precision = 8, scale = 2)
	private double price;
	@Column(name="me_active")
	private String active;
	@Column(name="me_date_of_launch")
	private Date dateOfLaunch;
	@Column(name="me_category")
	private String category;
	@Column(name="me_free_delivery")
	private String freeDelivery;
	
	@OneToMany(mappedBy = "menuItem", fetch = FetchType.EAGER)
	private List<Cart> carts;
	
	public MenuItem() {
		
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
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
		this.category = category;
	}


	public String getFreeDelivery() {
		return freeDelivery;
	}


	public void setFreeDelivery(String freeDelivery) {
		this.freeDelivery = freeDelivery;
	}


	public List<Cart> getCarts() {
		return carts;
	}


	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + ", dateOfLaunch="
				+ dateOfLaunch + ", category=" + category + ", freeDelivery=" + freeDelivery + ", carts=" + carts + "]";
	}
	public boolean equals(MenuItem obj) {
		if (this.getId() == obj.getId())
			return true;
		return false;

	}

}