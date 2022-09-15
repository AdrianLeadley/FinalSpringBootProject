package com.QA.FinalSpringBootProject.Controller;

import com.QA.FinalSpringBootProject.ErrorManagement.ErrorManagement;
import com.QA.FinalSpringBootProject.Model.RocketLeagueGame;
import com.QA.FinalSpringBootProject.Repository.RocketLeagueGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class RocketLeagueGameController {

    @Autowired
    private RocketLeagueGameRepository repo;

    @GetMapping(value = "/Stats")
    public List<RocketLeagueGame> getAllStats1(){
        return repo.findAll();
    }

    @PostMapping(value = "/CreateStats")
    public RocketLeagueGame createStats(@RequestBody RocketLeagueGame rocketLeagueGame) {
        return repo.save(rocketLeagueGame);
    }

    @GetMapping(value = "/stats/{id}")
    public ResponseEntity<RocketLeagueGame> getStatsById(@PathVariable  long id) throws Exception {
        RocketLeagueGame rocketLeagueGame = repo.findById(id)
                .orElseThrow(() -> new ErrorManagement("Gamer with the ID:" + id + "is not present in the database" ));
        return ResponseEntity.ok(rocketLeagueGame);
    }


    @PutMapping(value = "/stats/{id}")
    public ResponseEntity<RocketLeagueGame> updateStats(@PathVariable long id,@RequestBody RocketLeagueGame rocketLeagueGameDetails) {
        RocketLeagueGame updateStats = repo.findById(id)
                .orElseThrow(() -> new ErrorManagement("Gamer with the ID:" + id + "is not present in the database" ));

        updateStats.setId(rocketLeagueGameDetails.getId());
        updateStats.setUsername(rocketLeagueGameDetails.getUsername());
        updateStats.setGoalsScored(rocketLeagueGameDetails.getGoalsScored());
        updateStats.setGoalsConceded(rocketLeagueGameDetails.getGoalsConceded());
        updateStats.setGamesWon(rocketLeagueGameDetails.getGamesWon());
        updateStats.setGamesLost(rocketLeagueGameDetails.getGamesLost());
        updateStats.setGamesPlayed(rocketLeagueGameDetails.getGamesPlayed());

        repo.save(updateStats);

        return ResponseEntity.ok(updateStats);
    }

    @DeleteMapping(value = "/Stats/{id}")
    public ResponseEntity<HttpStatus> deleteStats(@PathVariable long id){

        RocketLeagueGame rocketLeagueGame = repo.findById(id)
                .orElseThrow(() -> new ErrorManagement("Gamer with the ID:" + id + "is not present in the database" ));;
        repo.delete(rocketLeagueGame);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping({"/StatsDisplay"})
    public ModelAndView getAllStats() {
        ModelAndView mav2 = new ModelAndView("list-stats");
        mav2.addObject("rocketLeagueGames", repo.findAll());
        return mav2;
    }

    @GetMapping(value = "/StatsDisplay/{id}")
    public ModelAndView getStatsByIdDisplay(@PathVariable  long id){
        ModelAndView mav3 = new ModelAndView("list-stats-by-id");
        mav3.addObject("rocketLeagueGames", repo.findById(id).orElseThrow(() -> new ErrorManagement("Gamer with the ID:" + id + "is not present in the database" )));
        System.out.println(id);
        return mav3;
    }


}

