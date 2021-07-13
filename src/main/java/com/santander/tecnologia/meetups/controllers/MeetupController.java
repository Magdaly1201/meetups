/**
 * 
 */
package com.santander.tecnologia.meetups.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.santander.tecnologia.meetups.dto.MeetRequestDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseSummaryDTO;
import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.exceptions.MeetupIsOverException;
import com.santander.tecnologia.meetups.model.IMeet;
import com.santander.tecnologia.meetups.services.IMeetupService;
import com.santander.tecnologia.meetups.services.ITemperatureService;
import com.santander.tecnologia.meetups.services.IUserAttendingMeetService;

/**
 * Class MeetupController
 * 
 * @author Magdaly Santos
 * 
 */
@Controller
public class MeetupController {

    @Autowired
    private IMeetupService service;

    @Autowired
    private ITemperatureService serviceTemperature;

    @Autowired
    private IUserAttendingMeetService UsersAttendingMeetService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * find list the all meetups.
     * 
     * @return all meetups exists in the system.
     */
    public List<MeetResponseSummaryDTO> getAllMeetups() {
	return this.service.getAllMeetups().stream().map(d -> this.modelMapper.map(d, MeetResponseSummaryDTO.class))
		.collect(Collectors.toList());
    }

    /**
     * find meetup by id.
     * 
     * @param id the meet.
     * @return meet found.
     * @throws Exception
     */
    public MeetResponseDTO getMeetById(int id) throws Exception {
	Meet meet = (Meet) this.service.getMeetById(id);
	MeetResponseDTO meetResponseDTO = modelMapper.map(meet, MeetResponseDTO.class);
	LocalDate date = meetResponseDTO.getDate();
	if (LocalDate.now().isBefore(date)) {
	    meetResponseDTO.setTemperature(this.serviceTemperature.findDayInForecastData(meetResponseDTO.getDate()));
	    meetResponseDTO.setCountOfAttendeesAtMeet(this.UsersAttendingMeetService.numberOfAttendeesAtMeet(meet));
	} else {
	    throw new MeetupIsOverException();
	}

	return meetResponseDTO;
    }

    /**
     * create meetup.
     * 
     * @param meetRequestDTO object to create meetup.
     * @return meetups created.
     */
    public MeetResponseSummaryDTO create(MeetRequestDTO meetRequestDTO) {

	Meet meet = this.modelMapper.map(meetRequestDTO, Meet.class);

	IMeet iMeet = this.service.create(meet);

	MeetResponseSummaryDTO meetResponse = this.modelMapper.map(iMeet, MeetResponseSummaryDTO.class);

	return meetResponse;
    }

}
