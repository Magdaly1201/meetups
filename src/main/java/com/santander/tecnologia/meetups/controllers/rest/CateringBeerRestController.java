/**
 * 
 */
package com.santander.tecnologia.meetups.controllers.rest;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.santander.tecnologia.meetups.controllers.CateringBeerController;
import com.santander.tecnologia.meetups.dto.MeetResponseDTO;
import com.santander.tecnologia.meetups.model.BeerByMeet;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

/**
 * Class CateringBeerRestController.
 * 
 * @author Magdaly Santos
 * 
 */
@RestController
@Api(value = "CateringBeerRestController", description = "REST APIs related to Catering Beer to the Meetups!")
@RequestMapping("/api/v1")
public class CateringBeerRestController {

    @Autowired
    private CateringBeerController controller;

    @GetMapping("/meetup/{id}/beers")
    @RolesAllowed("ADMIN")
    @ApiOperation(value = "Get count of the box beer for the Meetups by id the meet", response = MeetResponseDTO.class, produces = "application/json", notes = "Required roles:ADMIN", authorizations = {
	    @Authorization(value = "apiKey") })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
	    @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	    @ApiResponse(code = 404, message = "not found!!!") })
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> countTheBeerByMeet(int id) throws Exception {

	return new ResponseEntity<BeerByMeet>(this.controller.countTheBeerByMeet(id), HttpStatus.OK);
    }

}
