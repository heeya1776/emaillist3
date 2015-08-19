package com.bit2015.emaillist3.exception;

public class EmailListGetListException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailListGetListException(){
		super("EmailListDao:getListException");
	}
	
	public EmailListGetListException(String msg){
		super(msg);
	}
}
