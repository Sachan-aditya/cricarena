package com.crick.api.criclivebackend.controller;

import com.crick.api.criclivebackend.entities.match;
import com.crick.api.criclivebackend.services.MatchService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")public class matchcontroller {
    private MatchService matchService;

    public matchcontroller(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<match>> getLiveMatches() {
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<match>> getAllMatches() {
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }


    @GetMapping("/pointtable")
    public ResponseEntity<?> getPointTable() {
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }
}