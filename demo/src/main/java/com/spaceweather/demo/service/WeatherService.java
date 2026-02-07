package com.spaceweather.demo.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.spaceweather.demo.model.WeatherData;
import com.spaceweather.demo.repository.WeatherRepository;

@Service
public class WeatherService {
    private final WeatherRepository repository;

    public WeatherService(WeatherRepository repository) {
        this.repository = repository;
    }

    public String processWeatherData(WeatherData data) {

        data.setTimeStamp(java.time.LocalDateTime.now());
        repository.save(data);

        return evaluateAlertLevel(data);
    }

    public WeatherData getLatestData() {
        return repository.findTopByOrderByTimeStampDesc();
    }

    public List<WeatherData> getHistory() {
        return repository.findAll();
    }

    public String evaluateAlertLevel(WeatherData data) {

        if (data.getKpIndex() >= 7 || data.getLevelOfRadiation() >= 8) {
            return "SEVERE";
        }

        if (data.getKpIndex() >= 5 || data.getSolarSpeedOfWind() > 700) {
            return "WARNING";
        }

        return "NORMAL";
    }

}
