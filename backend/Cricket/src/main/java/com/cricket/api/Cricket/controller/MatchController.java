package com.cricket.api.Cricket.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.api.Cricket.model.Match;
import com.cricket.api.Cricket.services.MatchService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
@AllArgsConstructor
public class MatchController {
    private MatchService matchService;
    
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }
    
}
