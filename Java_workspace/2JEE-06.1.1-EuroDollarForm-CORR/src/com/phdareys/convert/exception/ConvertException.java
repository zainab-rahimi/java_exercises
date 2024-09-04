package com.phdareys.convert.exception;

public class ConvertException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mess = "";

	public ConvertException(String mess) {
		super();
		this.mess = mess;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return mess;
	}
	

}
