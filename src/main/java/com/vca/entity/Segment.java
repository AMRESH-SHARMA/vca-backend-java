package com.vca.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "segments")
public class Segment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String segName;

	public Segment() {
	}

	public Segment(String segName) {
		this.segName = segName;
	}

	public long getId() {
		return id;
	}

	public String getname() {
		return segName;
	}

	@Override
	public String toString() {
		return "Segment [id=" + id + ", name=" + segName + "]";
	}

}
