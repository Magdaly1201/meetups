/**
 * 
 */
package com.santander.tecnologia.meetups.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.entity.UsersAttendingMeet;
import com.santander.tecnologia.meetups.exceptions.MeetNotFoundException;
import com.santander.tecnologia.meetups.repository.IUsersAttendingMeetRepository;

/**
 * class UsersAttendingMeetService implements IUserAttendingMeetService
 * 
 * @author Magdaly Santos
 * 
 */
@Service
public class UsersAttendingMeetService implements IUserAttendingMeetService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IMeetupService meetupService;

    @Autowired
    private IUsersAttendingMeetRepository repository;

    @Override
    public UsersAttendingMeet registerByMeet(int id, String username) throws MeetNotFoundException {
	Meet meet = modelMapper.map(this.meetupService.getMeetById(id), Meet.class);
	return this.repository.save(new UsersAttendingMeet(username, meet));
    }

    @Override
    public UsersAttendingMeet checkingMeet(int id, String username) throws MeetNotFoundException {

	UsersAttendingMeet userRegister = this.repository.findByMeetAndUsername(this.meetupService.getMeetById(id),
		username);
	userRegister.checkingAssistence();
	return this.repository.save(userRegister);
    }

    @Override
    public List<UsersAttendingMeet> listMeetupsByUsername(String username) {
	return this.repository.findAllByUsername(username);
    }

    @Override
    public int numberOfAttendeesAtMeet(Meet meet) {
	return this.repository.countByMeet(meet);
    }

}
