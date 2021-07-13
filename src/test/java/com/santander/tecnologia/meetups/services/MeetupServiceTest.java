/**
 * 
 */
package com.santander.tecnologia.meetups.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.santander.tecnologia.meetups.dto.MeetResponseDTO;
import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.model.IMeet;
import com.santander.tecnologia.meetups.repository.IMeetupRepository;

/**
 * @author Magdaly Santos
 * 
 */
@SpringBootTest
//@AutoConfigureMockMvc
public class MeetupServiceTest {

    @Autowired
    MeetupService service;

    @MockBean
    IMeetupRepository repository;

    @Test
    public void whenCreate_thenReturnMeetDTO() {

	Meet meet = this.getMeet();

	doReturn(meet).when(repository).save(meet);

	IMeet meetReturn = this.service.create(meet);
	assertEquals(meet.getId(), meetReturn.getId());

    }

    @Test
    public void whenGetAllMeetups_thenReturnMeetDTO() {

	List<Meet> meets = getListMeet();

	doReturn(meets).when(repository).findAll();

	List<Meet> meetReturn = service.getAllMeetups();

	assertEquals(meetReturn.get(0).getId(), meets.get(0).getId());

    }

    private MeetResponseDTO getMeetDTO() {
	MeetResponseDTO meetDTO = new MeetResponseDTO();
	meetDTO.setId(1);
	meetDTO.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meetDTO.setReason("JAVA 1.8");
	return meetDTO;
    }

    private Meet getMeet() {
	Meet meet = new Meet();
	meet.setId(1);
	meet.setDescription("JAVA 1.8 MEET - developers interesting in new functions ");
	meet.setReason("JAVA 1.8");
	return meet;
    }

    private List<Meet> getListMeet() {
	List<Meet> meets = new ArrayList<Meet>();
	meets.add(this.getMeet());
	return meets;
    }
}
