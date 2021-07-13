package com.santander.tecnologia.meetups.exceptions;

import com.santander.tecnologia.meetups.enums.ExceptionCodes;

/**
 * Class InvalidTokenException extends CustomException
 * 
 * @author Magdaly Santos
 * 
 */
public class InvalidTokenException extends CustomException {

    private static final long serialVersionUID = -791005139316714970L;
    private static final ExceptionCodes exceptionCode = ExceptionCodes.INVALID_TOKEN;

    public InvalidTokenException() {
	super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
    }

}
