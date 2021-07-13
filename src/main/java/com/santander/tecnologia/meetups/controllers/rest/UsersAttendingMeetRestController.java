/**
 * 
 */
package com.santander.tecnologia.meetups.controllers.rest;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.santander.tecnologia.meetups.controllers.UsersAttendingMeetController;
import com.santander.tecnologia.meetups.entity.UsersAttendingMeet;
import com.santander.tecnologia.meetups.exceptions.MeetNotFoundException;
import com.santander.tecnologia.meetups.model.jwt.UserJWT;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Class UsersAttendingMeetRestController
 * 
 * @author Magdaly Santos
 * 
 */
@RestController
@Api(value = "UsersAttendingMeetRestController", description = "REST APIs - related to endpoints to sign up for a meet!")
@RequestMapping("/api/v1")
public class UsersAttendingMeetRestController {

    @Autowired
    private UsersAttendingMeetController controller;

    @PostMapping("/meetup/{id}/signup/{username}")
    @RolesAllowed({ "USER" })
    @ApiOperation(value = "asistir a una meet", response = UsersAttendingMeet.class, notes = "Required roles:USER", authorizations = {
	    @Authorization(value = "apiKey") })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
	    @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	    @ApiResponse(code = 404, message = "not found!!!") })
    public ResponseEntity<?> registerByMeet(@PathVariable(value = "id") @NotNull int id,
	    @ApiIgnore @RequestAttribute("com.santander.tecnologia.meetups.model.jwt.UserJWT") UserJWT user)
	    throws MeetNotFoundException {
	System.out.println(user.toString());
	return new ResponseEntity<UsersAttendingMeet>(this.controller.registerByMeet(id, user.getUsername()),
		HttpStatus.OK);
    }

    @PutMapping("/meetup/{id}/checkin/{username}")
    @RolesAllowed({ "USER" })
    @ApiOperation(value = "Checking en una meet a la que se asistio", response = UsersAttendingMeet.class, notes = "Required roles:USER", authorizations = {
	    @Authorization(value = "apiKey") })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
	    @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	    @ApiResponse(code = 404, message = "not found!!!") })
    public ResponseEntity<?> checkinByMeet(@PathVariable(value = "id") @NotNull int id,

	    @ApiIgnore @RequestAttribute("com.santander.tecnologia.meetups.model.jwt.UserJWT") UserJWT user)
	    throws MeetNotFoundException {
	System.out.println(user.toString());
	return new ResponseEntity<UsersAttendingMeet>(this.controller.checkingMeet(id, user.getUsername()),
		HttpStatus.OK);
    }

    @GetMapping("/meetups/{username}")
    @RolesAllowed({ "USER" })
    @ApiOperation(value = "list de todas las meetups en la que esta inscrito un users", response = UsersAttendingMeet.class, notes = "Required roles:USER", authorizations = {
	    @Authorization(value = "apiKey") })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
	    @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	    @ApiResponse(code = 404, message = "not found!!!") })
    @ResponseStatus(HttpStatus.OK)
    public List<UsersAttendingMeet> listMeetupsByUsername(
	    @ApiIgnore @RequestAttribute("com.santander.tecnologia.meetups.model.jwt.UserJWT") UserJWT user) {
	System.out.println(user.toString());
	return this.controller.listMeetupsByUsername(user.getUsername());
    }
}
