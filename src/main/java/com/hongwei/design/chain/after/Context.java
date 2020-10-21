package com.hongwei.design.chain.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-21
 */
public class Context {
    public void eat() {
        Animal animal = new AnimalChain();
        Food food = new Food();
        animal.eat(food);
    }
}
