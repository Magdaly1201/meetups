/**
 * 
 */
package com.santander.tecnologia.meetups.controllers.rest;

import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santander.tecnologia.meetups.controllers.MeetupController;
import com.santander.tecnologia.meetups.dto.MeetRequestDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseSummaryDTO;
import com.santander.tecnologia.meetups.interceptor.Interceptor;

/**
 * @author Magdaly Santos
 * 
 */
@SpringBootTest
@AutoConfigureMockMvc
public class MeetupRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MeetupController controller;

    @MockBean
    private Interceptor inteceptor;

    @Autowired
    ObjectMapper objectmapper;

    @BeforeEach
    public void setupInterceptor() throws Exception {
	Mockito.when(inteceptor.preHandle(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(true);
    }

    @Test
    public void whenGetMeetById_thenReturnMeetDTO() throws Exception {

	MeetResponseDTO meetDTO = this.getMeetDTO();

	doReturn(meetDTO).when(controller).getMeetById(1);

	mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/meetup/{id}", 1).accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk()).andExpect((jsonPath("$.id").value(meetDTO.getId())))
		.andExpect((jsonPath("$.reason").value(meetDTO.getReason())));

    }

    @Test
    public void whenCreate_thenReturnMeetDTO() throws Exception {
	MeetResponseSummaryDTO meetDResponseSummaryDTO = this.getMeetSummaryDTO();
	MeetRequestDTO meetRequestDTO = this.getMeetRequestDTO();

	doReturn(meetDResponseSummaryDTO).when(controller).create(meetRequestDTO);
	String string = objectmapper.writeValueAsString(meetRequestDTO);
	String response = mockMvc
		.perform(post("/api/v1/meetup").content(string).contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().is(HttpStatus.CREATED.value())).andReturn().getResponse().getContentAsString();

	System.out.println(response);

    }

    @Test
    public void whenGetAllMeetups_thenReturnListAllMeetups() throws Exception {
	List<MeetResponseDTO> list = getListMeetDTO();

	doReturn(list).when(controller).getAllMeetups();

	this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/meetup").accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(list.get(0).getId()))
		.andExpect(MockMvcResultMatchers.jsonPath("$[0].reason").value(list.get(0).getReason()));
    }

    private MeetResponseDTO getMeetDTO() {
	MeetResponseDTO meetDTO = new MeetResponseDTO();
	meetDTO.setId(1);
	meetDTO.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meetDTO.setReason("JAVA 1.8");
	meetDTO.setDate(LocalDate.now());
	return meetDTO;
    }

    private MeetResponseSummaryDTO getMeetSummaryDTO() {
	MeetResponseSummaryDTO meetDTO = new MeetResponseSummaryDTO();
	meetDTO.setId(1);
	meetDTO.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meetDTO.setReason("JAVA 1.8");
	meetDTO.setDate(LocalDate.now());
	return meetDTO;
    }

    private MeetRequestDTO getMeetRequestDTO() {
	MeetRequestDTO meetRequestDTO = new MeetRequestDTO();
	meetRequestDTO.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meetRequestDTO.setReason("JAVA 1.8");
	meetRequestDTO.setDate(LocalDate.now());
	return meetRequestDTO;
    }

    private List<MeetResponseDTO> getListMeetDTO() {
	List<MeetResponseDTO> meetDTOs = new ArrayList<MeetResponseDTO>();
	meetDTOs.add(this.getMeetDTO());
	return meetDTOs;
    }

}
