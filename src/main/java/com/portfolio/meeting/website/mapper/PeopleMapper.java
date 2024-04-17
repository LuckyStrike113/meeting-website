package com.portfolio.meeting.website.mapper;

import com.portfolio.meeting.website.dto.PeopleDto;
import com.portfolio.meeting.website.entity.People;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", uses = {CityMapper.class, HobbyMapper.class, ImagesMapper.class})
public interface PeopleMapper {

    PeopleDto toDto(People people);

    People toEntity(PeopleDto peopleDto);


}
