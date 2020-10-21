package com.hongwei.design.decorator.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-19
 */
public class HatDecorator extends Decorator {
    public HatDecorator(Animal animal) {
        super(animal);
    }

    @Override
    protected void eat() {
        // do get hat
        
        this.animal.eat();
    }
}
