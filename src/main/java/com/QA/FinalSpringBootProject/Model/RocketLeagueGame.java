package com.QA.FinalSpringBootProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class RocketLeagueGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String Username;

    @Column
    private int goalsScored;

    @Column
    private int goalsConceded;

    @Column
    private int gamesWon;

    @Column
    private int gamesLost;

    @Column
    private int gamesPlayed;


}
