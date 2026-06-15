package com.example.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "weather_data")
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "latitude", nullable = false)
    private Double latitude;
    @Column(name = "longitude", nullable = false)
    private Double longitude;
    @Column(name = "generation_time_ms")
    private Double generationTimeMs;
    @Column(name = "utc_offset_seconds")
    private Integer utcOffsetSeconds;
    @Column(name = "timezone")
    private String timezone;
    @Column(name = "timezone_abbreviation")
    private String timezoneAbbreviation;
    @Column(name = "elevation")
    private Double elevation;
    @Column(name = "weather_time")
    private String weatherTime;
    @Column(name = "interval_seconds")
    private Integer intervalSeconds;
    @Column(name = "temperature")
    private Double temperature;
    @Column(name = "windspeed")
    private Double windspeed;
    @Column(name = "winddirection")
    private Integer winddirection;
    @Column(name = "is_day")
    private Integer isDay;
    @Column(name = "weathercode")
    private Integer weathercode;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(Double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }

    public Integer getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(Integer utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public String getWeatherTime() {
        return weatherTime;
    }

    public void setWeatherTime(String weatherTime) {
        this.weatherTime = weatherTime;
    }

    public Integer getIntervalSeconds() {
        return intervalSeconds;
    }

    public void setIntervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Integer getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(Integer winddirection) {
        this.winddirection = winddirection;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public Integer getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(Integer weathercode) {
        this.weathercode = weathercode;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", windspeed=" + windspeed +
                ", weatherTime='" + weatherTime + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}