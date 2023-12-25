package com.portfolio.meeting.website.controllers;

import com.portfolio.meeting.website.entity.City;
import com.portfolio.meeting.website.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public List<City> showAllCities(){
        List<City> allCities = cityService.getAllCities();
        return allCities;
    }

    @GetMapping("/city/{id}")
    public City getCities(@PathVariable int id){
        City city = cityService.getCity(id);
        return city;
    }

    @PostMapping("/city")
    public City addNewCity(@RequestBody City city){
        cityService.saveCity(city);
        return city;
    }

    @PutMapping("/city")
    public City updateCity(@RequestBody City city){
        cityService.saveCity(city);
        return city;
    }

    @DeleteMapping("/people/{id}")
    public String deleteCity(@PathVariable int id){
        City city = cityService.getCity(id);
        cityService.deleteCity(id);
        return "City with ID = " + id + " was deleted";
    }

}