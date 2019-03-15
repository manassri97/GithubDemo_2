package com.capgemini.employee_cucumber_1.service;

import java.util.List;

import com.capgemini.employee_cucumber_1.bean.Address;
import com.capgemini.employee_cucumber_1.bean.Employee;
import com.capgemini.employee_cucumber_1.exceptions.EmployeeIdAlreadyExistException;
import com.capgemini.employee_cucumber_1.exceptions.EmployeeNotPresentException;
import com.capgemini.employee_cucumber_1.exceptions.InvalidEmployeeIdException;
import com.capgemini.employee_cucumber_1.exceptions.InvalidEmployeeNameException;
import com.capgemini.employee_cucumber_1.exceptions.NullAddressException;



public interface EmployeeService {
	public Employee createEmployee(int id, String name, Address address) throws InvalidEmployeeIdException, EmployeeIdAlreadyExistException, InvalidEmployeeNameException, NullAddressException;
	public List<Employee> searchByName(String name) throws InvalidEmployeeNameException, EmployeeNotPresentException;
}