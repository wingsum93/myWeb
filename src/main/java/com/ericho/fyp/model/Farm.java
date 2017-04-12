package com.ericho.fyp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "farm")
public class Farm {
	@Id
	@GeneratedValue()
	private int farm_id;
	
	private String name;
	
	private String address;
	
	private String phone_no;
	
	private String description;

	public int getFarm_id() {
		return farm_id;
	}

	public void setFarm_id(int farm_id) {
		this.farm_id = farm_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
