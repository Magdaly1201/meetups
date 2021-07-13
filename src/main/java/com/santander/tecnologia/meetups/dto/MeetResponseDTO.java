package com.santander.tecnologia.meetups.dto;

import java.time.LocalDate;

import com.santander.tecnologia.meetups.model.IMeet;

/**
 * Class MeetResponseDTO implements IMeet
 * 
 * @author Magdaly Santos
 * 
 */
public class MeetResponseDTO implements IMeet {

    private int id;
    private String reason;
    private String description;
    private LocalDate date;
    private int countOfAttendeesAtMeet;
    private double temperature;

    /**
     * @return the id
     */
    @Override
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
    @Override
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
    @Override
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
     * @return the dateAndTime
     */
    @Override
    public LocalDate getDate() {
	return date;
    }

    /**
     * @param dateAndTime the dateAndTime to set
     */
    public void setDate(LocalDate date) {
	this.date = date;
    }

    /**
     * @return the countOfAttendeesAtMeet
     */
    public int getCountOfAttendeesAtMeet() {
	return countOfAttendeesAtMeet;
    }

    /**
     * @param countOfAttendeesAtMeet the countOfAttendeesAtMeet to set
     */
    public void setCountOfAttendeesAtMeet(int countOfAttendeesAtMeet) {
	this.countOfAttendeesAtMeet = countOfAttendeesAtMeet;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
	return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
	this.temperature = temperature;
    }

}
