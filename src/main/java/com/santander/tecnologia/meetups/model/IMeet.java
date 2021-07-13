package com.santander.tecnologia.meetups.model;

import java.time.LocalDate;

public interface IMeet {

    /**
     * @return the id
     */
    int getId();

    /**
     * @return the reason
     */
    String getReason();

    /**
     * @return the description
     */
    String getDescription();

    /**
     * @return the dateAndTime
     */
    LocalDate getDate();

}