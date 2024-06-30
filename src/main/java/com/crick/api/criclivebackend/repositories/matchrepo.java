package com.crick.api.criclivebackend.repositories;

import com.crick.api.criclivebackend.entities.match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface matchrepo extends JpaRep<match,Integer>
{
    Optional<match> findbyteamname(String teamHeading)
}
