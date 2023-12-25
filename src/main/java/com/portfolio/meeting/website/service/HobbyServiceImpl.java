package com.portfolio.meeting.website.service;

import com.portfolio.meeting.website.dao.HobbyRepository;
import com.portfolio.meeting.website.entity.Hobby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyServiceImpl implements HobbyService{

    @Autowired
    private HobbyRepository hobbyRepository;

    @Override
    public List<Hobby> getAllHobbies() {
        return hobbyRepository.findAll();
    }

    @Override
    public void saveHobby(Hobby hobby) {
        hobbyRepository.save(hobby);
    }

    @Override
    public Hobby getHobby(int id) {
        Hobby hobby = null;
        Optional<Hobby> optional = hobbyRepository.findById(id);
        if(optional.isPresent()){
            hobby = optional.get();
        }
        return hobby;
    }

    @Override
    public void deleteHobby(int id) {
        hobbyRepository.deleteById(id);
    }
}
