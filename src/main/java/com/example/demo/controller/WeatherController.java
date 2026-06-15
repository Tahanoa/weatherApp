package com.example.demo.controller;


import com.example.demo.model.WeatherData;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/all")
    public ResponseEntity<List<WeatherData>> getAllWeatherData() {
        List<WeatherData> weatherDataList = weatherService.getAllWeatherData();
        return new ResponseEntity<>(weatherDataList, HttpStatus.OK);
    }
}