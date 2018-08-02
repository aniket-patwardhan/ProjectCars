package com.example.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "brandInfo")
@Table(name = "brand_info")
public class Brands {
	
	@Id
	@JsonProperty("two_wheeler")
	@Column(name = "two_wheeler")
	private String twowheeler;
	
	@JsonProperty("brandID")
	@Column(name = "brand_id", length = 50)
	private String brandId;

	@JsonProperty("BrandName")
	@Column(name = "brand_name", length = 100)
	private String brandName;

	public String getTwowheeler() {
		return twowheeler;
	}

	public void setTwowheeler(String twowheeler) {
		this.twowheeler = twowheeler;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



}
