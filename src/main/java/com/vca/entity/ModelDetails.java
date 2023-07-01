package com.vca.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "model_details")
public class ModelDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "mod_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
	private Model model;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "comp_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
	private Component component;

	public Long getId() {
		return id;
	}

	public Model getModel() {
		return model;
	}

	public Component getComponent() {
		return component;
	}

}
