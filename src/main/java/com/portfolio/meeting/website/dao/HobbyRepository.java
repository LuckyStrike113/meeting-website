package com.portfolio.meeting.website.dao;

import com.portfolio.meeting.website.entity.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyRepository extends JpaRepository<Hobby, Integer> {
}
