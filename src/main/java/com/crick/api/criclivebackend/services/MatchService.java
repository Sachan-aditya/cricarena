package com.crick.api.criclivebackend.services;

import com.crick.api.criclivebackend.entities.match;

import java.util.List;
import java.util.Map;

public interface MatchService {

List<match> getAllMatches();
    List<match> getLiveMatches();
    List<Map<String,String>> getPointTable();


}
