package com.vca.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "models")
public class Model implements Serializable
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String modName;
	
    // Define 'createdAt' and 'updatedAt' fields with 'TIMESTAMP' data type
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatedAt", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updatedAt;
    

//	// @ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "segId", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private Segment segment;

//	// @ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "manuId", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private Manufacturer manufacturer;
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", modName=" + modName + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", segment=" + segment + ", manufacturer=" + manufacturer + ", minQty=" + minQty + ", modelPrice="
				+ modelPrice + ", imgPath=" + imgPath + "]";
	}

	public double getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	private int minQty;
	private double modelPrice;
	private String imgPath;

	public int getId() {
		return id;
	}

	public String getName() {
		return modName;
	}

	public Segment getSegment() {
		return segment;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public int getMinQty() {
		return minQty;
	}

	public void setMinQty(int minQty) {
		this.minQty = minQty;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seg_id")
	private Segment segment;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manu_id")
	private Manufacturer manufacturer;
	
	
}
