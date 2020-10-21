package com.hongwei.refactor.dumplicate.before;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public class Dog implements AnimalAction {

    @Override
    public void haveLunch() {
        // find owner

        // want to eat

        // eat dog food

        // wash face    重复
    }

    @Override
    public void goSleep() {
        // find room         重复

        // play a while      重复

        // find his old place    不同点

        // sleep             重复
    }
}
