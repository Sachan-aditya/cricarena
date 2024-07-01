package com.crick.api.criclivebackend.services;

import com.crick.api.criclivebackend.entities.match;
import com.crick.api.criclivebackend.repositories.Matchrepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class matchserviceimpl implements  MatchService {
    @Autowired
    private Matchrepo matchrepo;

    public matchserviceimpl(Matchrepo matchrepo) {
        this.matchrepo = matchrepo;
    }

    @Override
    public List<match> getAllMatches() {
        return this.matchrepo.findAll();
    }

    @Override
    public List<match> getLiveMatches() {
        return List.of();
    }

    @Override
    public List<Map<String, String>> getPointTable() {
        return List.of();
    }
}
