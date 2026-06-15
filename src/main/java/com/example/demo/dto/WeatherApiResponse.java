package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherApiResponse {

    private Double latitude;
    private Double longitude;

    @JsonProperty("generationtime_ms")
    private Double generationTimeMs;

    @JsonProperty("utc_offset_seconds")
    private Integer utcOffsetSeconds;

    private String timezone;

    @JsonProperty("timezone_abbreviation")
    private String timezoneAbbreviation;

    private Double elevation;

    @JsonProperty("current_weather_units")
    private CurrentWeatherUnits currentWeatherUnits;

    @JsonProperty("current_weather")
    private CurrentWeather currentWeather;

    // Getters and Setters
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

    public CurrentWeatherUnits getCurrentWeatherUnits() {
        return currentWeatherUnits;
    }

    public void setCurrentWeatherUnits(CurrentWeatherUnits currentWeatherUnits) {
        this.currentWeatherUnits = currentWeatherUnits;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

    // Inner Classes
    public static class CurrentWeatherUnits {
        private String time;
        private String interval;
        private String temperature;
        private String windspeed;
        private String winddirection;

        @JsonProperty("is_day")
        private String isDay;

        private String weathercode;

        // Getters and Setters
        public String getTime() { return time; }
        public void setTime(String time) { this.time = time; }
        public String getInterval() { return interval; }
        public void setInterval(String interval) { this.interval = interval; }
        public String getTemperature() { return temperature; }
        public void setTemperature(String temperature) { this.temperature = temperature; }
        public String getWindspeed() { return windspeed; }
        public void setWindspeed(String windspeed) { this.windspeed = windspeed; }
        public String getWinddirection() { return winddirection; }
        public void setWinddirection(String winddirection) { this.winddirection = winddirection; }
        public String getIsDay() { return isDay; }
        public void setIsDay(String isDay) { this.isDay = isDay; }
        public String getWeathercode() { return weathercode; }
        public void setWeathercode(String weathercode) { this.weathercode = weathercode; }
    }

    public static class CurrentWeather {
        private String time;
        private Integer interval;
        private Double temperature;
        private Double windspeed;
        private Integer winddirection;

        @JsonProperty("is_day")
        private Integer isDay;

        private Integer weathercode;

        // Getters and Setters
        public String getTime() { return time; }
        public void setTime(String time) { this.time = time; }
        public Integer getInterval() { return interval; }
        public void setInterval(Integer interval) { this.interval = interval; }
        public Double getTemperature() { return temperature; }
        public void setTemperature(Double temperature) { this.temperature = temperature; }
        public Double getWindspeed() { return windspeed; }
        public void setWindspeed(Double windspeed) { this.windspeed = windspeed; }
        public Integer getWinddirection() { return winddirection; }
        public void setWinddirection(Integer winddirection) { this.winddirection = winddirection; }
        public Integer getIsDay() { return isDay; }
        public void setIsDay(Integer isDay) { this.isDay = isDay; }
        public Integer getWeathercode() { return weathercode; }
        public void setWeathercode(Integer weathercode) { this.weathercode = weathercode; }
    }
}