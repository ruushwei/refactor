package com.hongwei.refactor.dumplicate.before;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public class Cat implements AnimalAction {

    @Override
    public void haveLunch() {
        // find mouse

        // catch mouse

        // doEat mouse

        // wash face      重复
    }

    @Override
    public void goSleep() {
        // find room       重复

        // play a while    重复

        // find a warm place  不同点

        // sleep           重复
    }
}
