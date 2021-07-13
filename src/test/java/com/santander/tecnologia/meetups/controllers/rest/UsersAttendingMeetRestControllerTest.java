package com.santander.tecnologia.meetups.controllers.rest;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santander.tecnologia.meetups.controllers.UsersAttendingMeetController;

/**
 * @author Magdaly Santos
 * 
 */
@SpringBootTest
@AutoConfigureMockMvc
public class UsersAttendingMeetRestControllerTest {

    @MockBean
    private UsersAttendingMeetController controller;

    @Autowired
    ObjectMapper objectmapper;

    @BeforeEach
    public void setup() {

    }
}
