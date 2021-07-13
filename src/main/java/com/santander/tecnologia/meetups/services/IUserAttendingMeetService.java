package com.santander.tecnologia.meetups.services;

import java.util.List;

import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.entity.UsersAttendingMeet;
import com.santander.tecnologia.meetups.exceptions.MeetNotFoundException;

/**
 * interface IUserAttendingMeetService
 * 
 * @author Magdaly Santos
 * 
 */
public interface IUserAttendingMeetService {

    /**
     * method to register in the meet.
     * 
     * @param id       the meet.
     * @param username username the person to register.
     * @return UsersAttendingMeet.
     * @throws MeetNotFoundException
     */
    UsersAttendingMeet registerByMeet(int id, String username) throws MeetNotFoundException;

    /**
     * method to check-in assitent in the meet.
     * 
     * @param id       the meet.
     * @param username the person to user checking.
     * @return the UsersAttendingMeet.
     * @throws MeetNotFoundException
     */
    UsersAttendingMeet checkingMeet(int id, String username) throws MeetNotFoundException;

    /**
     * find all meetups to register by username
     * 
     * @param username to find
     * @return list the meet register.
     */
    List<UsersAttendingMeet> listMeetupsByUsername(String username);

    /**
     * @param meet
     * @return
     */
    int numberOfAttendeesAtMeet(Meet meet);

}