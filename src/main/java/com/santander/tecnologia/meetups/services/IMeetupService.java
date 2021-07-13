package com.santander.tecnologia.meetups.services;

import java.util.List;

import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.exceptions.MeetNotFoundException;
import com.santander.tecnologia.meetups.model.IMeet;

/**
 * interface IMeetupService
 * 
 * @author Magdaly Santos
 * 
 */
public interface IMeetupService {

    /**
     * find list the all meetups.
     * 
     * @return all meetups exists in the system.
     */
    List<Meet> getAllMeetups();

    /**
     * find meetup by id.
     * 
     * @param id the meet.
     * @return meet found.
     * @throws MeetNotFoundException
     */
    IMeet getMeetById(int id) throws MeetNotFoundException;

    /**
     * create meetup.
     * 
     * @param meet object to create meetup.
     * @return meetups created.
     */
    IMeet create(Meet meet);

}