package com.hongwei.refactor.typecode.subclass.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public class CatBO extends AnimalBO {

    public CatBO(int id, String name, AnimalTypeEnum animalTypeEnum) {
        super(id, name, animalTypeEnum);
    }

    @Override
    protected AnimalTypeEnum getAnimalTypeEnum() {
        return AnimalTypeEnum.CAT;
    }

    @Override
    protected void eat() {
        // do cat eat
    }

    @Override
    protected void run() {
        // do cat run
    }
}
