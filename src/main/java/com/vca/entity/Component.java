package com.vca.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Component")
public class Component implements Serializable
{
	private int compId;
	private String compName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comp_id")
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
		
	@Column(name="comp_name")
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	} 
	
}
