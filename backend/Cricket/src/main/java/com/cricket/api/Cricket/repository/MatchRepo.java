package com.cricket.api.Cricket.repository;

import com.cricket.api.Cricket.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer>{

    Optional<Match> findByTeamHeading(String teamHeading);
    
}
