/**
 * 
 */
package com.santander.tecnologia.meetups.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Magdaly Santos
 * 
 */
@Entity
@Table(name = "users_attending_meet")
public class UsersAttendingMeet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "username")
    private String username;

    @Column(nullable = false, name = "check_in")
    private Boolean checkIn;

    @ManyToOne()
    private Meet meet;

    public UsersAttendingMeet() {
	super();
    }

    public UsersAttendingMeet(String username, Meet meet) {
	super();
	this.username = username;
	this.meet = meet;
	this.checkIn = false;
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the username
     */
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
     * @return the checkIn
     */
    public Boolean getCheckIn() {
	return checkIn;
    }

    /**
     * @param checkIn the checkIn to set
     */
    public void setCheckIn(Boolean checkIn) {
	this.checkIn = checkIn;
    }

    public void checkingAssistence() {
	this.setCheckIn(true);
    }

}
