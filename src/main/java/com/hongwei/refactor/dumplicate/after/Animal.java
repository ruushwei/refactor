package com.hongwei.refactor.dumplicate.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public abstract class Animal implements AnimalAction {

    // 相同方法，直接提取
    public void washFace() {
        // 123
    }

    // 模板方法模式
    @Override
    public void goSleep() {
        // find room

        // play a while

        findPlace();                // 子类差异点，钩子方法，留给子类实现

        // sleep
    }

    protected abstract void findPlace();
}
