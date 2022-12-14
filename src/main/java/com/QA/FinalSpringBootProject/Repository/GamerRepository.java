package com.QA.FinalSpringBootProject.Repository;

import com.QA.FinalSpringBootProject.Model.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepository extends JpaRepository<Gamer, Long> {
}
