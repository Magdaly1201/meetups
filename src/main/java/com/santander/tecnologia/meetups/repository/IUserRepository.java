package com.santander.tecnologia.meetups.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santander.tecnologia.meetups.entity.User;

/**
 * Repository to access data base to entity User
 * 
 * @author Magdaly Santos
 * 
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    /**
     * method to find by UserName and Password
     * 
     * @param username the user
     * @param password the user
     * @return user found
     */
    Optional<User> findByUsernameAndPassword(String username, String password);

}
