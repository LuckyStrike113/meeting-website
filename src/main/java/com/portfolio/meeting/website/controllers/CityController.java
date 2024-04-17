package com.portfolio.meeting.website.controllers;

import com.portfolio.meeting.website.dto.CityDto;
import com.portfolio.meeting.website.entity.City;
import com.portfolio.meeting.website.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<CityDto> showAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCities(@PathVariable int id) {
        Optional<City> result = cityService.getCity(id);
        return result.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CityDto addNewCity(@RequestBody CityDto city) {
        return cityService.saveCity(city);
    }

    @PutMapping("/{id}")
    public CityDto updateCity(@RequestBody CityDto city, @PathVariable String id) {
        city.setId(Integer.parseInt(id));
        return cityService.saveCity(city);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCity(@PathVariable int id) {
        cityService.deleteCity(id);
        return ResponseEntity.ok().build();
    }

}