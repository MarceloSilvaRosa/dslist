package com.devsuperior.deslist.services;

import com.devsuperior.deslist.dto.GameDTO;
import com.devsuperior.deslist.dto.GameMinDTO;
import com.devsuperior.deslist.entities.Game;
import com.devsuperior.deslist.exceptions.ResourceNotFoundException;
import com.devsuperior.deslist.projections.GameMinProjection;
import com.devsuperior.deslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game not found with id " + id));
        return new GameDTO(result) ;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::formEntity).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findBList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        if (result.isEmpty()) {
            throw new ResourceNotFoundException("Game list not found with id " + listId);
        }
        return result.stream().map(GameMinDTO::formEntity).toList();
    }

}
