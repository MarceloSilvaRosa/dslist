package com.devsuperior.deslist.services;

import com.devsuperior.deslist.dto.GameDTO;
import com.devsuperior.deslist.dto.GameListDTO;
import com.devsuperior.deslist.dto.GameMinDTO;
import com.devsuperior.deslist.entities.Game;
import com.devsuperior.deslist.entities.GameList;
import com.devsuperior.deslist.projections.GameMinProjection;
import com.devsuperior.deslist.repositories.GameListRepository;
import com.devsuperior.deslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.crypto.spec.PSource;
import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::formEntity).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
