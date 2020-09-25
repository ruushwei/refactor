package com.hongwei.refactor.parameter.before;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-09-25
 */
public class CommonClass {

    // 参数过长
    public void method1(int p1, int p2, int p3, int p4, int p5, int p6, String p7) {
        // xxxxxxxx p1 + p2 + p5
        int temp = p1 + p2 + p5;

        /// xxxxxxxx  p3 + p4 + p6 + p7

        //  xxxxxxxxx p1 + p2 + p5 + p6 + temp
    }

    // 局部变量过多
    public void method2(int p1, int p2, int p3, int p4, int p5, int p6, String p7) {
        int temp = subMethod1(p1,p2,p5);
        subMethod2(p3,p4,p6, p7);
        subMethod3(p1,p2,p5,p6,temp);
    }

    private int subMethod1(int p1, int p2, int p5) {
        // xxxxxxxx p1 + p2 + p5
        return p1 + p2 + p5;
    }

    private void subMethod2(int p3, int p4, int p6, String p7) {
        /// xxxxxxxx  p3 + p4 + p6 + p7
    }

    private void subMethod3(int p1, int p2, int p5, int p6, int temp) {
        //  xxxxxxxxx p1 + p2 + p5 + p6
    }
}
