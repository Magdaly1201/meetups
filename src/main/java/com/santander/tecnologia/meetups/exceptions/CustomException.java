package com.santander.tecnologia.meetups.exceptions;

/**
 * Class CustomException extends Exception
 * 
 * @author Magdaly Santos
 * 
 */
public class CustomException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected int code;
    protected String userMessage;
    protected String systemMessage;

    public CustomException(int code, String userMessage, String systemMessage) {
	super();
	this.code = code;
	this.userMessage = userMessage;
	this.systemMessage = systemMessage;
    }

    public int getCode() {
	return code;
    }

    public String getUserMessage() {
	return userMessage;
    }

    public String getSystemMessage() {
	return systemMessage;
    }

}
