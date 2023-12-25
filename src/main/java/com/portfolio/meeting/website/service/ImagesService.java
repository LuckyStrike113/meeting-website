package com.portfolio.meeting.website.service;


import com.portfolio.meeting.website.entity.Images;

import java.util.List;

public interface ImagesService {

    public List<Images> getAllImages();

    public void saveImages(Images images);

    public Images getImages(int id);

    public void deleteImages(int id);

}
