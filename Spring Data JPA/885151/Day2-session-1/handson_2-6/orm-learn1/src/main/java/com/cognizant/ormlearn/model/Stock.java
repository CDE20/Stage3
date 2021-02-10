package com.cognizant.ormlearn.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "stock")
public class Stock {
	@Id
	@Column(name="st_id")
	private int st_id;
	@Column(name="st_code")
	private String code;
	@Column(name="st_date")
	private Date date;
	@Column(name="st_open")
	private java.math.BigDecimal open;
	@Column(name="st_close")
	private java.math.BigDecimal close;
	@Column(name="st_volume")
	private java.math.BigDecimal volume;

	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getSt_code() {
		return code;
	}
	public void setSt_code(String st_code) {
		this.code = st_code;
	}
	public Date getSt_date() {
		return date;
	}
	public void setSt_date(Date st_date) {
		this.date = st_date;
	}
	
	public BigDecimal getSt_open() {
		return open;
	}
	public void setSt_open(BigDecimal st_open) {
		this.open = st_open;
	}
	public BigDecimal getSt_close() {
		return close;
	}
	public void setSt_close(BigDecimal st_close) {
		this.close = st_close;
	}
	public BigDecimal getSt_volume() {
		return volume;
	}
	public void setSt_volume(BigDecimal st_volume) {
		this.volume = st_volume;
	}
	@Override
	public String toString() {
		return "Stock [st_id=" + st_id + ", st_code=" + code + ", date=" + date + ", st_open=" + open
				+ ", st_close=" + close + ", st_volume=" + volume + "]";
	}
	
}
