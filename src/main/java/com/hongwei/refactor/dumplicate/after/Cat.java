package com.hongwei.refactor.dumplicate.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public class Cat extends Animal {

    @Override
    public void haveLunch() {
        // find mouse

        // catch mouse

        // doEat mouse

        this.washFace();
    }

    @Override
    protected void findPlace() {
        // find a warm place
    }
}
