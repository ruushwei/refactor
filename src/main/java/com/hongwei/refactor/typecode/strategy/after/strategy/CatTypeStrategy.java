package com.hongwei.refactor.typecode.strategy.after.strategy;

import com.hongwei.refactor.typecode.strategy.after.AnimalTypeEnum;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public class CatTypeStrategy extends AnimalTypeStrategy {

    @Override
    public AnimalTypeEnum getAnimalTypeEnum() {
        return AnimalTypeEnum.CAT;
    }

    @Override
    public void eat() {
        // do cat eat
    }

    @Override
    public void run() {
        // do cat run
    }
}
