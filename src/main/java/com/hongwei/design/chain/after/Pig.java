package com.hongwei.design.chain.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-20
 */
public class Pig extends Animal {

    @Override
    protected void eat(Food food) {
        if (food.getGood() > 80) {
            // do eat
        } else {
            if (nextAnimal != null) {
                nextAnimal.eat(food);
            }
        }
    }
}
