package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.entity.People;

import java.util.List;

public interface PeopleService {

    public List<People> getAllPeople();

    public void savePeople(People people);

    public People getPeople(int id);

    public void deletePeople(int id);


}
