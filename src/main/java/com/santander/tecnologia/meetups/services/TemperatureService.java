/**
 * 
 */
package com.santander.tecnologia.meetups.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.santander.tecnologia.meetups.dto.DailyForecastData;
import com.santander.tecnologia.meetups.dto.Day;

/**
 * class TemperatureService implements ITemperatureService
 * 
 * @author Magdaly Santos
 * 
 */
@Service
public class TemperatureService implements ITemperatureService {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public DailyForecastData conectionWithWhetherBit() throws Exception {
	HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
		"https://weatherbit-v1-mashape.p.rapidapi.com/forecast/daily?lat=-34.6&lon=-58.37&units=metric&lang=es"))
		.header("x-rapidapi-key", "9c02f50988msh05d46fb3564ce84p1414e5jsn6999477116e0")
		.header("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody()).build();
	HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
	try {
	    return objectMapper.readValue(response.body(), DailyForecastData.class);
	} catch (JsonProcessingException e) {
	    throw new Exception("ERROR parsing json");
	}

    }

    @Override
    public double findDayInForecastData(LocalDate date) throws Exception {
	DailyForecastData dailyForecastData = this.conectionWithWhetherBit();

	Optional<Day> day = dailyForecastData.getData().stream().filter(d -> d.getDatetime().isEqual(date)).findFirst();

	return day.get().getTemp();
    }

}
