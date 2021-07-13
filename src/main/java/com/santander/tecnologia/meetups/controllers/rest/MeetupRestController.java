package com.santander.tecnologia.meetups.controllers.rest;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.santander.tecnologia.meetups.controllers.MeetupController;
import com.santander.tecnologia.meetups.dto.MeetRequestDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseSummaryDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

/**
 * Class RestController Meetup
 * 
 * @author Magdaly Santos
 * 
 */
@RestController
@Api(value = "MeetupRestController", description = "REST APIs related to Meetups!")
@RequestMapping("/api/v1")
public class MeetupRestController {

    @Autowired
    private MeetupController controller;

    @GetMapping("/meetup")
    @RolesAllowed({ "ADMIN", "USER" })
    @ApiOperation(value = "Get list of Meetups in the System ", response = MeetResponseDTO.class, notes = "Required roles:ADMIN , USER", authorizations = {
	    @Authorization(value = "apiKey") })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
	    @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	    @ApiResponse(code = 404, message = "not found!!!") })
    @ResponseStatus(HttpStatus.OK)
    public List<MeetResponseSummaryDTO> getAllMeetups() {
	return this.controller.getAllMeetups();
    }

    @GetMapping("/meetup/{id}")
    @RolesAllowed({ "ADMIN", "USER" })
    @ApiOperation(value = "Get Meetups by id", response = MeetResponseDTO.class, notes = "Required roles:ADMIN , USER", authorizations = {
	    @Authorization(value = "apiKey") })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
	    @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	    @ApiResponse(code = 404, message = "not found!!!") })
    public ResponseEntity<?> getMeetById(@PathVariable(value = "id") @NotNull int id) throws Exception {
	return new ResponseEntity<MeetResponseDTO>(this.controller.getMeetById(id), HttpStatus.OK);
    }

    @PostMapping("/meetup")
    @RolesAllowed("ADMIN")
    @ApiOperation(value = "Create Meetups", response = MeetRequestDTO.class, notes = "Required roles:ADMIN", authorizations = {
	    @Authorization(value = "apiKey") })
    @ApiResponses(value = { @ApiResponse(code = 201, message = "Success|OK"),
	    @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!") })
    public ResponseEntity<?> create(@Valid @RequestBody MeetRequestDTO meetRequestDTO) {
	MeetResponseSummaryDTO response = this.controller.create(meetRequestDTO);
	return new ResponseEntity<MeetResponseSummaryDTO>(response, HttpStatus.CREATED);
    }

}
