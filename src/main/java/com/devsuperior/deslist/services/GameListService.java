package com.devsuperior.deslist.services;

import com.devsuperior.deslist.dto.GameDTO;
import com.devsuperior.deslist.dto.GameListDTO;
import com.devsuperior.deslist.dto.GameMinDTO;
import com.devsuperior.deslist.entities.Game;
import com.devsuperior.deslist.entities.GameList;
import com.devsuperior.deslist.repositories.GameListRepository;
import com.devsuperior.deslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::formEntity).toList();
    }
}
