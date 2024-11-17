package com.devsuperior.deslist.dto;

import com.devsuperior.deslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GameListDTO {
    private Long id;
    private String title;

    public static GameListDTO formEntity(GameList entity) {
        return new GameListDTO(
                entity.getId(),
                entity.getName()
        );
    }
}
