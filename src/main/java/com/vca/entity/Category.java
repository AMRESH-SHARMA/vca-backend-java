package com.vca.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

//	@Column(name = "name")
	private String name;

	public Category() {

	}

	public Category(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getname() {
		return name;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + "]";
	}

}
