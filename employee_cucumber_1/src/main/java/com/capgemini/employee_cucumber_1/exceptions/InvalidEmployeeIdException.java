package com.capgemini.employee_cucumber_1.exceptions;

public class InvalidEmployeeIdException extends RuntimeException {

	public InvalidEmployeeIdException(String string) {
		super(string);
	}

}
