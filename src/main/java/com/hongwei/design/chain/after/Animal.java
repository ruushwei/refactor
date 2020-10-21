package com.hongwei.design.chain.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-19
 */
public abstract class Animal {
    protected Animal nextAnimal;
    protected abstract void eat(Food food);
}
