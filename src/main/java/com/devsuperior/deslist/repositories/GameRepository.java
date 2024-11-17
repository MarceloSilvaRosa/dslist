package com.devsuperior.deslist.repositories;

import com.devsuperior.deslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
