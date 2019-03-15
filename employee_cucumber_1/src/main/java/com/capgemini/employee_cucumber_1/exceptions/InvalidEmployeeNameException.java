package com.capgemini.employee_cucumber_1.exceptions;

public class InvalidEmployeeNameException extends RuntimeException {

	public InvalidEmployeeNameException(String string) {
		super(string);
	}

}
