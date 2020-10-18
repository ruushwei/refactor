package com.hongwei.refactor.typecode.subclass.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public class DogBO extends AnimalBO {
    public DogBO(int id, String name, AnimalTypeEnum animalTypeEnum) {
        super(id, name, animalTypeEnum);
    }

    @Override
    protected AnimalTypeEnum getAnimalTypeEnum() {
        return AnimalTypeEnum.DOG;
    }

    @Override
    protected void eat() {
        // do dog eat
    }

    @Override
    protected void run() {
        // do dog run
    }
}
