package com.hongwei.refactor.typecode.strategy.before;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public class Context {

    public void doEat() {
        AnimalBO animalBO = AnimalBO.create(1, 1, "猫1");
        // 执行操作
        switch (animalBO.getAnimalTypeEnum()) {
            case CAT:
                animalBO.eat1();
                break;
            case DOG:
                animalBO.eat2();
                break;
            default:
                break;
        }
    }

    public void doRun() {
        AnimalBO animalBO = AnimalBO.create(1, 2, "狗1");
        // 执行操作
        switch (animalBO.getAnimalTypeEnum()) {
            case CAT:
                animalBO.run1();
                break;
            case DOG:
                animalBO.run2();
                break;
            default:
                break;
        }
    }
}
