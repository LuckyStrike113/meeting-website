package com.portfolio.meeting.website.controllers;

import com.portfolio.meeting.website.dto.ImagesDto;
import com.portfolio.meeting.website.entity.Images;
import com.portfolio.meeting.website.service.ImagesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/images")
public class ImagesController {

    private final ImagesService imagesService;

    public ImagesController(ImagesService imagesService) {
        this.imagesService = imagesService;
    }

    @GetMapping
    public List<ImagesDto> showAllImages() {
        return imagesService.getAllImages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Images> getImages(@PathVariable int id) {
        Optional<Images> result = imagesService.getImages(id);
        return result.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ImagesDto addNewImages(@RequestBody ImagesDto images) {
        return imagesService.saveImages(images);
    }


    @PutMapping("/{id}")
    public ImagesDto updateImages(@RequestBody ImagesDto images, @PathVariable String id) {
        images.setId(Integer.parseInt(id));
        return imagesService.saveImages(images);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteImages(@PathVariable int id) {
        imagesService.deleteImages(id);
        return ResponseEntity.ok().build();
    }
}
