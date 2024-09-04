package com.phdareys.sql.exception;

public class DbsqlException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3509413100161389917L;
	private String mess;
	public DbsqlException() {
		// TODO Auto-generated constructor stub
	}

	public DbsqlException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		this.mess = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.mess;
	}

}
