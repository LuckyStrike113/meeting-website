package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.entity.Hobby;

import java.util.List;

public interface HobbyService {

    public List<Hobby> getAllHobbies();

    public void saveHobby(Hobby hobby);

    public Hobby getHobby(int id);

    public void deleteHobby(int id);

}
