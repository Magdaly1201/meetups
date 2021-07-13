package com.santander.tecnologia.meetups.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.santander.tecnologia.meetups.entity.UsersAttendingMeet;
import com.santander.tecnologia.meetups.exceptions.MeetNotFoundException;
import com.santander.tecnologia.meetups.services.IUserAttendingMeetService;

/**
 * Class UsersAttendingMeetController
 * 
 * @author Magdaly Santos
 * 
 */
@Controller
public class UsersAttendingMeetController {

    @Autowired
    private IUserAttendingMeetService service;

    /**
     * method to register user in the meet
     * 
     * @param id       the meet
     * @param username the user
     * @return userAttendingMeet
     * @throws MeetNotFoundException
     */
    public UsersAttendingMeet registerByMeet(int id, String username) throws MeetNotFoundException {
	return this.service.registerByMeet(id, username);
    }

    /**
     * checking assitence in the meet
     * 
     * @param id       the meet.
     * @param username the user.
     * @return userAttendingMeet.
     * @throws MeetNotFoundException
     */
    public UsersAttendingMeet checkingMeet(int id, String username) throws MeetNotFoundException {
	return this.service.checkingMeet(id, username);
    }

    /**
     * method to find all meet register a user.
     * 
     * @param username the user.
     * @return list the meet found.
     */
    public List<UsersAttendingMeet> listMeetupsByUsername(String username) {
	return this.service.listMeetupsByUsername(username);
    }
}
