package com.capgemini.employee_cucumber_1.exceptions;

public class EmployeeNotPresentException extends RuntimeException {

	public EmployeeNotPresentException(String string) {
		super(string);
	}

}
