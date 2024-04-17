package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dto.CityDto;
import com.portfolio.meeting.website.entity.City;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<CityDto> getAllCities();

    CityDto saveCity(CityDto city);

    Optional<City> getCity(int id);

    void deleteCity(int id);

}
