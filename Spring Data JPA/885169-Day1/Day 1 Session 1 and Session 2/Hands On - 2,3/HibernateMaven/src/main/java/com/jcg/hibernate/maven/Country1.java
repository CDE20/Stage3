package com.jcg.hibernate.maven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country1")
public class Country1 {
	@Id
	@Column(name="Code", unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int co_code;
	@Column(name="Name", unique = true)
	private String co_name;
	public int getCo_code() {
		return co_code;
	}
	public void setCo_code(int co_code) {
		this.co_code = co_code;
	}
	public String getCo_name() {
		return co_name;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	
	}
