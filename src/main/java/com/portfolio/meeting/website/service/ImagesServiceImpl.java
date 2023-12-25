package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dao.ImagesRepository;
import com.portfolio.meeting.website.entity.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagesServiceImpl implements ImagesService{

    @Autowired
    private ImagesRepository imagesRepository;

    @Override
    public List<Images> getAllImages() {
        return imagesRepository.findAll();
    }

    @Override
    public void saveImages(Images images) {
        imagesRepository.save(images);
    }

    @Override
    public Images getImages(int id) {
        Images images = null;
        Optional<Images> optional = imagesRepository.findById(id);
        if(optional.isPresent()){
            images = optional.get();
        }
        return images;
    }

    @Override
    public void deleteImages(int id) {
        imagesRepository.deleteById(id);
    }
}
