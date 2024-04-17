package com.portfolio.meeting.website.controllers;

import com.portfolio.meeting.website.dto.PeopleDto;
import com.portfolio.meeting.website.entity.People;
import com.portfolio.meeting.website.service.PeopleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public List<PeopleDto> showAllPeople() {
        return peopleService.getAllPeople();
    }

    @GetMapping("/{id}")
    public ResponseEntity<People> getPeople(@PathVariable int id) {
        Optional<People> result = peopleService.getPeople(id);
        return result.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PeopleDto addNewPeople(@RequestBody PeopleDto people) {
        return peopleService.savePeople(people);
    }


    @PutMapping("/{id}")
    public PeopleDto updatePeople(@RequestBody PeopleDto people, @PathVariable String id) {
        people.setId(Integer.parseInt(id));
        return peopleService.savePeople(people);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePeople(@PathVariable int id) {
        peopleService.deletePeople(id);
        return ResponseEntity.ok().build();
    }
}