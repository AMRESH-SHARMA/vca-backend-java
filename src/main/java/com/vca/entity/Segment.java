package com.vca.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "segments")
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String segName;
    
    public Segment() {
    }
    
    public Segment(String segName) {
        this.segName = segName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return segName;
    }

    @Override
    public String toString() {
        return "Segment [id=" + id + ", name=" + segName + "]";
    }

	public void setId(long id) {
		this.id = id;
	}

	public void setSegName(String segName) {
		this.segName = segName;
	}
    
    
}
