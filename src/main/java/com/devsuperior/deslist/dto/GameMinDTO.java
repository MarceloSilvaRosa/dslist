package com.devsuperior.deslist.dto;

import com.devsuperior.deslist.entities.Game;
import com.devsuperior.deslist.projections.GameMinProjection;
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

    public static GameMinDTO formEntity(GameMinProjection projection) {
        return new GameMinDTO(
                projection.getId(),
                projection.getTitle(),
                projection.getGameYear(),
                projection.getImgUrl(),
                projection.getShortDescription()
        );
    }
}
