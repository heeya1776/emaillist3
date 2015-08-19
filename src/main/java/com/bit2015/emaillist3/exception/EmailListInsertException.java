package com.bit2015.emaillist3.exception;

public class EmailListInsertException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailListInsertException(){
		super("EmailListDao:insert Exception");
	}
	
	public EmailListInsertException(String msg){
		super(msg);
	}
	
}
