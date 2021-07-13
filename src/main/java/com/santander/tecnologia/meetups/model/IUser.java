package com.santander.tecnologia.meetups.model;

import java.time.LocalDateTime;

public interface IUser {

    /**
     * @return the id
     */
    Long getId();

    /**
     * @return the fullName
     */
    String getFullName();

    /**
     * @return the username
     */
    String getUsername();

    /**
     * @return the password
     */
    String getPassword();

    /**
     * @return the role
     */
    String getRole();

    /**
     * @return the email
     */
    String getEmail();

    /**
     * @return the createAt
     */
    LocalDateTime getCreateAt();

}