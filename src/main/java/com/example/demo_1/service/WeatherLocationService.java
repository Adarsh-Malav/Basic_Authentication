package com.example.demo_1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo_1.entity.WeatherLocation;
import com.example.demo_1.repository.WeatherLocationRepository;

@Service
	public class WeatherLocationService {
	    private final WeatherLocationRepository repository;

	    public WeatherLocationService(WeatherLocationRepository repository) {
	        this.repository = repository;
	    }

	    public List<WeatherLocation> getAll() {
	        return repository.findAll();
	    }

	    public WeatherLocation getById(Long id) {
	        return repository.findById(id).orElseThrow(() -> new RuntimeException("Location not found"));
	    }

	    public WeatherLocation create(WeatherLocation location) {
	        return repository.save(location);
	    }

	    public WeatherLocation update(Long id, WeatherLocation updatedLocation) {
	        WeatherLocation existing = getById(id);
	        existing.setCity(updatedLocation.getCity());
	        existing.setDescription(updatedLocation.getDescription());
	        existing.setTemperature(updatedLocation.getTemperature());
	        return repository.save(existing);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
	}


