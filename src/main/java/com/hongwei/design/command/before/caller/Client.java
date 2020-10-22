package com.hongwei.design.command.before.caller;

import com.hongwei.design.command.before.receiver.MyService;

/**
 * 上层、上游、上级
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class Client {

    private MyService myService;

    public void call() {
        myService.catEat();
        myService.catDrink();
        myService.dogDrink();
        myService.dogEat();
    }
}
