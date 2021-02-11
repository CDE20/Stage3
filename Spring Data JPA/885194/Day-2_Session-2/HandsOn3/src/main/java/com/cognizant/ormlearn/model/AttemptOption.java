package com.cognizant.ormlearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attempt_option")
public class AttemptOption {
	@Id
	@Column(name = "ao_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ao_selected")
	private boolean selected;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "AttemptOption [id=" + id + ", selected=" + selected + "]";
	}

	@ManyToOne
	@JoinColumn(name = "ao_aq_id")
	private AttemptQuestion attemptQuestion;

	public AttemptQuestion getAttemptQuestion() {
		return attemptQuestion;
	}

	public void setAttemptQuestion(AttemptQuestion attemptQuestion) {
		this.attemptQuestion = attemptQuestion;
	}

	@ManyToOne
	@JoinColumn(name = "ao_op_id")
	private Options options;

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

}
