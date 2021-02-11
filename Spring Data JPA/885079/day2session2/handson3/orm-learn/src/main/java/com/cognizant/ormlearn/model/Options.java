package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "options")
public class Options {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "op_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="op_qt_id")
	private Question question;
	
	@Column(name = "op_score")
	private double score;
	
	@Column(name = "op_text")
	private String text;
	
	@ManyToMany(mappedBy = "options")
	private Set<Attempt> attempts;
	
	
}