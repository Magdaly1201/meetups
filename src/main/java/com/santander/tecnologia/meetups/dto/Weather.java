/**
 * 
 */
package com.santander.tecnologia.meetups.dto;

/**
 * Class Weather
 * 
 * @author Magdaly Santos
 * 
 */
public class Weather {

    private String icon;
    private int code;
    private String description;

    /**
     * @return the icon
     */
    public String getIcon() {
	return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
	this.icon = icon;
    }

    /**
     * @return the code
     */
    public int getCode() {
	return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
	this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
	this.description = description;
    }

}
