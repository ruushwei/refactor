package com.hongwei.refactor.typecode.strategy.before;

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
    private AnimalTypeEnum animalTypeEnum;   // 1 cat 2 dog
    private String name;

    public static AnimalBO create(int id, int typeId, String name) {
        AnimalTypeEnum animalTypeEnum = AnimalTypeEnum.of(typeId);
        return new AnimalBO(id, animalTypeEnum, name);
    }

    public void eat1() {
        // do cat eat
    }

    public void eat2() {
        // do dog eat
    }

    public void run1() {
        // do cat run
    }

    public void run2() {
        // do dog run
    }
}
