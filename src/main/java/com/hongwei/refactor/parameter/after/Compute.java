package com.hongwei.refactor.parameter.after;

/**
 * 计算函数类, 避免多参数传递
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-25
 */
public class Compute {

    private int p1;

    private int p2;

    private int p3;

    private int p4;

    private int p5;

    private int p6;

    private String p7;

    private int temp;

    public Compute(int p1, int p2, int p3, int p4, int p5, int p6, String p7) {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
        this.p5=p5;
        this.p6=p6;
        this.p7=p7;
    }

    public void compute() {
        subCompute1();

        subCompute2();

        subCompute3();
    }

    public void subCompute1() {
        this.temp = p1 + p2 + p5;
    }

    public void subCompute2() {
        // xxxxx  p3 + p4 + p6 + p7
    }

    public void subCompute3() {
        //  xxxx p1 + p2 + p5 + p6
    }
}
