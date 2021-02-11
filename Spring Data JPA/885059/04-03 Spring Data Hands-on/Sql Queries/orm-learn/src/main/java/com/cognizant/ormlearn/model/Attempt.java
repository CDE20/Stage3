package com.cognizant.ormlearn.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Attempt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "at_id")
	private int id;
	@Column(name = "at_date")
	private Date date;
	@Column(name = "at_score")
	private double score;

	@ManyToOne
	@JoinColumn(name = "at_us_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Attempt [id=" + id + ", date=" + date + ", score=" + score + ", user=" + user + "]";
	}

}
