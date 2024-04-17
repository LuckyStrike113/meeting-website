package com.portfolio.meeting.website.controllers;

import com.portfolio.meeting.website.dto.HobbyDto;
import com.portfolio.meeting.website.entity.Hobby;
import com.portfolio.meeting.website.service.HobbyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hobby")
public class HobbyController {

    private final HobbyService hobbyService;

    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }

    @GetMapping
    public List<HobbyDto> showAllHobby() {
        return hobbyService.getAllHobbies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hobby> getHobby(@PathVariable int id) {
        Optional<Hobby> result = hobbyService.getHobby(id);
        return result.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public HobbyDto addNewHobby(@RequestBody HobbyDto hobby) {
        return hobbyService.saveHobby(hobby);
    }


    @PutMapping("/{id}")
    public HobbyDto updateHobby(@RequestBody HobbyDto people, @PathVariable String id) {
        people.setId(Integer.parseInt(id));
        return hobbyService.saveHobby(people);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteHobby(@PathVariable int id) {
        hobbyService.deleteHobby(id);
        return ResponseEntity.ok().build();
    }
}