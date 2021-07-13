package com.santander.tecnologia.meetups.model.jwt;

/**
 * Class UserJWT
 * 
 * @author Magdaly Santos
 * 
 */
public class UserJWT {

    private Long id;

    private String username;

    private String role;

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
	return username;
    }

    /**
     * @return the role
     */
    public String getRole() {
	return role;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
	this.id = id;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
	this.role = role;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "UserJWT [id=" + id + ", username=" + username + ", role=" + role + "]";
    }

}