package com.santander.tecnologia.meetups.exceptions;

import com.santander.tecnologia.meetups.enums.ExceptionCodes;

/**
 * Class MeetupIsOverException extends CustomException
 * 
 * @author Magdaly Santos
 * 
 */
public class MeetupIsOverException extends CustomException {

    private static final long serialVersionUID = -50510158400280774L;
    private static final ExceptionCodes exceptionCode = ExceptionCodes.MEETUP_IS_OVER;

    public MeetupIsOverException() {
	super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
    }
}
