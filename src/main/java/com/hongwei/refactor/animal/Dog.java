package com.hongwei.refactor.animal;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public class Dog extends Animal {

    @Override
    protected String eat() {
        // ifHome()： return "狗粮";
        return "lj";
    }

    private boolean ifHome() {
        return true;
    }
}
