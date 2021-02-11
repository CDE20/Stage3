package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="attempt_question")
public class AttemptQuestion {
	@Id
	@Column(name="aq_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="aq_qt_id")
	private Question question;
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@ManyToOne
	@JoinColumn(name="aq_at_id")
	private Attempt attempt;
	public Attempt getAttempt() {
		return attempt;
	}
	public void setAttempt(Attempt attempt) {
		this.attempt = attempt;
	}
	@OneToMany(mappedBy = "attemptQuestion", fetch = FetchType.EAGER)
	private Set<AttemptOption> attemptOption;
	public Set<AttemptOption> getAttemptOption() {
		return attemptOption;
	}
	public void setAttemptOption(Set<AttemptOption> attemptOption) {
		this.attemptOption = attemptOption;
	}
	@Override
	public String toString() {
		return "AttemptQuestion [id=" + id + ", question=" + question + ", attempt=" + attempt + ", attemptOption="
				+ attemptOption + "]";
	}
	
	
	
}
