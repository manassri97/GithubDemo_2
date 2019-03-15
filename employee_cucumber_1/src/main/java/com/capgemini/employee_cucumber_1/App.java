package com.capgemini.employee_cucumber_1;


import com.capgemini.employee_cucumber_1.bean.Address;
import com.capgemini.employee_cucumber_1.bean.City;
import com.capgemini.employee_cucumber_1.bean.Country;
import com.capgemini.employee_cucumber_1.exceptions.EmployeeIdAlreadyExistException;
import com.capgemini.employee_cucumber_1.exceptions.EmployeeNotPresentException;
import com.capgemini.employee_cucumber_1.exceptions.InvalidEmployeeIdException;
import com.capgemini.employee_cucumber_1.exceptions.InvalidEmployeeNameException;
import com.capgemini.employee_cucumber_1.exceptions.NullAddressException;
import com.capgemini.employee_cucumber_1.repo.EmployeeRepo;
import com.capgemini.employee_cucumber_1.repo.EmployeeRepoImpl;
import com.capgemini.employee_cucumber_1.service.EmployeeService;
import com.capgemini.employee_cucumber_1.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeRepo employeeRepo = new EmployeeRepoImpl();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeRepo);
		
		City city = new City();
		city.setName("Kanpur");
		Country country = new Country();
		country.setCname("India");
		country.setCity(city);
		Address address = new Address();
		address.setAddressLine("89, kamla nagar");
		address.setCountry(country);
		try {
			employeeService.createEmployee(1,"manas",address);
		} catch (InvalidEmployeeIdException e2) {
			System.out.println(e2.getMessage());
		} catch (EmployeeIdAlreadyExistException e2) {
			System.out.println(e2.getMessage());
		} catch (InvalidEmployeeNameException e2) {
			System.out.println(e2.getMessage());
		} catch (NullAddressException e2) {
			System.out.println(e2.getMessage());
		}
		
		City city1 = new City();
		city1.setName("Kanpur");
		Country country1 = new Country();
		country1.setCname("India");
		country1.setCity(city1);
		Address address1 = new Address();
		address1.setAddressLine("89, kamla nagar");
		address1.setCountry(country1);
		try {
			employeeService.createEmployee(2,"manas",address1);
		} catch (InvalidEmployeeIdException e2) {
			System.out.println(e2.getMessage());
		} catch (EmployeeIdAlreadyExistException e2) {
			System.out.println(e2.getMessage());
		} catch (InvalidEmployeeNameException e2) {
			System.out.println(e2.getMessage());
		} catch (NullAddressException e2) {
			System.out.println(e2.getMessage());
		}
		
		try {
			System.out.println(employeeService.searchByName("manas"));
		} catch (InvalidEmployeeNameException e) {
			System.out.println(e.getMessage());
		} catch (EmployeeNotPresentException e) {
			System.out.println(e.getMessage());
		}
	}
}
