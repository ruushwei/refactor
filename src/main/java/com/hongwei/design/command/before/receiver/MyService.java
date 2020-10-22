package com.hongwei.design.command.before.receiver;

/**
 * 需要知道Cat, Dog
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class MyService {

    private Cat cat;
    private Dog dog;

    public void catEat() {
        cat.eat();
    }

    public void dogEat() {
        dog.eat();
    }

    public void catDrink() {
        cat.drink();
    }

    public void dogDrink() {
        dog.drink();
    }
}
