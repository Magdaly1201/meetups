package com.santander.tecnologia.meetups.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Class Day Mapper the WeatherBit
 * 
 * @author Magdaly Santos
 * 
 */
public class Day {

    private int moonrise_ts;
    private String wind_cdir;
    private int rh;
    private double pres;
    private double high_temp;
    private int sunset_ts;
    private double ozone;
    private double moon_phase;
    private double wind_gust_spd;
    private int snow_depth;
    private int clouds;
    private int ts;
    private int sunrise_ts;
    private double app_min_temp;
    private double wind_spd;
    private int pop;
    private String wind_cdir_full;
    private double slp;
    private double moon_phase_lunation;
    private String valid_date;
    private double app_max_temp;
    private double vis;
    private double dewpt;
    private int snow;
    private double uv;
    private Weather weather;
    private int wind_dir;
    private Object max_dhi;
    private int clouds_hi;
    private double precip;
    private double low_temp;
    private double max_temp;
    private int moonset_ts;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate datetime;
    private double temp;
    private double min_temp;
    private int clouds_mid;
    private int clouds_low;

    /**
     * @return the moonrise_ts
     */
    public int getMoonrise_ts() {
	return moonrise_ts;
    }

    /**
     * @param moonrise_ts the moonrise_ts to set
     */
    public void setMoonrise_ts(int moonrise_ts) {
	this.moonrise_ts = moonrise_ts;
    }

    /**
     * @return the wind_cdir
     */
    public String getWind_cdir() {
	return wind_cdir;
    }

    /**
     * @param wind_cdir the wind_cdir to set
     */
    public void setWind_cdir(String wind_cdir) {
	this.wind_cdir = wind_cdir;
    }

    /**
     * @return the rh
     */
    public int getRh() {
	return rh;
    }

    /**
     * @param rh the rh to set
     */
    public void setRh(int rh) {
	this.rh = rh;
    }

    /**
     * @return the pres
     */
    public double getPres() {
	return pres;
    }

    /**
     * @param pres the pres to set
     */
    public void setPres(double pres) {
	this.pres = pres;
    }

    /**
     * @return the high_temp
     */
    public double getHigh_temp() {
	return high_temp;
    }

    /**
     * @param high_temp the high_temp to set
     */
    public void setHigh_temp(double high_temp) {
	this.high_temp = high_temp;
    }

    /**
     * @return the sunset_ts
     */
    public int getSunset_ts() {
	return sunset_ts;
    }

    /**
     * @param sunset_ts the sunset_ts to set
     */
    public void setSunset_ts(int sunset_ts) {
	this.sunset_ts = sunset_ts;
    }

    /**
     * @return the ozone
     */
    public double getOzone() {
	return ozone;
    }

    /**
     * @param ozone the ozone to set
     */
    public void setOzone(double ozone) {
	this.ozone = ozone;
    }

    /**
     * @return the moon_phase
     */
    public double getMoon_phase() {
	return moon_phase;
    }

    /**
     * @param moon_phase the moon_phase to set
     */
    public void setMoon_phase(double moon_phase) {
	this.moon_phase = moon_phase;
    }

    /**
     * @return the wind_gust_spd
     */
    public double getWind_gust_spd() {
	return wind_gust_spd;
    }

    /**
     * @param wind_gust_spd the wind_gust_spd to set
     */
    public void setWind_gust_spd(double wind_gust_spd) {
	this.wind_gust_spd = wind_gust_spd;
    }

    /**
     * @return the snow_depth
     */
    public int getSnow_depth() {
	return snow_depth;
    }

    /**
     * @param snow_depth the snow_depth to set
     */
    public void setSnow_depth(int snow_depth) {
	this.snow_depth = snow_depth;
    }

    /**
     * @return the clouds
     */
    public int getClouds() {
	return clouds;
    }

    /**
     * @param clouds the clouds to set
     */
    public void setClouds(int clouds) {
	this.clouds = clouds;
    }

    /**
     * @return the ts
     */
    public int getTs() {
	return ts;
    }

