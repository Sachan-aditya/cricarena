package com.crick.api.criclivebackend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="crick_matches")
public class match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int matchId;
    private String teamHeading;
    private String battingTeam;
    private String matchNumberVenue;
    private String bowlTeam;
    private String battingTeamScore;
    private String bowlTeamScore;
    private String liveText;
    private String completeText;
    private String matchLink;
    @Enumerated
    private Matchstatus status;
    private Date matchDate = new Date();

    public match() {}
  //set match status to test complete
    public  void setmatchstatus()
    {
        if(completeText.isBlank())
        {
            this.status=Matchstatus.LIVE;
        }
        else
        {
            this.status=Matchstatus.COMPLETED;
        }
    }
    public match(int matchId) {
        this.matchId = matchId;
    }
}