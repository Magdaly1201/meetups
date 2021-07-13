package com.santander.tecnologia.meetups.exceptions;

import com.santander.tecnologia.meetups.enums.ExceptionCodes;

/**
 * Class MissingTokenException extends CustomException
 * 
 * @author Magdaly Santos
 * 
 */
public class MissingTokenException extends CustomException {

    private static final long serialVersionUID = -7001536940944730366L;
    private static final ExceptionCodes exceptionCode = ExceptionCodes.MISSING_TOKEN;

    public MissingTokenException() {
	super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
    }
}
