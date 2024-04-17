package com.portfolio.meeting.website.mapper;


import com.portfolio.meeting.website.dto.CityDto;
import com.portfolio.meeting.website.entity.City;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CityMapper {

    CityDto toDto(City city);

    City toEntity(CityDto cityDto);

}
