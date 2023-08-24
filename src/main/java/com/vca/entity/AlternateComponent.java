package com.vca.entity;

import java.util.Date;

import org.springframework.context.annotation.Configuration;

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
@Table(name="alternatecomponent")
@Configuration
public class AlternateComponent 
{
	private int altId;
	
	private double deltaPrice;
	private Model modelId;
	private Component compId;
	private Component altCompId;
	private Vehicle vehId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "veh_id")
	public Vehicle getVehId() {
		return vehId;
	}


	public void setVehId(Vehicle vehId) {
		this.vehId = vehId;
	}


	public AlternateComponent()
	{
		
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="alt_id")
	public int getAltId() {
		return altId;
	}

	public void setAltId(int altId) {
		this.altId = altId;
	}
	

	
	public double getDeltaPrice() {
		return deltaPrice;
	}

	public void setDeltaPrice(double deltaPrice) {
		this.deltaPrice = deltaPrice;
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

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "alt_com_id")
	public Component getAltCompId() {
		return altCompId;
	}


	public void setAltCompId(Component altCompId) {
		this.altCompId = altCompId;
	}



	// Define 'createdAt' and 'updatedAt' fields with 'TIMESTAMP' data type
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatedAt", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updatedAt;

}
