package com.capgemini.employee_cucumber_1.exceptions;

public class EmployeeIdAlreadyExistException extends RuntimeException {

	public EmployeeIdAlreadyExistException(String string) {
		super(string);
	}

}
