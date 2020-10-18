package com.hongwei.refactor.dumplicate.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public abstract class CommonBaseClass implements CommonInterface {

    // 相同方法，直接提取
    public void methodInner1() {
        // 123
    }

    // 模板方法模式
    public void method2() {
        // xxx
        // xxxx
        // xxx
        // xxxx

        printClassName();     // 子类差异点，钩子方法，留给子类实现
    }

    protected abstract void printClassName();
}
