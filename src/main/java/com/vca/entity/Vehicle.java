package com.vca.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="vehicle")
public class Vehicle
{
	private int configId;
	private String compType;
	private String isConfigurable;
	private Model modelId;
	private Component compId;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String compType, String isConfigurable) {
		
		this.compType = compType;
		this.isConfigurable = isConfigurable;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="config_id")
	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	// Define 'createdAt' and 'updatedAt' fields with 'TIMESTAMP' data type
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatedAt", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updatedAt;
    

	public String getCompType() {
		return compType;
	}

	public void setCompType(String compType) {
		this.compType = compType;
	}

	public String getIsConfigurable() {
		return isConfigurable;
	}

	public void setIsConfigurable(String isConfigurable) {
		this.isConfigurable = isConfigurable;
	}
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mod_id")
	public Model getModelId() {
		return modelId;
	}

	public void setModelId(Model modelId) {
		this.modelId = modelId;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "com_id")
	public Component getCompId() {
		return compId;
	}

	public void setCompId(Component compId) {
		this.compId = compId;
	}
	
	

}
