package com.portfolio.meeting.website.service;


import com.portfolio.meeting.website.dto.ImagesDto;
import com.portfolio.meeting.website.entity.Images;

import java.util.List;
import java.util.Optional;

public interface ImagesService {

    List<ImagesDto> getAllImages();

    ImagesDto saveImages(ImagesDto images);

    Optional<Images> getImages(int id);

    void deleteImages(int id);

}
