package com.devsuperior.deslist.services;

import com.devsuperior.deslist.dto.GameMinDTO;
import com.devsuperior.deslist.entities.Game;
import com.devsuperior.deslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::formEntity).toList();
    }
}
