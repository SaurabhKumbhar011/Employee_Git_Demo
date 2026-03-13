package com.example.demo.exceptions;

import java.time.LocalDate;

public class ExceptionResponse {
	private String errorMessageString;
	private LocalDate dateOfExceptionDate;
	private int stateCode;

	public String getErrorMessageString() {
		return errorMessageString;
	}

	public void setErrorMessageString(String errorMessageString) {
		this.errorMessageString = errorMessageString;
	}

	public LocalDate getDateOfExceptionDate() {
		return dateOfExceptionDate;
	}

	public void setDateOfExceptionDate(LocalDate dateOfExceptionDate) {
		this.dateOfExceptionDate = dateOfExceptionDate;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public ExceptionResponse() {

	}

	public ExceptionResponse(String errorMessageString, LocalDate dateOfExceptionDate, int stateCode) {
		super();
		this.errorMessageString = errorMessageString;
		this.dateOfExceptionDate = dateOfExceptionDate;
		this.stateCode = stateCode;
	}

}
