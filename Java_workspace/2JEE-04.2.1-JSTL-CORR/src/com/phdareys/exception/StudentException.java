package com.phdareys.exception;

public class StudentException extends Exception {
		// Exception � minima (en g�n�ral on met la grvit� et un code...
	private static final long serialVersionUID = -1983582211860557477L;
	private String mess;

	public StudentException(String mess) {
		super();
		this.mess = mess;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return mess;
	}

}
