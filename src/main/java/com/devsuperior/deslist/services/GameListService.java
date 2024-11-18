package com.devsuperior.deslist.services;

import com.devsuperior.deslist.dto.GameListDTO;
import com.devsuperior.deslist.entities.GameList;
import com.devsuperior.deslist.exceptions.ResourceNotFoundException;
import com.devsuperior.deslist.projections.GameMinProjection;
import com.devsuperior.deslist.repositories.GameListRepository;
import com.devsuperior.deslist.repositories.GameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private static final Logger logger = LoggerFactory.getLogger(GameListService.class);

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::formEntity).toList();
    }


    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        logger.info("Finding GameList with id: {}", id);
        GameList result = gameListRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Game list not found with id: {}", id);
                    return new ResourceNotFoundException("Game list not found with id " + id);
                });
        return GameListDTO.formEntity(result);
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        if (sourceIndex < 0 || sourceIndex >= list.size() || destinationIndex < 0 || destinationIndex >= list.size()) {
            throw new IllegalArgumentException("Invalid source or destination index");
        }
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
