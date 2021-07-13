package com.santander.tecnologia.meetups.model;

public class FactoryBeersByTemperature {

    public static BeerByMeet getFactura(Double temperature) {

	if (temperature < 20) {
	    double beers = 0.75;
	    return new CalculeBeerByMeet(beers);
	} else if (temperature >= 20 && temperature < 24) {
	    double beers = 1;
	    return new CalculeBeerByMeet(beers);
	} else {
	    double beers = 2;
	    return new CalculeBeerByMeet(beers);
	}

    }
}
