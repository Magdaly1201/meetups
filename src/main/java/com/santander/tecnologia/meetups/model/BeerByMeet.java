package com.santander.tecnologia.meetups.model;

public abstract class BeerByMeet {

    private int id;
    private int invite;

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
     * @return the invite
     */
    public int getInvite() {
	return invite;
    }

    /**
     * @param invite the invite to set
     */
    public void setInvite(int invite) {
	this.invite = invite;
    }

    /**
     * @return
     */
    public abstract double getCountBeerByTemperature();

    /**
     * @return
     */
    public abstract double getBeerByBox();

}
