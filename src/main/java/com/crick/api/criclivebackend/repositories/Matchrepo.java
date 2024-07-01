package com.crick.api.criclivebackend.repositories;

import com.crick.api.criclivebackend.entities.Matchstatus;
import com.crick.api.criclivebackend.entities.match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Matchrepo extends JpaRepository<match, Integer> {

    Optional<match> findByTeamHeading(String TeamHeading);


}