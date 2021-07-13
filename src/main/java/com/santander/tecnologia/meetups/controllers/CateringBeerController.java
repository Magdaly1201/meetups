/**
 * 
 */
package com.santander.tecnologia.meetups.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.santander.tecnologia.meetups.dto.MeetResponseDTO;
import com.santander.tecnologia.meetups.model.BeerByMeet;
import com.santander.tecnologia.meetups.model.FactoryBeersByTemperature;

/**
 * Class CateringBeerController
 * 
 * @author Magdaly Santos
 * 
 */
@Controller
public class CateringBeerController {

    @Autowired
    private MeetupController controller;

    /**
     * method to calculate to box for beer by count the invite
     * 
     * @param id
     * @return
     * @throws Exception
     */
    public BeerByMeet countTheBeerByMeet(int id) throws Exception {
	MeetResponseDTO meet = this.controller.getMeetById(id);
	BeerByMeet beer = FactoryBeersByTemperature.getFactura(meet.getTemperature());
	beer.setId(meet.getId());
	beer.setInvite(meet.getCountOfAttendeesAtMeet());
	beer.getCountBeerByTemperature();
	beer.getBeerByBox();
	return beer;
    }

}
