package com.santander.tecnologia.meetups.dto;

import com.santander.tecnologia.meetups.model.IUserData;

/**
 * Class UserResponseDTO implements IUserData
 * 
 * @author Magdaly Santos
 *
 */
public class UserResponseDTO implements IUserData {

    private Long id;
    private String username;
    private String fullName;
    private String password;
    private String role;
    private String email;

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
	this.id = id;
    }

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

}
