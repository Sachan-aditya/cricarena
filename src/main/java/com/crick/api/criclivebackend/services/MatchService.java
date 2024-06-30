package com.crick.api.criclivebackend.services;

import com.crick.api.criclivebackend.entities.match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get all matches
    List<match>   getall();
    //get live matches
    List<match>   getlive();
    //get points table
    List<Map<String,String>>  getPointtables();
}
