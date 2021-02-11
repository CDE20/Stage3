package com.cognizant.truyum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {	
	@Id
	@Column(name="ct_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="ct_us_id")
	private User user;
	@ManyToOne
	@JoinColumn(name="ct_pr_id")
	private MenuItem menuItem;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
}