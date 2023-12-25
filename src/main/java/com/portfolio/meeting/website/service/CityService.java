package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.entity.City;

import java.util.List;

public interface CityService {

    public List<City> getAllCities();

    public void saveCity(City city);

    public City getCity(int id);

    public void deleteCity(int id);

}
