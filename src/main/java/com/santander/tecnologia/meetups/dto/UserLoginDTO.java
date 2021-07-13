package com.santander.tecnologia.meetups.dto;

import javax.validation.constraints.NotEmpty;

import com.santander.tecnologia.meetups.model.jwt.IUserLogin;

public class UserLoginDTO implements IUserLogin {

    @NotEmpty(message = "no puede ser vacio.")
    private String username;

    @NotEmpty(message = "no puede ser vacio.")
    private String password;

    /**
     * @return the username
     */
    public String getUsername() {
	return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

}
