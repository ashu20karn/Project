package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="citylocation")
public class Location {

	@Id
	@GeneratedValue
	private int lId;
	private String cityName;
	public Location() {
		super();
	}
	
	public Location(String cityName) {
		super();
		this.cityName = cityName;
	}

	public Location(int lId, String cityName) {
		super();
		this.lId = lId;
		this.cityName = cityName;
	}
	

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Location [lId=" + lId + ", cityName=" + cityName + "]";
	}
	
	
	
	
	
}
