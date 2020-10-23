package com.hongwei.design.decorator.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-21
 */
public class Context {

    public void eat() {
        Animal animal = new Cat();
        Decorator decorator = new ClothDecorator(animal);
        decorator.eat();

        Decorator hatDecorator = new HatDecorator(animal);
        hatDecorator.eat();
    }
}
