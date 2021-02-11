package com.cognizant.ormlearn.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	@Id
	@Column(name="qt_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="qt_text")
	private String txt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", txt=" + txt + "]";
	}
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private List<AttemptQuestion> attemptQuestion;
	public List<AttemptQuestion> getAttemptQuestion() {
		return attemptQuestion;
	}
	public void setAttemptQuestion(List<AttemptQuestion> attemptQuestion) {
		this.attemptQuestion = attemptQuestion;
	}
	@OneToMany(mappedBy = "question" , fetch = FetchType.EAGER)
	private Set<Options> options;
	public Set<Options> getOptions() {
		return options;
	}
	public void setOptions(Set<Options> options) {
		this.options = options;
	}	
}
