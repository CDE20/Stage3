package com.cognizant.truyum.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@Column(name="Id")
	private int Id;
	@Column(name="Menu_id")
	private int menuId;
	@Column(name = "User_id")
	private int userId;
	
	

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public int getMenuId() {
		return menuId;
	}



	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "Cart [Id=" + Id + ", menuId=" + menuId + ", userId=" + userId + "]";
	}



}
