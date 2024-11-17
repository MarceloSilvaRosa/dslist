package com.devsuperior.deslist.dto;

import com.devsuperior.deslist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public static GameMinDTO formEntity(Game entity) {
        return new GameMinDTO(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getImgUrl(),
                entity.getShortDescription()
        );

    }

}
