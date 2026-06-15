package com.example.demo.service;

import com.example.demo.client.WeatherFeignClient;
import com.example.demo.dto.WeatherApiResponse;
import com.example.demo.model.WeatherData;
import com.example.demo.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private WeatherFeignClient weatherFeignClient;

    @Autowired
    private WeatherDataRepository weatherDataRepository;

    @Transactional
    public void fetchAndSaveWeatherData() {
        try {
            System.out.println("Fetching weather data from API at: " + LocalDateTime.now());

            WeatherApiResponse response = weatherFeignClient.getWeatherData(35.0, 35.0, true);
            WeatherData weatherData = convertToEntity(response);
            WeatherData savedData = weatherDataRepository.save(weatherData);

            System.out.println("✅ Weather data saved successfully! ID: " + savedData.getId() +
                    ", Temperature: " + savedData.getTemperature() + "°C");
        } catch (Exception e) {
            System.out.println("❌ Error fetching weather data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = true)
    public List<WeatherData> getAllWeatherData() {
        List<WeatherData> allData = weatherDataRepository.findAll();
        System.out.println("📊 Returning " + allData.size() + " weather records");
        return allData;
    }

    private WeatherData convertToEntity(WeatherApiResponse response) {
        WeatherData weatherData = new WeatherData();
        weatherData.setLatitude(response.getLatitude());
        weatherData.setLongitude(response.getLongitude());
        weatherData.setGenerationTimeMs(response.getGenerationTimeMs());
        weatherData.setUtcOffsetSeconds(response.getUtcOffsetSeconds());
        weatherData.setTimezone(response.getTimezone());
        weatherData.setTimezoneAbbreviation(response.getTimezoneAbbreviation());
        weatherData.setElevation(response.getElevation());

        if (response.getCurrentWeather() != null) {
            WeatherApiResponse.CurrentWeather current = response.getCurrentWeather();
            weatherData.setWeatherTime(current.getTime());
            weatherData.setIntervalSeconds(current.getInterval());
            weatherData.setTemperature(current.getTemperature());
            weatherData.setWindspeed(current.getWindspeed());
            weatherData.setWinddirection(current.getWinddirection());
            weatherData.setIsDay(current.getIsDay());
            weatherData.setWeathercode(current.getWeathercode());
        }


        return weatherData;
    }
}