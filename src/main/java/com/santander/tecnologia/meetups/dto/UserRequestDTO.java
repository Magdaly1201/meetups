/**
 * 
 */
package com.santander.tecnologia.meetups.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.santander.tecnologia.meetups.model.IUserData;

/**
 * Class UserRequestDTO implements IUserData
 * 
 * @author Magdaly Santos
 *
 */
public class UserRequestDTO implements IUserData {

    @NotNull(message = "No puede estar vacio")
    private String username;

    @NotNull(message = "No puede estar vacio")
    private String fullName;

    @NotNull(message = "No puede estar vacio")
    private String password;

    @NotNull(message = "No puede estar vacio")

    private String role;

    @Email(message = "No es una direccion de correo bien formada")
    @NotNull(message = "No puede estar vacio")
    private String email;

    /**
     * @return the username
     */
    @Override
    public String getUsername() {
	return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * @return the fullName
     */
    @Override
    public String getFullName() {
	return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
	this.fullName = fullName;
    }

    /**
     * @return the password
     */
    @Override
    public String getPassword() {
	return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @return the role
     */
    @Override
    public String getRole() {
	return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
	this.role = role;
    }

    /**
     * @return the email
     */
    @Override
    public String getEmail() {
	return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "UserRequestDTO [username=" + username + ", fullName=" + fullName + ", password=" + password + ", role="
		+ role + ", email=" + email + "]";
    }

}
