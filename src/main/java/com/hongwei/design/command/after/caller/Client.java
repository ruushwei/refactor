package com.hongwei.design.command.after.caller;

import com.hongwei.design.command.after.caller.command.CatDrinkCommand;
import com.hongwei.design.command.after.caller.command.DogEatCommand;
import com.hongwei.design.command.after.receiver.Command;
import com.hongwei.design.command.after.receiver.MyService;

/**
 * 调用方
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class Client {

    private MyService myService;   // invoker命令触发器

    public void call() {
        Command command1 = new DogEatCommand(new Dog());
        myService.execute(command1);

        Command command2 = new CatDrinkCommand(new Cat());
        myService.execute(command2);
    }
}
