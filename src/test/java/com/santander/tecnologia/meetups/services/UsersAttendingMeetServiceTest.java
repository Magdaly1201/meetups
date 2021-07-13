package com.santander.tecnologia.meetups.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.santander.tecnologia.meetups.repository.IUsersAttendingMeetRepository;

/**
 * @author Magdaly Santos
 * 
 */
@SpringBootTest
public class UsersAttendingMeetServiceTest {

    @Autowired
    IUserAttendingMeetService service;

    @MockBean
    IUsersAttendingMeetRepository repository;

}
