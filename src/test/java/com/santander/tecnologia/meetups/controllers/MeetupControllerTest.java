package com.santander.tecnologia.meetups.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.santander.tecnologia.meetups.dto.MeetRequestDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseDTO;
import com.santander.tecnologia.meetups.dto.MeetResponseSummaryDTO;
import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.services.IMeetupService;

/**
 * @author Magdaly Santos
 * 
 */
@SpringBootTest
@AutoConfigureMockMvc
public class MeetupControllerTest {

    @Autowired
    MeetupController controller;

    @Autowired
    ModelMapper modelMapper;

    @MockBean
    private IMeetupService service;

    @Test
    public void whenGetMeetById_thenReturnMeetDTO() throws Exception {

	MeetResponseDTO meetDTO = getMeetDTO();

	doReturn(this.getMeet()).when(service).getMeetById(meetDTO.getId());

	MeetResponseDTO meetDTOReturn = controller.getMeetById(meetDTO.getId());
	assertEquals(meetDTO.getId(), meetDTOReturn.getId());

    }

    @Test
    public void whenGetAllMeetups_thenReturnMeetDTO() {

	List<Meet> meetDTOs = getListMeet();

	doReturn(meetDTOs).when(service).getAllMeetups();

	List<MeetResponseSummaryDTO> meetDTOsReturn = controller.getAllMeetups();

	assertEquals(meetDTOsReturn.get(0).getId(), meetDTOs.get(0).getId());

    }

    private MeetResponseDTO getMeetDTO() {
	MeetResponseDTO meetDTO = new MeetResponseDTO();
	meetDTO.setId(1);
	meetDTO.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meetDTO.setReason("JAVA 1.8");
	meetDTO.setDate(LocalDate.now());
	return meetDTO;
    }

    private MeetRequestDTO getRequestDTO() {
	MeetRequestDTO meetRequestDTO = new MeetRequestDTO();
	meetRequestDTO.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meetRequestDTO.setReason("JAVA 1.8");
	meetRequestDTO.setDate(LocalDate.now());
	return meetRequestDTO;
    }

    private Meet getMeet() {
	Meet meet = new Meet();
	meet.setId(1);
	meet.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meet.setReason("JAVA 1.8");
	meet.setDate(LocalDate.now());
	return meet;
    }

    private List<Meet> getListMeet() {
	List<Meet> meets = new ArrayList<Meet>();
	meets.add(this.getMeet());
	return meets;
    }

}
