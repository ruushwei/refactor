package com.hongwei.refactor.typecode.strategy.after.strategy;

import com.hongwei.refactor.typecode.strategy.after.AnimalTypeEnum;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public class DogTypeStrategy extends AnimalTypeStrategy {

    @Override
    public AnimalTypeEnum getAnimalTypeEnum() {
        return AnimalTypeEnum.DOG;
    }

    @Override
    public void eat() {
        // do dog eat
    }

    @Override
    public void run() {
        // do dog run
    }
}
