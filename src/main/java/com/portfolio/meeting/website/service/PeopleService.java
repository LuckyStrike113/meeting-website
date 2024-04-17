package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dto.PeopleDto;
import com.portfolio.meeting.website.entity.People;

import java.util.List;
import java.util.Optional;

public interface PeopleService {

    List<PeopleDto> getAllPeople();

    PeopleDto savePeople(PeopleDto people);

    Optional<People> getPeople(int id);

    void deletePeople(int id);

}
