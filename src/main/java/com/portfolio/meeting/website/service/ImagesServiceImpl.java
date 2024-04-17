package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dao.ImagesRepository;
import com.portfolio.meeting.website.dto.ImagesDto;
import com.portfolio.meeting.website.entity.Images;
import com.portfolio.meeting.website.mapper.ImagesMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImagesServiceImpl implements ImagesService {

    private final ImagesRepository imagesRepository;
    private final ImagesMapper imagesMapper;

    public ImagesServiceImpl(ImagesRepository imagesRepository, ImagesMapper imagesMapper) {
        this.imagesRepository = imagesRepository;
        this.imagesMapper = imagesMapper;
    }

    @Override
    public List<ImagesDto> getAllImages() {
        return imagesRepository.findAll()
                .stream()
                .map(imagesMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ImagesDto saveImages(ImagesDto images) {
        return imagesMapper.
                toDto(imagesRepository
                        .save(imagesMapper.toEntity(images)));
    }

    @Override
    public Optional<Images> getImages(int id) {
        return imagesRepository.findById(id);
    }

    @Override
    public void deleteImages(int id) {
        imagesRepository.deleteById(id);
    }
}
