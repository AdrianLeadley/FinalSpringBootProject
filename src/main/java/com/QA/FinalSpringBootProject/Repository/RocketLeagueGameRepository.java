package com.QA.FinalSpringBootProject.Repository;

import com.QA.FinalSpringBootProject.Model.Gamer;
import com.QA.FinalSpringBootProject.Model.RocketLeagueGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RocketLeagueGameRepository extends JpaRepository<RocketLeagueGame, Long> {
}