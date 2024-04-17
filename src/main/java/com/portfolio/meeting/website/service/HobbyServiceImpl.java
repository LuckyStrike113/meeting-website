package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dao.HobbyRepository;
import com.portfolio.meeting.website.dto.HobbyDto;
import com.portfolio.meeting.website.entity.Hobby;
import com.portfolio.meeting.website.mapper.HobbyMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HobbyServiceImpl implements HobbyService {

    private final HobbyRepository hobbyRepository;
    private final HobbyMapper hobbyMapper;

    public HobbyServiceImpl(HobbyRepository hobbyRepository, HobbyMapper hobbyMapper) {
        this.hobbyRepository = hobbyRepository;
        this.hobbyMapper = hobbyMapper;
    }

    @Override
    public List<HobbyDto> getAllHobbies() {
        return hobbyRepository.findAll().
                stream()
                .map(hobbyMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public HobbyDto saveHobby(HobbyDto hobby) {

        return hobbyMapper
                .toDto(hobbyRepository
                        .save(hobbyMapper.toEntity(hobby)));
    }

    @Override
    public Optional<Hobby> getHobby(int id) {
        return hobbyRepository.findById(id);
    }

    @Override
    public void deleteHobby(int id) {
        hobbyRepository.deleteById(id);
    }
}
