/**
 * 
 */
package com.santander.tecnologia.meetups.dto;

import java.util.List;

/**
 * Claa DailyForecastData
 * 
 * @author Magdaly Santos
 *
 */
public class DailyForecastData {

    private List<Day> data;
    private String city_name;
    private double lon;
    private String timezone;
    private double lat;
    private String country_code;
    private String state_code;

    /**
     * @return the data
     */
    public List<Day> getData() {
	return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<Day> data) {
	this.data = data;
    }

    /**
     * @return the city_name
     */
    public String getCity_name() {
	return city_name;
    }

    /**
     * @param city_name the city_name to set
     */
    public void setCity_name(String city_name) {
	this.city_name = city_name;
    }

    /**
     * @return the lon
     */
    public double getLon() {
	return lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setLon(double lon) {
	this.lon = lon;
    }

    /**
     * @return the timezone
     */
    public String getTimezone() {
	return timezone;
    }

    /**
     * @param timezone the timezone to set
     */
    public void setTimezone(String timezone) {
	this.timezone = timezone;
    }

    /**
     * @return the lat
     */
    public double getLat() {
	return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(double lat) {
	this.lat = lat;
    }

    /**
     * @return the country_code
     */
    public String getCountry_code() {
	return country_code;
    }

    /**
     * @param country_code the country_code to set
     */
    public void setCountry_code(String country_code) {
	this.country_code = country_code;
    }

    /**
     * @return the state_code
     */
    public String getState_code() {
	return state_code;
    }

    /**
     * @param state_code the state_code to set
     */
    public void setState_code(String state_code) {
	this.state_code = state_code;
    }

    @Override
    public String toString() {
	return "DailyForecastData [data=" + data + ", city_name=" + city_name + ", lon=" + lon + ", timezone="
		+ timezone + ", lat=" + lat + ", country_code=" + country_code + ", state_code=" + state_code + "]";
    }

}
