package com.example.demo.scheduler;


import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class WeatherScheduler {

    @Autowired
    private WeatherService weatherService;

    // هر 15 ثانیه یکبار اجرا می‌شود
    @Scheduled(fixedDelay = 15000, initialDelay = 5000) // اولین اجرا 5 ثانیه بعد از شروع
    public void fetchWeatherDataJob() {
        System.out.println(" Running scheduled job...");
        weatherService.fetchAndSaveWeatherData();
    }
}