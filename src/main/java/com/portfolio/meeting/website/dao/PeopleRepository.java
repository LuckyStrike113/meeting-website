package com.portfolio.meeting.website.dao;

import com.portfolio.meeting.website.dto.PeopleDto;
import com.portfolio.meeting.website.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.Map;

public interface PeopleRepository extends JpaRepository<People, Integer> {
//    public People addNewPeople(People people) {
//        Map<String, Object> parameters = new HashMap<String, Object>();
//        parameters.put("ID", people.getId());
//        parameters.put("name", people.getName());
//        parameters.put(" people.getGender());
//        parameters.put("date_bigender",rth", people.getDateBirth());
//        parameters.put("city_id", people.getCity());
//
//        return simpleJdbcInsert.execute(parameters);
//    }
}
