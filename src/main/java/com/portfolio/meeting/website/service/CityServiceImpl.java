package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dao.CityRepository;
import com.portfolio.meeting.website.dto.CityDto;
import com.portfolio.meeting.website.entity.City;
import com.portfolio.meeting.website.mapper.CityMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    public CityServiceImpl(CityRepository cityRepository, CityMapper cityMapper) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    @Override
    public List<CityDto> getAllCities() {
        return cityRepository.findAll()
                .stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CityDto saveCity(CityDto city) {
        return cityMapper
                .toDto(cityRepository
                        .save(cityMapper.toEntity(city)));
    }

    @Override
    public Optional<City> getCity(int id) {
        return cityRepository.findById(id);
    }

    @Override
    public void deleteCity(int id) {
        cityRepository.deleteById(id);
    }
}
