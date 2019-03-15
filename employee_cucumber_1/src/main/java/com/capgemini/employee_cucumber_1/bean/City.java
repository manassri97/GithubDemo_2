package com.capgemini.employee_cucumber_1.bean;

public class City {
	private String name;

	
	@Override
	public String toString() {
		return "City = " + name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
