package com.hongwei.design.chain.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class AnimalChain extends Animal {

    @Override
    protected void eat(Food food) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal pig = new Pig();



        cat.nextAnimal = dog;
        dog.nextAnimal = pig;

        cat.eat(food);
    }
}
