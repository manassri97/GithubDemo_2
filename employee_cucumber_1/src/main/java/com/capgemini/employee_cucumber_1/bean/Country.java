package com.capgemini.employee_cucumber_1.bean;

public class Country {
	private String cname;
	private City city;
	
	
	@Override
	public String toString() {
		return "Country=" + cname + ", " + city;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
