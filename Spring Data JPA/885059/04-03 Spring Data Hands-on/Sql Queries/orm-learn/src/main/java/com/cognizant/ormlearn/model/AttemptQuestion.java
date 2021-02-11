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
@Table(name = "attempt_question")
public class AttemptQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aq_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "aq_at_id")
	private Attempt attempt;

	@ManyToOne
	@JoinColumn(name = "aq_qt_id")
	private Question question;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Attempt getAttempt() {
		return attempt;
	}

	public void setAttempt(Attempt attempt) {
		this.attempt = attempt;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "AttemptQuestion [id=" + id + ", attempt=" + attempt + ", question=" + question + "]";
	}

}
