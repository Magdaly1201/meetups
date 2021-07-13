package com.santander.tecnologia.meetups.services;

import java.time.LocalDate;

import com.santander.tecnologia.meetups.dto.DailyForecastData;

/**
 * interface ITemperatureService
 * 
 * @author Magdaly Santos
 * 
 */
public interface ITemperatureService {

    /**
     * connections with the Whetherbit and return data with the 16 days.
     * 
     * @return dailyForecastData with the 16 days.
     * @throws Exception the object mapper
     */
    DailyForecastData conectionWithWhetherBit() throws Exception;

    /**
     * method to find temperature by date.
     * 
     * @param date day to the find
     * @return date found
     * @throws Exception the object mapper
     */
    double findDayInForecastData(LocalDate date) throws Exception;

}