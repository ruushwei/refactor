package com.hongwei.design.decorator.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-19
 */
public abstract class Decorator extends Animal {
    protected Animal animal;

    public Decorator(Animal animal) {
        this.animal = animal;
    }
}
