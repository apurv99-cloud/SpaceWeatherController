package com.spaceweather.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "weather")
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solarSpeedOfWind;
    private double levelOfRadiation;
    private int kpIndex;
    private double cmeProbability;
    private String source;
    private LocalDateTime timeStamp;

    public WeatherData() {
    }

    public WeatherData(double solarSpeedOfWind, double levelOfRadiation,
            int kpIndex, double cmeProbability,
            String source, LocalDateTime timeStamp) {
        this.solarSpeedOfWind = solarSpeedOfWind;
        this.levelOfRadiation = levelOfRadiation;
        this.kpIndex = kpIndex;
        this.cmeProbability = cmeProbability;
        this.source = source;
        this.timeStamp = timeStamp;
    }

    public double getSolarSpeedOfWind() {
        return solarSpeedOfWind;
    }

    public void setSolarSpeedOfWind(double solarSpeedOfWind) {
        this.solarSpeedOfWind = solarSpeedOfWind;
    }

    public double getLevelOfRadiation() {
        return levelOfRadiation;
    }

    public void setLevelOfRadiation(double levelOfRadiation) {
        this.levelOfRadiation = levelOfRadiation;
    }

    public int getKpIndex() {
        return kpIndex;
    }

    public void setKpIndex(int kpIndex) {
        this.kpIndex = kpIndex;
    }

    public double getCmeProbability() {
        return cmeProbability;
    }

    public void setCmeProbability(double cmeProbability) {
        this.cmeProbability = cmeProbability;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

}
