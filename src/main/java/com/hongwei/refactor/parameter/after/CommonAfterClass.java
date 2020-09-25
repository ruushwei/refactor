package com.hongwei.refactor.parameter.after;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-25
 */
public class CommonAfterClass {

    // 参数过长解决
    public void method1(ComputeParam computeParam) {
        // xxxxxxxx p1 + p2 + p5

        /// xxxxxxxx  p3 + p4 + p6 + p7

        //  xxxxxxxxx p1 + p2 + p5 + p6
    }

    // 局部变量过多
    public void method2(int p1, int p2, int p3, int p4, int p5, int p6, String p7) {
        new Compute(p1, p2, p3, p4, p5, p6, p7).compute();
    }
}
