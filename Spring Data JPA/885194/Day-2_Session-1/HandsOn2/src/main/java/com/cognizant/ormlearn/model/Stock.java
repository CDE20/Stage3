package com.cognizant.ormlearn.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
	@Id
	@Column(name="st_id")
	private int id;
	@Column(name="st_code")
	private String code;
	@Column(name="st_date")
	private Date date;
	@Column(name="st_open", columnDefinition="decimal", precision=10, scale=2)
	private double open;
	@Column(name="st_close", columnDefinition="decimal", precision=10, scale=2)
	private double close;
	@Column(name="st_volume", columnDefinition="decimal", precision=10, scale=0)
	private double volume;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return code + " " + date + " " + open + " " + close
				+ " " + String.format("%.0f", volume);
	}
	

}
