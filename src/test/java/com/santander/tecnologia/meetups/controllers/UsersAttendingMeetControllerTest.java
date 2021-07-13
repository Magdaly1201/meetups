package com.santander.tecnologia.meetups.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.santander.tecnologia.meetups.services.IUserAttendingMeetService;

/**
 * @author Magdaly Santos
 * 
 */
@SpringBootTest
@AutoConfigureMockMvc
public class UsersAttendingMeetControllerTest {

    @Autowired
    UsersAttendingMeetController controller;

    @MockBean
    IUserAttendingMeetService service;
}
