package com.hongwei.refactor.typecode.strategy.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public class Context {

    public void doEat() {
        AnimalBO animalBO = AnimalBO.create(1,  1, "猫1" );
        animalBO.getAnimalTypeStrategy().eat();
    }

    public void doRun() {
        AnimalBO animalBO = AnimalBO.create(1,  2, "狗1" );
        animalBO.getAnimalTypeStrategy().run();
    }
}
