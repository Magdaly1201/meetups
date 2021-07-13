/**
 * 
 */
package com.santander.tecnologia.meetups.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.santander.tecnologia.meetups.model.IMeet;

/**
 * @author Magdaly Santos
 * 
 */
@Entity
@Table(name = "meetups")
public class Meet implements IMeet, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "reason")
    private String reason;

    @Column(nullable = true, name = "description")
    private String description;

    @Column(nullable = false, name = "date")
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

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
	return serialVersionUID;
    }

}
