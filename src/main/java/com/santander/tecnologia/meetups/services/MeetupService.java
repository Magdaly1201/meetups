/**
 * 
 */
package com.santander.tecnologia.meetups.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.exceptions.MeetNotFoundException;
import com.santander.tecnologia.meetups.model.IMeet;
import com.santander.tecnologia.meetups.repository.IMeetupRepository;

/**
 * Class MeetupService implements IMeetupService
 * 
 * @author Magdaly Santos
 * 
 */
@Service
public class MeetupService implements IMeetupService {

    @Autowired
    private IMeetupRepository repository;

    /**
     * find list the all meetups.
     * 
     * @return all meetups exists in the system.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Meet> getAllMeetups() {
	return repository.findAll();
    }

    /**
     * find meetup by id.
     * 
     * @param id the meet.
     * @return meet found.
     * @throws MeetNotFoundException
     */
    @Override
    @Transactional(readOnly = true)
    public IMeet getMeetById(int id) throws MeetNotFoundException {
	return this.repository.findById(id).orElseThrow(() -> new MeetNotFoundException());

    }

    /**
     * create meetup.
     * 
     * @param meet object to create meetup.
     * @return meetups created.
     */
    @Override
    public IMeet create(Meet meet) {
	return this.repository.save(meet);
    }

}
