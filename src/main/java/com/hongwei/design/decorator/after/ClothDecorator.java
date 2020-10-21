package com.hongwei.design.decorator.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-19
 */
public class ClothDecorator extends Decorator {
    public ClothDecorator(Animal animal) {
        super(animal);
    }

    @Override
    protected void eat() {
        // do get cloth

        this.animal.eat();
    }
}
