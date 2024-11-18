package com.devsuperior.deslist.controllers;

import com.devsuperior.deslist.dto.GameDTO;
import com.devsuperior.deslist.dto.GameListDTO;
import com.devsuperior.deslist.dto.GameMinDTO;
import com.devsuperior.deslist.services.GameListService;
import com.devsuperior.deslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findBList(listId);
        return result;
    }

}
