package com.capgemini.employee_cucumber_1.bean;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", " + address + "]"+"\n";
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
