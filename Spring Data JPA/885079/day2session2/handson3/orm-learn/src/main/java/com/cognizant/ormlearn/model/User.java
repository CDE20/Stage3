package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int id;
	
	@Column(name = "us_name")
	private String name;
	
	@Column(name = "us_email")
	private String email;
	
	@OneToMany(mappedBy = "user")
	private Set<Attempt> attempt;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Attempt> getAttempt() {
		return attempt;
	}

	public void setAttempt(Set<Attempt> attempt) {
		this.attempt = attempt;
	}

	
	
	
}