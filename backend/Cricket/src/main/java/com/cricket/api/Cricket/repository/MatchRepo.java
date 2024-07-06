package com.cricket.api.Cricket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.api.Cricket.model.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{

    Optional<Match> findByTeamHeading(String teamHeading);
    
}
