package com.spaceweather.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spaceweather.demo.model.WeatherData;

public interface WeatherRepository extends JpaRepository<WeatherData, Long> {

    WeatherData findTopByOrderByTimeStampDesc();
}

// This single line replaces: JDBC, ResultSet, manual mapping, HQL
