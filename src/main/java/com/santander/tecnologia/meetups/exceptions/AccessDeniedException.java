package com.santander.tecnologia.meetups.exceptions;

import com.santander.tecnologia.meetups.enums.ExceptionCodes;

/**
 * Class AccessDeniedException extends CustomException
 * 
 * @author Magdaly Santos
 * 
 */
public class AccessDeniedException extends CustomException {

    private static final long serialVersionUID = -50510158400280774L;
    private static final ExceptionCodes exceptionCode = ExceptionCodes.ACCESS_DENIED;

    public AccessDeniedException() {
	super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
    }
}
