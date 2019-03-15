package com.capgemini.employee_cucumber_1.repo;

import java.util.List;

import com.capgemini.employee_cucumber_1.bean.Employee;

public interface EmployeeRepo {
	public Employee save(Employee e);
	public List<Employee> findByName(String name);
	public boolean findById(int id);
}
