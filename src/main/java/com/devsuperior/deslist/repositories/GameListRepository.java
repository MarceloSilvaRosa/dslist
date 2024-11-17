package com.devsuperior.deslist.repositories;

import com.devsuperior.deslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
