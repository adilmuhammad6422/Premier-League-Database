package com.example.Premier_League_Database.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_statistic")
public class Player {

    @Id
    @Column(name = "player_name", unique = true)
    private String playerName;  // Use camelCase for Java naming convention

    private String nation;
    private String position;
    private Integer age;
    private Integer matchesPlayed;
    private Integer starts;
    private Double minutesPlayed;
    private Double goals;
    private Double assists;
    private Double penaltiesScored;
    private Double yellowCards;
    private Double redCards;
    private Double expectedGoals;
    private Double expectedAssists;
    private String teamName;

    public Player() {
    }

    public Player(String playerName, String nation, String position, Integer matchesPlayed, Integer age, String teamName,
                  Double expectedAssists, Double expectedGoals, Double redCards, Double yellowCards,
                  Double penaltiesScored, Double minutesPlayed, Double assists, Double goals, Integer starts) {
        this.playerName = playerName;
        this.nation = nation;
        this.position = position;
        this.matchesPlayed = matchesPlayed;
        this.age = age;
        this.teamName = teamName;
        this.expectedAssists = expectedAssists;
        this.expectedGoals = expectedGoals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
        this.penaltiesScored = penaltiesScored;
        this.minutesPlayed = minutesPlayed;
        this.assists = assists;
        this.goals = goals;
        this.starts = starts;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    // Getters and Setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Double minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPenaltiesScored() {
        return penaltiesScored;
    }

    public void setPenaltiesScored(Double penaltiesScored) {
        this.penaltiesScored = penaltiesScored;
    }

    public Double getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Double yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Double getRedCards() {
        return redCards;
    }

    public void setRedCards(Double redCards) {
        this.redCards = redCards;
    }

    public Double getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(Double expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public Double getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(Double expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
