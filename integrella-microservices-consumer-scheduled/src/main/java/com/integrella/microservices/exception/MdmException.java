package com.integrella.microservices.exception;

public class MdmException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 25580366197949653L;

	public MdmException(String message, Throwable cause) {
		super(message, cause);
	}

	public MdmException(String message) {
		super(message);
	}
	
}
