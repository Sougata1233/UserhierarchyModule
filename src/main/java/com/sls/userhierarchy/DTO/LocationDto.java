package com.sls.userhierarchy.DTO;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class LocationDto {

	private long id;
	
	private String locationArea;
	
	private String locationCity;
	
	private String locationState;
	
	private String locationCountry;
	
	private long locationPin;
	
	private long createdBy;
	
	private Date createdOn;
	
	private long modBy;
	
	private Date modOn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocationArea() {
		return locationArea;
	}

	public void setLocationArea(String locationArea) {
		this.locationArea = locationArea;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getLocationState() {
		return locationState;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}

	public String getLocationCountry() {
		return locationCountry;
	}

	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}

	public long getLocationPin() {
		return locationPin;
	}

	public void setLocationPin(long locationPin) {
		this.locationPin = locationPin;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public long getModBy() {
		return modBy;
	}

	public void setModBy(long modBy) {
		this.modBy = modBy;
	}

	public Date getModOn() {
		return modOn;
	}

	public void setModOn(Date modOn) {
		this.modOn = modOn;
	}

	public LocationDto(long id, String locationArea, String locationCity, String locationState, String locationCountry,
			long locationPin, long createdBy, Date createdOn, long modBy, Date modOn) {
		super();
		this.id = id;
		this.locationArea = locationArea;
		this.locationCity = locationCity;
		this.locationState = locationState;
		this.locationCountry = locationCountry;
		this.locationPin = locationPin;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modBy = modBy;
		this.modOn = modOn;
	}

	public LocationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", locationArea=" + locationArea + ", locationCity=" + locationCity
				+ ", locationState=" + locationState + ", locationCountry=" + locationCountry + ", locationPin="
				+ locationPin + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modBy=" + modBy
				+ ", modOn=" + modOn + "]";
	}
	
	
	
}
