/**
 * 
 */
package com.santander.tecnologia.meetups.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * Class MeetRequestDTO
 * 
 * @author Magdaly Santos
 * 
 */
public class MeetRequestDTO {

    @NotNull
    private String reason;
    @NotNull
    private String description;
    @NotNull
    private LocalDate date;

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
