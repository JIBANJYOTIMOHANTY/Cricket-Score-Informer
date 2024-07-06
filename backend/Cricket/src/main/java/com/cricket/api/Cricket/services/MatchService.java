package com.cricket.api.Cricket.services;

import java.util.List;
import java.util.Map;

import com.cricket.api.Cricket.model.Match;

public interface MatchService {
    List<Match> getAllMatches(); 

    List<Match> getLiveMatches();

    List<List<String>> getPointTable();
    
}
