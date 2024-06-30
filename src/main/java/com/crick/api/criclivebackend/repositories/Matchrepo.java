package com.crick.api.criclivebackend.repositories;

import com.crick.api.criclivebackend.entities.match;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface Matchrepo extends JpaRepository<match, Integer> {
    Optional<match> findByTeamName(String teamHeading);
}