package com.hongwei.design.chain.before;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class Context {
    public String feed() {
        Food food = new Food();
        if (food.getGood() > 80) {
            // do cat eat
            return "cat";
        }
        if (food.getGood() > 60) {
            // do dog eat
            return "dog";
        }
        if (food.getGood() > 30) {
            // do pig eat
            return "pig";
        }
        return "null";
    }
}