    /**
     * @param ts the ts to set
     */
    public void setTs(int ts) {
	this.ts = ts;
    }

    /**
     * @return the sunrise_ts
     */
    public int getSunrise_ts() {
	return sunrise_ts;
    }

    /**
     * @param sunrise_ts the sunrise_ts to set
     */
    public void setSunrise_ts(int sunrise_ts) {
	this.sunrise_ts = sunrise_ts;
    }

    /**
     * @return the app_min_temp
     */
    public double getApp_min_temp() {
	return app_min_temp;
    }

    /**
     * @param app_min_temp the app_min_temp to set
     */
    public void setApp_min_temp(double app_min_temp) {
	this.app_min_temp = app_min_temp;
    }

    /**
     * @return the wind_spd
     */
    public double getWind_spd() {
	return wind_spd;
    }

    /**
     * @param wind_spd the wind_spd to set
     */
    public void setWind_spd(double wind_spd) {
	this.wind_spd = wind_spd;
    }

    /**
     * @return the pop
     */
    public int getPop() {
	return pop;
    }

    /**
     * @param pop the pop to set
     */
    public void setPop(int pop) {
	this.pop = pop;
    }

    /**
     * @return the wind_cdir_full
     */
    public String getWind_cdir_full() {
	return wind_cdir_full;
    }

    /**
     * @param wind_cdir_full the wind_cdir_full to set
     */
    public void setWind_cdir_full(String wind_cdir_full) {
	this.wind_cdir_full = wind_cdir_full;
    }

    /**
     * @return the slp
     */
    public double getSlp() {
	return slp;
    }

    /**
     * @param slp the slp to set
     */
    public void setSlp(double slp) {
	this.slp = slp;
    }

    /**
     * @return the moon_phase_lunation
     */
    public double getMoon_phase_lunation() {
	return moon_phase_lunation;
    }

    /**
     * @param moon_phase_lunation the moon_phase_lunation to set
     */
    public void setMoon_phase_lunation(double moon_phase_lunation) {
	this.moon_phase_lunation = moon_phase_lunation;
    }

    /**
     * @return the valid_date
     */
    public String getValid_date() {
	return valid_date;
    }

    /**
     * @param valid_date the valid_date to set
     */
    public void setValid_date(String valid_date) {
	this.valid_date = valid_date;
    }

    /**
     * @return the app_max_temp
     */
    public double getApp_max_temp() {
	return app_max_temp;
    }

    /**
     * @param app_max_temp the app_max_temp to set
     */
    public void setApp_max_temp(double app_max_temp) {
	this.app_max_temp = app_max_temp;
    }

    /**
     * @return the vis
     */
    public double getVis() {
	return vis;
    }

    /**
     * @param vis the vis to set
     */
    public void setVis(double vis) {
	this.vis = vis;
    }

    /**
     * @return the dewpt
     */
    public double getDewpt() {
	return dewpt;
    }

    /**
     * @param dewpt the dewpt to set
     */
    public void setDewpt(double dewpt) {
	this.dewpt = dewpt;
    }

    /**
     * @return the snow
     */
    public int getSnow() {
	return snow;
    }

    /**
     * @param snow the snow to set
     */
    public void setSnow(int snow) {
	this.snow = snow;
    }

    /**
     * @return the uv
     */
    public double getUv() {
	return uv;
    }

    /**
     * @param uv the uv to set
     */
    public void setUv(double uv) {
	this.uv = uv;
    }

    /**
     * @return the weather
     */
    public Weather getWeather() {
	return weather;
    }

    /**
     * @param weather the weather to set
     */
    public void setWeather(Weather weather) {
	this.weather = weather;
    }

    /**
     * @return the wind_dir
     */
    public int getWind_dir() {
	return wind_dir;
    }

    /**
     * @param wind_dir the wind_dir to set
     */
    public void setWind_dir(int wind_dir) {
	this.wind_dir = wind_dir;
    }

    /**
     * @return the max_dhi
     */
    public Object getMax_dhi() {
	return max_dhi;
    }

