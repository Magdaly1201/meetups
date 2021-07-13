package com.santander.tecnologia.meetups.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.tecnologia.meetups.entity.Meet;
import com.santander.tecnologia.meetups.entity.UsersAttendingMeet;
import com.santander.tecnologia.meetups.model.IMeet;

/**
 * Repository to access data base to entity UsersAttendingMeet
 * 
 * @author Magdaly Santos
 * 
 */
public interface IUsersAttendingMeetRepository extends JpaRepository<UsersAttendingMeet, Integer> {

    /**
     * method to find UsersAttendingMeet by meet and username
     * 
     * @param iMeet    the meet to find
     * @param username the person.
     * @return user found
     */
    UsersAttendingMeet findByMeetAndUsername(IMeet iMeet, String username);

    /**
     * find list the meet register by username
     * 
     * @param username the person
     * @return list the meet
     */
    List<UsersAttendingMeet> findAllByUsername(String username);

    /**
     * count the persons registers to the meet.
     * 
     * @param meet to find.
     * @return count total the person register to the meet.
     */
    int countByMeet(Meet meet);
}
