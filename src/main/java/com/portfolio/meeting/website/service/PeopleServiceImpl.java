package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dao.PeopleRepository;
import com.portfolio.meeting.website.dto.PeopleDto;
import com.portfolio.meeting.website.entity.People;
import com.portfolio.meeting.website.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PeopleServiceImpl implements PeopleService {

    private final PeopleRepository peopleRepository;

    private final PeopleMapper peopleMapper;

    public PeopleServiceImpl(PeopleRepository peopleRepository, PeopleMapper peopleMapper) {
        this.peopleRepository = peopleRepository;
        this.peopleMapper = peopleMapper;
    }

    @Override
    public List<PeopleDto> getAllPeople() {
        return peopleRepository.findAll()
                .stream()
                .map(peopleMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PeopleDto savePeople(PeopleDto people) {
        return peopleMapper
                .toDto(peopleRepository
                        .save(peopleMapper.toEntity(people)));
    }

    @Override
    public Optional<People> getPeople(int id) {

        return peopleRepository.findById(id);

    }

    @Override
    public void deletePeople(int id) {
        peopleRepository.deleteById(id);
    }

}
