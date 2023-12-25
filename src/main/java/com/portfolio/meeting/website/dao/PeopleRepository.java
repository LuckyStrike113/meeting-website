package com.portfolio.meeting.website.dao;

import com.portfolio.meeting.website.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Integer> {


}
