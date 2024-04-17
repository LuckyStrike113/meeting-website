package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dto.HobbyDto;
import com.portfolio.meeting.website.entity.Hobby;

import java.util.List;
import java.util.Optional;

public interface HobbyService {

    List<HobbyDto> getAllHobbies();

    HobbyDto saveHobby(HobbyDto hobby);

    Optional<Hobby> getHobby(int id);

    void deleteHobby(int id);

}
