package com.example.demo_1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo_1.entity.WeatherLocation;


import com.example.demo_1.service.WeatherLocationService;

@RestController
	@RequestMapping("/api/locations")
	public class WeatherLocationController {
		
	    private final WeatherLocationService service;

	    public WeatherLocationController(WeatherLocationService service) {
	        this.service = service;
	    }

	    @GetMapping
	    public List<WeatherLocation> getAll() {
	        return service.getAll();
	    }

	    @GetMapping("/{id}")
	    public WeatherLocation getById(@PathVariable Long id) {
	        return service.getById(id);
	    }

	    @PostMapping
	    public WeatherLocation create(@RequestBody WeatherLocation location) {
	        return service.create(location);
	    }

	    @PutMapping("/{id}")
	    public WeatherLocation update(@PathVariable Long id, @RequestBody WeatherLocation location) {
	        return service.update(id, location);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
	}

