package com.portfolio.meeting.website.mapper;

import com.portfolio.meeting.website.dto.ImagesDto;
import com.portfolio.meeting.website.entity.Images;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ImagesMapper {


    ImagesDto toDto(Images images);

    Images toEntity(ImagesDto imagesDto);

}
