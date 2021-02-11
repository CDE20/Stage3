package com.cognizant.ormlearn.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name="attempt")
public class Attempt {
	@Id
	@Column(name="at_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="at_date")
	private Date date;
	@Column(name = "at_score")
	private Double score;
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
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Attempt [id=" + id + ", date=" + date +  ", score=" + score + "]";
	}
	@ManyToOne
	@JoinColumn(name="at_us_id")
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@OneToMany(mappedBy = "attempt")
	@OrderBy("question.id")
	private Set<AttemptQuestion> attemptQuestion;
	public Set<AttemptQuestion> getAttemptQuestion() {
		return attemptQuestion;
	}
	public void setAttemptQuestion(Set<AttemptQuestion> attemptQuestion) {
		this.attemptQuestion = attemptQuestion;
	}
}
