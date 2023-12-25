package com.portfolio.meeting.website.controllers;

import com.portfolio.meeting.website.entity.People;
import com.portfolio.meeting.website.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping("/people")
    public List<People> showAllPeople(){
        List<People> allPeople = peopleService.getAllPeople();
        return allPeople;
    }

    @GetMapping("/people/{id}")
    public People getPeople(@PathVariable int id){
        People people = peopleService.getPeople(id);
    return people;
    }

    @PostMapping("/people")
    public People addNewPeople(@RequestBody People people){
        peopleService.savePeople(people);
        return people;
    }

    @PutMapping("/people")
    public People updatePeople(@RequestBody People people){
            peopleService.savePeople(people);
            return people;
    }

    @DeleteMapping("/people/{id}")
    public String deletePeople(@PathVariable int id){
        People people = peopleService.getPeople(id);
        peopleService.deletePeople(id);
        return "People with ID = " + id + " was deleted";
    }

}
