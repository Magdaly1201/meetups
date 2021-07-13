package com.santander.tecnologia.meetups.exceptions;

import com.santander.tecnologia.meetups.enums.ExceptionCodes;

/**
 * Class AccessDeniedException extends CustomException
 * 
 * @author Magdaly Santos
 * 
 */
public class MeetNotFoundException extends CustomException {

    private static final long serialVersionUID = -50510158400280774L;
    private static final ExceptionCodes exceptionCode = ExceptionCodes.MEET_NOT_FOUND;

    public MeetNotFoundException() {
	super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
    }
}
