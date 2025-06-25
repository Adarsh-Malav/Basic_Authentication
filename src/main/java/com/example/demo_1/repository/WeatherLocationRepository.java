package com.example.demo_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_1.entity.WeatherLocation;

public interface WeatherLocationRepository extends JpaRepository<WeatherLocation, Long> {}
