package com.crick.api.criclivebackend.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.config.YamlProcessor;

import java.util.Date;

@Data
@Entity
@Table(name = "crickmatches") // pluralized table name
public class match  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
  private String  textComplete;


    @Enumerated
  private  Matchstatus status;
  private Date date=new Date();

    public match() {

    }

    public match(String matchNumberVenue, String battingTeam, String battingTeamScore, String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete, Matchstatus status, Date date) {
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    public match(int id) {
        this.id = id;
    }
   public void setcomplete()
        {
            if(textComplete.isBlank())
            {
                this.status=Matchstatus.LIVE;

            }
            else
                this.status=Matchstatus.COMPLETED;
        }



}
