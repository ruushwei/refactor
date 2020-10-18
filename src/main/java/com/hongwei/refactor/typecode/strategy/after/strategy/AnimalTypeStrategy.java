package com.hongwei.refactor.typecode.strategy.after.strategy;

import com.hongwei.refactor.typecode.strategy.after.AnimalTypeEnum;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public abstract class AnimalTypeStrategy {

    public abstract AnimalTypeEnum getAnimalTypeEnum();
    public abstract void eat();
    public abstract void run();

    public static AnimalTypeStrategy createByTypeId(int typeId) {
        AnimalTypeEnum animalTypeEnum = AnimalTypeEnum.of(typeId);
        if (animalTypeEnum == null) {
            return null;
        }
        AnimalTypeStrategy animalTypeStrategy = null;
        switch (animalTypeEnum) {
            case CAT:
                animalTypeStrategy = new CatTypeStrategy();
                break;
            case DOG:
                animalTypeStrategy = new DogTypeStrategy();
                break;
            default:
                break;
        }
        return animalTypeStrategy;
    }
}
