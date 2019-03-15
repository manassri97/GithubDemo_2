package com.capgemini.employee_cucumber_1.bean;

public class Address {
	private String addressLine;
	private Country country;

	
	@Override
	public String toString() {
		return "addressLine=" + addressLine + ", " + country;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
}
