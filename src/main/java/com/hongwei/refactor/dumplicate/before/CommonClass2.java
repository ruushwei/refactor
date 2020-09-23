package com.hongwei.refactor.dumplicate.before;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public class CommonClass2 implements CommonInterface {

    public void method1() {
        // 123
    }

    public void method2() {
        // xxx
        // xxxx
        // xxx
        // xxxx
        System.out.println("bro2");
    }
}
