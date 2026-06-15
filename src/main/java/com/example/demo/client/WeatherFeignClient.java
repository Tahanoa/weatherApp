package com.example.demo.client;

import com.example.demo.dto.WeatherApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "weatherClient", url = "https://api.open-meteo.com")
public interface WeatherFeignClient {

    @GetMapping("/v1/forecast")
    WeatherApiResponse getWeatherData(
            @RequestParam("latitude") Double latitude,
            @RequestParam("longitude") Double longitude,
            @RequestParam("current_weather") Boolean currentWeather
    );
}