    /**
     * @param max_dhi the max_dhi to set
     */
    public void setMax_dhi(Object max_dhi) {
	this.max_dhi = max_dhi;
    }

    /**
     * @return the clouds_hi
     */
    public int getClouds_hi() {
	return clouds_hi;
    }

    /**
     * @param clouds_hi the clouds_hi to set
     */
    public void setClouds_hi(int clouds_hi) {
	this.clouds_hi = clouds_hi;
    }

    /**
     * @return the precip
     */
    public double getPrecip() {
	return precip;
    }

    /**
     * @param precip the precip to set
     */
    public void setPrecip(double precip) {
	this.precip = precip;
    }

    /**
     * @return the low_temp
     */
    public double getLow_temp() {
	return low_temp;
    }

    /**
     * @param low_temp the low_temp to set
     */
    public void setLow_temp(double low_temp) {
	this.low_temp = low_temp;
    }

    /**
     * @return the max_temp
     */
    public double getMax_temp() {
	return max_temp;
    }

    /**
     * @param max_temp the max_temp to set
     */
    public void setMax_temp(double max_temp) {
	this.max_temp = max_temp;
    }

    /**
     * @return the moonset_ts
     */
    public int getMoonset_ts() {
	return moonset_ts;
    }

    /**
     * @param moonset_ts the moonset_ts to set
     */
    public void setMoonset_ts(int moonset_ts) {
	this.moonset_ts = moonset_ts;
    }

    /**
     * @return the datetime
     */
    public LocalDate getDatetime() {
	return datetime;
    }

    /**
     * @param datetime the datetime to set
     */
    public void setDatetime(LocalDate datetime) {
	this.datetime = datetime;
    }

    /**
     * @return the temp
     */
    public double getTemp() {
	return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(double temp) {
	this.temp = temp;
    }

    /**
     * @return the min_temp
     */
    public double getMin_temp() {
	return min_temp;
    }

    /**
     * @param min_temp the min_temp to set
     */
    public void setMin_temp(double min_temp) {
	this.min_temp = min_temp;
    }

    /**
     * @return the clouds_mid
     */
    public int getClouds_mid() {
	return clouds_mid;
    }

    /**
     * @param clouds_mid the clouds_mid to set
     */
    public void setClouds_mid(int clouds_mid) {
	this.clouds_mid = clouds_mid;
    }

    /**
     * @return the clouds_low
     */
    public int getClouds_low() {
	return clouds_low;
    }

    /**
     * @param clouds_low the clouds_low to set
     */
    public void setClouds_low(int clouds_low) {
	this.clouds_low = clouds_low;
    }

    @Override
    public String toString() {
	return "Day [moonrise_ts=" + moonrise_ts + ", wind_cdir=" + wind_cdir + ", rh=" + rh + ", pres=" + pres
		+ ", high_temp=" + high_temp + ", sunset_ts=" + sunset_ts + ", ozone=" + ozone + ", moon_phase="
		+ moon_phase + ", wind_gust_spd=" + wind_gust_spd + ", snow_depth=" + snow_depth + ", clouds=" + clouds
		+ ", ts=" + ts + ", sunrise_ts=" + sunrise_ts + ", app_min_temp=" + app_min_temp + ", wind_spd="
		+ wind_spd + ", pop=" + pop + ", wind_cdir_full=" + wind_cdir_full + ", slp=" + slp
		+ ", moon_phase_lunation=" + moon_phase_lunation + ", valid_date=" + valid_date + ", app_max_temp="
		+ app_max_temp + ", vis=" + vis + ", dewpt=" + dewpt + ", snow=" + snow + ", uv=" + uv + ", weather="
		+ weather + ", wind_dir=" + wind_dir + ", max_dhi=" + max_dhi + ", clouds_hi=" + clouds_hi + ", precip="
		+ precip + ", low_temp=" + low_temp + ", max_temp=" + max_temp + ", moonset_ts=" + moonset_ts
		+ ", datetime=" + datetime + ", temp=" + temp + ", min_temp=" + min_temp + ", clouds_mid=" + clouds_mid
		+ ", clouds_low=" + clouds_low + "]";
    }

}
