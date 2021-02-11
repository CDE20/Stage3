package com.cognizant.ormlearnstock.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;

@Entity
@Table(name = "stock")
public class Stock {

	@Id
	@Column(name= "st_id")
	private int Id;
	
	@Column(name= "st_code")
	private String code;
	
	@Column(name= "st_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name= "st_open",precision = 2)
	private BigDecimal open;
	
	@Column(name= "st_close",precision = 2)
	private BigDecimal close;
	
	@Column(name= "st_volume")
	private BigDecimal volume;
	
	public Stock(){
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	
	
	
}
