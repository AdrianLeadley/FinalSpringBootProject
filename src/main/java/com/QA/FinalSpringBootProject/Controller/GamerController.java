package com.QA.FinalSpringBootProject.Controller;

import com.QA.FinalSpringBootProject.ErrorManagement.ErrorManagement;
import com.QA.FinalSpringBootProject.Model.Gamer;
import com.QA.FinalSpringBootProject.Repository.GamerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping
public class GamerController {

    @Autowired
    private GamerRepository repo;

    @GetMapping(value = "/Gamer")
    public List<Gamer> getAllGamers1(){
        return repo.findAll();
    }

    @PostMapping(value = "/CreateGamer")
    public Gamer createGamer(@RequestBody Gamer gamer) {
        return repo.save(gamer);
    }

    @GetMapping(value = "/Gamer/{id}")
    public ResponseEntity<Gamer> getGamerById(@PathVariable  long id) throws Exception {
        Gamer gamer = repo.findById(id)
                .orElseThrow(() -> new ErrorManagement("Gamer with the ID:" + id + "is not present in the database" ));
        return ResponseEntity.ok(gamer);
    }


    @PutMapping(value = "/Gamer/{id}")
    public ResponseEntity<Gamer> updateGamer(@PathVariable long id,@RequestBody Gamer gamerDetails) {
        Gamer updateGamer = repo.findById(id)
                .orElseThrow(() -> new ErrorManagement("Gamer with the ID:" + id + "is not present in the database" ));

        updateGamer.setFirstName(gamerDetails.getFirstName());
        updateGamer.setLastName(gamerDetails.getLastName());
        updateGamer.setEmailAddress(gamerDetails.getEmailAddress());

        repo.save(updateGamer);

        return ResponseEntity.ok(updateGamer);
    }

    @DeleteMapping(value = "/Gamer/{id}")
    public ResponseEntity<HttpStatus> deleteGamer(@PathVariable long id){

        Gamer gamer = repo.findById(id)
                .orElseThrow(() -> new ErrorManagement("Gamer with the ID:" + id + "is not present in the database" ));;
        repo.delete(gamer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping({"/list", "/"})
    public ModelAndView getAllGamers() {
        ModelAndView mav = new ModelAndView("list-gamer");
        mav.addObject("gamers", repo.findAll());
        return mav;
    }
}





