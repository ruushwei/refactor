package com.hongwei.refactor.dumplicate.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public class Dog extends Animal {

    @Override
    public void haveLunch() {
        // find owner

        // want to eat

        // eat dog food

        this.washFace();
    }

    @Override
    protected void findPlace() {
        // find his old place
    }
}
