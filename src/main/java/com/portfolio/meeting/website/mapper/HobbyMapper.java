package com.portfolio.meeting.website.mapper;

import com.portfolio.meeting.website.dto.HobbyDto;
import com.portfolio.meeting.website.entity.Hobby;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface HobbyMapper {


    HobbyDto toDto(Hobby hobby);

    Hobby toEntity(HobbyDto hobbyDto);


}
