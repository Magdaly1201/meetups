package com.santander.tecnologia.meetups.model;

public class CalculeBeerByMeet extends BeerByMeet {

    private double beers;

    public CalculeBeerByMeet(double beers) {
	this.beers = beers;
    }

    @Override
    public double getCountBeerByTemperature() {
	return getInvite() * beers;
    }

    @Override
    public double getBeerByBox() {
	double countBeerByBox = this.getCountBeerByTemperature() / 6;
	double count = Math.ceil(countBeerByBox);
	return (int) count;
    }

}
