/**
 * 
 */
package com.santander.tecnologia.meetups.exceptions;

import com.santander.tecnologia.meetups.enums.ExceptionCodes;

/**
 * Class AuthenticationFailedException extends CustomException
 * 
 * @author Magdaly Santos
 *
 */
public class AuthenticationFailedException extends CustomException {

    /**
     * 
     */
    private static final long serialVersionUID = -856728934136263657L;
    private static final ExceptionCodes exceptionCode = ExceptionCodes.USERNAME_PASSWORD_NO_MATCH;

    public AuthenticationFailedException() {
	super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
    }
}
