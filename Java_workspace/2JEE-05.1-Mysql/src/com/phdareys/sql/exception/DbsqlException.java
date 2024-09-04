package com.phdareys.sql.exception;

public class DbsqlException extends Exception {

	/**
	 * une exception spécialisée... qui ne fait pas grand-chose pour le moment
	 */
	private static final long serialVersionUID = 1L;
	private String mess;
	public DbsqlException() {
		// TODO Auto-generated constructor stub
	}

	public DbsqlException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		this.mess = message;
	}

	public String getError() {
		return this.mess;
	}
}
