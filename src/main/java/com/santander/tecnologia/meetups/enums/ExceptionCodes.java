/**
 * 
 */
package com.santander.tecnologia.meetups.enums;

/**
 * @author Magdaly Santos
 *
 */
public enum ExceptionCodes {

    ACCESS_DENIED(1, "No tiene los roles necesarios.", "No tiene los roles necesarios."),
    INVALID_TOKEN(2, "Token invalido.", "Token invalido"), MISSING_TOKEN(3, "Request sin token", "Request sin token"),
    USERNAME_PASSWORD_NO_MATCH(4, "No coincide usuario o password.", "Usuario no encontrado."),
    MEETUP_IS_OVER(5, "Esta meet ya paso.", "Esta meet ya paso."),
    MEET_NOT_FOUND(6, "Meet no encontrada.", "Meet no encontrada.");

    private int code;
    private String userMessage;
    private String systemMessage;

    private ExceptionCodes(int code, String userMessage, String systemMessage) {
	this.code = code;
	this.userMessage = userMessage;
	this.systemMessage = systemMessage;
    }

    /**
     * @return the code
     */
    public int getCode() {
	return code;
    }

    /**
     * @return the userMessage
     */
    public String getUserMessage() {
	return userMessage;
    }

    /**
     * @return the systemMessage
     */
    public String getSystemMessage() {
	return systemMessage;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
	this.code = code;
    }

    /**
     * @param userMessage the userMessage to set
     */
    public void setUserMessage(String userMessage) {
	this.userMessage = userMessage;
    }

    /**
     * @param systemMessage the systemMessage to set
     */
    public void setSystemMessage(String systemMessage) {
	this.systemMessage = systemMessage;
    }

}
