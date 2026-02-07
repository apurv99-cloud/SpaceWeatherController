package com.spaceweather.demo.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spaceweather.demo.model.WeatherData;
import com.spaceweather.demo.service.WeatherService;

@RestController

    // @GetMapping("/health")
    // public String healthCheck() {
    // return "Space Weather Checking System is running";
    // }

@RequestMapping("/api/weather")
public class SpaceWeatherController {

    private final WeatherService service;

    public SpaceWeatherController(WeatherService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public String addWeatherData(@RequestBody WeatherData data) {
        data.setTimeStamp(LocalDateTime.now());
        String alertLevel = service.evaluateAlertLevel(data);

        return "Weather data received. Current Alert Level: "
                + alertLevel;

    }



}
