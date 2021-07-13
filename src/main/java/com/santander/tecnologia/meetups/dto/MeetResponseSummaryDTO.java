package com.santander.tecnologia.meetups.dto;

import java.time.LocalDate;

import com.santander.tecnologia.meetups.model.IMeet;

/**
 * Class MeetResponseSummaryDTO implements IMeet
 * 
 * @author Magdaly Santos
 * 
 */
public class MeetResponseSummaryDTO implements IMeet {

    private int id;
    private String reason;
    private String description;
    private LocalDate date;

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
     * @return the reason
     */
    public String getReason() {
	return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
	this.reason = reason;
    }

    /**
     * @return the description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
	this.description = description;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
	return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
	this.date = date;
    }

}
