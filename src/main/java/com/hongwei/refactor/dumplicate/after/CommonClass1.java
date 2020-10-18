package com.hongwei.refactor.dumplicate.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-23
 */
public class CommonClass1 extends CommonBaseClass {

    @Override
    public void method1() {
        System.out.println("Class1 method1");
        methodInner1();
    }

    @Override
    protected void printClassName() {
        System.out.println("CommonClass1");
    }
}
