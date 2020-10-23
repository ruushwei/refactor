package com.hongwei.refactor.typecode.subclass.after;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
@Data
@AllArgsConstructor
public abstract class AnimalBO {
    private int id;
    private String name;
    private AnimalTypeEnum animalTypeEnum;   // 1 cat 2 dog

    protected abstract AnimalTypeEnum getAnimalTypeEnum();
    protected abstract void eat();
    protected abstract void run();

    public static AnimalBO create(int id, int typeId, String name) {
        AnimalTypeEnum animalTypeEnum = AnimalTypeEnum.of(typeId);
        if (animalTypeEnum == null) {
            return null;
        }
        AnimalBO animalBO = null;
        switch (animalTypeEnum) {
            case CAT:
                animalBO = new CatBO(id, name, animalTypeEnum);
                break;
            case DOG:
                animalBO = new DogBO(id, name, animalTypeEnum);
                break;
            default:
                break;
        }
        return animalBO;
    }


}
