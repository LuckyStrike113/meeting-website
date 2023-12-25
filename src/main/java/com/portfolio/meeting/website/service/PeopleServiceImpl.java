package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dao.PeopleRepository;
import com.portfolio.meeting.website.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService{

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public List<People> getAllPeople() {
        return peopleRepository.findAll();
    }

    @Override
    public void savePeople(People people) {peopleRepository.save(people);}

    @Override
    public People getPeople(int id) {

        People people = null;
        Optional<People> optional = peopleRepository.findById(id);
        if(optional.isPresent()){
            people = optional.get();
        }
        return people;
    }

    @Override
    public void deletePeople(int id) {
        peopleRepository.deleteById(id);
    }
}
