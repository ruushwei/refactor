package com.hongwei.refactor.typecode.strategy.after;

import com.hongwei.refactor.typecode.strategy.after.strategy.AnimalTypeStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
@Data
@AllArgsConstructor
public class AnimalBO {
    private int id;
    private String name;
    private AnimalTypeStrategy animalTypeStrategy;   // 1 cat 2 dog

    public static AnimalBO create(int id, int typeId, String name) {
        AnimalTypeStrategy animalTypeStrategy = AnimalTypeStrategy.createByTypeId(typeId);
        return new AnimalBO(id, name, animalTypeStrategy);
    }
}
