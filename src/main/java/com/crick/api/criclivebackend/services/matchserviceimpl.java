package com.crick.api.criclivebackend.services;

import com.crick.api.criclivebackend.entities.match;
import com.crick.api.criclivebackend.repositories.Matchrepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class matchserviceimpl implements  MatchService{

private Matchrepo matchRepo;

    public matchserviceimpl(Matchrepo matchRepo) {
        this.matchRepo = matchRepo;
    }
//match history
    @Override
    public List<match> getall() {
        return this.matchRepo.findAll();
    }

    @Override
    public List<match> getlive() {
        return List.of();
    }

    @Override
    public List<Map<String, String>> getPointtables() {
        return List.of();
    }
}

