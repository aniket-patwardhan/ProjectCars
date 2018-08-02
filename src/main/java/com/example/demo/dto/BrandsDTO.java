package com.example.demo.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandsDTO implements Serializable{
	
	@JsonProperty("two_wheeler")
	private String twowheeler;
	
	@JsonProperty("brandID")
	private String brandId;

	@JsonProperty("BrandName")
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
