package com.capgemini.employee_cucumber_1.service;

import java.util.List;

import com.capgemini.employee_cucumber_1.bean.Address;
import com.capgemini.employee_cucumber_1.bean.Employee;
import com.capgemini.employee_cucumber_1.exceptions.EmployeeIdAlreadyExistException;
import com.capgemini.employee_cucumber_1.exceptions.EmployeeNotPresentException;
import com.capgemini.employee_cucumber_1.exceptions.InvalidAddressLineException;
import com.capgemini.employee_cucumber_1.exceptions.InvalidEmployeeIdException;
import com.capgemini.employee_cucumber_1.exceptions.InvalidEmployeeNameException;
import com.capgemini.employee_cucumber_1.exceptions.NullAddressException;
import com.capgemini.employee_cucumber_1.repo.EmployeeRepo;



public class EmployeeServiceImpl implements EmployeeService{

	EmployeeRepo employeeRepo;
	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo=employeeRepo;
	}

	public Employee createEmployee(int id, String name, Address address) throws InvalidEmployeeIdException, EmployeeIdAlreadyExistException, InvalidEmployeeNameException, NullAddressException {
		Employee employee =new Employee();
		if(validateId(id))
		{
			if(employeeRepo.findById(id))
			{
				throw new EmployeeIdAlreadyExistException("id already exist");
			}
			else
			{
				employee.setId(id);
			}
		}
		if(validateName(name))
		{
			throw new InvalidEmployeeNameException("Sorry name cannot be null");
		}
		else
		{
			employee.setName("manas");
		}
		if(validateAddress(address)) 
		{
			throw new NullAddressException("address cannot be null");
		}
		else if(validateAddressField(address))
		{
			throw new InvalidAddressLineException("Address Line cannot be null");
		}
		else
		{
			employee.setAddress(address);
		}
		return employeeRepo.save(employee);
	}
	
	private boolean validateAddressField(Address address) {
		if(address.getAddressLine()==null || address.getCountry().getCname()==null || address.getCountry().getCity().getName()==null)
			return true;
		else
			return false;	
	}

	public List<Employee> searchByName(String name) throws InvalidEmployeeNameException, EmployeeNotPresentException {
		List<Employee> list;
		if(validateName(name))
		{
			throw new InvalidEmployeeNameException("Sorry name cannot be null");
		}
		list=employeeRepo.findByName(name);
		if(list.size()==0)
		{
			throw new EmployeeNotPresentException("employee doesnot exist");
		}
		return employeeRepo.findByName(name);
	
	}

	private boolean validateAddress(Address address) {
		if(address==null)
			return true;
		else
			return false;
	}

	private boolean validateName(String name) {
		if(name==null)
			return true;
		else
			return false;
	}

	private boolean validateId(int id) throws InvalidEmployeeIdException {
		if(id>0)
			return true;
		else
			throw new InvalidEmployeeIdException("invalid id entered");
	}
}